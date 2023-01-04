pipeline {
    agent any
    stages {
        
        stage('clean') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('package') {
            steps {
                sh "mvn package"
            }
        }
    }
}