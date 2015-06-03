import org.gradle.api.Plugin
import org.gradle.api.Project

class BazPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('baz') << {
            println "Hello from the BazPlugin"
        }
    }
}
