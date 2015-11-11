import javax.swing.*;
import java.awt.*;

/**
 * Created by Mårten on 2015-11-11.
 */
public class ButtonPanel extends JPanel{
    JButton but;

    public ButtonPanel(){
        but = new JButton("Expand");
        add(but);
    }
}
