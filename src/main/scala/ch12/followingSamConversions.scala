package ch12

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, JFrame}

object followingSamConversions extends App{


  var frame = new JFrame("test)")
  frame.setVisible(true);
  frame.setSize(400,200);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)



  var counter = 0
  val listener = (event: ActionListener) => println(counter)
  val button = new JButton("increment")
  button.setSize(200,100)
  val exit = (event: ActionEvent) => if (counter > 9) System.exit(0)
  button.addActionListener(exit(_))

  frame.add(button)

}


