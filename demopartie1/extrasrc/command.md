## Commande Docker 

**Création d'une instance sonarQube**
docker run -d --name sonarqube -p 9000:9000 -v sonardata:/opt/sonarqube/data -v sonarextensions:/opt/sonarqube/extensions sonarqube:9.9-community

**Analyse manuel sonarqube**

mvn clean verify sonar:sonar \
-Dsonar.projectKey= \
-Dsonar.host.url= \
-Dsonar.login=

**Plugin checkstyle**
```maven
<reporting>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>3.0.0</version>
            </plugin>
        </plugins>
</reporting>
```
**Commande check**: mvn checkstyle:checkstyle

**Plugin pmd**
```maven
<reporting>
        <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-pmd-plugin</artifactId>
                <version>3.7</version>
                <!--<configuration>
                    <rulesets>
                        <ruleset>/rulesets/java/naming.xml</ruleset>
                    </rulesets>
                </configuration>-->
            </plugin>
</reporting>
```
**Commande check**: mvn pmd:pmd


**Démarrer un docker compose** : docker-compose up -d
**Exécuter une commande dans un conteneur docker** : docker exec -it <id_container> <command>

