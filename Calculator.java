
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnEight;
    private JButton btnFour;
    private JButton btnOne;
    private JButton btnZero;
    private JButton btnNine;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnPoint;
    private JButton btnDivde;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnClear;
    private JButton btnSeven;


    private double input = 0.0;
    private double output = 0.0;
    private char math_operators;


    private void getOperator(String btnText){
        math_operators = btnText.charAt(0);
        input = input + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }


    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);

            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);

            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);

            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);

            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);

            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);

            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);

            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);

            }
        });

        // Plus Operation '+'
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnPlus.getText();
                getOperator(buttonText);

            }
        });

        // Subtract operation '-'
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnMinus.getText();
                getOperator(buttonText);

            }
        });

        // Multiply operation '*'
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnMultiply.getText();
                getOperator(buttonText);

            }
        });
        // Divided operation '/'
        btnDivde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnDivde.getText();
                getOperator(buttonText);

            }
        });

        //Equals operation ' = '
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                switch (math_operators){
                    case '+':
                        output = input + Double.parseDouble(textDisplay.getText());
                        break;

                    case '-':
                        output = input - Double.parseDouble(textDisplay.getText());
                        break;

                    case '*':
                        output = input * Double.parseDouble(textDisplay.getText());
                        break;

                    case '/':
                        output = input / Double.parseDouble(textDisplay.getText());
                        break;
                }

                textDisplay.setText(Double.toString(output));
                input= 0;
            }
        });

        // Clear operation <--
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                output = 0 ;
                textDisplay.setText("");

            }
        });

        // Point ' 0.0 '
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }
                else if (textDisplay.getText().contains(".")){
                    btnPoint.setEnabled(false);

                }
                else {
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText(btnPointText);
                }

                btnPoint.setEnabled((true));
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
