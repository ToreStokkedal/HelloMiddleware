# Intro
This contains setup of RabbitMQ in Kubernetes / docker, as well as sample code to test that teh install is running.

The insoiration are from the following:
- TGIR - I want to run RabbitMQ in K8S, where do I start?, at https://www.youtube.com/watch?v=-yU95ocpBYs
- Rabbit Blog; https://www.rabbitmq.com/blog/2020/08/10/deploying-rabbitmq-to-kubernetes-whats-involved/

Thought to self; This is a singe container setup, I guess it´s enough for dev and test, should cent1 get a cluster - or is that waste of my time (I should rather code Java :-))

# Install and configure RabbitMq in K8S¨
This is the commands done in installing Rabbit on Mac Air, to be repeated on mini and cent1.

## Set namespace

kubectl create namespace rabbitmq
kubectl config set-context --current --namespace=rabbitmq

tsair1-2:´k8s torestokkedal$ kubectl apply -f ./statefulset.yml

## Create colume claim
 kubectl apply -f persistentvolumeclaim.yml
 kubectl apply -f service.yml

## Run stresstest
kubectl <??> -f benchmark.job

The stresstest executed nicely and was around 5000 messages pr second on the mac-air.


# Testing reveals that Loadbalancer do not work for AMQP
Instalation was tested with sample project code, in this project
- Det fungerer på manuell Port Forward fra K9S på port 5672
- Det fungerer for admin på IP adresse (192.168.99.100:31300) som konfigurert i Service
- Admin fungerer også på localhost:15672 når port forward er satt opp, men ikke på IP adresse og 15672 (K9S aksepterer bare 1 port forward)