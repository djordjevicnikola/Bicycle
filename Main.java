package bicikl;

public class Main {

	public static void main(String[] args) {
		Lampa l1 = new Lampa(false, "zuta");
		Lampa l2 = new Lampa(false, "bela");
		Lampa l3 = new Lampa(true, "crna");
		Lampa l4 = new Lampa(true, "plava");
		Bicikl b1 = new Bicikl("Poni", "bela", 120);
		b1.dodaj(l1);
		b1.dodaj(l2);
		b1.dodaj(l3);
//		System.out.println(l1); 
		System.out.println(b1);
		b1.upaliUgasi(l3);
		System.out.println();
		System.out.println(b1);
		System.out.println();
		System.out.println(b1.getVisinaSedista());
		b1.podigniSediste(33);
		b1.podigniSediste(30);
		System.out.println(b1.getVisinaSedista());
		b1.spustiSediste(101);
		b1.spustiSediste(46);
		System.out.println(b1.getVisinaSedista());
		b1.getLampa(1);
b1.getLampa(4);
		System.out.println(b1.getLampa(3).isSvetli());

	}

}
