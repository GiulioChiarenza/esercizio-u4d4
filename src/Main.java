import Interfaces.CheckIn;
public class Main {
    public static void main(String[] args) {

        Dipendente[] Dipendenti = new Dipendente[3];
        Dipendenti[0]= new DipendenteFullTime("12345", 1200.0, Dipartimento.PRODUZIONE);
        Dipendenti[1] = new DipendentePartTime("67890", 40, 12.5, Dipartimento.VENDITE);
        Dipendenti[2] = new Dirigente("111213", 2000.0, 1500.0, Dipartimento.AMMINISTRAZIONE);

        Volontario Volontario1= new Volontario("Mario", 56, "CurriculumDiMario");
        Volontario Volontario2= new Volontario("Luca", 61, "CurriculumDiluca");
        Volontario[] Volontari = { Volontario1, Volontario2};


        for (Dipendente dipendente : Dipendenti){
            dipendente.calculateSalary();
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.getStipendio());
            if (dipendente instanceof CheckIn) {
                ((CheckIn) dipendente).CheckIn();
                System.out.println("Inizio turno ore 8:00 per dipendente: " + dipendente.getMatricola());
            }
        }
        for (Volontario volontario : Volontari) {
            volontario.CheckIn();
            System.out.println("Inizio turno ore 8:00 per volontario: " + volontario.getNome());
        }
        }
    }
