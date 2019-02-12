pipeline {
    agent any
    tools {
        gradle 'gradle-3.3.0'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
				sh '''
					echo "PATH = ${PATH}"
					echo "M2_HOME = ${M2_HOME}"
				'''
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