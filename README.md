# Spring Boot - Mysql - JPA - External Rest Call API

This is a Rest Web Service Provider. Its aim that connect MySql database and with in JPA integration doing CRUD operations. 

## Installation

Use the package manager [pip](https://pip.pypa.io/en/stable/) to install foobar.

```bash
git clone https://github.com/emrahseren/spring-boot-mysql-rest-api.git
cd spring-boot-mysql-rest-api
mvn clean install
```

## Configuration

```python
resources/application.propeties file

set this DB Connection values for your envariment.
spring.datasource.url=jdbc:mysql://localhost:3306/mvc?serverTimezone=UTC
spring.datasource.username=user_name
spring.datasource.password=user_password

```
Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)