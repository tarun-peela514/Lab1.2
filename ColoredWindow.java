import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ColoredWindow extends JFrame
{
    public static final int W = 300;
    public static final int H = 200;
    
    public ColoredWindow(Color theColor)
    {
        super("No Charge for Color");
        setSize(W, H);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(theColor);
        
        JLabel aLabel = new JLabel("Exit");
        add(aLabel);
    }
    
    public ColoredWindow()
    {
        this(Color.PINK);
    }
}