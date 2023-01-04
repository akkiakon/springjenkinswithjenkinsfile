pipeline {
    agent any
    tools {
        maven 
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