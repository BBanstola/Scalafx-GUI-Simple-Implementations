package Bindings

import java.time.LocalDate

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control.{ColorPicker, DatePicker, Label}
import scalafx.scene.paint.Color
import scalafx.beans.property._

/**
  * Created by Own on 1/12/2019.
  */
object PickerBindings extends JFXApp{
  stage = new PrimaryStage{

    title ="Picker Control"

    scene = new Scene(200,150) {
      val label = new Label("Shows Date")
      label.layoutX = 20
      label.layoutY = 30

      val date = new DatePicker(LocalDate.now)
      date.layoutX = 20
      date.layoutY = 60

      val color = new ColorPicker(Color.White)
      color.layoutX = 20
      color.layoutY = 90

      content = List(label, date, color)

      label.text <== StringProperty("Date: ") + date.value.asString

      fill<== color.value

    }
    }

}
