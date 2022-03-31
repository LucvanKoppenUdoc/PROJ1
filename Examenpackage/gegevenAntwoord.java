package Examenpackage;
public class gegevenAntwoord {
    private Vraag vragen;
    private String gegevenAntwoord;
    
    public gegevenAntwoord(Vraag vragen, String gegevenAntwoord){
        this.vragen = vragen;
        this.gegevenAntwoord = gegevenAntwoord;
    }

    public String getGegevenAntwoord() {
        return gegevenAntwoord;
    }

    public void setGegevenAntwoord(String gegevenAntwoord) {
        this.gegevenAntwoord = gegevenAntwoord;
    }
}
