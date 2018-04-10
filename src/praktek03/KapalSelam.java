package praktek03;

public class KapalSelam extends Kapal{
    private String jenisKapal;
    
    void throttle(){
        System.out.println("THOOOTT......");
    }

    public String getJenisKapal() {
        return jenisKapal;
    }

    public void setJenisKapal(String jenisKapal) {
        this.jenisKapal = jenisKapal;
    }
    
    
    
}
