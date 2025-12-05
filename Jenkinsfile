pipeline{
     agent any

     tools{
          jdk 'jdk-17'
          maven 'Maven3.9.11'
     }

     environment{
     VERSION_BACK = "4.0.0"
     }

     stages {


          stage('Show messages'){
             steps {
               bat 'echo "Primer stage del pipeline"'
               bat 'echo "A continuación hacemos checkout del proyecto"'
             }
          }


           stage('Checkout proyecto'){
                       steps {
                          git branch: 'master',
                          url: 'https://github.com/DavidJaramillo1/biblioteca_devops.git'
                       }
                    }

                    stage('Comandos Maven'){
                    steps {

                   bat 'mvn clean package'

                    }
                    }

                    stage('Crear directorio'){
                    steps{
                    bat 'mkdir v%VERSION_BACK%'
                    }

                    }

                    stage('Copiar ficheros '){
                    steps{
                    bat 'xcopy /Y ".\\target\\*.jar" ".\\"v%VERSION_BACK%"'
                    }
                    }

     }

}