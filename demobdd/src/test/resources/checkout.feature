Feature: Checkout
  Scenario Outline: Checkout books
    Given The Book "<name>" cost <price>
    When buy <qty> of the Book "<name>"
    Then total of "<name>" checkout is <total>

    Examples:

      |name| price | qty | total|
      | b1 | 10    | 1   | 10   |
      | b2 | 20    | 2   | 40   |