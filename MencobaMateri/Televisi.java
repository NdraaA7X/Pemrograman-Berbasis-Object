public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    // Konstruktor default
    public Televisi() {
        this.channelAktif = 1; // Default channel aktif dimulai dari 1
    }

    // Konstruktor dengan parameter
    public Televisi(String merek, int jumlahChannel) {
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
        this.channelAktif = 1;
    }

    // Method untuk berpindah channel
    public void pindahChannel(int channelBaru) {
        this.channelAktif = channelBaru;
    }

    // Getter untuk mendapatkan channel aktif
    public int getChannelAktif() {
        return channelAktif;
    }
}