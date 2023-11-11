help:
	@grep '^[^#[:space:]].*:' Makefile

test:
	@echo "test"
	./gradlew test

build:
	@echo "build"
	./gradlew build

docker-build:
	@echo "build docker image"
	./gradlew bootBuildImage
	docker run --rm heimskringla:0.0.1-SNAPSHOT

native-build:
	@echo "build native image"
	./gradlew nativeCompile
	./gradlew nativeTest

run:
	@echo "run"
	./gradlew bootRun

clean:
	@echo "build"
	./gradlew clean

deploy-local:
	@echo "deploy local"

deploy-remote:
	@echo "deploy remote"