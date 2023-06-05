package javafx.window.base.windowextension

import javafx.fxml.FXML
import javafx.scene.control.Label
import java.lang.StringBuilder
import java.util.*

class HelloController : WindowBase() {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }

    override fun initializeWithParameters(vararg parameters: Any) {
        val sb = StringBuilder()
        sb.append("Arg1:${parameters[0]},")
        sb.append("Arg2:${parameters[1]},")
        sb.append("Arg3:${parameters[2]},")
        welcomeText.text =sb.toString()
    }
}