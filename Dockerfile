FROM java:8-jre

MAINTAINER huangll99@126.com
ADD flash-1.0.jar /app.jar

EXPOSE 8080
ENTRYPOINT ["java","-Xmx300m","-Deureka.client.serviceUrl.defaultZone=http://cloud-eureka:8080/eureka/","-Dserver.port=8080","-jar","app.jar"]