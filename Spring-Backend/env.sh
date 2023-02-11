#!/bin/sh

echo "Setting env variables"

export AZ_RESOURCE_GROUP=tmp-spring-jdbc-sql-server
export AZ_DATABASE_NAME=XXXXXX-tmp-spring-jdbc-sql-server
export AZ_LOCATION=eastus
export AZ_SQL_SERVER_USERNAME=spring
export AZ_SQL_SERVER_PASSWORD=XXXXXXXXXXXXXXXXXXX
export AZ_LOCAL_IP_ADDRESS=$(curl http://whatismyip.akamai.com/)

export SPRING_DATASOURCE_URL="jdbc:sqlserver://dcssqldeploy.database.windows.net:1433;database=DCS-SQL-Deployment;user=SQLAdmin@dcssqldeploy;password=SqlDeploy56;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;"
export SPRING_DATASOURCE_USERNAME=spring@$DCS-SQL-Deployment
export SPRING_DATASOURCE_PASSWORD=$SqlDeploy56


# Source: https://github.com/Azure-Samples/quickstart-spring-data-jdbc-sql-server