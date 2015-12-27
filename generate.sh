#!/bin/bash

templatePath='templates/'

destination=$1
templateType=$2
name=$3
moduleName=$4

case $templateType in
    angular-*)
        language=javascript
        ;;
    jersey-*)
        language=java
        ;;
    guice-*)
        language=java
        ;;
    java-*)
        language=java
        ;;
    *)
        echo "Unrecognized template type: $templateType"
        exit 1
esac

case $language in
    javascript)
        fileExtension=js
        ;;
    java)
        fileExtension=java
        packagePath="${moduleName//\./\/}"
        destination="$destination/$packagePath"
        ;;
esac

mkdir -p "$destination"
fileName=$name

case $templateType in
    java-pojo)
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    guice-module)
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    guice-service)
        cat "$templatePath/$templateType-interface.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        fileName="Default$name"
        cat "$templatePath/$templateType-implementation.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    guice-dao)
        cat "$templatePath/$templateType-interface.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        fileName="Mock$name"
        cat "$templatePath/$templateType-implementation.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    *)
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
esac
