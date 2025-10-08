public enum Days {

LUN(2,"lundi"), MAR(3,"mardi"), MER(4,"mercredi"), JEU(5,"jeudi"), VEN(6,"vendredi"), SAM(7,"samedi"), DIM(1,"dimanche"); 

private int NumJouralgerie;
private String nomJour ;

public int GetnumeJour(){
    return NumJouralgerie;

}
public String GetnomJour(){
    return nomJour; }


private Days(int numJouralgerie, String nomJour) {
    this.NumJouralgerie = numJouralgerie;
    this.nomJour = nomJour;


}
