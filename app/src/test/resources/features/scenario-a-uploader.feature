Feature: Scenario a uploader

  @ORPHAN
  Scenario: Session d essai
    Given je suis sur JIRA
    And je suis sur le module Requirements
    When je clique sur le bouton Import
    And je clique sur le bouton Select Features
    And je selectionne le fichier voulu
    Then je visualise le contenu du feature
