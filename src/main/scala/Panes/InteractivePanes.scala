package Panes

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.layout._

/**
  * Created by Own on 1/13/2019.
  */
object InteractivePanes  extends JFXApp{

  stage = new JFXApp.PrimaryStage{
    title = "tabpanes and ScrollPanes"

    scene = new Scene(400,400){
      val tab = new TabPane

      val tab1 = new Tab
      tab1.text = "Split and Accordian"

      val accordion = new Accordion
      for (i<- 1 to 10){
        val title = new TitledPane
        title.text = "Title Number "+ i
        title.content = new Button("Button"+i)
        accordion.panes += title
      }

      val split = new SplitPane
      split.items ++= List(accordion,new TextArea)
      tab1.content = split

      val tab2 = new Tab
      tab2.text = "Scroll"

      val tiles = new TilePane
      for (i <- 1 to 150){
        tiles.children += new Button("Button "+i)

        val scroll = new ScrollPane
        scroll.content = tiles

        tab2.content = scroll
      }

      tab.tabs = List(tab1,tab2)

      root = tab

    }

}
}
