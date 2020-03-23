package ui

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.text.SimpleDateFormat

public class input {


	@Keyword
	def nameMailPassword(String Name, String mail, String password){

		KeywordUtil.logInfo("Input nama lengkap")
		WebUI.setText(findTestObject('/Page_Login/Email_Login/Page_Register/input_NamaLengkap'),
				Name)

		KeywordUtil.logInfo("Input email")
		WebUI.setText(findTestObject('/Page_Login/Email_Login/Page_Register/input_Email'),
				mail)

		KeywordUtil.logInfo("Input password")
		WebUI.setText(findTestObject('/Page_Login/Email_Login/Page_Register/input_password'),
				password)

		KeywordUtil.logInfo("Click agreement")
		WebUI.click(findTestObject('/Page_Login/Email_Login/Page_Register/check_SayatelahmenyetujuiSehatQ'))
		WebUI.takeScreenshot()
	}

	@Keyword
	def lengkapiProfil(){

		if (WebUI.waitForElementPresent(findTestObject('/LengkapiProfil/text_LengkapiProfil'), 10, FailureHandling.OPTIONAL)) {

			KeywordUtil.logInfo("Input DOB")
			WebUI.click(findTestObject('/LengkapiProfil/input_DOB'))
			WebUI.delay(1)
			WebUI.click(findTestObject('/LengkapiProfil/text_maret2020'))
			WebUI.delay(1)
			WebUI.click(findTestObject('/LengkapiProfil/text_Jan'))
			WebUI.delay(1)
			WebUI.click(findTestObject('/LengkapiProfil/text_1'))

			KeywordUtil.logInfo("Check female")
			WebUI.click(findTestObject('Object Repository/LengkapiProfil/text_rb_Perempuan'))
			WebUI.takeScreenshot()

			KeywordUtil.logInfo("Click button continue")
			WebUI.click(findTestObject('/LengkapiProfil/button_Continue'))

			KeywordUtil.logInfo("Check message")
			WebUI.verifyElementPresent(findTestObject('/Messages/success_CompleteRegister'), 10)
		}
	}
	
	@Keyword
	def editProfile(String inputDob){
		def date = new Date()
		def sdf = new SimpleDateFormat("MMddhhmmSS")
			String newDate = sdf.format(date)
			println (newDate)
		
	KeywordUtil.logInfo("Input Valid Email")
		WebUI.click(findTestObject('/Home/button_EditProfile'))
		WebUI.waitForElementPresent(findTestObject('/Home/Profil/DetailProfil/ProfilSaya/EditProfil/text_EditProfil'), 10)
		WebUI.takeScreenshot()
			
		if(inputDob=='yes'){
			
			KeywordUtil.logInfo("Input DOB")
			WebUI.click(findTestObject('/LengkapiProfil/input_DOB'))
			WebUI.delay(1)
			WebUI.click(findTestObject('/LengkapiProfil/text_maret2020'))
			WebUI.delay(1)
			WebUI.click(findTestObject('/LengkapiProfil/text_Jan'))
			WebUI.delay(1)
			WebUI.click(findTestObject('/LengkapiProfil/text_1'))
		}
		
	
		WebUI.scrollToElement(findTestObject('/Home/Profil/DetailProfil/ProfilSaya/EditProfil/text_namaLengkap'), 10)
		
	KeywordUtil.logInfo("Check female")
		WebUI.click(findTestObject('/LengkapiProfil/text_rb_Perempuan'))
		WebUI.takeScreenshot()
	
	KeywordUtil.logInfo("Input tinggi badan")
		WebUI.setText(findTestObject('/Home/Profil/DetailProfil/ProfilSaya/EditProfil/input_TinggiBadan'),
			"170")
		
	KeywordUtil.logInfo("Input Berat badan")
		WebUI.setText(findTestObject('/Home/Profil/DetailProfil/ProfilSaya/EditProfil/input_bb'),
			"60")
		
	KeywordUtil.logInfo("Input Alamat")
		WebUI.setText(findTestObject('/Home/Profil/DetailProfil/ProfilSaya/EditProfil/input_Alamat'),
			"Pondok Bambu")
		
	KeywordUtil.logInfo("Input no telepon")
		WebUI.setText(findTestObject('/Home/Profil/DetailProfil/ProfilSaya/EditProfil/input_Phone'),
			"08"+newDate)
		WebUI.takeScreenshot()
		
	KeywordUtil.logInfo("click button simpan")
		WebUI.click(findTestObject('/Home/Profil/DetailProfil/ProfilSaya/EditProfil/button_Simpan'))
		WebUI.verifyElementPresent(findTestObject('/Messages/success_EditProfie'), 90)
		WebUI.takeScreenshot()
	}
}
