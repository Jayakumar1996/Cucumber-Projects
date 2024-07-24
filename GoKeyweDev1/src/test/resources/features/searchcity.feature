@smoke
Feature: City Seach functionality

Background:
   Given user enters email "jayakumar086.t@gmail.com" and enters password "Test@123" and clicks on login button
   
   
  Scenario Outline: Properties in the particular city
    When Click the keywe or cb logo in the navbar to land on the homepage
    And search for with city name "<city>"
    
  
    Examples: 
      | city            | 
      | Los Gatos       | 
      | San Jose        | 
           
 