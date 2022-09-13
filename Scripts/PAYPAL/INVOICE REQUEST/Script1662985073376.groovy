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

WebUI.click(findTestObject('Object Repository/INVOICE REQUEST/Page_Home - PayPal/span'))

WebUI.click(findTestObject('Object Repository/INVOICE REQUEST/Page_PayPal Request payments/div_Create an invoiceCustomize, track, and _cabe8c'))

WebUI.setText(findTestObject('Object Repository/INVOICE REQUEST/Page_Invoice/input_Bill multiple customers_combo_t_email-input'), 
    'nawwarahyusof123@gmail.com')

WebUI.setText(findTestObject('Object Repository/INVOICE REQUEST/Page_Invoice/input_Email address or name_combo_t_NO_NAME'), 
    'barang')

WebUI.setText(findTestObject('Object Repository/INVOICE REQUEST/Page_Invoice/input_Quantity_unit_price'), '55')

WebUI.setText(findTestObject('Object Repository/INVOICE REQUEST/Page_Invoice/textarea_Add item or service_note'), 'o')

WebUI.setText(findTestObject('Object Repository/INVOICE REQUEST/Page_Invoice/textarea_o'), 'ok')

WebUI.click(findTestObject('Object Repository/INVOICE REQUEST/Page_Invoice/button_Send'))

WebUI.click(findTestObject('Object Repository/INVOICE REQUEST/Page_Invoice/a_Home'))

