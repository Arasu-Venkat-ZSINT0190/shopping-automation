Feature: User Signup on Advantage Online Shopping

  Scenario Outline: User registers successfully
    Given user is on the Advantage Online Shopping registration page
    When user fills the signup form with "<username>", "<email>", "<password>", "<confirmPassword>", "<firstName>", "<lastName>", "<phone>", "<country>", "<city>", "<address>", "<state>", "<postalCode>"
    And user submits the registration form
    Then user should see the username "<username>" displayed on the dashboard

    Examples:
      | username | email             | password  | confirmPassword | firstName | lastName | phone      | country   | city   | address       | state       | postalCode |
      | arasuv   | arasu@example.com | Arasu@123 | Arasu@123       | Arasu     | Venkat   | 1234567890 | India     | Mumbai | 123 Street Rd | Maharastra  | 400001     |
      | testuser | test@example.com  | Test@123  | Test@123        | Testing   | User1    | 9876543210 | Australia | Sydney | 456 Hill Lane | NSW         | 2000       |
