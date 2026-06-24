package i;
import javax.swing.*;
import java.awt.*;
import java.util.function.BinaryOperator;

public class SmartCalculator extends JFrame {
    private JTextField display = new JTextField("0");
    private double lastValue = 0;
    private String lastOperator = "=";
    private boolean start = true;

    public SmartCalculator() {
        setTitle("Modern Java Calc");
        setSize(300, 400);
        setLayout(new BorderLayout());

        display.setEditable(false);
        display.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        
        // Define buttons in an array for quick generation
        String[] labels = {
            "7", "8", "9", "x",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : labels) {
            buttonPanel.add(createButton(label));
        }

        add(buttonPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JButton createButton(String label) {
        JButton btn = new JButton(label);
        btn.addActionListener(e -> processInput(label));
        return btn;
    }

    private void processInput(String input) {
        // If it's a number or decimal
        if ("0123456789.".contains(input)) {
            if (start) {
                display.setText(input);
                start = false;
            } else {
                display.setText(display.getText() + input);
            }
        } else {
            // It's an operator
            calculate(Double.parseDouble(display.getText()));
            lastOperator = input;
            start = true;
        }
    }

    private void calculate(double n) {
        lastValue = switch (lastOperator) {
            case "+" -> lastValue + n;
            case "-" -> lastValue - n;
            case "*" -> lastValue * n;
            case "/" -> lastValue / n;
            case "=" -> n;
            default -> 0;
        };
        display.setText("" + lastValue);
    }

    public static void main(String[] args) {
        new SmartCalculator();
    }
}

