package ScalafxBegins

/**
  * Created by Own on 1/8/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.geometry.Orientation
import scalafx.scene.Scene
import scalafx.scene.control._


object BarsOtherControls extends JFXApp{

  stage =new JFXApp.PrimaryStage {
    title = "Other Controls"

    scene = new Scene(500, 500) {

      val toolBar= new ToolBar
      toolBar.layoutX = 40
      toolBar.layoutY = 20
      toolBar.prefWidth = 460

      val plus = new Button("Increase")
      val minus = new Button("Decrease")
      toolBar.items = List(plus, minus, new Separator, new Button("+++"), new Button("---"))

      val progressB = new ProgressBar
      progressB.layoutX =  25
      progressB.layoutY =  70
      progressB.prefWidth = 200

      val scrollBar = new ScrollBar
      scrollBar.layoutX = 25
      scrollBar.layoutY = 120
      scrollBar.prefWidth = 200

      val scrollLabel = new Label("")
      scrollLabel.layoutX =25
      scrollLabel.layoutY = 170

      val separate = new Separator
      separate.layoutX = 250
      separate. layoutY = 70
      separate.orientation = Orientation.Vertical
      separate.prefHeight= 130

      val slider = new Slider
      slider.layoutX = 270
      slider.layoutY = 70
      slider.prefWidth = 160

      val sliderLabel = new Label("")
      sliderLabel.layoutX=270
      sliderLabel.layoutY = 120

      content = List(toolBar, progressB, scrollBar, separate, slider, scrollLabel, sliderLabel)

      plus.onAction = (e:ActionEvent) =>{
        progressB.progress = progressB.progress.apply + 0.05 min(1.0) max(0.0)
      }

      minus.onAction = (e:ActionEvent) =>{
        progressB.progress = progressB.progress.apply - 0.05 min(1.0) max(0.0)
      }

      scrollBar.value.onChange{
        scrollLabel.text = "Scroll Bar: "+ scrollBar.value.apply
      }

      slider.value.onChange{
        sliderLabel.text = "Slider Bar: "+ slider.value.apply
      }


    }
  }
}
