FROM alpine:latest
LABEL maintainer="Shabbir"
ENV JAVA_HOME /home/java
RUN apk update
RUN apk add tree
COPY . ./
CMD echo "${JAVA_HOME}"