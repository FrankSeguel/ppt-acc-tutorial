# Ejemplo de Hello World 

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

git checkout feature/HelloWorld!

```

##### Build 
```
mvn clean package install .
```
##### Run JAVA
```
java -jar target/ppt-acc-tutorial-0.0.1-SNAPSHOT.jar
```

##### Test application

```
curl http://localhost:8080/ppt-acc-tutorial/hello
```

response should be:
```
Hello, World!
```