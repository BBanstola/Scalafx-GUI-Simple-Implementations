package ScalafxBegins

/**
  * Created by Own on 12/31/2018.
  */
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control._

object EventHandlers extends JFXApp{

  stage = new JFXApp.PrimaryStage {
    title = "Events and Handlers"

    scene = new Scene(400,400){
      val button =  new Button("Remove from List")

      button.layoutY= 50
      button.layoutX= 50

      val b = List("AWT","AWS","Maven","SBT")

      val combobox = new ComboBox(List("Java","Hadoop","Python","Scala"))
      combobox.layoutX= 180
      combobox.layoutY= 50

      val listView= new ListView(b)
      listView.layoutX= 100
      listView.layoutY= 100
      listView.prefHeight=100

      content = List(button,combobox,listView)

      button.onAction = (e:ActionEvent) => {
        val selected = listView.selectionModel.apply.getSelectedItems
        listView.items = listView.items.apply.diff(selected)
        println("Deleted")
      }

      combobox.onAction = (e:ActionEvent) => {
        listView.items.apply += combobox.selectionModel.apply.getSelectedItem
      }

    }
  }



}
