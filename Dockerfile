FROM tomcat
MAINTAINER Nandan

# Add the service itself
ARG WAR_FILE
ADD target/${WAR_FILE} /usr/local/tomcat/webapps/app.war