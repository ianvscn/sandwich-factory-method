package criadoresConcretos;

import criadorAbstrato.SanduicheFactory;
import interfacesProdutos.Ovo;
import interfacesProdutos.Pao;
import interfacesProdutos.Presunto;
import interfacesProdutos.Queijo;
import produtosConcretos.OvoCapoeira;
import produtosConcretos.PaoFrances;
import produtosConcretos.PresuntoFrango;
import produtosConcretos.QueijoPrato;

public class SanduicheArtesanalFactory extends SanduicheFactory {

    @Override
    public Pao defineTipoPao() {
        return new PaoFrances();
    }

    @Override
    public Queijo defineTipoQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Presunto defineTipoPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public Ovo defineTipoOvo() {
        return new OvoCapoeira();
    }
}
