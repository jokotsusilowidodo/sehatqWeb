import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'ui.openUrlto_InputEmailpage.inputEmailPage'()
	
KeywordUtil.logInfo("Input Valid Email")
	WebUI.setText(findTestObject('/Page_Login/Email_Login/input_Email'), 
		GlobalVariable.email)

KeywordUtil.logInfo("Input Valid Password")
	WebUI.setText(findTestObject('/Page_Login/Email_Login/input_password'), 
		GlobalVariable.password)
	WebUI.takeScreenshot()
	
KeywordUtil.logInfo("Click button Continue")
	WebUI.click(findTestObject('/Page_Login/Email_Login/button_Continue'))
	WebUI.waitForElementPresent(findTestObject('/Messages/success_Login'), 120)
	WebUI.takeScreenshot()

CustomKeywords.'ui.input.lengkapiProfil'()
