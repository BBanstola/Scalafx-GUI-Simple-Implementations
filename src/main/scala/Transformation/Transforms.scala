package Transformation


import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.{Scene,Group}
import scalafx.scene.control._
import scalafx.scene.transform._
import scalafx.scene.shape._


/**
  * Created by Own on 1/16/2019.
  */

object Transforms extends JFXApp{

  def makeLines:Group ={
    new Group(Line(-50,-50,-50,50),Line(50,-50,50,50))
  }

  stage = new JFXApp.PrimaryStage {
    title = "Transformation Begins"

    scene = new Scene(600, 600) {
      val lines1 = makeLines
      lines1.transforms = List(Transform.translate(100,100))

      val lines2 = makeLines
      lines2.transforms = List(Transform.translate(300,100),Transform.rotate(45,0,0))

      val lines3 = makeLines
      lines3.transforms = List(Transform.translate(100,300),Transform.scale(1.5,1.5))

      val lines4 = makeLines
      lines4.transforms = List(Transform.translate(300,300),Transform.shear(1.5,0.5))

      content =List(lines1,lines2, lines3, lines4)



    }
  }
}
