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

WebUI.callTestCase(findTestCase('Common/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_Home - PayPal/span'))

WebUI.setText(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments/input_Name, username, email, or mobile_mult_f16261'), 
    'nawwarahyusof123@gmail.com')

WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments/div_589A4529-8063-4CAA-B3A7-46DACC69259ECre_e20c6a'))

WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments/button_Next'))

WebUI.setText(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments Preview/input_App Center_amount'), 
    '40.00')

WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments Preview/button_Request a Payment'))

WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments Success/a_Home'))

WebUI.closeBrowser()

