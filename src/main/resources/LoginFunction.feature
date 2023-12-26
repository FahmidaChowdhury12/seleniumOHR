@Smoke @Regrassion 
Feature: Login function test
#description: credential function must be vaild
#background:

@Postitive @TC_01
Scenario: testing loging function with valid credential

Given open browser
And go to application URL
When put valid user
And put valid password
And click login btn
Then test will pass if log out btn found