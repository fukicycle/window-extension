package javafx.window.base.windowextension

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import java.time.LocalDate

class HelloApplication : Application() {
    var isDialog = true
    override fun start(stage: Stage) {
        if (isDialog) {
            val wb = Window.create(this.javaClass, "hello-view.fxml", "Hello window")
            wb.initializeWithParameters("This is initial parameter 1", 1, LocalDate.now())
            var result = wb.showDialog()
        } else {
            Window.create(this.javaClass, "hello-view.fxml", "Hello window").show()
        }
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}