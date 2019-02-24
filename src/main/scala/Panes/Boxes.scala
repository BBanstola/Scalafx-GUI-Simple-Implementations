package Panes

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.layout._

/**
  * Created by Own on 1/12/2019.
  */
object Boxes extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title = "Layout and Panes"

    scene = new Scene(400,400){
      val border = new BorderPane
      val hBox = new HBox(20, new Label("label here"), new Button("Button here"))
      val vBox = new VBox(20, new Label("label here"), new Button("Button here"))
      val flow = new FlowPane(10,10)
      flow.children =List(new Label("Flow Pane"), new Button ("Flowpane Button"))

      border.top = hBox
      border.bottom = new Button("Here")
      border.left= new ListView(List(1,2,3))
      border.right = vBox
      border.center = flow

      root = border
    }

  }

}
