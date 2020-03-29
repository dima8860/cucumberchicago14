Feature: Student List API

  @batchID
  Scenario Outline: Getting list of students by batch number
    Given user gets students list with "<resource>"
    And user validates data from response by batch number "<batchID>"
    Examples:
      | resource          | batchID |
      | /student/batch/14 | 14      |

  @studentDelete
  Scenario Outline: Deleting student End to End scenario
    Given user deletes student with "<resource>"
    And user goes to cybertek training application
    Then user searches for the student with student ID "<studentID>"
    And user verifies that no result should show
    Examples:
      | resource              | studentID |
      | /student/delete/7625/ | 7625      |

  @studentCreate
  Scenario: Student creations with API E2E scenario
    Given user creates student with following data "/student/create"
      | firstName        | QA AUTOMATION   |
      | lastName         | Messi           |
      | emailAddress     | messi@gmail.com |
      | joinDate         | 01/01/2010      |
      | password         | 123jbr          |
      | subject          | Math            |
      | phone            | 3124756521      |
      | gender           | Male            |
      | admissionNo      | 10              |
      | birthDate        | 01/01/1990      |
      | major            | Football        |
      | batch            | 10              |
      | section          | LaLigA          |
      | premanentAddress | 921 W Huron St. |
      | companyName      | Barcelona       |
      | title            | Goatie          |
      | startDate        | 01/02/2010      |
      | city             | Barcelona       |
      | street           | 13 Hurnon       |
      | zipCode          | 60742           |
      | state            | IL              |
    And user goes to cybertek training application
    Then user searches for the student with newly created student ID
   And user verifies that student is created
