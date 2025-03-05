Feature: SalesForce Login

Scenario: Login with Valid Credentials

Given Enter username
Given Enter password
When Click login
Then Homepage is verified