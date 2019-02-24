package Panes

/**
  * Created by Own on 1/12/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.layout._
import scalafx.event.ActionEvent

object TileStackAnchor extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title = "Tilepanes, Stackpanes and Anchorpanes"

    scene = new Scene(400,400){

      val tilePane: TilePane = new TilePane()
      for (i<- 1 to 9){
        val item = new Button("Button "+i)
        item.minWidth = 150
        tilePane.children += item
      }
      tilePane.children += new TextField

      val slider = new Slider(0,20,0)
      val label = new Label("Here it is")

      val anchor = new AnchorPane
      anchor.children = List ( label,slider)

      AnchorPane.setBottomAnchor(label,50)
      AnchorPane.setBottomAnchor(slider,10)
      AnchorPane.setLeftAnchor(label,0)
      AnchorPane.setLeftAnchor(slider,150)

      val stack = new StackPane
      stack.children = List(tilePane,anchor)

      root = stack
    }
  }
}
