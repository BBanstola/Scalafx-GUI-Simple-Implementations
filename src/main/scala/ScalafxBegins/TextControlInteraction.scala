package ScalafxBegins

/**
  * Created by Own on 12/31/2018.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control._

object TextControlInteraction extends JFXApp{

  stage= new JFXApp.PrimaryStage{
    title="Text and Controllers and Interactions "

    scene = new Scene(400,400){
      val label = new Label("This is a label")
      label.layoutX= 30
      label.layoutY=10

      val textField = new TextField
      textField.layoutX= 30
      textField.layoutY= 40
      textField.promptText= "Text Field"

      val textArea = new TextArea
      textArea.layoutX= 30
      textArea.layoutY= 80
      textArea.prefHeight= 200
      textArea.prefWidth= 200
      textArea.promptText= "Text Area"

      val passWord = new PasswordField
      passWord.layoutX = 30
      passWord.layoutY = 300
      passWord.promptText = "Password here"

      content =List(label,textField, textArea, passWord)

      textField.onAction = (e:ActionEvent) =>{
        label.text = "Field Action: "+textField.text.apply
      }

      textArea.text.onChange{
        label.text = "Area Changed: "+textArea.text.apply
      }
      passWord.focused.onChange{
        label.text = "Password Focus Triggered : " +passWord.focused.apply
      }

    }
  }



  }
