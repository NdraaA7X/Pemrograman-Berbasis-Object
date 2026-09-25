package Kuis1;

public class SlotParkir {
    private int nomor;
    private Kendaraan kendaraan;

    public SlotParkir(int nomor){
        this.nomor = nomor;
    }
    
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public boolean isKosong() {
        return kendaraan == null;
    }

     public String info() {
        if (isKosong()) {
            return "Slot " + nomor + ": (kosong)";
        } else {
            return "Slot " + nomor + ": " + kendaraan.info();
        }
    }
}
