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

case $templateType in
    java-pojo)
        fileName=$name
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    jersey-controller)
        fileName="${name}WebService"
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    guice-module)
        fileName="${name}GuiceModule"
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    guice-service)
        fileName="${name}Service"
        cat "$templatePath/$templateType-interface.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        fileName="Default${name}Service"
        cat "$templatePath/$templateType-implementation.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    guice-dao)
        fileName="${name}Dao"
        cat "$templatePath/$templateType-interface.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        fileName="Mock${name}Dao"
        cat "$templatePath/$templateType-implementation.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    angular-resource)
        fileName=$name
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    angular-controller)
        fileName="${name}Controller"
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    angular-directive)
        fileName="${name}Directive"
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
    angular-service)
        fileName="${name}Service"
        cat "$templatePath/$templateType.template.$fileExtension" | sed "s/@@name@@/$name/g" | sed "s/@@moduleName@@/$moduleName/g" > "$destination/$fileName.$fileExtension"
        ;;
esac
