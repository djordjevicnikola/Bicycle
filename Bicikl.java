package bicikl;

public class Bicikl {
	private String tip;
	private String boja;
	private double visinaSedista;
	private Lampa[] lampa;
	private int brLampica = 0;

	public Bicikl(String tip, String boja, double visinaSedista) {
		this.tip = tip;
		this.boja = boja;
		this.visinaSedista = visinaSedista;
		this.lampa = new Lampa[3];
	}

	public Lampa getLampa(int redBr) {
		redBr--;
		if (redBr < 0 || redBr >= brLampica) {
			System.out.println("Ne postoji lampa sa tim rednim brojem");
			return null;
		} else {
			System.out.println("Lampa sa rednim brojem " + (redBr + 1));
			return lampa[redBr];
		}
	}

	public void podigniSediste(int i) {
		double max = 150;
		if (visinaSedista + i > max) {
			System.out.println("Sediste mozete podici max jos " + (max - visinaSedista));
		} else {
			visinaSedista += i;
		}
	}

	public void spustiSediste(int i) {
		double min = 50;
		if (visinaSedista - i < min) {
			System.out.println("Sediste mozete podici max jos " + (visinaSedista - min));
		} else {
			visinaSedista -= i;
		}
	}

	public double getVisinaSedista() {
		return visinaSedista;
	}

	public void dodaj(Lampa l) {
		if (brLampica < lampa.length) {
			lampa[brLampica++] = l;
		} else {
			System.out.println("Moguce je dodati max 3 lampe.");
		}
	}

	public void upaliUgasi(Lampa l) {
		if (l.isSvetli() == true) {
			l.setSvetli(false);
		} else {
			l.setSvetli(true);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tip: " + tip + "\nBoja bajsa: " + boja);
		for (int i = 0; i < brLampica; i++) {
			sb.append(lampa[i].toString());
		}
		return sb.toString();
	}

}
