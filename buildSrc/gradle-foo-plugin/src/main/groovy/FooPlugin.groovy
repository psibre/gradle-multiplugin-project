import org.gradle.api.Plugin
import org.gradle.api.Project

class FooPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('foo') << {
            println "Hello from the FooPlugin"
        }
    }
}
