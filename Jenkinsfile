pipeline {
    agent any
    tools {
        maven 'apache-maven-3.0.1' 
    }
    stages {
        
        stage('clean') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('package') {
            steps {
                 bat "mvn package"
            }
        }
    }
}