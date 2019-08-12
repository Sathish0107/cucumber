
Feature: Title of your feature
  I want to use this template for my feature file

#@tag1
 #Scenario: Title of your scenario
   # Given launch the browser
    
    
 #   When enter the customer details
  #|fname|sathish|
  #|lname|baskaran|
  #|email|sathishbaskaranr@gmail.com|
  #|address|chennai|
  #|phone|9840076968|
  #  Then I validate the outcomes
 
@tag2
Scenario Outline: Rutime
Given launch the brwoser
When enter the customer details "<fname>", "<lname>","<email>","<address>","<phone>"
Then Validate outcome

Examples:
|fname|lname|email|address|phone|
|sathish|baskaran|abc@gmail.com|chennai|9840076968|
|divya|baskaran|bca@gmail.com|chennai|787455575|
|siva|thimu|xyz@gmail.com|chennai|885247963|