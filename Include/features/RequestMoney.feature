Feature: Request Money

  Scenario Outline: Request Money success
    Given User is at login page
    When User fills textbox with <email> 
    And User clicks Next button
    When User enter textbox with <password>
    And User clicks on Login button
    When User clicks Request
    Then User Input Details Request Payment from <email>
    Then User click Next button
    Then User Input Amount of money with <number>
    Then User click Request Payment
    Then User click Home

    Examples: 
      | email                                  | password | email                      | number |
      | sb-5nuc4314643945@business.example.com | 2D:)407m | nawwarahyusof123@gmail.com |  40.00 |
