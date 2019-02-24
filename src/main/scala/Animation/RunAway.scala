package Animation

/**
  * Created by Own on 1/16/2019.
  */
import scalafx.Includes._
import scalafx.animation._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
import scalafx.scene.shape._
import scalafx.scene.input._
import scalafx.event.ActionEvent
import scalafx.scene.text._

object RunAway extends JFXApp{

  stage = new JFXApp.PrimaryStage{

    title = "Animation and Animation Timer"

    scene = new Scene(700,700){
      var enemies = List(Circle(10,10,10))

      val player = Circle(300,300, 20)
      player.fill = "green"

      val enemySpeed = 20
      val playerSpeed = 35

      var spawnDelay = 15.0

      var leftPressed= false
      var upPressed= false
      var downPressed= false
      var rightPressed= false

      onKeyPressed = (e:KeyEvent) =>{
        if(e.code == KeyCode.Up) upPressed = true
        if(e.code == KeyCode.Down) downPressed = true
        if(e.code == KeyCode.Left) leftPressed = true
        if(e.code == KeyCode.Right) rightPressed = true
      }

      onKeyReleased = (e:KeyEvent) =>{
        if(e.code == KeyCode.Up) upPressed = false
        if(e.code == KeyCode.Down) downPressed = false
        if(e.code == KeyCode.Left) leftPressed = false
        if(e.code == KeyCode.Right) rightPressed = false
      }

      var lastTime = 0L
      val timer:AnimationTimer  = AnimationTimer(t => {
        if (lastTime>0){
          val delta = (t-lastTime)/1e9
          for (e <- enemies){
            val dx = player.centerX.value - e.centerX.value
            val dy = player.centerY.value - e.centerY.value

            val dist = math.sqrt(dx*dx+dy*dy)
            e.centerX = e.centerX.value + dx/dist*enemySpeed*delta
            e. centerY =e.centerY.value + dy/dist*enemySpeed*delta

            if(dist < e.radius.value+ player.radius.value){
              content += new Text(250,250,"You have died, better luck next time")
              timer.stop
            }
          }
          if (leftPressed){
            player.centerX  = player.centerX.value - playerSpeed*delta
          }

          if (upPressed){
            player.centerY  = player.centerY.value - playerSpeed*delta
          }

          if (rightPressed){
            player.centerX  = player.centerX.value + playerSpeed*delta
          }

          if (downPressed){
            player.centerY  = player.centerY.value + playerSpeed*delta
          }

          spawnDelay -= delta
          if (spawnDelay <=0){
                        val e = Circle (math.random*700, math.random*700, 10 )
            content += e
            enemies ::= e
            spawnDelay = 25.0
          }

        }
        lastTime = t
      })
      timer.start
      content = List(enemies.head, player)
    }
  }

}
