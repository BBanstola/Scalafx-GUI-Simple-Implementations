package ScalafxBegins

/**
  * Created by Own on 1/7/2019.
  */

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.input.{KeyCode, KeyCodeCombination, KeyCombination}


object Menus extends JFXApp{

  stage =new JFXApp.PrimaryStage{
    title ="Menus"

    scene = new Scene(500,500){

      val menuBar = new MenuBar
      val fileMenu = new Menu("File")
      val openItem = new MenuItem("Open")
      openItem.accelerator = new KeyCodeCombination(KeyCode.O,KeyCombination.ControlDown)

      val saveItem = new MenuItem("Save")
      saveItem.accelerator =new KeyCodeCombination(KeyCode.S,KeyCombination.ControlDown)

      val closeItem = new MenuItem("Close")
      closeItem.accelerator = new KeyCodeCombination(KeyCode.X,KeyCombination.ControlDown)

      fileMenu.items = List (openItem, saveItem, new SeparatorMenuItem, closeItem)

      val checkMenu = new Menu("Check")
      val check1 = new CheckMenuItem("Check 1")
      val check2 = new CheckMenuItem("Check 2")

      checkMenu.items = List(check1,check2)

      val radioMenu = new Menu("Radio")
      val radio1 = new RadioMenuItem("Radio 1")
      val radio2 = new RadioMenuItem("Radio 2")
      val radio3 = new RadioMenuItem("Radio 3")

      val group = new ToggleGroup
      group.toggles = List(radio1,radio2,radio3)

      radioMenu.items = List(radio1,radio2,radio3)

      val types = new Menu("Types")
      types.items = List(checkMenu, radioMenu)

      menuBar.menus =  List(fileMenu, types)
      menuBar.prefWidth = 500

      val menuButton = new MenuButton("Menu Button")
      menuButton.items = List(new MenuItem("Button 1"), new MenuItem("Button 2") )
      menuButton.layoutX = 20
      menuButton.layoutY = 50

      val splitMenu = new SplitMenuButton(new MenuItem("Split 1"), new MenuItem("Split 2"))
      splitMenu.text = "Split Menu Button"
      splitMenu.layoutX = 20
      splitMenu.layoutY = 100

      val label = new Label("Right Click for Context Menu")
      label.layoutY= 150
      label.layoutX= 20

      val context = new ContextMenu(new MenuItem("Context 1"), new MenuItem("Context 2"))

      label.contextMenu = context

      content = List (menuBar, menuButton, splitMenu, label)

      closeItem.onAction = (e:ActionEvent) => sys.exit(0)

    }
  }

}
