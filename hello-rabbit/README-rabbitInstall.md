# Intro
This contains setup of RabbitMQ in Kubernetes / docker, as well as sample code to test that teh install is running.

The insoiration are from the following:

Thought to self; This is a singe container setup, I guess it´s enough for dev and test, should cent1 get a cluster - or is that waste of my time (I should rather code Java :-))

# Install and configure MariaDB in K8S
This is the commands done in installing Rabbit on Mac Air, to be repeated on mini and cent1.

## Set namespace
kubectl create namespace mariadb
kubectl config set-context --current --namespace=mariadb

#### GKommandoer for gjennomføring
 cd /Users/torestokkedal/Projects-workspaces/HelloMiddleware/hello-mariadb/src/yaml
 kubectl apply -f ./persistentvolumeclaim.yml
 kubectl apply -f ./ts-mariadb-setup.yaml
 kubectl apply -f ./service.yaml

 #### Test with