
pipeline{
        agent any
        stages{
                stage('---build---'){
                        steps{
                               sh "docker build -t ayshamarty/account-num-gen-low ."
                        }
                }
                stage('---push---'){
                        steps{
                                sh "docker push ayshamarty/account-num-gen-low"
                        }
                }

                stage('---redeploy stack---') {
                    steps {
                            build job: "Account-API-Deploy", wait: true

                        }
                }
        }
}
