import org.gradle.api.Plugin
import org.gradle.api.Project

class BarPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.rootProject.subprojects.find { it.name == 'baz-project' }?.apply plugin: 'baz'
        project.task('bar') {
            dependsOn ':foo-project:baz-project:baz'
            doLast {
                println "Hello from the BarPlugin"
            }
        }
    }
}
