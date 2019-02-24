package KeyBoardMouseInput

/**
  * Created by Own on 1/16/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.shape._
import scalafx.scene.input._
import scalafx.event.ActionEvent

object Input extends JFXApp{
  stage = new JFXApp.PrimaryStage{
    title = "Keyboard and Mouse Input"

    scene = new Scene(400,400){

      val circle = Circle(20,20,10)
      var rect = List[Rectangle]()

      onKeyPressed = (e:KeyEvent)=>{
        val oldX = circle.centerX.value
        val oldY = circle.centerY.value

        if(e.code == KeyCode.Up) circle.centerY= circle.centerY.value - 2
        if(e.code == KeyCode.Down) circle.centerY= circle.centerY.value + 2
        if(e.code == KeyCode.Left) circle.centerX= circle.centerX.value - 2
        if(e.code == KeyCode.Right) circle.centerX= circle.centerX.value + 2

        val clear = rect.forall(rec=>{
          Shape.intersect(circle, rec).boundsInLocal.value.isEmpty
        })

        if(!clear){
          circle.centerX = oldX
          circle.centerY = oldY
      }
      }

      content = circle

      onMouseClicked = (e:MouseEvent)=>{
        val rec = Rectangle(e.x-10, e.y-10, 20, 20)
        rect ::= rec
        content += rec
      }

      onMouseDragged = (e:MouseEvent)=>{
        val rec = Rectangle(e.x-10, e.y-10, 20, 20)
        rect ::= rec
        content += rec
      }

    }
  }
}
