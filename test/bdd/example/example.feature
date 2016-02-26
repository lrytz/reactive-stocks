Feature: example

Scenario: eat some cucumbers
  Given there are 5 cucumbers
  When I eat 2 cucumbers
  Then there are 3 cucumbers left
