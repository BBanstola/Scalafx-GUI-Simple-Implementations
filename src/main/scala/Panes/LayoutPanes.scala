package Panes

/**
  * Created by Own on 1/12/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.paint._
import scalafx.event.ActionEvent
import scalafx.scene.layout._

object LayoutPanes extends JFXApp {

  stage = new JFXApp.PrimaryStage{
    title = "Layout and Panes"

    scene = new Scene(400,400){
      val border = new BorderPane
      border.top = new Label("Top")
      border.bottom = new Button("Click me")
      border.left= new ListView(List(1,2,3))
      border.right = new Button("Click me 2")
      border.center = new TextArea

      root = border
    }

  }

}
