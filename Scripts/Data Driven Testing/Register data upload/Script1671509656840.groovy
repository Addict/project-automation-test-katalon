import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.psegameshop.com/')

WebUI.click(findTestObject('Object Repository/Login/i_Coming Soon_icon-user'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/select_Please Select OneActionRacingSimulat_02dff3'), 
    'Action', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/select_Please Select OnePlaystationXBoxNintendoPC'), 
    'Playstation', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/select_Please Select OneCulinaryTraveling  _80d3f1'), 
    'Traveling & Leisure', true)

WebUI.click(findTestObject('Object Repository/Register/input_Male_acffield_5ea3be750efb3'))

WebUI.setText(findTestObject('Object Repository/Register/input__email'), username)

WebUI.setText(findTestObject('Register/input__password'), password)

WebUI.setText(findTestObject('Object Repository/Register/input__confirm_password'), confirmPassword)

WebUI.click(findTestObject('Object Repository/Register/button_Register'))

//WebUI.verifyElementPresent(findTestObject('Register/Done Message/div_Thank you for registering. Your account has to be activated before you can login. Please check your email'), 
//    0)

//WebUI.switchToWindowTitle('https://mail.google.com/mail/u/1/?ogbl#inbox/FMfcgzGrbbzrlFjQBfcGlPGdksFcMhXq')
//
//WebUI.switchToWindowTitle('Kotak Masuk (5) - ads.sto15@gmail.com - Gmail')
//WebUI.click(findTestObject('Object Repository/Register/Email/span_-PS Enterprise Gameshop Hello from PS _9ac359'))
//
//WebUI.click(findTestObject('Object Repository/Register/Email/a_View Account'))
//
//WebUI.click(findTestObject('Object Repository/Register/Email/div_Kotak Masuk5'))
//
//WebUI.click(findTestObject('Object Repository/Register/Email/span_Please activate your account'))
//
//WebUI.click(findTestObject('Object Repository/Register/Email/a_httpswww.psegameshop.commy-accountalg_wc__7fdaf2'))
//
//WebUI.switchToWindowTitle('My Account - PS Enterprise Gameshop')
//
//WebUI.click(findTestObject('Object Repository/Register/Done Message/div_Success Your account has been activated'))
WebUI.closeBrowser()

