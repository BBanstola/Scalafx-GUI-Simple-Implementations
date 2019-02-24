package ScalafxBegins

/**
  * Created by Own on 1/2/2019.
  */

import java.time.LocalDate

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.paint.Color

object PickerControl extends JFXApp{

  stage = new PrimaryStage{

    title ="Picker Control"

    scene = new Scene(200,150){
      val label = new Label("Shows Date")
      label.layoutX =20
      label. layoutY = 30

      val date =new DatePicker(LocalDate.now)
      date.layoutX = 20
      date.layoutY = 60

      val color =new ColorPicker(Color.White)
      color.layoutX = 20
      color.layoutY = 90

      content = List(label, date, color)

      date.onAction = (e:ActionEvent) =>{
        label.text = "Date : "+ date.value.apply
      }

      color.onAction =(e:ActionEvent) =>{
        fill = color.value.apply
      }


    }


  }

}
