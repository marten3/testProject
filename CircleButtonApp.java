import javax.swing.*;
import java.awt.*;

/**
 * Created by Mårten on 2015-11-11.
 */
public class CircleButtonApp extends JFrame{

    //Reference to the frame we will use
    static CircleButtonApp appFrame;

    //constructor
    public CircleButtonApp(){
        super("Circle window");
        setPreferredSize(new Dimension(500,500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new ButtonPanel());
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        new CircleButtonApp();
    }
}
