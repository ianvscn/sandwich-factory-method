package criadorAbstrato;

import interfacesProdutos.Ovo;
import interfacesProdutos.Pao;
import interfacesProdutos.Presunto;
import interfacesProdutos.Queijo;

public abstract class SanduicheFactory {

    public abstract Pao defineTipoPao();

    public abstract Queijo defineTipoQueijo();

    public abstract Presunto defineTipoPresunto();

    public abstract Ovo defineTipoOvo();
}
