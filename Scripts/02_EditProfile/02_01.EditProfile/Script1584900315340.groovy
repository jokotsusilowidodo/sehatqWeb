import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.callTestCase(findTestCase('01_Login/01_01.Login_Success'), [:])

//Edit existing user 
CustomKeywords.'ui.input.editProfile'("no")