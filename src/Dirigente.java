import Interfaces.CheckIn;

public class Dirigente extends Dipendente implements CheckIn {

    private double bonus;
    public Dirigente(String matricola, double stipendio, double bonus, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
        this.bonus= bonus;
    }

    @Override
    public void calculateSalary() {
        stipendio = stipendio + bonus;
    }

    @Override
    public void CheckIn() {

    }
}
