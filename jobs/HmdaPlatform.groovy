job('HMDA-Platform-Assembly') {
    scm {
        git('git://github.com/cfpb/hmda-platform.git')
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        sbt('sbt', 'clean test assembly', '-Dsbt.log.noformat=true', '-Xmx2G -Xmx512M')
    }
}
