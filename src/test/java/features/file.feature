
Feature: Add a new Employee

Background:
		Given The user will log in with valid admin credentials "y.ogurlu" and "ElifimBurcum2014!@"
		And user will navigate to add employee page

  @AddEmployee
  Scenario: Add Employee with required fields
  
    When user enters employees "fName", "lName" and "userName"
    And user clicks submit button
    Then employee has been added successfully
