# new feature
# Tags: optional

Feature: Select Menu
  Scenario: Select menus
    Given I open select menu website https://demoqa.com/selectmenu/
    When I select fast in the speed as fast
    Then I verify fast value is already selected in the speed
    When I select as Some unknown file in select file
    Then I verify as Some unknown file value is already selected in select file
    When I select 4 in select a number
    Then I verify 4 value is already selected in select a number
    When I select Mrs. in select a title
    Then I verify Mrs value is already selected in select a title


#  Scenario Outline : Select menus
#    Given I open select menu website <website>
#    When I select fast in the speed as <speed>
#    Then I verify fast value is already selected in the speed
#    When I select as <file> in select file
#    Then I verify Some unknown file value is already selected in select file
#    When I select number as <number> in select a number
#    Then I verify 4 value is already selected in select a number
#    When I select <title> in select a title
#    Then I verify Mrs. value is already selected in select a title
#
#  Examples:
#  |website                        | speed|file             |number   |title|
#  |https://demoqa.com/selectmenu/ |fast  |Some unknown file|4        |Mrs.  |
