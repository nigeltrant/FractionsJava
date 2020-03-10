node{
  stage('SCM Checkout'){
    git 'https://github.com/nigeltrant/FractionsJava'
    username 'nigel73'
    password 'Tralee1973'
  }
  
  stage('Compile-Package'){
    def mvnHome = tool name: 'mavan_3_6_3', type: 'maven'
    sh 'mvn package'
  }
}
