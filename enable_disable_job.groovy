pipelineJob("enable-disable_job") {
    description("enable disable cron jobs")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('git@github.com:techieguy007/jenkins_test_dsl.git')
                        credentials('github-techieguy')
                    }
                    branch('test_dsl')
                    scriptPath("enable_disable.jenkinsfile")
                }
            }
        }
    }
}
