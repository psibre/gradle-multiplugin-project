import org.gradle.api.Plugin
import org.gradle.api.Project

class BarPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('bar') << {
            println "Hello from the BarPlugin"
        }
    }
}
