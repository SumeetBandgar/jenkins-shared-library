@Library("shared-library") _

pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    stages {
        stage("Checkout Repo") {
            steps {
                script{
                    buildApp.checkout(${REPO_URL}, ${BRANCH_NAME})
                }
            }
        }
        stage("Build Application") {
            steps {
                script{
                    buildApp.build()
                }
            }
            
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}