package builder;

import criadorAbstrato.SanduicheFactory;
import modelo.Sanduiche;
import interfacesProdutos.Ovo;
import interfacesProdutos.Pao;
import interfacesProdutos.Presunto;
import interfacesProdutos.Queijo;

public class SanduicheBuilder {
    public Sanduiche montaSanduiche(SanduicheFactory factory) {
        Pao pao = factory.defineTipoPao();
        Queijo queijo = factory.defineTipoQueijo();
        Presunto presunto = factory.defineTipoPresunto();
        Ovo ovo = factory.defineTipoOvo();

        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setPao(pao);
        sanduiche.setQueijo(queijo);
        sanduiche.setPresunto(presunto);
        sanduiche.setOvo(ovo);

        return sanduiche;
    }
}
