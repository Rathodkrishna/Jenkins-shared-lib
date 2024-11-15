def call(String imageName, String imageVersion){
  sudo sh "docker build -t ${imageName}:${imageVersion} ."
}
