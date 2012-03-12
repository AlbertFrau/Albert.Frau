public class Professors extends Persona {

	private String salari;
	private String curs

	public Professors(){
		super();
	}

	public Professors (String nom, String llinatges, byte edat, String telefon, String salari, String curs) {
		super(nom, llinatges, edat, telefon);
		this.salari = salari;
		this.curs = curs;
	}
	public String getSalari() {
		return salari;
	}
	public void setAssignatura(String assignatura, String salari) {
		this.salari = salari;

	public String getCurs() {
		return curs;
	}
	public setCurs(String curs){	
		this.curs = curs;
	}

	public String toString(){
		return "Nom: " +getNom()+ "\n" +
			"Llinatges" + getLlinatges()+ "\n" +
			"Edat" + getEdat()+ "\n" +
			"Telefon" + getTelefon()+ "\n" +
			"Salari" + this.Salari+ "\n" +
			"Curs" + this.curs + "\n"
			"----------------------------------\n";
	}
}
