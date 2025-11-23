@echo off
echo Iniciando backend Sofia (Spring Boot)...
echo.
echo Usando H2 Database (em memória) para desenvolvimento
echo Console H2 disponível em: http://localhost:8080/h2-console
echo.
echo Iniciando aplicação Spring Boot...
./mvnw spring-boot:run

pause