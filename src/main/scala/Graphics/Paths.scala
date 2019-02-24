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
import scalafx.scene.paint._

object Paths extends JFXApp{
  stage = new JFXApp.PrimaryStage{
    title = "paths"
    scene = new Scene(600,600){
      val svg = new SVGPath
      svg.content = "M10,10 L10,190 C190,190,190,10 10,10"
      svg.fill = Color.Tomato

      val path = new Path
      path.elements += MoveTo(210,10)
      path.elements += VLineTo(210)
      path.elements += HLineTo(10)
      path.elements += LineTo(210,290)

      path.elements += QuadCurveTo(600,600,590,10)
      path.elements += new ClosePath()

      path.fill = LinearGradient(250,250, 450,50, false, CycleMethod.Reflect, Stop(0, Color.Black),Stop(0.1, Color.Red),Stop(0.9, Color.Blue),Stop(1, Color.White))
      path.strokeWidth = 16
      path.strokeType = StrokeType.Centered
      path.stroke = Color.Blue
      path.strokeDashArray = List(25.0,20.0,45.0,30.0)
      path.strokeLineCap = StrokeLineCap.Round
      path.strokeLineJoin = StrokeLineJoin.Round

      val path2 = new Path
      path2.elements += MoveTo (10,250)
      path2.elements += VLineTo (590)
      path2.elements += HLineTo (300)
      path2.elements += VLineTo (250)
      path2.elements += CubicCurveTo(-100,590,400,590,10,250)
      path2.elements += new ClosePath()

      path2.fill = RadialGradient(150, 20, 150,500,190, false, CycleMethod.Repeat,Stop(0, Color.Black),Stop(0.1, Color.Red),Stop(0.9, Color.Green),Stop(1, Color.White) )
      path2.fillRule = FillRule.EvenOdd

      content = List(svg, path, path2)
    }
  }
}
