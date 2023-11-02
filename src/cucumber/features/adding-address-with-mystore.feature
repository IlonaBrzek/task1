Feature: Adding address with mystore

  Scenario Outline: Adding new address for user after login at MyStore website
    Given Page MyStore opened in browser
    When User is signed in
    And Addresses tab is selected
    And the 'Create New Address' button is clicked
    Then Fields: '<alias>' '<address>' '<city>' '<postcode>' '<phone>' are completed
    And Address is saved
    And Address is added successfully
#    And Browser is closed

    Examples:
     | alias | address            | city   | postcode | phone     |
     | Mrs   | Downing Street 10  | London | SW1A 2AA | 506123456 |