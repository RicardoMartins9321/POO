package aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex9_2 {
    final static int DIMS[] = { 1000, 5000, 10000, 20000, 40000, 100000 };

	public static void main(String[] args) {
		String hr = "_______________________________________________________________";

		System.out.println(hr);
		System.out.print("Collection");

		for (int d : DIMS) {
            System.out.print("\t" + d);
        }

		printBenchmark(new ArrayList<>());
		
		printBenchmark(new LinkedList<>());
		
		printBenchmark(new HashSet<>());
		
		printBenchmark(new TreeSet<>());

		System.out.println();

		System.out.println(hr);
	}

	static void printBenchmark(Collection<Integer> c) {
		double[][] a = new double[3][6];
		double[] temp = new double[3];

		for (int i = 0; i < 6; i++) {
			temp = checkPerformance(c, DIMS[i]);
			a[0][i] = temp[0];
			a[1][i] = temp[1];
			a[2][i] = temp[2];
		}

		System.out.println("\n" + c.getClass().getSimpleName());
		System.out.print("Add:    \t");

		for (int i = 0; i < 6; i++) {
            System.out.printf("%.2f\t", a[0][i]);
        }

        System.out.println();
        System.out.print("Search: \t");

		for (int i = 0; i < 6; i++) {
            System.out.printf("%.2f\t", a[1][i]);
        }
			
        System.out.println();
        System.out.print("Remove: \t");

		for (int i = 0; i < 6; i++) {
            System.out.printf("%.2f\t", a[2][i]);
        }
        
		System.out.println();
	}

	static double[] checkPerformance(Collection<Integer> col, int DIM) {
		double start, stop, delta;
		double benchmark[] = new double[3];

		start = System.nanoTime(); 

		for (int i = 0; i < DIM; i++) {
            col.add(i);
        }

		stop = System.nanoTime(); 
		delta = (stop - start) / 1e6; 
		benchmark[0] = delta;

		start = System.nanoTime(); 

		for (int i = 0; i < DIM; i++) {
			int n = (int) (Math.random() * DIM);
			if (!col.contains(n)) {
                System.out.println("Not found???" + n);
            }	
		}

		stop = System.nanoTime(); 
		delta = (stop - start) / 1e6; 

		benchmark[1] = delta;

		start = System.nanoTime(); 
		Iterator<Integer> iterator = col.iterator();

		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
        
		stop = System.nanoTime();
		delta = (stop - start) / 1e6; 
		benchmark[2] = delta;

		return benchmark;
	}
}
