package ScalafxBegins

/**
  * Created by Own on 1/2/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control._


object ButtonControlInteraction extends JFXApp{
  stage = new JFXApp.PrimaryStage {
    title = "Button Control"

    scene = new Scene(200, 600) {
      val label = new Label("Button Control: feedback")
      label.layoutX = 20
      label.layoutY = 20

      val button = new Button("A button")
      button.layoutX = 20
      button.layoutY = 50

      val cb1 = new CheckBox("Check Box 1")
      cb1.layoutX = 20
      cb1.layoutY = 80

      val cb2 = new CheckBox("Check Box 2")
      cb2.layoutX = 20
      cb2.layoutY = 110

      val rb1 = new RadioButton("Radio Button 1")
      rb1.layoutX = 20
      rb1.layoutY = 140

      val rb2 = new RadioButton("Radio Button 2")
      rb2.layoutX = 20
      rb2.layoutY = 160

      val rb3 = new RadioButton("Radio Button 3")
      rb3.layoutX = 20
      rb3.layoutY = 180

      val toggle1 = new ToggleGroup()
      toggle1.toggles = List(rb1, rb2, rb3)


      val tb1 = new ToggleButton("Toggle Button 1")
      tb1.layoutX = 20
      tb1.layoutY = 210

      val tb2 = new ToggleButton("Toggle Button 2")
      tb2.layoutX = 20
      tb2.layoutY = 240

      val tb3 = new ToggleButton("Toggle Button 3")
      tb3.layoutX = 20
      tb3.layoutY = 270

      val toggle2 = new ToggleGroup()
      toggle2.toggles = List(tb1, tb2, tb3)

      content = List(label, button, cb1, cb2, rb1, rb2, rb3, tb1, tb2, tb3)

      button.onAction = (e: ActionEvent) => {
        label.text = "Button Clicked"
      }

      cb1.onAction = (e: ActionEvent) => {
        label.text = "CB1 clicked" + cb1.selected.apply
      }

      cb2.onAction = (e: ActionEvent) => {
        label.text = "CB2 clicked" + cb2.selected.apply
      }
    }
  }
}

