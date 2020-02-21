@Login
Feature: As a user i want to add item in the cart successfully

  Scenario: I want to add the item in cart succesfully
    Given user is on login page
    Then Create your account
      | First Name    | Elavarasan                                |
      | Last Name     | Srinivasan                                |
      | Email Address | elavarasansrinivasan2020@gmail.com        |
      | Address       | Dugar MME Gold City, Tower 4 ,Flat No 304 |
      | Password      | Password1                                 |
      | City          | Chennai                                   |
      | PostalCode    | 35007                                     |
      | Mobile Phone  | 9500414365                                |
      | Address Alias | chidambaram                               |
    And Sign out from the application
    And Login with valid user name "elavarasansrinivasan2020@gmail.com" and password "Password1"
    Then Navigate to My Addresses and add a new address
      | First Name    | ElavarasanUpdated                                  |
      | Last Name     | SrinivasanUpdated                                  |
      | Email Address | elavarasansrinivasan2020@gmail.com                 |
      | Address       | Dugar1 MME Gold City, Tower 4 ,Flat No 304 Updated |
      | Password      | Password1                                          |
      | City          | ChennaiUpdated                                     |
      | PostalCode    | 35006                                              |
      | Mobile Phone  | 9500414364                                         |
      | Address Alias | DallasUpdated                                      |
    Then Navigate to 'Women' --> Summer dresses
    And Move to your profile and check order history and details
    Then Capture screenshot of the order history
    And Sign out from the application

