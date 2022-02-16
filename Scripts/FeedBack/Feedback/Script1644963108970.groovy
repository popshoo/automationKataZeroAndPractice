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

WebUI.navigateToUrl('http://zero.webappsecurity.com/feedback.html')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_email'), 'robtest@gmail.com')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_subject'), 'test')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/textarea_IMPORTANT_comment'), 'applying test')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'))

WebUI.waitForElementPresent(findTestObject('FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'), 3)

WebUI.navigateToUrl('http://zero.webappsecurity.com/feedback.html')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_name'), 'test2')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_email'), 'rtest2')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_subject'), 'test2')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/textarea_IMPORTANT_comment'), 'Applying test2')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'))

WebUI.waitForElementPresent(findTestObject('FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'), 3)

WebUI.navigateToUrl('http://zero.webappsecurity.com/feedback.html')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_name'), '')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'))

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_name'), 'Test3')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/div_IMPORTANT_controls pictured'))

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_email'), '')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'))

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_email'), 'rtest3')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/div_IMPORTANT_controls pictured'))

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_subject'), '')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'))

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_subject'), 'test3')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/textarea_IMPORTANT_comment'), '')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'))

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/textarea_IMPORTANT_comment'), 'Applying test3')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'))

WebUI.waitForElementPresent(findTestObject('FeedBack/Page_Zero - FeebBack/input_IMPORTANT_submit'), 3)

WebUI.navigateToUrl('http://zero.webappsecurity.com/feedback.html')

WebUI.click(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/Page_Zero - Contact Us/input_IMPORTANT_name'))

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/Page_Zero - Contact Us/input_IMPORTANT_name'), 
    'test4')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/Page_Zero - Contact Us/input_IMPORTANT_email'), 
    'robtest4')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/Page_Zero - Contact Us/input_IMPORTANT_subject'), 
    'test4')

WebUI.setText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/Page_Zero - Contact Us/textarea_IMPORTANT_comment'), 
    'Applying test to button clear')

WebUI.clearText(findTestObject('Object Repository/FeedBack/Page_Zero - FeebBack/Page_Zero - Contact Us/textarea_IMPORTANT_comment'))

WebUI.closeBrowser()

