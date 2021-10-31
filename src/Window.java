import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
public void initWindow(){
    setSize(600,600);
    setLocation(1200,350);
    int value = WindowConstants.EXIT_ON_CLOSE;
    setDefaultCloseOperation(value);

    GridLayout layout = new GridLayout(1,4);
    JPanel panel = new JPanel(layout);
    JButton firstButton = new JButton("Вкладка 1");
    JButton secondButton = new JButton("Вкладка 2");
    JButton thirdButton = new JButton("Вкладка 3");
    JButton fourthButton = new JButton("Выход");
    panel.add(firstButton);
    panel.add(secondButton);
    panel.add(thirdButton);
    add(fourthButton, BorderLayout.SOUTH);
    add(panel,BorderLayout.NORTH);
    JCheckBox CheckBox1 = new JCheckBox("Найдётся");
    add(CheckBox1, BorderLayout.EAST);
    JLabel label = new JLabel("Сестра, а не найдется соли и лимончика, а то текилку нечем закусить");
    add(label, BorderLayout.WEST);



    setVisible(true);
  }
}
