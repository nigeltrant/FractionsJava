pipeline{
  agent any
  
  stages{
    stage('Compile Stage'){
      steps{
        tool name: 'mavan_3_5_2', type: 'maven'{
          sh 'mvn clean compile'
        }
      }
    }
    
   stage('Testing Stage'){
     steps{
       tool name: 'mavan_3_5_2', type: 'maven'{
         sh 'mvn test'
        }
      }
    }
   stage('Deployment Stage'){
     steps{
       tool name: 'mavan_3_5_2', type: 'maven'{
         sh 'mvn deploy'
        }
      }
    }
  }
}
