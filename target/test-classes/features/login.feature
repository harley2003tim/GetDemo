Feature: Login into Application

Scenario: Positive test validation login
Given Initialize the browser with Firefox
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home page to land on Secure sign on Page
When User enters "littleredshoes65@yahoo.com" and "123456" and logs in
Then Verify that the user is successfully logged in
