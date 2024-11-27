Feature: Account Testcases in Leaftaps application for HooksImplementation

Scenario Outline: Create Account with valid testdata

Given Click CRMSFA link
And Click Accounts tab
And Click Create Account link
And Enter Account Name as <acctName>
When Click Create Account button
Then Verify Account Name as <acctName>

Examples:

|acctName|
|'TestAcctUserCre'|
|'LeafAcctUserCrea'|
|'QeagleTestUserCr'|

Scenario: Edit Account for the created Account

Given Click CRMSFA link
And Click Accounts tab
And Click Find Accounts link
And Enter created account Name as 'QeagleTestUser'
And Click Find Accounts button
And Click on the first Account Id displayed
And Click Edit button
And Enter Description as 'This is test account'
And Click Save button

Scenario: Delete Account

Given Click CRMSFA link
And Click Accounts tab
And Click Find Accounts link
And Enter created account Name as 'TestAcctUserCre'
And Click Find Accounts button
And Click on the first Account Id displayed
When Click on Deactivate Account
Then Accept the confirmation alert
And Click Find Accounts link
And Enter created account Name as 'TestAcctUserCre'
And Click Find Accounts button
And Verify the account is deleted