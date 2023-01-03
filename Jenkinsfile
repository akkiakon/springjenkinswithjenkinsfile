pipeline {
    agent any

    tools {
        maven "3.6.3"
    }

    stages {
        stage('Build') {
            steps {
                 bat 'mvn clean install'
            }
        }
    }
    stages {
        stage('package') {
            steps {
                 bat 'mvn package'
            }
        }
    }
}
