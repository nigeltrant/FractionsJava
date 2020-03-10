node{
  stage('SCM Checkout'){
    git 'https://github.com/nigeltrant/FractionsJava'
  }
  
  stage('Compile-Package'){
    def mvnHome = tool name: '', type: 'maven'
    sh 'mvn package'
  }
}
