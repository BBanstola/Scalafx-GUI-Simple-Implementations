package Bindings

/**
  * Created by Own on 1/12/2019.
  */
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.paint._
import scalafx.event.ActionEvent

object ConditionalBindings extends JFXApp{

  stage = new JFXApp.PrimaryStage{

    title = "Conditional Binding"

    scene = new Scene(400,400){

      val label = new Label("I am Label")

      val slider = new Slider(0,10,0)

      label.layoutY <== (scene.height - label.height)/2

      label.layoutX <== when(slider.value<5) choose 0 otherwise scene.width - label.width

      content = List (label, slider)

      fill <== when (label.hover) choose Color.Green otherwise Color.White

    }

  }

}
