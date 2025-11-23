@echo off
echo Testando endpoints do backend...
echo.

echo 1. Testando health check...
curl -X GET http://localhost:8080/actuator/health
echo.
echo.

echo 2. Testando auth test...
curl -X GET http://localhost:8080/auth/test
echo.
echo.

echo 3. Testando registro de usuario...
curl -X POST http://localhost:8080/auth/register ^
  -H "Content-Type: application/x-www-form-urlencoded" ^
  -d "userName=test@test.com&password=123456&localizacao=CIDADE&cidade=Sao Paulo"
echo.
echo.

echo 4. Testando login...
curl -X POST http://localhost:8080/auth/login ^
  -H "Content-Type: application/json" ^
  -d "{\"userName\":\"test@test.com\",\"password\":\"123456\"}"
echo.

pause