package spai.egit2;

public class NumeroEntero {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    public NumeroEntero() {
        this(0);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }

    public void doblar() {
        this.setValor(this.valor * 2);
    }


    public void incrementar(int i) {
        // TODO Auto-generated method stub
        
    }

    public void decrementar(int i) {
        // TODO Auto-generated method stub
        
    }

}
