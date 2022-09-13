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

WebUI.navigateToUrl('https://www.sandbox.paypal.com/my/business')

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Business  Merchant Services for_0ffd0b/a_Log Masuk'))

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_Log masuk ke akaun PayPal anda/a_English'))

WebUI.setText(findTestObject('Object Repository/SEND MONEY/Page_Log in to your PayPal account/input_MY_login_email'), 'sb-5nuc4314643945@business.example.com')

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_Log in to your PayPal account/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/SEND MONEY/Page_Log in to your PayPal account/input_Next_login_password'), 
    'Zaegf44StniHolX9QxciFQ==')

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_Log in to your PayPal account/button_Log In'))

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_Home - PayPal/span'))

WebUI.setText(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment/input_Name, username, email, or mobile_auto_8f566d'), 
    'nawwarahyusof123@gmail.com')

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment/div_589A4529-8063-4CAA-B3A7-46DACC69259ECre_cf718e'))

WebUI.click(findTestObject('SEND MONEY/Page_PayPal Make a payment Preview/input_App Center_amount'))

WebUI.focus(findTestObject('SEND MONEY/Page_PayPal Make a payment Preview/input_App Center_amount'))

WebUI.setText(findTestObject('SEND MONEY/Page_PayPal Make a payment Preview/input_App Center_amount'), '33.30')

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Preview/p_Whats this payment for'))

WebUI.setText(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Preview/textarea_You can select from up to differen_c7ccca'), 
    'i')

WebUI.setText(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Preview/textarea_i'), 'it')

WebUI.setText(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Preview/textarea_it'), 'ite')

WebUI.setText(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Preview/textarea_ite'), 'item')

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Preview/button_Continue'))

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Funding Option Selection/label_PayPal Balance (MYR)'))

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Funding Option Selection/button_Next'))

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Preview/button_Send Payments Now'))

WebUI.click(findTestObject('Object Repository/SEND MONEY/Page_PayPal Make a payment Success/a_Home'))

