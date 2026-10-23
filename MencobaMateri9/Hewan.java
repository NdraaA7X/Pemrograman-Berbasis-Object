package MencobaMateri9;

public abstract class Hewan {
  protected String nama;
  protected int umur;

  public Hewan(String nama) {
    this.nama = nama;
  }

  public void tambahanUmur(){
    umur++;
    System.out.println("Umur " + nama + " bertambah menjadi " + umur);
  }
}
