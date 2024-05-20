import java.awt.*;
import java.awt.event.*;

 class trafficlight implements ActionListener { 
    Frame f=new Frame();
 
    Button b1=new Button("RED");
    Button b2=new Button("YELLOW");
    Button b3=new Button("GREEN");
    Button b4=new Button("CANCEL");
    Label l1=new Label("");
    
    trafficlight() { 
        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        b3.setBounds(170,250,50,20);
        b4.setBounds(220,250,50,20);
 
        l1.setBounds(200,100,150,90);
 
        b1.setForeground(Color.RED);
        b2.setForeground(Color.YELLOW);
        b3.setForeground(Color.GREEN);
 
        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
 
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
	   b4.addActionListener(this);
 
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600,400);
    }
 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            l1.setForeground(Color.RED);
            l1.setText("STOP");
        } else if(e.getSource()==b2) {
            l1.setForeground(Color.YELLOW);
            l1.setText("READY");
        } else if(e.getSource()==b3) {
            l1.setForeground(Color.GREEN);
            l1.setText("GO");
        } else if (e.getSource()==b4) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        trafficlight tra=new trafficlight();
    }
}
