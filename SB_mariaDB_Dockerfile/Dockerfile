FROM openjdk:10
ADD target/sterkeverb2-0.0.1-SNAPSHOT.jar sterkeverb2-0.0.1-SNAPSHOT.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "sterkeverb2-0.0.1-SNAPSHOT.jar"]

# sterkeverb2-0.0.1-SNAPSHOT jar is created through building the project

# creating docker image:
# in IDE's terminal (repository name must be lower case, i.e. the one after -t):
# sudo docker build -f Dockerfile -t sterkeverb2 .

# Tomcat runs on port 8080
# mapping port 8085 to 8080
# sudo docker run -p 8085:9000 sterkeverb2

# docker images: http://172.17.0.1:9000/#/images
# view app page on http://172.17.0.1:8080  or localhost:8080