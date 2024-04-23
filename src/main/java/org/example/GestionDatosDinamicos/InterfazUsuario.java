package org.example.GestionDatosDinamicos;

import javax.swing.*;

public class InterfazUsuario {

    private ListaDatos datosMultidimensionales;
    private DefaultListModel<String> listModel;
    private JList<String> dataList;

    public InterfazUsuario() {
        // Inicializar la estructura de datos multidimensionales y el modelo de lista
        datosMultidimensionales = new ListaDatos();
        listModel = new DefaultListModel<>();

        // Configurar la lista y el modelo de la lista
        dataList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(dataList);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        // Crear los campos de texto y botones
        JTextField datoRealTextField = new JTextField(10);
        JTextField primeroTextField = new JTextField(5);
        JTextField segundoTextField = new JTextField(5);
        JButton agregarDatoRealButton = new JButton("Agregar Dato Real");
        JButton agregarParejaEnteraButton = new JButton("Agregar Pareja Entera");

        // Agregar acciones a los botones
        agregarDatoRealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = datoRealTextField.getText();
                if (!dato.isEmpty()) {
                    datosMultidimensionales.agregarDatoReal(Double.parseDouble(dato));
                    actualizarLista();
                    datoRealTextField.setText("");
                }
            }
        });

        agregarParejaEnteraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String primero = primeroTextField.getText();
                String segundo = segundoTextField.getText();
                if (!primero.isEmpty() && !segundo.isEmpty()) {
                    datosMultidimensionales.agregarParejaEntera(Integer.parseInt(primero), Integer.parseInt(segundo));
                    actualizarLista();
                    primeroTextField.setText("");
                    segundoTextField.setText("");
                }
            }
        });

        // Crear el panel para los controles
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(new JLabel("Dato Real:"));
        controlPanel.add(datoRealTextField);
        controlPanel.add(agregarDatoRealButton);
        controlPanel.add(new JLabel("Primero:"));
        controlPanel.add(primeroTextField);
        controlPanel.add(new JLabel("Segundo:"));
        controlPanel.add(segundoTextField);
        controlPanel.add(agregarParejaEnteraButton);

        // Agregar componentes al marco
        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Configurar el marco
        setTitle("Interfaz de Usuario Multidimensional");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void actualizarLista() {
        listModel.clear();
        for (Double dato : datosMultidimensionales.getDatosReales()) {
            listModel.addElement(String.valueOf(dato));
        }
        for (Pareja<Integer, Integer> pareja : datosMultidimensionales.getDatosEnteros()) {
            listModel.addElement("(" + pareja.getPrimero() + ", " + pareja.getSegundo() + ")");
        }
    }
}
