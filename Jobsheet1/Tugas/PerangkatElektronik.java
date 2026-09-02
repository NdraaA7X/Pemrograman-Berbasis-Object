package Jobsheet1.Tugas;

public class PerangkatElektronik {
    private String merek;
    private int dayaBaterai;

    public PerangkatElektronik(String merek, int dayaBaterai) {
        this.merek = merek;
        this.dayaBaterai = dayaBaterai;
    }

    public void cekBaterai() {
        if (dayaBaterai < 20) {
            System.out.println(merek + " baterai lemah, segera charge!");
        } else {
            System.out.println(merek + " baterai masih " + dayaBaterai + "%.");
        }
    }

    public void charge(int tambahan) {
        dayaBaterai += tambahan;
        if (dayaBaterai > 100) {
            dayaBaterai = 100;
        }
        System.out.println(merek + " sedang di-charge, sekarang " + dayaBaterai + "%.");
    }

    public String getMerek() {
        return merek;
    }

    public void printInfo() {
        System.out.println("Merek         : " + merek);
        System.out.println("Daya Baterai  : " + dayaBaterai + "%");
    }
}
