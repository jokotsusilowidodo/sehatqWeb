import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'ui.openUrlto_InputEmailpage.inputEmailPage'()
	
KeywordUtil.logInfo("Input Valid Email")
	WebUI.setText(findTestObject('/Page_Login/Email_Login/input_Email'), 
		GlobalVariable.email)

KeywordUtil.logInfo("Input Valid Password")
	WebUI.setText(findTestObject('/Page_Login/Email_Login/input_password'), 
		"13aeruwer")
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click button Continue")
	WebUI.click(findTestObject('/Page_Login/Email_Login/button_Continue'))
	WebUI.waitForElementPresent(findTestObject('/Messages/error_Message/msg_EmailatauPasswordSalah'), 120)
	WebUI.takeScreenshot()
	