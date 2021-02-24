Feature: As a student I should be able to
  search books with different categories

@lol
  Scenario: Student able to search  books by list of categories
    Given User logged in as a student
    Then User able to see below list of books categories
      | ALL                    |
      | Action and Adventure  |
      |  Anthology             |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |


