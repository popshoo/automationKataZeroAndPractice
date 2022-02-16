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

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=contact')

WebUI.click(findTestObject('Object Repository/Page_Contact us - My Store/div_Subject Heading                        _6144f4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact us - My Store/select_-- Choose --                        _4284a0'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Email address_from'), 'testing@test.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/textarea_Message_message'), 'Applying test')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact us - My Store/textarea_Message_message'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'), 3)

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Contact us'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact us - My Store/select_-- Choose --                        _4284a0'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Email address_from'), 'testing@test.2')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Order reference_id_order'), 'Campo Opcional')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/textarea_Message_message'), '')

WebUI.verifyElementPresent(findTestObject('Page_Contact us - My Store/textarea_Message_message'), 3)

WebUI.click(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'))

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Contact us'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact us - My Store/select_-- Choose --                        _4284a0'),
	'1', true)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Email address_from'), 'testing3')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact us - My Store/input_Email address_from'), 2)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Order reference_id_order'), 'Campo Opcional')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/textarea_Message_message'), 'Applying test3')

WebUI.click(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'), 3)

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Contact us'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact us - My Store/select_-- Choose --                        _4284a0'),
	'1', true)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Email address_from'), 'testing@test.3')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Order reference_id_order'), 'Campo Opcional')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/textarea_Message_message'), 'Applying test3')

WebUI.click(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'), 3)

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Contact us'))

WebUI.closeBrowser()

