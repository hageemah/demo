pipeline {
  agent any
  stages {
    stage('stage1') {
      parallel {
        stage('stage1') {
          steps {
            sleep 2
            sleep 2
          }
        }
        stage('step2') {
          steps {
            sleep 4
          }
        }
      }
    }
    stage('stage2') {
      steps {
        build '1'
      }
    }
    stage('stage3') {
      steps {
        echo 'test'
      }
    }
  }
  environment {
    test = 'test'
  }
}