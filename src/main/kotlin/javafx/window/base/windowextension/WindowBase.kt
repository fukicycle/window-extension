package javafx.window.base.windowextension

import javafx.stage.Modality
import javafx.stage.Stage
import java.util.Objects

abstract class WindowBase{
    var stage:Stage? = null
    var dialogResult = true

    fun show(){
        if(stage == null) throw IllegalArgumentException("Stage is null")
        stage!!.show()
    }

    fun showDialog():Boolean{
        if(stage == null) throw IllegalArgumentException("Stage is null")
        stage!!.initModality( Modality.APPLICATION_MODAL)
        stage!!.showAndWait()
        return dialogResult
    }

    fun close(){
        if(stage == null) throw IllegalArgumentException("Stage is null")
        stage!!.close()
    }

    abstract fun initializeWithParameters(vararg parameters: Any)
}