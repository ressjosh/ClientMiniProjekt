package my_project.view;

import my_project.control.ViewControll;
import my_project.model.SpielClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientInterface {
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField nameTextField;
    private JTextField remoteIPText;
    private JTextField portTextField;
    private JButton connectButton;
    private JTextField messageField;
    private JButton sendButton;
    private JTextPane receivedField;
    private ViewControll vC;
    private SpielClient myClient;

    public ClientInterface(ViewControll vC){
        this.vC = vC;
        frame = new JFrame("Spieler-Client");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(600,300,400,300);

        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(remoteIPText.getText() != null && portTextField != null && nameTextField.getText() != null){
                    try{
                        vC.erstelleClient(remoteIPText.getText(), Integer.parseInt(portTextField.getText()), nameTextField.getText());
                    }catch(NumberFormatException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        });
    }

    public void setFensterVisible(boolean b){
        frame.setVisible(b);
    }

    public void updateDarstellung(String s){
        receivedField.setText(receivedField.getText()+ "\n" + s);
        messageField.setText(null);
    }

    public String getMessage(){
        return messageField.getText();
    }
}
