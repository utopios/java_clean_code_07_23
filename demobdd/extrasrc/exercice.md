Exercice : Ecris des scénarios de test en BDD pour les fonctionnalités suivantes et puis implementes-les en utilisant Cucumber et JUnit.

Fonctionnalité 1 : Un utilisateur peut réserver une salle s'il n'y a pas de conflit avec une autre réservation.

- Scénario : Réserver une salle qui est libre.
  - Étant donné une salle de conférence qui n'est pas réservée.
  - Quand un utilisateur essaie de réserver cette salle pour une période donnée.
  - Alors la salle devrait être réservée pour cet utilisateur pour cette période.

- Scénario : Essayer de réserver une salle qui est déjà réservée.
  - Étant donné une salle de conférence qui est déjà réservée pour une certaine période. 
  - Quand un autre utilisateur essaie de réserver cette salle pour la même période.
  - Alors l'utilisateur devrait recevoir un message d'erreur indiquant que la salle est déjà réservée pour cette période.