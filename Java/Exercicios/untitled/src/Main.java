import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JComboBox<String> itemComboBox;
    private JComboBox<String> colorComboBox;
    private JButton buyButton;
    private JTextField priceField;

    public Main() {
        // Cria o frame e o painel
        frame = new JFrame("Loja de Roupas");
        panel = new JPanel();

        // Cria os componentes
        label = new JLabel("Selecione um item:");
        itemComboBox = new JComboBox<>(new String[]{"Boné", "Camiseta"});
        colorComboBox = new JComboBox<>(new String[]{"Vermelho", "Azul", "Verde"});
        buyButton = new JButton("Comprar");
        priceField = new JTextField(10);
        priceField.setEditable(false);

        // Adiciona os componentes ao painel
        panel.add(label);
        panel.add(itemComboBox);
        panel.add(colorComboBox);
        panel.add(buyButton);
        panel.add(priceField);

        // Adiciona um ouvinte de ação ao botão
        buyButton.addActionListener(this);

        // Configura o frame
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Obtém o item selecionado e sua cor correspondente
        String item = (String) itemComboBox.getSelectedItem();
        String color = (String) colorComboBox.getSelectedItem();

        // Calcula o preço com base no item e na cor selecionados
        double price = 0;
        if (item.equals("Boné")) {
            if (color.equals("Vermelho")) {
                price = 15.0;
            } else if (color.equals("Azul")) {
                price = 20.0;
            } else if (color.equals("Verde")) {
                price = 25.0;
            }
        } else if (item.equals("Camiseta")) {
            if (color.equals("Vermelho")) {
                price = 30.0;
            } else if (color.equals("Azul")) {
                price = 35.0;
            } else if (color.equals("Verde")) {
                price = 40.0;
            }
        }

        // Exibe o preço na caixa de texto
        priceField.setText(String.format("R$%.2f", price));
    }

    public static void main(String[] args) {
        new Main();
    }
}