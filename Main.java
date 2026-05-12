import javax.swing.*;

void main() {


    JFrame tela = new JFrame("Cadastro de produto");
    tela.setSize(600, 400);
    tela.setLayout(null);

    JLabel labelProduto = new JLabel("Produto");
    labelProduto.setBounds(20, 50, 150, 40);
    tela.add(labelProduto);
    JTextField nomeProduto = new JTextField();
    nomeProduto.setBounds(20, 80, 150, 40);
    tela.add(nomeProduto);

    JLabel labelPreco = new JLabel("Preço");
    labelPreco.setBounds(20, 110, 150, 40);
    tela.add(labelPreco);
    JTextField preco = new JTextField();
    preco.setBounds(20, 150, 150, 40);
    tela.add(preco);

    JLabel labelQuantidade = new JLabel("Quantidade");
    labelQuantidade.setBounds(20, 190, 150, 40);
    tela.add(labelQuantidade);
    JTextField quantidade = new JTextField();
    quantidade.setBounds(20, 220, 150, 40);
    tela.add(quantidade);

    JButton cadastrar = new JButton("Cadastrar");
    cadastrar.setBounds(20, 270, 150, 40);
    tela.add(cadastrar);
    cadastrar.addActionListener(e -> {
        String nome = nomeProduto.getText();
        String preco1 = preco.getText();
        String quantidade1 = quantidade.getText();
        JOptionPane.showMessageDialog(null, "Produto cadatrado com sucesso " + nome +" Preço " +preco1 + " quantidade "+ quantidade1);
            });

    JButton limpar = new JButton("limpar");
    limpar.setBounds(180, 270, 150, 40);
    tela.add(limpar);
    limpar.addActionListener(e -> {
        nomeProduto.setText("");
        preco.setText("");
        quantidade.setText("");

    });



    tela.setVisible(true);
}

