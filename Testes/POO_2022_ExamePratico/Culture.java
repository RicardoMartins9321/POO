package POO_2022_ExamePratico;

public class Culture extends Activity{
    public Culture(Culture.Option modal, int parc){
        super("Culture",String.valueOf(modal), parc, 22);
    }
    public enum Option{
        ART_MUSEUM,ARCHITECTURAL_TOUR,RIVER_TOUR,WINE_TASTING
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
