package Images

/**
  * Created by Own on 1/16/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.image._
import scalafx.scene.paint.Color
import javax.imageio._
import scalafx.embed.swing._

object WritingImage extends JFXApp{
  stage = new JFXApp.PrimaryStage {
    title = "Images"

    scene = new Scene(600, 600) {
      val img = new Image("file:C:/Users/Own/IdeaProjects/GUI/src/main/scala/Images/shark.jpg")

      val node = img.pixelReader match {
        case None => new Label("No image")
        case Some(p) =>
          val wimg = new WritableImage(p,img.width.value.toInt, img.height.value.toInt)
          val pixelwriter = wimg.pixelWriter
          for (i <-0 until (img.width.value.toInt)/2; j<-0 until img.height.value.toInt){
            val c = p.getColor(i,j)
            pixelwriter.setColor(i,j,Color(c.green,c.green,c.green,1.0))
          }
          ImageIO.write(SwingFXUtils.fromFXImage(wimg,null), "png", new java.io.File("C:/Users/Own/IdeaProjects/GUI/src/main/scala/Images/shark2.png"))             //into new image

          new ImageView(wimg)
      }
      content = node
    }
  }
}
