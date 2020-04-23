@tag
Feature: HomeOnline
  I want to use this template to perform the functional testing on HomeOnline

  @tag1
  Scenario: Check Admin sign up with valid data
    Given I Open Browser with URL "https://www.homeonline.com/"
    Then I Should See Home page
    When I Hovering the mouse over the Action icon
    And I Click on Sign Up link
    And I Enter the Valid Mobile Number
    Then Click on Continue Button
    When Enter the valid OTP No
    And Click on Continue Button
    When I close the Browser
    
    
    
    @tag2
	Scenario Outline: Check Sign Up with invalid data
	Given I Open Browser with URL "https://www.homeonline.com/"
	Then I Should See Home Page
	When I Hovering the mouse over the Action icon
  And I Click on Sign Up link
	And I Enter the Invalid Mobile No as "<num>"
  And Click on Continue Button
	Then I Should See Error Message
  And I Enter the Invalid OTP No as "<otm>"
  When I Close Browser


  Examples: 
	|num|otp|
	|982745719|1234567|
	|9827457479|Qedge123!@#|
	 