import Interfaces.CheckIn;

public class DipendentePartTime extends  Dipendente implements CheckIn {

    private int oreLavorate;
    private double tariffaOraria;
    public DipendentePartTime(String matricola, int oreLavorate, double tariffaOraria, Dipartimento dipartimento) {
        super(matricola, 0, dipartimento);
        this.oreLavorate= oreLavorate;
        this.tariffaOraria= tariffaOraria;

    }

    @Override
    public void calculateSalary() {
        stipendio = oreLavorate * tariffaOraria;

    }

    @Override
    public void CheckIn() {

    }
}
