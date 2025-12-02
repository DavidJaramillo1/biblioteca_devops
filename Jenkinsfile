pipeline{
     agent any

     tools{
          jdk 'jdk-17'
          maven 'Maven3.9.11'
     }
     stages {


          stage('Show messages'){
             steps {
                echo "Primer stage del pipeline"
                echo "A continuación hacemos checkout del proyecto"
             }
          }


           stage('Checkout proyecto'){
                       steps {
                          git branch: 'master',
                          url: 'https://github.com/DavidJaramillo1/biblioteca_devops.git'
                       }
                    }

                    stage('Maven clean'){
                    steps {
                   bat 'mvn clean'
                    }
                    }



     }

}