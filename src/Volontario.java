import Interfaces.CheckIn;

public class Volontario implements CheckIn {
    private String nome;
    private int età;
    private String CV;

    public Volontario(String nome, int età, String CV) {
        this.nome = nome;
        this.età = età;
        this.CV = CV;
    }
    @Override
    public void CheckIn() {

    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    public String getCV() {
        return CV;
    }
}
