Feature:Se connecter par des logins
  L'utilisateur se connecte avec son adresse mail et son mot de passe

  Scenario Outline: Identification valide
    Given je suis sur la page de login
    And j ai un compte utilisateur
    Then je clique sur la saisie du email
    And je saisi mon email <email>
    Then je clique sur la saisie du mot de passe
    And je saisi mon mot de passe <mot_de_passe>
    Then je clique sur le bouton connexion
    
    Examples: sample data
      | email         | mot_de_passe             |
      | "abv@yahoo.fr" | "123456"                |
      | "test@gmail.com" | "somePassWithVeryLongValue" |