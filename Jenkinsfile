pipeline {
    agent { docker { image 'maven:3.6.0' } }
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
