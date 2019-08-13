
Feature: Title of your feature
  I want to use this template for my feature file

@tag1
 Scenario: Title of your scenario
   Given launch the browser
    
    
  When enter the customer detailss
  |fname|sathish|
  |lname|baskaran|
  |email|sathishbaskaranr@gmail.com|
  |address|chennai|
  |phone|9840076968|
  Then I validate the outcomes
 
@tag2
Scenario Outline: Rutime
Given launch the browser
When enter the customer detailsss "<fname>", "<lname>","<email>","<address>","<phone>"
Then Validate outcome

Examples:
|fname|lname|email|address|phone|
|sathish|baskaran|abc@gmail.com|chennai|9840076968|
|divya|baskaran|bca@gmail.com|chennai|787455575|
|siva|thimu|xyz@gmail.com|chennai|885247963|

@tag3
 Scenario: Title of your scenario
   Given launch the browser
    
    
  When enter the customer detail
  
  |sathish|baskaran|sathish@gmail.com|chennai|9840076968|
|sameer|muhammed|sathish@gmail.com|chennai|984005668|
|nishant|masi|masi@gmail.com|chennai|789456123|
  Then I validate the outcomes
  
  @tag4
 Scenario: Title of your scenario
   Given launch the browser
   When enter the customer detai
|fname|lname|email|address|phone|
|sathish|baskaran|sathish@gmail.com|chennai|9840076968|
|sameer|muhammed|sathish@gmail.com|chennai|984005668|
|nishant|masi|masi@gmail.com|chennai|789456123|
  Then I validate the outcomes