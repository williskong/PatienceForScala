package ch12

import java.awt.event.ActionListener
import javax.swing.JButton

object followingSamConversions extends App{


  var counter = 0
  val listener = (event: ActionListener) => println(counter)
  val button = new JButton("increment")
  button.addActionListener(event => counter += 1)



}
