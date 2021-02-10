# bootify-kafka

## Apache Kafka Learning

## What is Apache Kafka

Apache Kafka is an open-source stream-processing software platform developed by the Apache Software Foundation, written in Scala and Java.


## Installation on MacOS

`
brew install kafka
brew install zookeeper
zkServer start
kafka-server-start /usr/local/etc/kafka/server.properties
`

## Create Topic

`
kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic myTopic
`

## Send a message
`
kafka-console-producer --broker-list localhost:9092 --topic myTopic > HELLO Kafka
`

## Receive a message
`
kafka-console-consumer --bootstrap-server localhost:9092 --topic myTopic --from-beginning HELLO Kafka
`

## Run all the test 

`
./gradlew test
`

## Run application
`
./gradlew bootRun
`
