# Ejemplo de Primer Rest Full 

[SpringBoot](http://projects.spring.io/spring-boot/)

#### Prerequisite 

Installed:
[git](https://www.digitalocean.com/community/tutorials/how-to-contribute-to-open-source-getting-started-with-git)

Optional:   
[Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[Maven 3.x](https://maven.apache.org/download.cgi)

#### Steps

##### Clone source code from git
```
git clone git@github.com:FrankSeguel/ppt-acc-tutorial.git

git checkout feature/PrimerRestFull

```

##### Build 
```
mvn clean package install
```
##### Run JAVA
```
java -jar target/ppt-acc-tutorial-0.0.1-SNAPSHOT.jar
```

##### Test application

```
curl http://localhost:8080/ppt-acc-tutorial/sistema/info
```
curl -X PUT http://localhost:8080/ppt-acc-tutorial/usuario/add -H 'Content-Type: application/json' -d '{"id":"1","usuario":"tutorial","nombre":"tutorial","apellido":"tutorial","email":"tutorial@gmail.com","fechaNac":"2022-01-10"}'
'''
curl http://localhost:8080/ppt-acc-tutorial/usuario/1/get
'''
curl -X DELETE http://localhost:8080/ppt-acc-tutorial/usuario/1/delete
'''
curl http://localhost:8080/ppt-acc-tutorial/usuario/getAll
'''

##### Test Jmeter

Installed:
[JMeter](https://jmeter.apache.org/download_jmeter.cgi)

Abrir el Archivo jmeter/ppt-acc-tutorial.jmx
