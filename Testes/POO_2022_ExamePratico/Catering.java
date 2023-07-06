package POO_2022_ExamePratico;

public class Catering extends Activity{
    public Catering(Catering.Option modal, int parc){
        super("Catering",String.valueOf(modal), parc, 25);
    }
    public enum Option{
        FULL_MENU,DRINKS_AND_SNACKS,LIGHT_BITES
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
