package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import aula05.DateYMD;
import aula06.Pessoa;


public class Ex9_1 {
    public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();

		for (int i = 10; i <= 100; i += 10) {
            c1.add(i);
        }
			
		System.out.println("Size: " + c1.size());

		for (int i = 0; i < c1.size(); i++) {
            System.out.println("Elemento: " + c1.get(i));
        }	

		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		System.out.println(c2);
		Collections.sort(c2);
		System.out.println(c2);
		c2.remove("Frio");
		c2.remove(0);
		System.out.println(c2);

		System.out.println(c2.contains("Frio"));
		System.out.println(c2.lastIndexOf("Vento"));

		Set<Pessoa> c3 = new HashSet<>();
		c3.add(new Pessoa("Igor Santos", 8976543, new DateYMD(11, 7, 1985)));
		c3.add(new Pessoa("Marco Pinto", 9988776, new DateYMD(18, 7, 1986)));
		c3.add(new Pessoa("Ana Moreira", 8978549, new DateYMD(11, 8, 1985)));
		c3.add(new Pessoa("Maria Almeida", 8979590, new DateYMD(12, 8, 1985)));
		c3.add(new Pessoa("Alberto Costa", 8977790, new DateYMD(10, 7, 1985)));

		System.out.println("Elements in c3: ");
		Iterator<Pessoa> iterator  = c3.iterator();
		while (iterator .hasNext())
			System.out.println(iterator .next());

		Set<DateYMD2> c4 = new TreeSet<>();
		c4.add(new DateYMD2(11, 7, 1985));
		c4.add(new DateYMD2(18, 7, 1986));
		c4.add(new DateYMD2(11, 8, 1985));
		c4.add(new DateYMD2(11, 8, 1985));
		c4.add(new DateYMD2(10, 7, 1985));
		
		System.out.println("Elements in c4: ");
		Iterator<DateYMD2> dateIterator = c4.iterator();
			while(dateIterator.hasNext()) {
		System.out.println(dateIterator.next());
		}
	}
}