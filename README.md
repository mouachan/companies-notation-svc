# notation project

## Prerequesties 
Install :
- oc client
- knative client (kn)
- Openshift serverless operator from the operatorhub on your Openshift cluster

## Create a registry secret

```
oc create secret docker-registry quay-secret \
    --docker-server=quay.io/mouachan \
    --docker-username=mouachan+ocp_quay \
    --docker-password=FAVSCH1NQRMF6NV6ALAZHKW03VMKMU1LAC631BWT3MLL148EE2652FGWLTUQB93K
oc secrets link builder quay-secret
oc secrets link default quay-secret --for=pull
```

## Clone the source from github

```
git clone https://github.com/mouachan/dmn-svc-notation.git
```

## Build and generate native container image

```
./mvnw clean package  -Dquarkus.container-image.build=true -Dquarkus.container-image.name=dmn-svc-notation -Dquarkus.container-image.tag=native-1.0 -Pnative  -Dquarkus.native.container-build=true
```

## Push the image to your registry (change the username by yours)

Make sure that you are connected to your images registry and create a repo named frequent-flyer
```
docker tag amouachani/dmn-svc-notation:native-1.0 quay.io/mouachan/dmn-svc-notation:native-1.0
docker push quay.io/mouachan/dmn-svc-notation:native-1.0
```
