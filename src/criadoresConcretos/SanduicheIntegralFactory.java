package criadoresConcretos;

import criadorAbstrato.SanduicheFactory;
import interfacesProdutos.Ovo;
import interfacesProdutos.Pao;
import interfacesProdutos.Presunto;
import interfacesProdutos.Queijo;
import produtosConcretos.OvoGranja;
import produtosConcretos.PaoIntegral;
import produtosConcretos.PresuntoPeru;
import produtosConcretos.QueijoMussarela;

public class SanduicheIntegralFactory extends SanduicheFactory {

    @Override
    public Pao defineTipoPao() {
        return new PaoIntegral();
    }

    @Override
    public Queijo defineTipoQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public Presunto defineTipoPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public Ovo defineTipoOvo() {
        return new OvoGranja();
    }
}
