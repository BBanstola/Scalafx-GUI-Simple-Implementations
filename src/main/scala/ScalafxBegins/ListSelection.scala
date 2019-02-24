package ScalafxBegins

/**
  * Created by Own on 1/2/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control._

object ListSelection extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title= "List Selection"

    scene= new Scene(250,400){
      val label = new Label("Feedback")
      label.layoutX=20
      label.layoutY=20

      val comboBox = new ComboBox(List("Combo1", "Combo 2", "Combo 3"))
      comboBox.layoutX= 20
      comboBox.layoutY= 50

      val listView =new ListView(List.tabulate(20)(i => "Option" +(i+1)))
      listView.layoutX= 20
      listView.layoutY= 90
      listView.prefHeight= 200

      content=List(label,comboBox, listView)

      comboBox.onAction = (e:ActionEvent)=>{
        label.text = "Combo Value Selected " +comboBox.value.apply
      }

      listView.selectionModel.apply.selectedItems.onChange{
        label.text = "List View " +listView.selectionModel.apply.getSelectedItems
      }

    }
  }

}
