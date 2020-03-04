package cópia.pkgdo.slide.muito.braba;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;  
import javax.swing.Icon;
import javax.swing.ImageIcon;        

public class LabelFrame extends JFrame {
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame(){
        
        super ("testando jlabel");
        setLayout (new FlowLayout () );
        label1 = new JLabel ("label com texto");
        label1.setToolTipText ("esse é o label1");
        add(label1);
        
        Icon bug = new ImageIcon ( getClass ().getResource("bug.png"));
        label2 = new JLabel (" label com texto e ícone",bug, SwingConstants.LEFT);
        label2.setToolTipText ("esse é o label2");
        add(label2);
        
        label3 = new JLabel ();
        label3.setText ("label com ícone e texto embaixo");
        label3.setIcon (bug);
        label3.setHorizontalTextPosition (SwingConstants.CENTER);
        label3.setVerticalTextPosition (SwingConstants.BOTTOM);
        label3.setToolTipText ("esse é o label3");
        add(label3);
        
       
    }
    
}
