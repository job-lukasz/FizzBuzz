pipeline {
  agent any
  stages {
    stage('Preparation') {
      steps {
        echo 'hello'
        junit(testResults: '*', allowEmptyResults: true, healthScaleFactor: 2)
        checkstyle(pattern: '*')
      }
    }
  }
}