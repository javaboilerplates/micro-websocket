echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push javaboilerplates/micro-websocket
docker push javaboilerplates/micro-websocket:0.0.0
