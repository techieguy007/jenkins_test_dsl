pipelineJob("enable-disable_job") {
    properties {
        pipelineTriggers {
            triggers {
                cron { spec('H 01 * * *') }
            }
        }
    }
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
                    scriptPath("jenkins_test_dsl/enable_disable.jenkinsfile")
                }
            }
        }
    }
}
