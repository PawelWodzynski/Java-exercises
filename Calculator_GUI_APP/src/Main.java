import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {


    JFrame frame;
    JTextField text_field;
    JButton[] number_buttons = new JButton[10];
    JButton[] function_buttons = new JButton[9];
    JButton add_button,sub_button,mul_button,div_button;
    JButton dec_button, equ_button, del_button,clr_button,neg_button;
    JPanel panel;

    Font my_font = new Font("Arial", Font.BOLD,30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Main(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        text_field = new JTextField();
        text_field.setBounds(50,25,300,50);
        text_field.setFont(my_font);
        text_field.setEditable(false);

        add_button = new JButton("+");
        sub_button = new JButton("-");
        mul_button = new JButton("*");
        div_button = new JButton("/");
        dec_button = new JButton(".");
        equ_button = new JButton("=");
        del_button = new JButton("Delete");
        clr_button = new JButton("Clear");
        neg_button = new JButton("(-)");

        function_buttons[0] = add_button;
        function_buttons[1] = sub_button;
        function_buttons[2] = mul_button;
        function_buttons[3] = div_button;
        function_buttons[4] = dec_button;
        function_buttons[5] = equ_button;
        function_buttons[6] = del_button;
        function_buttons[7] = clr_button;
        function_buttons[8] = neg_button;

        for (int i = 0; i<9; i++){
            function_buttons[i].addActionListener(this);
            function_buttons[i].setFont(my_font);
            function_buttons[i].setFocusable(false);
        }

        for (int i = 0; i<10; i++){
            number_buttons[i]= new JButton(String.valueOf(i));
            number_buttons[i].addActionListener(this);
            number_buttons[i].setFont(my_font);
            number_buttons[i].setFocusable(false);
        }

        neg_button.setBounds(50,430,100,50);
        del_button.setBounds(150,430,100,50);
        clr_button.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.add(number_buttons[1]);
        panel.add(number_buttons[2]);
        panel.add(number_buttons[3]);
        panel.add(add_button);
        panel.add(number_buttons[4]);
        panel.add(number_buttons[5]);
        panel.add(number_buttons[6]);
        panel.add(sub_button);
        panel.add(number_buttons[7]);
        panel.add(number_buttons[8]);
        panel.add(number_buttons[9]);
        panel.add(mul_button);
        panel.add(dec_button);
        panel.add(number_buttons[0]);
        panel.add(equ_button);
        panel.add(div_button);
        //panel.setBackground(Color.GRAY);

        frame.add(panel);
        frame.add(neg_button);
        frame.add(del_button);
        frame.add(clr_button);
        frame.add(text_field);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        Main calculator = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i=0; i<10; i++){
            if (e.getSource() == number_buttons[i]){
                text_field.setText(text_field.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==dec_button){
            text_field.setText(text_field.getText().concat("."));
        }
        if(e.getSource()==add_button){
            num1 = Double.parseDouble(text_field.getText());
            operator = '+';
            text_field.setText("");
        }
        if(e.getSource()==sub_button){
            num1 = Double.parseDouble(text_field.getText());
            operator = '-';
            text_field.setText("");
        }
        if(e.getSource()==mul_button){
            num1 = Double.parseDouble(text_field.getText());
            operator = '*';
            text_field.setText("");
        }
        if(e.getSource()==div_button){
            num1 = Double.parseDouble(text_field.getText());
            operator = '/';
            text_field.setText("");
        }
        if (e.getSource()==equ_button){
            num2=Double.parseDouble(text_field.getText());
            switch (operator){
                case '+'->
                    result = num1+num2;
                    case '-'->
                        result=num1-num2;
                    case '*'->
                        result=num1*num2;
                    case '/'->
                            result=num1/num2;

            }
            text_field.setText(String.valueOf(result));
            num1=result;
        }
        if (e.getSource()==clr_button){
            text_field.setText("");
        }
        if (e.getSource()==del_button){
            String string = text_field.getText();
            text_field.setText("");
            for (int i=0;i<string.length()-1; i++){
                text_field.setText(text_field.getText()+string.charAt(i));
            }
        }
        if (e.getSource()==neg_button){
            double temp = Double.parseDouble(text_field.getText());
            temp*=-1;
            text_field.setText(String.valueOf(temp));
        }
    }
}