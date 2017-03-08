job('HMDA-Platform-Assembly') {
    scm {
        git('git://github.com/cfpb/hmda-platform.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        sbt('clean test assembly')
    }
}
