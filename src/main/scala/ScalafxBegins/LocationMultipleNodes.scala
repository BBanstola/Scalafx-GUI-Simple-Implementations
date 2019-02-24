package ScalafxBegins

/**
  * Created by Own on 12/31/2018.
  */

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._

object LocationMultipleNodes extends JFXApp {

  stage = new JFXApp.PrimaryStage {
    title = "Location and Multiple Nodes"

    scene = new Scene(300,300){
      val button =  new Button("Turn Me On")

      button.layoutY= 50
      button.layoutX= 50

      val b = List("AWT","AWS","Maven","SBT")

      val combobox = new ComboBox(List("Java","Hadoop","Python","Scala"))
      combobox.layoutX= 150
      combobox.layoutY= 50

      val listView= new ListView(b)
      listView.layoutX= 250
      listView.layoutY= 50
      listView.prefHeight=100

      content = List(button,combobox,listView)
    }
  }

}