Feature: Login Functionality

  Background:  A web browser is at the Testrunz login page
   Given User navigates to login pagee
  
  Scenario Outline: Login with valid credentials
    When User enters the valid email address "<email>" and valid password "<password>"
    And User clicks on the login button
    Then User should get successfully logged in

    Examples: 
      | email                      										| password      |
      | jayakumar.thiruvenkidam@twilightsoftwares.com | SmartWork@321 |
      
     
  Scenario Outline: Login with invalid credentials
    When User enters the invalid email address "<email>" and invalid password "<password>"
    And User clicks on the login button
    Then User should not get logged in
    
    Examples: 
      | email                      										| password     |
      | jayakumar.thiruvenkidamtwilightsoftwares.com  | SmartWork    |


 Scenario Outline: Login with valid email and invalid password
    When User enters the valid email address "<email>" and invalid password "<password>"
    And User clicks on the login button
    Then User should not get logged in
    
     Examples: 
      | email                      										| password     |
      | jayakumar.thiruvenkidam@twilightsoftwares.com | SmartWork    |

  Scenario Outline: Login with invalid email and valid password
    When User enters the invalid email address "<email>" and valid password "<password>"
    And User clicks on the login button
    Then Verify an error message occurred
    
     Examples: 
      | email                      										| password      |
      | jayakumar.thiruvenkidamtwilightsoftwares.com  | SmartWork@321 |

  Scenario: Login without providing any credentials
    When User does not enters email address and password
    And User clicks on the login button
    Then Verify the login button is disabled 
 
 