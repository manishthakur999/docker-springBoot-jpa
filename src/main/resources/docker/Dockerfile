From tomcat:8-jre8

RUN ["rm", "-fr", "/usr/local/tomcat/webapps/ROOT"]

COPY @project.build.finalName@.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8181

CMD [ "catalina.sh", "run" ]

