package praktek03;
public class KapalAksi {
    public static void main(String[] args) {
         Kapal k = new Kapal();
        
         k.setMerk("Titanic");
         k.setWarna("Hitam");
         k.setHarga(1500);
         
         k.cetakInfo();
         
         System.out.println("Merknya \t: ");
         System.out.println(k.getMerk());
         System.out.println("Warnanya \t: ");
         System.out.println(k.getWarna());
         System.out.println("Harganya \t: ");
         System.out.println(k.getHarga());
    }
}
