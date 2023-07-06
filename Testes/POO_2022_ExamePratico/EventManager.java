package POO_2022_ExamePratico;
import java.time.LocalDate;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.TreeSet;

public class EventManager {
    @Override
    public String toString() {
        return nome;
    }

    private TreeMap<Client,HashSet<Event>> mapa;
    private String nome;
    public EventManager(String name){
        this.nome=name;
        this.mapa = new TreeMap<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Client addClient(String um, String dois){
        Client newclient = new Client(um, dois);
        if(!mapa.containsKey(newclient)){
            mapa.put(newclient, new HashSet<>());
        }
        return newclient;
    }
    public Event addEvent(Client c, LocalDate data){
        Event now = new Event(data);
        if(mapa.containsKey(c)){
            mapa.get(c).add(now);
        }
        return now;
    }
    public String listClients(){
        for(Client c : mapa.keySet()){
            System.out.println(c);
        }
        return "";
    }
    public ArrayList<String> getClientsWithEvents(){
        ArrayList<String> clientes = new ArrayList<>();
        for(Client c : mapa.keySet()){
            if (mapa.get(c).size()!=0){
                clientes.add(c.toString());
            }
        }
        return clientes;
    }
    public String listEvents(){
        for(Client c : mapa.keySet()){
            System.out.println(c);
            for(Event e : mapa.get(c)){
                System.out.println(e);
            }
        }
        return "";
    }

    public TreeSet<String> getNextEventsByDate(){
        TreeSet<String> eve = new TreeSet<>();
        for(Client c : mapa.keySet()){
            for(Event e : mapa.get(c)){
                eve.add(e.toString());
            }
        }
        return eve;
    }
}
