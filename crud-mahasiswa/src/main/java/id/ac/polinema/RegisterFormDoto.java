package id.ac.polinema;

    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JTextField;
    import javax.swing.JPasswordField;
    import javax.swing.JButton;
    import javax.swing.SwingConstants;
    import java.awt.Font;

    public class RegisterFormDoto {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(420, 560);
        frame.setTitle("Register");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 1. Judul & Subjudul
        JLabel lblTitle = new JLabel("Register");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitle.setBounds(40, 20, 200, 30);
        frame.add(lblTitle);

        JLabel lblSub = new JLabel("let's finish your work with us!");
        lblSub.setBounds(40, 50, 320, 20);
        frame.add(lblSub);

        // 2. Field: Username
        JLabel lblUser = new JLabel("Username");
        lblUser.setBounds(40, 85, 320, 20);
        frame.add(lblUser);

        JTextField txtUser = new JTextField();
        txtUser.setBounds(40, 108, 320, 32);
        frame.add(txtUser);

        // 3. Field: Email
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(40, 148, 320, 20);
        frame.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(40, 171, 320, 32);
        frame.add(txtEmail);

        // 4. Field: Password
        JLabel lblPass = new JLabel("Password");
        lblPass.setBounds(40, 211, 320, 20);
        frame.add(lblPass);

        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(40, 234, 245, 32);
        frame.add(txtPass);

        JButton btnShow = new JButton("Show");
        btnShow.setBounds(290, 234, 70, 32);
        frame.add(btnShow);

        // 5. Field: Konfirmasi Password
        JLabel lblConfirm = new JLabel("Konfirmasi Password");
        lblConfirm.setBounds(40, 274, 320, 20);
        frame.add(lblConfirm);

        JPasswordField txtConfirm = new JPasswordField();
        txtConfirm.setBounds(40, 297, 320, 32);
        frame.add(txtConfirm);

        // 6. Tombol: Get Started
        JButton btnGetStarted = new JButton("Get Started");
        btnGetStarted.setBounds(40, 345, 320, 38);
        frame.add(btnGetStarted);

        // 7. Label Pemisah: 'or'
        JLabel lblOr = new JLabel("or", SwingConstants.CENTER);
        lblOr.setBounds(40, 388, 320, 20);
        frame.add(lblOr);

        // 8. Tombol: Daftar dengan Google
        JButton btnGoogle = new JButton("Daftar dengan Google");
        btnGoogle.setBounds(40, 412, 320, 38);
        frame.add(btnGoogle);

        // 9. Teks Sign In
        JLabel lblSignIn = new JLabel("Already have an account? Sign in", SwingConstants.CENTER);
        lblSignIn.setBounds(40, 465, 320, 25);
        frame.add(lblSignIn);

        frame.setVisible(true);
    }
}