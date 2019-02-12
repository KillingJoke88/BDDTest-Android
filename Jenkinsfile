pipeline {
    agent any
    tools {
        gradle 'gradle-3.3.0'
        jdk 'JAVA_HOME'
    }
    stages {
        stage ('Initialize') {
            steps {
				bat 'echo %JAVA_HOME%'
            }
        }

        stage ('Build') {
            steps {
				dir('bdd/demoAndroid'){
					sh './gradlew clean test' 
				}
            }
            post {
                success {
					sh ''' 
						echo "Success"
					'''
                }
				always{
					junit 'bdd/app/build/reports/**/*.xml'
				}
            }
        }
    }
}