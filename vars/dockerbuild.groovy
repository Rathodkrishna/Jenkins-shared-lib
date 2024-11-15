def call (String ImageName, String ImageVersion){

  sudo sh "docker build -t ${ImageName}:${ImageVersion} ."
}
