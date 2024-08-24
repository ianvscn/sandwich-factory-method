package criadoresConcretos;

import criadorAbstrato.SanduicheFactory;
import interfacesProdutos.Ovo;
import interfacesProdutos.Pao;
import interfacesProdutos.Presunto;
import interfacesProdutos.Queijo;
import produtosConcretos.OvoGranja;
import produtosConcretos.PaoBola;
import produtosConcretos.PresuntoFrango;
import produtosConcretos.QueijoCheddar;

public class SanduicheXTudoFactory extends SanduicheFactory {

    @Override
    public Pao defineTipoPao() {
        return new PaoBola();
    }

    @Override
    public Queijo defineTipoQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public Presunto defineTipoPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public Ovo defineTipoOvo() {
        return new OvoGranja();
    }
}
