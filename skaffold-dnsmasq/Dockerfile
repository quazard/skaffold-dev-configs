FROM alpine:3.16.2

RUN apk --no-cache add dnsmasq

EXPOSE 53 53/udp

ENTRYPOINT [ "dnsmasq", "-k" ]