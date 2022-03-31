import java.util.ArrayList;

public class Examen {

    private String naam;
    private Integer teBehalenPunten;

    private ArrayList<Student> HasA = new ArrayList<Student>();
    private ArrayList<Vraag> HasMultiple = new ArrayList<Vraag>();

    public Examen(String naam, Integer teBehalenPunten) {
        this.naam = naam;
        this.teBehalenPunten = teBehalenPunten;
    }

    public ArrayList<Student> getHasA() {
        return HasA;
    }

    public ArrayList<Vraag> getHasMultiple() {
        return HasMultiple;
    }

    public String getNaam() {
        return naam;
    }

    public Integer getTeBehalenPunten() {
        return teBehalenPunten;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setTeBehalenPunten(Integer teBehalenPunten) {
        this.teBehalenPunten = teBehalenPunten;
    }

//    public void setStudentGeslaagd(Student s){
//        this.Student = "geslaagd";
//    }

    public void addVragen(Vraag v){
        getHasMultiple().add(v);
    }

    public void addStudentGeslaagd(Student uitslag) {
        getHasA().add(uitslag);
    }

}
