Feature: To validate Login Application


Background: 
Given Login page


#Scenario: TO Test Login with Valid Credentials
#When Enter Valida name "Admin" 
#And Enter valid password "admin123" 
#And Click on submit button
#Then IShould see the userName as "Welcome Paul" 
#
#Scenario: TO Test Login with Valid Credentials
#When Enter Valida name "Admin" 
#And Enter valid password "admin123" 
#And Click on submit button
#Then IShould see the userName as "Welcome Paul" 

Scenario Outline: To Test Login With Different Data
When Enter Valida name "<name>"
And Enter valid password "<pwd>"
And Click on submit button
Then IShould see the userName as "<loginname>"

#this will be like a data driven test
Examples: 
|name	|pwd			|loginname|
|Admin|admin123 |Welcome Paul|
|Admin|admin123 |Welcome Paul|

Scenario: TO Test Login with INValid Credentials
When Enter InValida name "sunil" 
And Enter Invalid password "sunil" 
And Click on submit button
Then I Should see the Invalid Credentail as "Invalid credentials" 