package id.ac.polinema;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;

public class RegisterFromDoto {
    public static void main(String[] args) {
        //==============    WINDOW FRAME    ==============
        JFrame frame = new JFrame();
        frame.setSize(420, 500);
        frame.setTitle("Form Register - Doto");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 

        //==============    JUDUL    ==============
        JLabel lblHeader = new JLabel("REGISTER AKUN");
        lblHeader.setFont(new Font("Arial", Font.BOLD, 18));
        lblHeader.setBounds(130, 20, 200, 30);
        frame.add(lblHeader);

        //==============    INPUT NAMA    ==============
        JLabel lblNama = new JLabel("Nama Lengkap");
        lblNama.setBounds(40, 70, 120, 25);
        frame.add(lblNama);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(170, 70, 190, 25);
        frame.add(txtNama);

        //==============    INPUT USERNAME    ==============
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(40, 110, 120, 25);
        frame.add(lblUsername);

        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(170, 110, 190, 25);
        frame.add(txtUsername);

        //==============    INPUT EMAIL    ==============
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(40, 150, 120, 25);
        frame.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(170, 150, 190, 25);
        frame.add(txtEmail);

        //==============    INPUT PASSWORD    ==============
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(40, 190, 120, 25);
        frame.add(lblPassword);

        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(170, 190, 190, 25);
        frame.add(txtPassword);

        //==============    INPUT KONFIRMASI PASSWORD    ==============
        JLabel lblConfirm = new JLabel("Konfirmasi Pass");
        lblConfirm.setBounds(40, 230, 120, 25);
        frame.add(lblConfirm);

        JPasswordField txtConfirm = new JPasswordField();
        txtConfirm.setBounds(170, 230, 190, 25);
        frame.add(txtConfirm);

        //==============    TOMBOL REGISTER & RESET    ==============
        JButton btnRegister = new JButton("Daftar Sekarang");
            btnRegister.setBounds(40, 290, 150, 35);
            btnRegister.setBackground(new Color(58, 139, 230));
            frame.add(btnRegister);

            JButton btnReset = new JButton("Reset Form");
            btnReset.setBounds(210, 290, 150, 35);
            frame.add(btnReset);

        //==============    LOGIKA KLIK TOMBOL REGISTER    ==============
        btnRegister.addActionListener(e -> {
            String nama = txtNama.getText().trim();
            String username = txtUsername.getText().trim();
            String email = txtEmail.getText().trim();
            String password = new String(txtPassword.getPassword());
            String confirmPass = new String(txtConfirm.getPassword());

        //==== UNTUK VALIDASI AGAR KOLOM TDK BOLEH KOSONG ====
        if (nama.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Semua data wajib diisi!", 
            "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //==== UNTUK VALIDASI PANJANG PASSWORD MINIMAL 6 ====
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(frame, "Password minimal 6 karakter!", 
            "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //==== UNTUK VALIDASI PW DAN KONFIRMASI PW HARUS SAMA ====
        if (!password.equals(confirmPass)) {
            JOptionPane.showMessageDialog(frame, "Konfirmasi password tidak cocok!",
            "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //==== JIKA UDAH VALID ====
        JOptionPane.showMessageDialog(frame, "Selamat " + nama + ", pendaftaran akun Anda berhasil!", 
        "Sukses", JOptionPane.INFORMATION_MESSAGE);

        txtNama.setText("");
        txtUsername.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirm.setText("");
    });

    //===========   LOGIKA KLIK TOMBOL RESET    ===========
    btnReset.addActionListener(e -> {
        txtNama.setText("");
        txtUsername.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirm.setText("");
    });

    frame.setVisible(true);
    }
}
