package Images

/**
  * Created by Own on 1/16/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.shape._
import scalafx.scene.image._
import scalafx.event.ActionEvent

object Images extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title = "Images"

    scene = new Scene(600,600){
      val img = new Image("file:C:/Users/Own/IdeaProjects/GUI/src/main/scala/Images/shark.jpg")

      val node = img.pixelReader match {
        case None => new Label("No image")
        case Some(p) =>
          println(p.getArgb(0,0))
          val c = (p.getColor(0,0))
          println(c.red + " " + c.green+ " "+c.blue)
          new ImageView(img)
      }
      content = node
    }
  }

}
