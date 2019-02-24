package ScalafxBegins

/**
  * Created by Own on 12/31/2018.
  */

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._

object TextControls extends JFXApp{

  stage= new JFXApp.PrimaryStage{
    title="Text and Controllers"

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
    }


  }

}
