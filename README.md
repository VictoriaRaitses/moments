# moments


**Moments** is a learning curve development project to be able setup and run backend software 
together with a front end  framework like Thymyleaf and psql using docker.

Idea of writing moments was taken from Instagram as a reference.

Project is still under development.

How to:

       docker run -d -p 5432:5432 --name moments-postgres -e POSTGRES_PASSWORD=password  -e POSTGRES_DB=moments  -e POSTGRES_USER=moments postgres
       mvn spring-boot:run
