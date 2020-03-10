node{
  stage('SCM Checkout'){
    git 'https://github.com/nigeltrant/FractionsJava.git'
  }
  
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
