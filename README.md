
# DB Migration

This repo contains a microservice used as example for the Video [Database Migrations Best Practices](https://youtube.com/c/OutOfDevOps)

### Start a database using Docker
```bash
export LOCAL_PORT=5432
export POSTGRES_PASSWORD=testdb
export POSTGRES_USER=testdb
export DB_CONTAINER_NAME=testdb
docker run -d --rm -p ${LOCAL_PORT}:5432 \
  -e POSTGRES_PASSWORD=$POSTGRES_PASSWORD \
  -e POSTGRES_USER=$POSTGRES_USER \
  --name=$DB_CONTAINER_NAME \
  postgres
```
### Delete the database

```bash
docker rm -fv testdb
```