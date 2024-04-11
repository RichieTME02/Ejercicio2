import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCaja {

    private JTextField textField1;
    private JButton añadirButton;
    private JButton buscarButton;
    private JButton mostrarTodosLosElementosButton;
    private JTextArea textArea1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private Pila pila1= new Pila();
    private Pila pila2= new Pila();
    private Pila pila3= new Pila();

    public VentanaCaja(){

        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a= comboBox2.getSelectedItem().toString();
                if (a.equals("1")){
                    if (pila1.getTamanio()<6){
                        pila1.apilar(textField1.getText(),textField2.getText(),comboBox1.getSelectedItem().toString());

                    } else
                        JOptionPane.showMessageDialog(null, "No hay espacio en la pila 1");
                } else if (a.equals("2")) {
                    if (pila1.getTamanio()<6){
                        pila1.apilar(textField1.getText(),textField2.getText(),comboBox1.getSelectedItem().toString());

                    } else
                        JOptionPane.showMessageDialog(null, "No hay espacio en la pila 2");
                } else if (a.equals("3")) {
                    if (pila1.getTamanio() < 6) {
                        pila1.apilar(textField1.getText(), textField2.getText(), comboBox1.getSelectedItem().toString());
                        textArea1.setText(pila1.toString());
                    } else
                        JOptionPane.showMessageDialog(null, "No hay espacio en la pila 3");
                }
            }
        });
    }

}
