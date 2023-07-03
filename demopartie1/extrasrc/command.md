## Commande Docker 

**Création d'une instance sonarQube**
docker run -d --name sonarqube -p 9000:9000 -v sonardata:/opt/sonarqube/data -v sonarextensions:/opt/sonarqube/extensions sonarqube:9.9-community
