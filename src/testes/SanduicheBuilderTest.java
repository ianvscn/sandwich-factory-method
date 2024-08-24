package testes;

import builder.SanduicheBuilder;
import criadoresConcretos.SanduicheArtesanalFactory;
import criadoresConcretos.SanduicheIntegralFactory;
import criadoresConcretos.SanduicheXTudoFactory;
import criadorAbstrato.SanduicheFactory;
import modelo.Sanduiche;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SanduicheBuilderTest {

    @Test
    public void testSanduicheArtesanal() {
        SanduicheBuilder builder = new SanduicheBuilder();
        SanduicheFactory factory = new SanduicheArtesanalFactory();
        Sanduiche sanduiche = builder.montaSanduiche(factory);

        System.out.println(sanduiche);
        assertTrue(sanduiche.toString().contains("PaoFrances"));
        assertTrue(sanduiche.toString().contains("QueijoPrato"));
        assertTrue(sanduiche.toString().contains("PresuntoFrango"));
        assertTrue(sanduiche.toString().contains("OvoCapoeira"));
    }

    @Test
    public void testSanduicheIntegral() {
        SanduicheBuilder builder = new SanduicheBuilder();
        SanduicheFactory factory = new SanduicheIntegralFactory();
        Sanduiche sanduiche = builder.montaSanduiche(factory);

        System.out.println(sanduiche);
        assertTrue(sanduiche.toString().contains("PaoIntegral"));
        assertTrue(sanduiche.toString().contains("QueijoMussarela"));
        assertTrue(sanduiche.toString().contains("PresuntoPeru"));
        assertTrue(sanduiche.toString().contains("OvoGranja"));
    }

    @Test
    public void testSanduicheXTudo() {
        SanduicheBuilder builder = new SanduicheBuilder();
        SanduicheFactory factory = new SanduicheXTudoFactory();
        Sanduiche sanduiche = builder.montaSanduiche(factory);

        System.out.println(sanduiche);
        assertTrue(sanduiche.toString().contains("PaoBola"));
        assertTrue(sanduiche.toString().contains("QueijoCheddar"));
        assertTrue(sanduiche.toString().contains("PresuntoFrango"));
        assertTrue(sanduiche.toString().contains("OvoGranja"));
    }
}
