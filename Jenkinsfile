pipeline {
    agent any
	tools {
	    maven
	 	}
	stages {
	    stage('install') {
		    steps {
		       bat 'mvn clean install'
			}
		}
		stage('package') {
		    steps {
		       bat 'mvn package'
			}
		}
    }
}