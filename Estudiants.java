/**
* Classe Estudiants
* @author Albert Frau
* @version 0.2
*/
public class Estudiants extends Persona {

private String curs;
private String matricula;

/**
*
*/

public Estudiants (){
super();
}
/**
*
* @param nom
* @param llinatges
* @param edat
* @param telefon
* @param matricula
* @param curs
*/

public Estudiants (String nom, String llinatges, byte edat, String telefon, String matricula, String curs){
super (nom, llinatges, edat, telefon);
this.curs = curs;
this.matricula = matricula;
}
public String getCurs() {
return curs;
}
/**
* Mètode per insertar el curs del estudiant
* @param curs
*/
public void setCurs(String curs) {
this.curs = curs;
}
public String getMatricula() {
return matricula;
}
/**
* Mètode per insertar la matricula del estudiant
* @param matricula
*/
public void setMatricula(String matricula) {
this.matricula = matricula;
}
public String toString(){
return "Nom: " + getNom() + "\n" +
"Llinatges" + getLlinatges() + "\n" +
"Edat" + getEdat() + "\n" +
"Telefon" + getEdat() + "\n" +
"Curs" + this.curs + "\n" +
"Matricula" + this.matricula + "\n" +
"----------------------------------\n";
}
}
