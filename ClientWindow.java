import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Scanner;

public class ClientWindow {
    private JFrame mainFrame;
    private JTextField message;
    private JTextArea areaMessage;
    private String clientMessage;


    public ClientWindow() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Client");
        mainFrame.setBounds(600, 300, 600, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new BorderLayout());

        JLabel jChat = new JLabel("Chat");
        topPanel.add(jChat, BorderLayout.NORTH);
        areaMessage = new JTextArea();
        JScrollPane jsp = new JScrollPane(areaMessage);
        topPanel.add(jsp, BorderLayout.CENTER);


        JPanel lowPanel = new JPanel(new BorderLayout());

        JButton jbSendMessage = new JButton("Send");
        message = new JTextField("Enter your message: ");
        lowPanel.add(jbSendMessage, BorderLayout.EAST);
        lowPanel.add(message, BorderLayout.CENTER);

        ActionButtonListener abListener = new ActionButtonListener(message, areaMessage);
        jbSendMessage.addActionListener(abListener);



        mainFrame.add(topPanel, BorderLayout.CENTER);
        mainFrame.add(lowPanel, BorderLayout.SOUTH);


        mainFrame.setVisible(true);
    }
}
