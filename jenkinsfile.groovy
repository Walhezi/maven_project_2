pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                echo 'Building...'
            }
        }
        stage ('Deploy to Staging'){
            steps {
                echo 'deploying...'
            }
        }
    }
}