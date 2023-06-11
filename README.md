Ejemplo de Hello World 

[SpringBoot](http://projects.spring.io/spring-boot/)
[Docker](https://www.docker.com/)

#### Prerequisite 

Installed:   
[Docker](https://www.docker.com/)   
[git](https://www.digitalocean.com/community/tutorials/how-to-contribute-to-open-source-getting-started-with-git)   

Optional:   
[Docker-Compose](https://docs.docker.com/compose/install/)
[Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[Maven 3.x](https://maven.apache.org/download.cgi)


#### Steps

##### Clone source code from git
```
git clone git@github.com:FrankSeguel/ppt-acc-tutorial.git

```

##### Build Docker image
```
docker build -t="ppt/tutorial" .
```
Maven build will be executes during creation of the docker image.

>Note:if you run this command for first time it will take some time in order to download base image from [DockerHub](https://hub.docker.com/)

##### Run Docker Container
```
docker run --name tutorial -it --restart unless-stopped -d -p 8080:8080 ppt/tutorial
```

##### Test application

```
curl localhost:8080
```

response should be:
```
Hello World
```

#####  Stop Docker Container:
```
docker stop `docker container ls | grep "tutorial:*" | awk '{ print $1 }'`
```

### Run with docker-compose 

Build and start the container by running 

```
docker-compose up -d 
```

#### Test application with ***curl*** command

```
curl localhost:8080
```

response should be:
```
Hello World
```