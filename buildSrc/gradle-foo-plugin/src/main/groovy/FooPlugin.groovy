import org.gradle.api.Plugin
import org.gradle.api.Project

class FooPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.rootProject.subprojects.find { it.name == 'bar-project' }?.apply plugin: 'bar'
        project.task('foo') {
            dependsOn ':foo-project:bar-project:bar'
            doLast {
                println "Hello from the FooPlugin"
            }
        }
    }
}
