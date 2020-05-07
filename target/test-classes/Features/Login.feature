Feature: Login into Application

Scenario Outline: Positive test validating Login

Given Initialize Browser with Chrome
And Navigate to "http://qaclickacademy.com" Site
And Click on login link in home page to land on Secure Sign In page
When user enters <username> and <password> and log In
Then Verify user is successfully logged In

Examples:
|username 						|	password 	|
|yash.yash.bhargava@gmail.com 	|	rajeneetu 	|