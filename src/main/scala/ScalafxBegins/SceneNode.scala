package ScalafxBegins

/**
  * Created by Own on 12/30/2018.
  */

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._

object SceneNode extends JFXApp{
  stage= new JFXApp.PrimaryStage{
    title = "nodes and scene"
    scene =  new Scene(500,500){
      val button= new Button("Turn me on")

      content = button}
  }
}
