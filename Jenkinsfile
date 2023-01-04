pipeline {
    agent any
    stages {
    
    stage('git') {
            steps {
                git url: 'https://github.com/akkiakon/springjenkinswithjenkinsfile.git'
            }
        }
        
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
        stage('Server') {
            steps {
                rtServer (
                id: "Artifactory",
                url: 'http://localhost:8082/artifactory',
                username: 'admin',
                password: '9676271812@Aa',
                bypassProxy: true,
                timeout: 300
                )
            }
        }
        stage('upload') {
            steps {
               rtUpload(
                   serverId:"Artifactory",
                   spec:'''{
                       "files": [
                       {
                           "pattern": "*.war",
                           "target": "logic-ops-lab-libs-snapshot-local"
                       }
                       ]

                   }''',
                   )
           }
        }
        stage('publish and build') {
            steps {
              rtPublishBuildInfo(
              	serverId: "Artifactory", 
              	)
            }
        }
        
    }
}