# quotes-30-rock

GOAL: 
run a web app on docker in AWS ECS

# CREATING DEPLOYABLE DOCKER IMAGE
- create lein clj project
`lein new compojure quotes-30-rock`
- Get the app running 
`lein ring server-headless`
- Build the jar
`lein ring uberjar`
- Run the jar
`java -jar target/quotes-30-rock-0.1.0-SNAPSHOT-standalone.jar`
- Build a Docker image for the app
`docker build -t quotes-30-rock .`
- Run the app docker image locally
`docker run -it --rm -p3000:3000 quotes-30-rock`
- Tag the docker image
`docker tag quotes-30-rock:latest rikeshdhokia/quotes-30-rock:latest`
- `docker login` 
- Push docker image up to DH
`docker push rikeshdhokia/quotes-30-rock:latest`

# BUILD MY APP INFRA

- [ ] API gateway
- [ ] ALB
- [ ] ECS Cluster