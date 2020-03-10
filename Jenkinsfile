node{
  stage('SCM Checkout'){
    git 'https://github.com/nigeltrant/FractionsJava'
  }
  
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
