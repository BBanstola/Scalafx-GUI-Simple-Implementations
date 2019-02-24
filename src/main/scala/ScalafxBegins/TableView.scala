package ScalafxBegins

/**
  * Created by Own on 1/2/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.beans.property._
import scalafx.collections.ObservableBuffer
import scalafx.scene.Scene
import scalafx.scene.control._

case class Student(name:String, test1:Int, test2:Int)

object TableView extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title = "Table View Initial"

    scene = new Scene(300,300){

      val label = new Label("Table View Initial")

      val data =ObservableBuffer(
        Student("Name1",95,80),
        Student("Name2",85,50),
        Student("Name3",75,60),
        Student("Name4",65,50),
        Student("Name5",55,70),
        Student("Name6",45,90)
        )
      val table = new TableView(data)

      val col1 =new TableColumn [Student, String]("Name")
      col1.cellValueFactory = cellDataFeature => StringProperty(cellDataFeature.value.name)

      val col2 = new TableColumn[Student, Integer]("Test Marks")
      col2.cellValueFactory =cdf => ObjectProperty(cdf.value.test1)

      val col3 = new TableColumn[Student, Integer]("Assignment Marks")
      col3.cellValueFactory =cdf => ObjectProperty(cdf.value.test2)

      val col4 = new TableColumn[Student, Double]("Average")
      col4.cellValueFactory =cdf => ObjectProperty((cdf.value.test1+cdf.value.test2)/2.0 )

      table.columns ++= List(col1, col2, col3, col4)

      root = table

      table.selectionModel.apply.selectedItems.onChange{
        println("Selected:"+table.selectionModel.apply.getSelectedItems)
      }
    }
  }
}
