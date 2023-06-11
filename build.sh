#!/bin/bash
echo "Compilando Fuentes"

export JAVA_HOME=/opt/jdk-17.0.7
export MAVEN_HOME=/opt/apache-maven-3.9.2

export PATH=$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH

mvn clean package install

echo '==FIN del Build=='
