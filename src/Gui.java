import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener{
    JFrame window;
    JTextField t1;
    JButton l1,l2,l3,l4,l5,l6,l7,l8,l9,ll0,lc,lEqual,lDivide,lMultiply,lSub,lAdd,l10,l100,lb;
    JLabel jl1;
    double add=0,sub=0,mul=0,div=0,sol=0;

    KeyHandle kh=new KeyHandle(this);

    Gui(){
        window =new JFrame("Calculator");
        t1=new JTextField();

        window.setSize(430,500);
        window.setLocation(530, 150);
        window.setLayout(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        t1.setBounds(5, 5, 400, 70);
        t1.setFont(new Font("System",Font.BOLD,30));
        window.add(t1);

        jl1=new JLabel();

        l1=new JButton("1");
        l2=new JButton("2");
        l3=new JButton("3");
        l4=new JButton("4");
        l5=new JButton("5");
        l6=new JButton("6");
        l7=new JButton("7");
        l8=new JButton("8");
        l9=new JButton("9");
        ll0=new JButton("0");
        lc=new JButton("C");
        lEqual=new JButton("=");
        lAdd =new JButton("+");
        lSub =new JButton("-");
        lMultiply =new JButton("*");
        lDivide =new JButton("/");
        l10=new JButton("x10");
        l100=new JButton("x100");
        lb= new JButton("<");

        l1.setBounds(10, 80, 70, 70);
        l2.setBounds(90, 80, 70, 70);
        l3.setBounds(170, 80, 70, 70);
        lc.setBounds(250, 80, 70, 70);
        lb.setBounds(330, 80, 70, 70);
        lAdd.setBounds(250, 180, 70, 70);
        l4.setBounds(10, 180, 70, 70);
        l5.setBounds(90, 180, 70, 70);
        l6.setBounds(170, 180, 70, 70);
        lSub.setBounds(330, 180, 70, 70);
        l7.setBounds(10, 280, 70, 70);
        l8.setBounds(90, 280, 70, 70);
        l9.setBounds(170, 280, 70, 70);
        lMultiply.setBounds(250, 280, 70, 70);
        lDivide.setBounds(330, 280, 70, 70);
        ll0.setBounds(10, 380, 70, 70);
        l10.setBounds(90, 380, 70, 70);
        l100.setBounds(170, 380, 70, 70);
        lEqual.setBounds(250, 380, 153, 70);

        t1.addKeyListener(kh);

        l1.setFont(new Font("System",Font.BOLD,30));
        l2.setFont(new Font("System",Font.BOLD,30));
        l3.setFont(new Font("System",Font.BOLD,30));
        l4.setFont(new Font("System",Font.BOLD,30));
        l5.setFont(new Font("System",Font.BOLD,30));
        l6.setFont(new Font("System",Font.BOLD,30));
        l7.setFont(new Font("System",Font.BOLD,30));
        l8.setFont(new Font("System",Font.BOLD,30));
        l9.setFont(new Font("System",Font.BOLD,30));
        ll0.setFont(new Font("System",Font.BOLD,30));
        l10.setFont(new Font("System",Font.BOLD,21));
        l100.setFont(new Font("System",Font.BOLD,16));
        lAdd.setFont(new Font("System",Font.BOLD,30));
        lSub.setFont(new Font("System",Font.BOLD,30));
        lMultiply.setFont(new Font("System",Font.BOLD,30));
        lDivide.setFont(new Font("System",Font.BOLD,30));
        lEqual.setFont(new Font("System",Font.BOLD,30));
        lc.setFont(new Font("System",Font.BOLD,30));
        lb.setFont(new Font("System",Font.BOLD,30));


        l1.addActionListener(this);
        l2.addActionListener(this);
        l3.addActionListener(this);
        l4.addActionListener(this);
        l5.addActionListener(this);
        l6.addActionListener(this);
        l7.addActionListener(this);
        l8.addActionListener(this);
        l9.addActionListener(this);
        l10.addActionListener(this);
        l100.addActionListener(this);
        ll0.addActionListener(this);
        lAdd.addActionListener(this);
        lSub.addActionListener(this);
        lMultiply.addActionListener(this);
        lDivide.addActionListener(this);
        lc.addActionListener(this);
        lb.addActionListener(this);
        lEqual.addActionListener(this);



        window.add(l1);
        window.add(l2);
        window.add(l3);
        window.add(l4);
        window.add(l5);
        window.add(l6);
        window.add(l7);
        window.add(l8);
        window.add(l9);
        window.add(ll0);
        window.add(l10);
        window.add(l100);
        window.add(lc);
        window.add(lb);
        window.add(lAdd);
        window.add(lSub);
        window.add(lMultiply);
        window.add(lDivide);
        window.add(lEqual);

        window.setVisible(true);
    }

    public static void main(String[] args){
        new Gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command=e.getActionCommand();

        switch(command) {
            case "1":
                t1.setText(t1.getText()+"1");
                break;
            case "2":
                t1.setText(t1.getText()+"2");
                break;
            case "3":
                t1.setText(t1.getText()+"3");
                break;
            case "4":
                t1.setText(t1.getText()+"4");
                break;
            case "5":
                t1.setText(t1.getText()+"5");
                break;
            case "6":
                t1.setText(t1.getText()+"6");
                break;
            case "7":
                t1.setText(t1.getText()+"7");
                break;
            case "8":
                t1.setText(t1.getText()+"8");
                break;
            case "9":
                t1.setText(t1.getText()+"9");
                break;
            case "0":
                t1.setText(t1.getText()+"0");
                break;
            case "+":
                try {
                    if(!t1.getText().equals("")) {
                        add=Double.parseDouble(t1.getText());
                        sub=0;
                        mul=0;
                        div=0;
                        jl1.setText(t1.getText()+"+");
                        jl1.setBounds(5, 5, 400, 20);
                        jl1.setFont(new Font("System",Font.BOLD,18));
                        t1.add(jl1);
                        t1.setFont(new Font("System",Font.BOLD,20));
                        t1.setText("");
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }
                break;
            case "-":
                try {
                    if(!t1.getText().equals("")) {
                        add=0;
                        sub=Double.parseDouble(t1.getText());
                        mul=0;
                        div=0;
                        jl1.setText(t1.getText()+"-");
                        jl1.setBounds(5, 5, 400, 20);
                        jl1.setFont(new Font("System",Font.BOLD,18));
                        t1.add(jl1);
                        t1.setFont(new Font("System",Font.BOLD,20));
                        t1.setText("");
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }
                break;
            case "*":
                try {
                    if(!t1.getText().equals("")) {
                        add=0;
                        sub=0;
                        mul=Double.parseDouble(t1.getText());
                        div=0;
                        jl1.setText(t1.getText()+"*");
                        jl1.setBounds(5, 5, 400, 20);
                        jl1.setFont(new Font("System",Font.BOLD,18));
                        t1.add(jl1);
                        t1.setFont(new Font("System",Font.BOLD,20));
                        t1.setText("");
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }
                break;
            case "/":
                try {
                    if(!t1.getText().equals("")) {
                        add=0;
                        sub=0;
                        mul=0;
                        div=Double.parseDouble(t1.getText());
                        jl1.setText(t1.getText()+"/");
                        jl1.setBounds(5, 5, 400, 20);
                        jl1.setFont(new Font("System",Font.BOLD,18));
                        t1.add(jl1);
                        t1.setFont(new Font("System",Font.BOLD,20));
                        t1.setText("");
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }
                break;
            case "x10":
                try {
                    if(!t1.getText().equals("") && add==0 && sub==0 && mul==0 && div==0 ) {
                        sol=10;
                        sol=Double.parseDouble(t1.getText())*sol;
                        String z="";
                        z=z+sol;
                        jl1.setText("");
                        t1.setFont(new Font("System",Font.BOLD,30));
                        t1.setText(z);
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }
                break;
            case "x100":
                try {
                    if(!t1.getText().equals("") && add==0 && sub==0 && mul==0 && div==0 ) {
                        sol=100;
                        sol=Double.parseDouble(t1.getText())*sol;
                        String z="";
                        z=z+sol;
                        jl1.setText("");
                        t1.setFont(new Font("System",Font.BOLD,30));
                        t1.setText(z);
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }
                break;
            case "C":
                t1.remove(jl1);
                t1.setFont(new Font("System",Font.BOLD,30));
                t1.setText("");
                break;
            case "<":
                try {
                    if(!t1.getText().equals("")) {
                        String back=t1.getText();
                        String z="";
                        for(int i=0;i<back.length()-1;i++) {
                            z=z+back.charAt(i);
                        }
                        t1.setText(z);
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }
                break;
            case "=":
                try {
                    if(!t1.getText().equals("")) {
                        sol=Double.parseDouble(t1.getText());
                        if(add!=0) {
                            sol=add+sol;
                            String z="";
                            z=z+sol;
                            jl1.setText("");
                            t1.setFont(new Font("System",Font.BOLD,30));
                            t1.setText(z);
                        }else if(sub!=0) {
                            sol=sub-sol;
                            String z="";
                            z=z+sol;
                            jl1.setText("");
                            t1.setFont(new Font("System",Font.BOLD,30));
                            t1.setText(z);
                        }else if(mul!=0) {
                            sol=mul*sol;
                            String z="";
                            z=z+sol;
                            jl1.setText("");
                            t1.setFont(new Font("System",Font.BOLD,30));
                            t1.setText(z);
                        }else if(div!=0) {
                            sol=div/sol;
                            String z="";
                            z=z+sol;
                            jl1.setText("");
                            t1.setFont(new Font("System",Font.BOLD,30));
                            t1.setText(z);
                        }
                    }
                }catch(Exception e1) {
                    System.out.println(e1.getMessage());
                }

                break;
        }
        t1.requestFocusInWindow();

    }

}
