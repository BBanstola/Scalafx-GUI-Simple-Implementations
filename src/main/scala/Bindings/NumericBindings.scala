package Bindings

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene._
import  scalafx.scene.control._
import scalafx.event.ActionEvent

/**
  * Created by Own on 1/12/2019.
  */
object NumericBindings extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title = "Numeric Bindings"

    scene = new Scene (400,400){
      val label = new Label("Centered")
      label.layoutY = 60

      val button = new Button("Turn me on")
      button.layoutY = 80

      val slider = new Slider(0,400,0)

      val scrollBar = new ScrollBar
      scrollBar.min = 0
      scrollBar.max = 400


      val field = new TextField
      field.layoutX =200
      field.prefWidth = 150

      content = List(button,slider,scrollBar,label,field)

      button.layoutX <== slider.value

      scrollBar.value <== slider.value

      label.layoutX <== (scene.width - label.width)/2

      label.text <== field.text

      scrollBar.layoutY <== scene.height - scrollBar.height

      field.layoutX <== scene.width - field.width

    }
  }

}
