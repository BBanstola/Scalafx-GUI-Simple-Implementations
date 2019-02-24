package Canvas

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.event.ActionEvent
import scalafx.scene.canvas._
import scalafx.scene.input._
import scalafx.scene.control._
import scalafx.scene.shape._

/**
  * Created by Own on 1/16/2019.
  */

object Canvas extends JFXApp{

  stage = new JFXApp.PrimaryStage {

    title = "Canvas"
    scene = new Scene(500,500){
      val canvas =new Canvas(500,500)

      val art = canvas.graphicsContext2D

      canvas.onMouseDragged = (e:MouseEvent)=>{
         art.fillOval(e.x,e.y,10,10)
      }
      content = canvas

    }
  }
}
