def call(String imageName, String context){
  sh "docker build -t '${imageName}' '${context}' "
}
