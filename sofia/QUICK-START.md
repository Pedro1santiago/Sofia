# Quick Start - Sofia Backend

## Início Rápido (sem PostgreSQL)

O projeto agora usa **H2 Database** por padrão para facilitar os testes.

### 1. Iniciar Backend
```bash
./mvnw spring-boot:run
```

### 2. Verificar se está funcionando
- **API Health**: http://localhost:8080/actuator/health
- **H2 Console**: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:sofia_db`
  - Username: `sa`
  - Password: (deixar vazio)

### 3. Endpoints Disponíveis
- `POST /auth/login` - Login
- `POST /auth/register` - Registro
- `GET /context` - Dados do dashboard
- `POST /user-interaction` - Demandas
- `POST /opinion` - Avaliações

## Profiles Disponíveis

### Desenvolvimento (padrão)
```bash
./mvnw spring-boot:run
```
Usa H2 Database em memória.

### Produção (com PostgreSQL)
```bash
./mvnw spring-boot:run -Dspring.profiles.active=prod
```
Requer PostgreSQL configurado.

## Sem Dependências Externas
✅ Não precisa de PostgreSQL  
✅ Não precisa de configuração de banco  
✅ Funciona imediatamente após o clone