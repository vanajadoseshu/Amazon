Feature: Click on women category

Scenario: To select women category
Given Open chrome and browse the application to launch
When User clicks on All
And User clicks on the womens fashion
Then opens western wear

Scenario: To check for dresses
When User clicks on western wear
And clicks on trousers
Then selects an item
And Add item to wish list

Scenario: Remove selected item
 When User add selected item to wish list
 And User clicks on view wish list
 And User clicks on more options
 Then User selects delete from more options
 And User closes the browser