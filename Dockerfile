# je pars de cette image parceque il parait que openjdk n'est plus maintenu.
FROM eclipse-temurin:17
CMD ["java", "-jar", "/opt/app/mood-app.jar"]
COPY target/mood-app.jar /opt/app/mood-app.jar