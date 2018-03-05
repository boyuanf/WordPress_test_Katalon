import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://52.221.174.11/wp-login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('log_in_page/input_log'), username)

WebUI.setText(findTestObject('log_in_page/input_pwd'), password)

WebUI.click(findTestObject('log_in_page/input_wp-submit'))

WebUI.mouseOver(findTestObject('dashboard_page/Posts_button'))

WebUI.waitForElementVisible(findTestObject('dashboard_page/All Posts_button'), 30)

WebUI.mouseOver(findTestObject('dashboard_page/All Posts_button'))

WebUI.click(findTestObject('dashboard_page/All Posts_button'))

not_run: WebUI.click(findTestObject('all_post_page/a_post_title'))

WebUI.click(findTestObject('edit_post_page/All_Posts_button'))

WebUI.click(findTestObject('all_post_page/add_new_post_button'))

WebUI.setText(findTestObject('add_new_post_page/input_post_title'), 'new post title by Katalon')

WebUI.setText(findTestObject('add_new_post_page/new_post_body'), 'new post body by Katalon')

WebUI.delay(3)

WebUI.click(findTestObject('add_new_post_page/publish_button'))

not_run: WebUI.waitForElementPresent(findTestObject('add_new_post_page/update_button'), 30)

WebUI.click(findTestObject('edit_post_page/All_Posts_button'))

WebUI.verifyElementPresent(findTestObject('all_post_page/post_created'), 30)

WebUI.closeBrowser()

