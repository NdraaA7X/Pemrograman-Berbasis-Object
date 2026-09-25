package Kuis1;

public class Areaparkir {
    private String nama;
    private SlotParkir[] arraySlot;

    public Areaparkir(String nama, int jumlah) {
        this.nama = nama;
        this.arraySlot = new SlotParkir[jumlah];
        this.initSlot();
    }

    private void initSlot() {
        for (int i = 0; i < arraySlot.length; i++) {
            arraySlot[i] = new SlotParkir(i + 1);
        }
    }

    public void parkir(Kendaraan k, int nomor) {
        if (nomor < 1 || nomor > arraySlot.length) {
            System.out.println("Nomor slot tidak valid");
            return;
        }
        SlotParkir slot = arraySlot[nomor - 1];
        if (!slot.isKosong()) {
            System.out.println("Slot " + nomor + " sudah terisi");
            return;
        }
        slot.setKendaraan(k);
    }

    public void keluar(int nomor) {
        if (nomor < 1 || nomor > arraySlot.length) {
            System.out.println("Nomor slot tidak valid");
            return;
        }
        arraySlot[nomor - 1].setKendaraan(null);
    }

    public int jumlahSlotKosong() {
        int jumlah = 0;
        for (SlotParkir slot : arraySlot) {
            if (slot.isKosong()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public String info() {
        String info = "";
        info += "Area: " + nama + "\n";
        for (SlotParkir slot : arraySlot) {
            info += slot.info() + "\n";
        }
        return info;
    }
}
