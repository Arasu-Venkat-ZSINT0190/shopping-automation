Feature: User Login on Advantage Online Shopping

  Scenario Outline: User logs in successfully
    Given user is on the Advantage Online Shopping homepage
    When user clicks on the user icon
    And user enters username "<username>" and password "<password>"
    And user clicks login button
    Then user should see the username "<username>" displayed on the dashboard

    Examples:
      | username | password  |
      | arasuv   | Arasu@123 |
      | testuser | Test@123  |
