package Graphics

/**
  * Created by Own on 1/16/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.event.ActionEvent
import scalafx.scene.shape._
import scalafx.scene.text._

object BasicShapes extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title = "Basic Shape"
    scene = new Scene(600,600){
      val rect = Rectangle(10,10,80,80)
      val circle = Circle(150,60,40)    //radius point at 150, 40 and radius is 40
      val ellipse = Ellipse(250,60,40,50)
      val line = Line(350,10,390,60) //coordinate for both point
      val text = new Text(410,50,"Here is the Text")

      val poly = Polygon(10,110,10,290,40,350)
      val polyL = Polyline(110,110,110,190,190,190,190,110,150,150  )

      val arc = Arc(520,110,40,30,0,270) //x,y,radiusx,radiusy,angle

      val quad = QuadCurve(310,110,350,190,390,110)

      val cubiccurve =new CubicCurve()
      cubiccurve.startX=410
      cubiccurve.startY=110
      cubiccurve.endX=490
      cubiccurve.endY=190
      cubiccurve.controlX1=410
      cubiccurve.controlY1=290
      cubiccurve.controlX2=490
      cubiccurve.controlY2=110

      content = List(rect, circle, ellipse, line, text, poly, polyL, arc, quad, cubiccurve)


    }
  }

}
