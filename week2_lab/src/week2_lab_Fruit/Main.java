package week2_lab_Fruit;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String arg[]) {
		List<Fruit> al = new ArrayList<Fruit>();
		
		al.add(new Fruit(101,"Apple",1000));
		al.add(new Fruit(102,"Orange",1500));
		al.add(new Fruit(103,"Kiwi",2000));
		al.add(new Fruit(104,"Lemon",1300));
		al.add(new Fruit(105,"WaterMelon",4000));
		al.add(new Fruit(106,"Mandarin",700));
		al.add(new Fruit(107,"Banana",1200));
		al.add(new Fruit(108,"Mango",3000));
		al.add(new Fruit(109,"Mangostin",5000));
		al.add(new Fruit(110,"Cherry",1700));
		
		Collections.sort(al, new FruitComparator() );
		for(Fruit s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		Collections.sort(al, new FruitComparatorDesc() );
		
		for(int i=0 ; i < al.size() ; i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
