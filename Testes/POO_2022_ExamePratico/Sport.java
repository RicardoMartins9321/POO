package POO_2022_ExamePratico;

public class Sport extends Activity {

    public Sport(Sport.Modality modal, int parc){
        super("Sport",String.valueOf(modal), parc, 30);
    }
    public enum Modality {
        KAYAK,BIKE,HIKING,BOWLING
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
