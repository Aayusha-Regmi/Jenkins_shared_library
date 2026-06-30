def call(String idName, String imageName,String newImageName ){

    withCredentials([usenamePassword(credentialId: "${idName}",usernameVariable: "USER", usernamePassword: "PASS")]){
     sh " docker login -u ${env.USER} -p ${env.PASS}"
     sh "docker image tag ${imageName} ${env.USER}/${newImageName}"
     sh "docker push ${env.USER}/${newImageName}"
    }
}
