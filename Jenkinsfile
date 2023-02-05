pipeline {
    agent any
    stages {

        stage ('Testing Stage') {
                    steps {
                        withMaven(maven : 'maven3-8-6') {
                            sh 'mvn test'
                        }
                    }
        }


    }
}