#!/bin/bash

destination=$1
name=$2
packageName=$3
moduleName=$4

if [ "$destination" == "" ]; then
    read -p 'Please enter a destination path: ' destination
fi

if [ "$name" == "" ]; then
    read -p 'Please enter a domain object name: ' name
fi

if [ "$packageName" == "" ]; then
    read -p 'Please enter a java package name: ' packageName
fi

if [ "$moduleName" == "" ]; then
    read -p 'Please enter an angular module name: ' packageName
fi

javaDestination="$destination/src/main/java"
./java-pojo.sh $javaDestination $name $packageName
./guice-dao.sh $javaDestination $name $packageName
./guice-service.sh $javaDestination $name $packageName
./guice-module.sh $javaDestination $name $packageName
./jersey-controller.sh $javaDestination $name $packageName

javascriptDestination="$destination/src/main/javascript"
./ng-resource.sh $javascriptDestination $name $moduleName
./ng-controller.sh $javascriptDestination $name $moduleName
./ng-directive.sh $javascriptDestination $name $moduleName
./ng-service.sh $javascriptDestination $name $moduleName
