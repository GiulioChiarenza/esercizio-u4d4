import Interfaces.CheckIn;

abstract class Dipendente implements CheckIn {
    //attributi
    private String matricola;
    protected double stipendio;
    private Dipartimento dipartimento;
// constructor

public Dipendente (String matricola, double stipendio, Dipartimento dipartimento){
    this.matricola= matricola;
    this.stipendio= stipendio;
    this.dipartimento= dipartimento;
}

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }


    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


    //metodi

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento='" + dipartimento + '\'' +
                '}';
    }
    public abstract void calculateSalary();

}
