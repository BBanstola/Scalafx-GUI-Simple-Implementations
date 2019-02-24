package ScalafxBegins

/**
  * Created by Own on 1/7/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._

object TreeView extends JFXApp {

  stage = new JFXApp.PrimaryStage{
    title = "Tree View"

    scene = new Scene(300,300){

      val pokhara = new TreeItem("Pokhara")

      pokhara.children = List(new TreeItem("Mahendrapul"), new TreeItem("Pokhara"))

      val ktm = new TreeItem("Kathmandu")

      ktm.children = List(new TreeItem("Bansewor"),new TreeItem("Dhumbarahi"))

      val nepal = new TreeItem("Nepal")
      nepal.children = List(pokhara,ktm)

      val tree = new TreeView(nepal)

      root = tree

      tree.selectionModel.apply.selectedItem.onChange{
        println("Selected: "+tree.selectionModel.apply.getSelectedItems)
      }

    }
  }
}
