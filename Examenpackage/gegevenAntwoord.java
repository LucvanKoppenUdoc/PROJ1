package Examenpackage;
public class gegevenAntwoord {
    private Vraag vraag;
    private String gegevenAntwoord;
    
    public gegevenAntwoord(Vraag vraag, String gegevenAntwoord){
        this.vraag = vraag;
        this.gegevenAntwoord = gegevenAntwoord;
    }

    public String getGegevenAntwoord() {
        return gegevenAntwoord;
    }

    public void setGegevenAntwoord(String gegevenAntwoord) {
        this.gegevenAntwoord = gegevenAntwoord;
    }

    @Override
    public String toString() {
        return "gegevenAntwoord{" +
                "vraag=" + vraag +
                ", gegevenAntwoord='" + gegevenAntwoord + '\'' +
                '}';
    }
}