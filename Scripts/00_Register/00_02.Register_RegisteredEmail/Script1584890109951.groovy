import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'ui.openUrlto_InputEmailpage.inputEmailPage'()

KeywordUtil.logInfo("New to sehatq")
	WebUI.click(findTestObject('/Page_Login/Email_Login/button_SignUp'))
	WebUI.waitForElementPresent(findTestObject('/Page_Login/Email_Login/Page_Register/text_SignUp'), 10)
	WebUI.takeScreenshot()
	
def date = new Date()
def sdf = new SimpleDateFormat("yyyMMddhhmmSS")
	String newDate = sdf.format(date)
	println (newDate)

//define input data variable
String name = "User Test "+newDate
String password = "sehatq1234"

CustomKeywords.'ui.input.nameMailPassword'(name, GlobalVariable.email, password)	

KeywordUtil.logInfo("Click button Continue")
	WebUI.click(findTestObject('/Page_Login/Email_Login/Page_Register/button_Continue'))
	
KeywordUtil.logInfo("Check success Message")
	WebUI.verifyElementPresent(findTestObject('/Messages/error_Message/msg_TerjadiKesalahanEmailsudahada'), 60)
	WebUI.takeScreenshot()
	
	