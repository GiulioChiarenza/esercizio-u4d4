import Interfaces.CheckIn;

public class DipendenteFullTime extends Dipendente implements CheckIn {


    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {

    }

    @Override
    public void CheckIn() {

    }
}
