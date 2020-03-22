Feature: Deleting teacher service
  @teacherDelete
  Scenario: Positive teacher deleting
    Given user deletes teacher at "/teacher/delete/2776"
    And user gets teacher at "/teacher/2776"
    Then user verifies response message "Teacher with id = 2776 NOT FOUND!"

