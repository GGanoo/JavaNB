package calc;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame implements ActionListener {

    private JPanel panel;
    private JPanel panel2;
    private GridLayout gridLayout;
    private JButton btns;
    private JTextField numberInput;
    private JTextField otherInput;

    private String[] strGrid = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "+", "="};

    ArrayList<Integer> 숫자배열 = new ArrayList<>();
    ArrayList<String> 연산자배열 = new ArrayList<>();
    private String 숫자누적 = "";
    private String 결과값 = "";

    public Calc() {
        super("계산기");
        this.setSize(300, 400);
        this.panel = new JPanel();
        this.panel2 = new JPanel();
        this.numberInput = new JTextField("0");
        this.otherInput = new JTextField("");
        this.numberInput.setHorizontalAlignment(JTextField.RIGHT);
        this.otherInput.setHorizontalAlignment(JTextField.RIGHT);
        this.numberInput.setEditable(false);
        this.otherInput.setEditable(false);

        this.panel2.setLayout(new BorderLayout());
        this.panel2.add(BorderLayout.NORTH, this.numberInput);
        this.panel2.add(BorderLayout.CENTER, this.otherInput);

        for (int i = 0; i < strGrid.length; i++) {
            this.btns = new JButton(strGrid[i]);
            this.btns.addActionListener(this);
            this.panel.add(this.btns);
        }

        this.panel.setLayout(new GridLayout(4, 3, 6, 6));
        this.add(BorderLayout.CENTER, panel);
        this.add(BorderLayout.NORTH, panel2);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calc();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        System.out.println(cmd);

        if (cmd.equals("C")) {
            숫자배열.clear();
            연산자배열.clear();
            숫자누적 = "";
            결과값 = "";
            this.numberInput.setText("0");
            this.otherInput.setText("");
        } else if (cmd.equals("=")) {
            숫자배열.add(Integer.parseInt(숫자누적));
            계산();
            this.numberInput.setText(결과값);
            this.otherInput.setText("");

        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            숫자배열.add(Integer.parseInt(숫자누적));
            연산자배열.add(cmd);
            숫자누적 = "";
            this.otherInput.setText(this.otherInput.getText() + cmd);

        } else {
            숫자누적 += cmd;
            this.numberInput.setText(숫자누적);
            this.otherInput.setText(this.otherInput.getText() + cmd);
        }
    }

    private void 계산() {
        int 결과 = 숫자배열.get(0);
        for (int i = 0; i < 연산자배열.size(); i++) {
            String 연산자 = 연산자배열.get(i);
            int 다음숫자 = 숫자배열.get(i + 1);
            if (연산자.equals("+")) {
                결과 += 다음숫자;
            } else if (연산자.equals("-")) {
                결과 -= 다음숫자;
            } else if (연산자.equals("*")) {
                결과 *= 다음숫자;
            } else if (연산자.equals("/")) {
                결과 /= 다음숫자;
            }
        }
        결과값 = String.valueOf(결과);
    }
}