package ui

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class openUrlto_InputEmailpage {

	@Keyword
	def inputEmailPage(){

		KeywordUtil.logInfo("Open apps")
		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('/Home/input_Search'), 60)
		WebUI.delay(3)
		WebUI.takeScreenshot()

		KeywordUtil.logInfo("Click button Profile")
		WebUI.click(findTestObject('/Home/button_Profile'))
		WebUI.waitForElementPresent(findTestObject('/Page_Login/text_JoinUs'), 10)
		WebUI.takeScreenshot()

		KeywordUtil.logInfo("Click button Continue with email")
		WebUI.click(findTestObject('/Page_Login/button_ContinuewithEmail'))
		WebUI.waitForElementPresent(findTestObject('/Page_Login/Email_Login/header_Login'), 10)
		WebUI.takeScreenshot()
	}
}
