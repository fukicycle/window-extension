package javafx.window.base.windowextension

import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

object Window {
    fun create(classes:Class<*>,fxml:String,title:String):WindowBase{
        val stage = Stage()
        val fxmlLoader = FXMLLoader(classes.getResource(fxml))
        val scene = Scene(fxmlLoader.load())
        stage.title = title
        stage.scene = scene
        val windowBase = fxmlLoader.getController<WindowBase>()
        windowBase.stage = stage
        return windowBase
    }
}