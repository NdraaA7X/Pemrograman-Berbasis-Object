package id.ac.polinema;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setTitle("Aplikasi Database Java");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //==============    LABEL    ==============
        JLabel lblNIM = new JLabel("NIM");
        lblNIM.setBounds(30, 30, 100, 25);
        frame.add(lblNIM);

        JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(30, 65, 100, 25);
        frame.add(lblNama);

        //==============    TEXTFIELD    ==============
        JTextField txtNIM = new JTextField();
        txtNIM.setBounds(140, 30, 210, 25);
        frame.add(txtNIM);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(140, 65, 210, 25);
        frame.add(txtNama);
        
        //==============    BUTTON    ==============
        frame.setLayout(null);
        JButton btnCreate = new JButton("Create");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        btnCreate.setBounds(30, 120, 100, 30);
        btnUpdate.setBounds(140, 120, 100, 30);
        btnDelete.setBounds(250, 120, 100, 30);

        frame.add(btnCreate);
        frame.add(btnUpdate);
        frame.add(btnDelete);

        //==============    TABLE & SCROLLPANE    ==============
        String[] columnNames = {"NIM", "Nama"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 160, 200, 90);
        frame.add(scrollPane);

        //==============    TOMBOL EDIT & VIEW     ==============
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(250, 160, 100, 35);
        frame.add(btnEdit);

        JButton btnView = new JButton("View");
        btnView.setBounds(250, 205, 100, 35);
        frame.add(btnView);

        //=============    EVENT TOMBOL CREATE   ==============
        btnCreate.addActionListener(e -> {
            String nim = txtNIM.getText();
            String nama = txtNama.getText();

            if (nim.isEmpty() || nama.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "NIM dan Nama harus Diisi!");
                return;
            }

            try {
                Integer.parseInt(nim);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "NIM harus berupa angka!");
                return;
            }

            model.addRow(new Object[]{nim, nama});

            txtNIM.setText("");
            txtNama.setText("");

        });

        //==============    EVENT LISTENER   ==============
        btnEdit.addActionListener(e -> {
            btnCreate.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        });


        frame.setVisible(true);
    }
}
