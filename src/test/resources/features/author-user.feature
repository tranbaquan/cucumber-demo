Feature: Authorize input user

  Scenario Outline: Authorize valid user
    Given I enter an username: "<username>"
    Given I enter a password: "<password>"
    When I authorize user
    Then I expect to receive "<value>"
    Examples:
      | username   | password | value |
      | tranbaquan | 123      | true  |
      | user1      | 123      | true  |
      | user2      | 123      | true  |
      | user3      | 123      | true  |
      | user4      | 123      | true  |
      | user5      | 123      | true  |
      | user6      | 123      | true  |
      | user7      | 123      | true  |
      | user8      | 123      | true  |
      | user9      | 123      | true  |

  Scenario Outline: Authorize invalid user
    Given I enter an username: "<username>"
    Given I enter a password: "<password>"
    When I authorize user
    Then I expect to receive "<value>"
    Examples:
      | username   | password | value |
      | tranbaquan | 1234     | false |
      | user11     | 123      | false |
      | user12     | 123      | false |
      | user13     | 123      | false |
      | user14     | 123      | false |
      | user15     | 123      | false |
      | user16     | 123      | false |
      | user17     | 123      | false |
      | user18     | 123      | false |
      | user19     | 123      | false |