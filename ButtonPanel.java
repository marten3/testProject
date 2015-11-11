import javax.swing.*;
// import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mårten on 2015-11-11.
 */
public class ButtonPanel extends JPanel implements ActionListener{
    JButton but;

    public ButtonPanel(){
        but = new JButton("Expand");
        but.addActionListener(this);
        add(but);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("ButtonPanel get event from "+e.getSource().toString());
    }
}
