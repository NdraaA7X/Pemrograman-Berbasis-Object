 package id.ac.polinema;

    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JTextField;
    import javax.swing.JPasswordField;
    import javax.swing.JButton;
    import javax.swing.SwingConstants;
    import java.awt.Font;

    public class ForgotPasswordForm {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(420, 520);
            frame.setTitle("Forgot Password");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            // 1. Judul & Subjudul
            JLabel lblTitle = new JLabel("Forgot Password");
            lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
            lblTitle.setBounds(40, 25, 250, 30);
            frame.add(lblTitle);

            JLabel lblSub = new JLabel("Reset your password to access your account");
            lblSub.setBounds(40, 55, 320, 20);
            frame.add(lblSub);

            // 2. Field: Username / Email
            JLabel lblUser = new JLabel("Username or Email");
            lblUser.setBounds(40, 95, 320, 20);
            frame.add(lblUser);

            JTextField txtUser = new JTextField();
            txtUser.setBounds(40, 120, 320, 32);
            frame.add(txtUser);

            // 3. Field: Password Baru
            JLabel lblNewPass = new JLabel("New Password");
            lblNewPass.setBounds(40, 165, 320, 20);
            frame.add(lblNewPass);

            JPasswordField txtNewPass = new JPasswordField();
            txtNewPass.setBounds(40, 190, 245, 32);
            frame.add(txtNewPass);

            JButton btnShow = new JButton("Show");
            btnShow.setBounds(290, 190, 70, 32);
            frame.add(btnShow);

            // 4. Field: Konfirmasi Password Baru
            JLabel lblConfirmPass = new JLabel("Confirm New Password");
            lblConfirmPass.setBounds(40, 235, 320, 20);
            frame.add(lblConfirmPass);

            JPasswordField txtConfirmPass = new JPasswordField();
            txtConfirmPass.setBounds(40, 260, 320, 32);
            frame.add(txtConfirmPass);

            // 5. Tombol: Reset Password
            JButton btnReset = new JButton("Reset Password");
            btnReset.setBounds(40, 315, 320, 38);
            frame.add(btnReset);

            // 6. Teks Kembali ke Sign In
            JLabel lblBack = new JLabel("Remember your password? Sign in", SwingConstants.CENTER);
            lblBack.setBounds(40, 370, 320, 25);
            frame.add(lblBack);

            frame.setVisible(true);
        }
    }