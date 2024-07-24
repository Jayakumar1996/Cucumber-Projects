@tag1
@OrthognathicDesign
Feature: To test the functionality of Orthogathic Design procedure
  Scenario: User is able to check the functionality
    Given Launch the Orthognathic Design case from CMS emulator
    When User gets the list of tab names details
    When User click on summary tab
    When Click on Expand button in pre-op view 
 		And User click on the gear icon to open VCP

 #		And User Click on 2D slice view in VCP
 #		And User Click on 3D in VCP
 #		And User Gets displayed models name list
 		And User Click on the gear icon to close VCP
 		And Click on minimize button in pre-op view
 #		And  Click on Expand button in post-op view
 #		When User click on summary tab
 #		And User click on the gear icon to open VCP
 #		And User Click on 2D slice view in VCP
 #		And User Click on 3D in VCP
 #		And User Gets displayed models name list
 #		And User Click on the gear icon to close VCP
 #		And Click on minimize button in post-op view
 		
 		
 		
	