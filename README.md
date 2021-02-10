# bootify-kafka

## Apache Kafka Learning

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
