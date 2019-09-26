package bicikl;

public class Lampa {
	private boolean svetli;
	private String boja;

	public Lampa(boolean svetli, String boja) {
		this.svetli = svetli;
		this.boja = boja;
	}

	public boolean isSvetli() {
		return svetli;
	}

	public void setSvetli(boolean svetli) {
		this.svetli = svetli;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (svetli) {
			sb.append("\nSvetli: DA;");
		} else {
			sb.append("\nSvetli: NE;");
		}
		sb.append(" Boja lampice: " + boja);
		return sb.toString();
	}

}
