package testes;

import criadoresConcretos.SanduicheArtesanalFactory;
import criadoresConcretos.SanduicheIntegralFactory;
import criadoresConcretos.SanduicheXTudoFactory;
import criadorAbstrato.SanduicheFactory;
import interfacesProdutos.Ovo;
import interfacesProdutos.Pao;
import interfacesProdutos.Presunto;
import interfacesProdutos.Queijo;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SanduicheFactoryTest {

    @Test
    public void testSanduicheArtesanalFactory() {
        SanduicheFactory artesanalFactory = new SanduicheArtesanalFactory();
        Pao paoArtesanal = artesanalFactory.defineTipoPao();
        Queijo queijoArtesanal = artesanalFactory.defineTipoQueijo();
        Presunto presuntoArtesanal = artesanalFactory.defineTipoPresunto();
        Ovo ovoArtesanal = artesanalFactory.defineTipoOvo();

        assertTrue(paoArtesanal instanceof produtosConcretos.PaoFrances);
        assertTrue(queijoArtesanal instanceof produtosConcretos.QueijoPrato);
        assertTrue(presuntoArtesanal instanceof produtosConcretos.PresuntoFrango);
        assertTrue(ovoArtesanal instanceof produtosConcretos.OvoCapoeira);
    }

    @Test
    public void testSanduicheIntegralFactory() {
        SanduicheFactory integralFactory = new SanduicheIntegralFactory();
        Pao paoIntegral = integralFactory.defineTipoPao();
        Queijo queijoIntegral = integralFactory.defineTipoQueijo();
        Presunto presuntoIntegral = integralFactory.defineTipoPresunto();
        Ovo ovoIntegral = integralFactory.defineTipoOvo();

        assertTrue(paoIntegral instanceof produtosConcretos.PaoIntegral);
        assertTrue(queijoIntegral instanceof produtosConcretos.QueijoMussarela);
        assertTrue(presuntoIntegral instanceof produtosConcretos.PresuntoPeru);
        assertTrue(ovoIntegral instanceof produtosConcretos.OvoGranja);
    }

    @Test
    public void testSanduicheXTudoFactory() {
        SanduicheFactory xTudoFactory = new SanduicheXTudoFactory();
        Pao paoXTudo = xTudoFactory.defineTipoPao();
        Queijo queijoXTudo = xTudoFactory.defineTipoQueijo();
        Presunto presuntoXTudo = xTudoFactory.defineTipoPresunto();
        Ovo ovoXTudo = xTudoFactory.defineTipoOvo();

        assertTrue(paoXTudo instanceof produtosConcretos.PaoBola);
        assertTrue(queijoXTudo instanceof produtosConcretos.QueijoCheddar);
        assertTrue(presuntoXTudo instanceof produtosConcretos.PresuntoFrango);
        assertTrue(ovoXTudo instanceof produtosConcretos.OvoGranja);
    }
}
