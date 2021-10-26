FROM openjdk:17.0.1 AS builder

WORKDIR /app

COPY ./app /app

RUN cd /app
RUN ./gradlew clean build -x test


FROM openjdk:17.0.1

COPY --from=builder /app/build/libs/*-SNAPSHOT.jar /app/service.jar

CMD java -jar /app/service.jar