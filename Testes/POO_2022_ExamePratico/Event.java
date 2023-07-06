package POO_2022_ExamePratico;

import java.time.LocalDate;
import java.util.HashSet;

public class Event implements IEvent {
    private LocalDate data;
    private HashSet<Activity> lista = new HashSet<>();
    public Event(LocalDate data) {
        this.data = data;
    }
    public Event addActivity(Activity act){
        boolean stop = false;
        for(Activity lel : lista){
            if(lel instanceof Catering){
                stop= true;
                break;
            }
        }
        if(!stop){
            lista.add(act);
            Event event = new Event(getDate());
            return event;
        }
        else{
            if(!(act instanceof Catering)){
                lista.add(act);
                Event event = new Event(getDate());
                return event;
            }
            else{
                Event event = new Event(getDate());
                return event;
            }
        }

    }
    public double totalPrice(){
        double total=0;
        for(Activity x : lista){
            total+= x.getPreco();
        }
        return total;
    }
    public LocalDate getDate() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public HashSet<Activity> getLista() {
        return lista;
    }
    public void setLista(HashSet<Activity> lista) {
        this.lista = lista;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((lista == null) ? 0 : lista.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Event other = (Event) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (lista == null) {
            if (other.lista != null)
                return false;
        } else if (!lista.equals(other.lista))
            return false;
        return true;
    }
    @Override
    public String toString() {
        String res = "*** Evento em "+this.data + ", total="+this.totalPrice()+"\n";
        for (Activity a : this.lista){
            res += "\t"+a+"\n";
        }
        return res.substring(0, res.length()-1);
    }
}
