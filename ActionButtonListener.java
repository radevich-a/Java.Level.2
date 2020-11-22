import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionButtonListener implements ActionListener{
    private JTextField massage;
    private JTextArea areaMessage;


    public ActionButtonListener(JTextField massage, JTextArea areaMessage) {
        this.massage = massage;
        this.areaMessage = areaMessage;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String val = massage.getText();
        areaMessage.setText(val);
        massage.setText("");
    }


}
