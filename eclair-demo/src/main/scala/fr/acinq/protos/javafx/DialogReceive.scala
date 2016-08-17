package fr.acinq.protos.javafx

import javafx.geometry.{Insets, Pos}
import javafx.scene.Scene
import javafx.scene.control.{Label, TextField}
import javafx.scene.layout.GridPane
import javafx.stage.{Modality, Stage, StageStyle}

/**
  * Created by PM on 16/08/2016.
  */
class DialogReceive() extends Stage() {
  initModality(Modality.WINDOW_MODAL)
  initStyle(StageStyle.UTILITY)
  setAlwaysOnTop(true)
  setTitle("Receive")
  setResizable(false)

  val grid = new GridPane()
  grid.setAlignment(Pos.CENTER)
  grid.setHgap(10)
  grid.setVgap(10)
  grid.setPadding(new Insets(20, 5, 20, 5))

  val labelH = new Label("H")
  grid.add(labelH, 0, 0)

  val textFieldH = new TextField()
  textFieldH.setEditable(false)
  grid.add(textFieldH, 1, 0)

  GUIBoot.handlers.getH(textFieldH)

  val scene = new Scene(grid, 400, 60)
  setScene(scene)
}