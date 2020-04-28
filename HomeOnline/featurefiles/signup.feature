@tag
   Feature: HomeOnline
  

 @tag1
    Scenario:Sign_Up Functionality
    Given I Open Browser with URL "https://www.homeonline.com/"
    Then I Should See Home page
    When I Click on Action icon
    And I Click on Sign Up link
    And I switch the frame
    Then I set explicit wait on phon no element until it becomes click
    And I Enter the Valid Mobile Number
    Then Click on Continue Button
    When Enter the valid OTP No
    When I set implicit timeout
    And Click on Confirm Button
    And Back to the default frame
    Then I set explicit wait on cross icon element until it becomes clickable
    Then Click on Cancel icon
    When I close the Browser
    
    
    
    @tag2
	Scenario Outline: Check Login Functionality with Valid or Invalid data
    Given I Open Browser with URL "https://www.homeonline.com/"
	When I Click on Action icon
    And I Click on Login link
    And I Switch the Frame
	When I Enter the Email Address as "<email>"
    And Click on Continue2 Button
	When I Enter the Password as "<pword>"
	And Click On Sign_in Button
	And Back to the default frame1
	Then I set explicit wait on cancel icon element until it becomes clickable
	Then I set explicit wait on cross icon element until it becomes clickable
    Then Click on Cancel Icon
    When I Close Browser


  Examples: 
	|email|pword|
	|corwin.dell@gmail.com|dbcl@2019|
	
	
	 