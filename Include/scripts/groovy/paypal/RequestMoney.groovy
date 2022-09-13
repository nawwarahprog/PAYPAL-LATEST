package paypal
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RequestMoney {

	@Given("User is at login page")
	def atLoginPage(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://sandbox.paypal.com/my/business')
		WebUI.click(findTestObject('Object Repository/Login/Page_PayPal Business  Merchant Services for_0ffd0b/a_Log Masuk'))
		WebUI.click(findTestObject('Object Repository/Login/Page_Log masuk ke akaun PayPal anda/a_English'))
	}

	@When("User fills textbox with (.*)")
	def enterCredentials(String email){
		WebUI.setText(findTestObject('Object Repository/Login/Page_Log in to your PayPal account/input_MY_login_email'), email)
	}

	@And("User clicks Next button")
	def clicksNext(){
		WebUI.click(findTestObject('Object Repository/Login/Page_Log in to your PayPal account/button_Next'))
	}

	@When("User enter textbox with (.*)")
	def enterTextbox(String password){
		WebUI.setText(findTestObject('Object Repository/Login/Page_Log in to your PayPal account/input_Next_login_password'), password)
	}

	@And("User clicks on Login button")
	def ClickLogin(){
		WebUI.click(findTestObject('Object Repository/Login/Page_Log in to your PayPal account/button_Log In'))
	}

	@When("User clicks Request")
	def ClickRequest(){
		WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_Home - PayPal/span'))
	}

	@Then("User Input Details Request Payment from (.*)")
	def InputDetails(String email) {
		WebUI.setText(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments/input_Name, username, email, or mobile_mult_f16261'), email)
		WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments/div_589A4529-8063-4CAA-B3A7-46DACC69259ECre_e20c6a'))
	}

	@Then("User click Next button")
	def ClickNext(){
		WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments/button_Next'))
	}

	@Then("User Input Amount of money with (.*)")
	def InputAmount(String number) {
		WebUI.setText(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments Preview/input_App Center_amount'), number)
	}

	@Then("User click Request Payment")
	def ClicksRequestPayment(){
		WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments Preview/button_Request a Payment'))
	}

	@Then("User click Home")
	def ClikcHome() {
		WebUI.click(findTestObject('Object Repository/REQUEST MONEY/Page_PayPal Request payments Success/a_Home'))
	}
}