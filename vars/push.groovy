def call(String idName, String imageName,String newImageName ){

    withCredentials([usernamePassword(credentialsId: "${idName}",usernameVariable: "USER", passwordVariable: "PASS")]){
     sh " docker login -u ${env.USER} -p ${env.PASS}"
     sh "docker image tag ${imageName} ${env.USER}/${newImageName}"
     sh "docker push ${env.USER}/${newImageName}"
    }
}
