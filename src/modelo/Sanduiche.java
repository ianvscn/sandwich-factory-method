package modelo;

import interfacesProdutos.Ovo;
import interfacesProdutos.Pao;
import interfacesProdutos.Presunto;
import interfacesProdutos.Queijo;

public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Ovo ovo;

    public void setPao(Pao pao) {
        this.pao = pao;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    public void setPresunto(Presunto presunto) {
        this.presunto = presunto;
    }

    public void setOvo(Ovo ovo) {
        this.ovo = ovo;
    }

    @Override
    public String toString() {
        return "Sanduíche com " + pao.getClass().getSimpleName() + ", " + queijo.getClass().getSimpleName() + ", " + presunto.getClass().getSimpleName() + " e " + ovo.getClass().getSimpleName();
    }
}
