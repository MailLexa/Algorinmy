package Game;
import java.awt.*;
import javax.swing.*;

public class Gui extends JFrame {
    public  void createGUI() {
        String[] items = {
                "Элемент списка 1",
                "Элемент списка 2",
                "Элемент списка 3"
        };
        JFrame frame = new JFrame("GridBagLayoutTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button;
        frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        frame.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        // По умолчанию натуральная высота, максимальная ширина
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy   = 0  ;  // нулевая ячейка таблицы по вертикали
        JComboBox comboBox = new JComboBox(items);
        constraints.gridx = 0;      // нулевая ячейка таблицы по горизонтали
        frame.getContentPane().add(comboBox, constraints);
        button = new JButton("Add to Team 1");
        constraints.gridx = 1;      // первая ячейка таблицы по горизонтали
        frame.getContentPane().add(button, constraints);
        JComboBox comboBox1 = new JComboBox(items);
        constraints.gridx = 2;
        constraints.weighty   = 100.0;
        frame.getContentPane().add(comboBox1, constraints);
        button = new JButton("Add to Team 2");
        constraints.gridx     = 3;
        frame.getContentPane().add(button, constraints);
        JTextArea area1 = new JTextArea(15, 10);
        area1.setText("Первое многострочное поле");
        constraints.ipady     = 0;
        constraints.weighty   = 0;
        constraints.gridwidth = 2;
        constraints.gridx     = 0;
        constraints.gridy     = 2;
        frame.getContentPane().add(area1, constraints);
        JTextArea area2 = new JTextArea(15, 10);
        constraints.ipady     = 0;
        constraints.weighty   = 100.0;
        constraints.weightx= 100.0;
        constraints.gridwidth = 2;
        constraints.gridx     = 2;
        constraints.gridy     = 2;
        area2.setText("Второе многострочное поле");
        frame.getContentPane().add(area2, constraints);
        JButton button2= new JButton("Start");
        area1.setText("Первое многострочное поле");
        constraints.ipady     = 0;
        constraints.gridx     = 0;
        constraints.gridy     = 3;
        frame.getContentPane().add(button2, constraints);
        JButton button3 = new JButton ("Repeat");
        constraints.gridx = 2;
        frame.getContentPane().add(button3,constraints);
        JTextArea area3 = new JTextArea(15, 10);
        area3.setText("Третье многострочное поле");
        //area2.setBorder(BorderFactory.createEmptyBorder(10,90,0,0));
        constraints.ipady     = 0;
        constraints.gridwidth = 5;
        constraints.gridx     = 0;
        constraints.gridy     = 4;
        area2.setText("Второе многострочное поле");
        frame.getContentPane().add(area3, constraints);

        frame.pack();
        frame.setVisible(true);





    }
    public static void main(String[] args) {

        Gui gui = new Gui();
        gui.createGUI();

    }
}
