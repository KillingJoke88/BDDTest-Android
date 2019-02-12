pipeline {
    agent any
    tools {
        gradle 'GRADLE'
        jdk 'JAVA_HOME'
    }
    stages {
        stage ('Initialize') {
            steps {
				bat 'echo %GRADLE%'
            }
        }

        stage ('Build') {
            steps {
				dir('bdd/demoAndroid'){
					bat 'gradlew.bat clean test' 
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