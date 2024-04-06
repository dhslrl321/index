# Docker 컨테이너 이름
CONTAINER_NAME=my-mysql

# Docker 이미지 이름
IMAGE_NAME=mysql:8.0

# MySQL 환경 설정
MYSQL_DATABASE=storing-aggregate-to-json
MYSQL_USER=storing-aggregate-to-json
MYSQL_PASSWORD=storing-aggregate-to-json
MYSQL_ROOT_PASSWORD=storing-aggregate-to-json

start-db:
	docker run --name $(CONTAINER_NAME) -e MYSQL_DATABASE=$(MYSQL_DATABASE) -e MYSQL_USER=$(MYSQL_USER) -e MYSQL_PASSWORD=$(MYSQL_PASSWORD) -e MYSQL_ROOT_PASSWORD=$(MYSQL_ROOT_PASSWORD) -v $(PWD)/mysql:/docker-entrypoint-initdb.d -d -p 3306:3306 $(IMAGE_NAME)

stop-db:
	docker stop $(CONTAINER_NAME) && docker rm $(CONTAINER_NAME)
