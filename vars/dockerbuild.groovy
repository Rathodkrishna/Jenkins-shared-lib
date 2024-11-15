def call (String ImageName, String ImageVersion){

  sh "docker build -t ${ImageName}:${ImageVersion}"
}
