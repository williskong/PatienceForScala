

import java.awt.event.ActionListener
import javax.swing.{JButton, JFrame}



var frame = new JFrame("test)")
frame.setVisible(true);
frame.setSize(400,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

var counter = 0
val listener = (event: ActionListener) => println(counter)
val button = new JButton("increment")
button.setSize(200,100)
button.addActionListener(event => counter += 1)

frame.add(button)

