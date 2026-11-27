package id.ac.polinema.backend;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;

    public class DBHelper {
        // Ganti <HOST_SUPABASE> dengan Host Session Pooler dari Supabase kamu
        // Contoh: aws-0-ap-southeast-1.pooler.supabase.com
        private static final String URL = "jdbc:postgresql://aws-1-ap-northeast-1.pooler.supabase.com:5432/postgres?sslmode=require";

        // Ganti dengan User Session Pooler dari Supabase (contoh: postgres.abcdefghijkl)
        private static final String USER = "postgres.bfqgmsyulhvpabjvvlyt";

        // Ganti dengan Password database Supabase kamu
        private static final String PASS = "taikayam198";

        // Membuka koneksi ke Supabase
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASS);
        }

        // Mengisi tanda tanya (?) pada PreparedStatement secara berurutan
        private static void isiParameter(PreparedStatement ps, Object... params) throws SQLException {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
        }

        // Menjalankan query INSERT, UPDATE, atau DELETE
        public static boolean executeQuery(String sql, Object... params) {
            try (var c = getConnection();
                 var ps = c.prepareStatement(sql)) {
                isiParameter(ps, params);
                ps.executeUpdate();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }