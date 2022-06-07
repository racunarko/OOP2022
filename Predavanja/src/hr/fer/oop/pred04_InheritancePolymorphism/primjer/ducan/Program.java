package hr.fer.oop.pred04_InheritancePolymorphism.primjer.ducan;

public class Program {
	
	public static double checkout(Item[] items) {
		double sum =0;
		
		//reference su na Item, ali objekti su Beverage, Cloth i Food
		for (Item i : items) {
			//metoda getPrice je definirana u klasi Item pa je mogu pozvati
			sum += i.getPrice(1);
		}
		
		return sum;
	}

	public static void main(String[] args) {

		//Object je "krovna klasa" u Javi
		//možemo stvoriti objekt tipa Object, ali to nema baš puno smisla... 
		Object o = new Object();
		System.out.println(o.toString());
		
		//Stvaramo objekt tipa Item, s def. konstruktorom
		Item i0 = new Item();
		System.out.println(i0);
		
		//Stvaramo objekt tipa Item s konstruktorom s 2 parametra
		//on zove this(,,)
		Item i1 = new Item("123456789", "Oreo keksići");
		System.out.println(i1);
		
		System.out.println(i1.getItemType());
		
		//Stvaramo objekt tipa Beverage
		//A za Beverage smo rekli "extends Item" 
		//uočiti redoslijed poziva konstruktora!
		Beverage b = new Beverage();

		//Stvaramo još jedan Beverage, s drugim konstruktorom
		Beverage p = new Beverage("123434", "Zmajska Therapy", 10, 0.5);
		System.out.println(p);
		
		//pitanja... 
		//valja li ovo?
		//Item p2 = new Beverage("123", "Nova runda C4", 20, 0.5);
		//a ovo:
		//Beverage p2 = new Item("123", "Nova runda C4", 20, 0.5);
		//a ovo:
		//Item p2 = new Item("123", "Nova runda C4", 20, 0.5);
		//Zašto?
		
		Food prsut = new Food("234234", "Domaci prsut", 100, 1000);
		
		System.out.println(prsut + "    PDV=" + prsut.getVAT());
		
		System.out.println(prsut);
		
		System.out.println(prsut.getSKU());
		
		
		//prvi primjer zašto nam je polimorfizam često praktičan 
		//različite "Iteme" strpam u košaricu, tj polje koje sadrži
		//reference na 3 itema
		
		Item[] items = new Item[3];
		
		//redom, u polju su ustvari jedan Beverage, pa Cloth i Food
		//ali svi oni su i "Item" pa ih kao takve mogu stavit u polje
		items[0] = p;
		items[1] = new Cloth("23432432", "T-shirt", 100, 32);
		items[2] = prsut;
			
		//polje predam fji checkout
		System.out.println(checkout(items));
		
		//ispisujem sadržaj košarice
		System.out.println("Košarica: ");
		
		//uočiti: iako su reference tipa Item, objekti su tipa Beverage, Cloth i Food
		//zato se u metodi println zove toString() od objekta, tj. redom će se zvati
		//toString() iz Beverage pa onaj iz Cloth pa iz Food
		for (int i=0; i< items.length; i++) {
			System.out.println(items[i]);
			//jasno, ako želim, mogu castati referencu nazad na pravi tip
			//onda ću moći pozvati sve metode iz te klase, npr. getVolume() za Beverage 
			//pazi: moram provjeriti mogu li castati Item na Beverage
			//npr. items[0] mogu, ali za items[1] ću dobiti ClassCast exception
			if (items[i] instanceof Beverage) {
				Beverage bevref = (Beverage)items[i];
				System.out.println(bevref.getItemType());
			}
		}
		
	}

}
