# This is a playground project for practicing Spring Boot

## Local Setup
### Install MySQL

- [MacOS](https://dev.mysql.com/doc/refman/8.0/en/macos-installation.html)
- [Windows](https://dev.mysql.com/doc/refman/8.0/en/windows-installation.html)
- [Linux](https://dev.mysql.com/doc/refman/8.0/en/linux-installation.html)

### Create Database

1. Once MySQL is installed, login into MySQL via CLI
`mysql -u <username> -p` and then enter the password
2. Once logged in, create the database. `CREATE DATABASE hrms`

### Run the application

Via IntelliJ, navigate to `HrmsApplication` class and click on the run button in the left-hand side.

Via CLI, `mvn clean spring-boot:run`

### Setting up environment variables

Via IntelliJ, set the environment variables at Run/Debug Configuration
Via CLI, set the environment variables with the command `SET <key> = <value>`
