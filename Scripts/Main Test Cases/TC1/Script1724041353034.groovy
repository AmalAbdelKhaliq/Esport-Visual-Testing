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

WebUI.navigateToUrl('https://qa.saudiesports.sa/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Login'))

WebUI.takeElementScreenshotAsCheckpoint('Login Dialog Origin', findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/div_Log In                    Welcome to Es_48b420'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__email'), 'yasmine@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.takeElementScreenshotAsCheckpoint('Login Dialog With Data', findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/div_Log In                    Welcome to Es_48b420'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__login'))

WebUI.click(findTestObject('Object Repository/Page_Esports/span_Users'))

WebUI.takeElementScreenshotAsCheckpoint('User List', findTestObject('Object Repository/Page_Esports/app-user-list_0user threeuserthreeyopmail.c_8ea037'))

WebUI.click(findTestObject('Object Repository/Page_Esports/div_Employee_col-sm-12 col-md-12 col-lg-7 c_e56339'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Esports/span_userthreeyopmail.com'), 'userthree@yopmail.com')

WebUI.closeBrowser()

