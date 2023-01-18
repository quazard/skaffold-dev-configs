# Image based on https://github.com/bscott/pocketbase-docker

FROM alpine:3.17.1

ARG POCKETBASE_VERSION=0.11.2

RUN apk add --no-cache \
    ca-certificates \
    unzip \
    wget \
    zip \
    zlib-dev

ADD https://github.com/pocketbase/pocketbase/releases/download/v${POCKETBASE_VERSION}/pocketbase_${POCKETBASE_VERSION}_linux_amd64.zip /tmp/pocketbase.zip
RUN unzip /tmp/pocketbase.zip -d /usr/local/bin/
RUN chmod +x /usr/local/bin/pocketbase

EXPOSE 8090

CMD [ "/usr/local/bin/pocketbase", "serve" ]