#!/bin/bash

destination=$1
name=$2
moduleName=$3

if [ "$destination" == "" ]; then
    read -p 'Please enter a destination path: ' destination
fi

if [ "$name" == "" ]; then
    read -p 'Please enter a directive name: ' name
fi

if [ "$moduleName" == "" ]; then
    read -p 'Please enter a module name: ' moduleName
fi

./generate.sh $destination angular-directive $name $moduleName
