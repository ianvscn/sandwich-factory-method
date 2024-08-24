package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import produtosConcretos.PaoBola;
import produtosConcretos.PaoFrances;
import produtosConcretos.PaoIntegral;
import interfacesProdutos.Pao;

public class PaoTest {

    @Test
    public void testPaoBola() {
        Pao pao = new PaoBola();
        assertTrue(pao instanceof PaoBola);
    }

    @Test
    public void testPaoFrances() {
        Pao pao = new PaoFrances();
        assertTrue(pao instanceof PaoFrances);
    }

    @Test
    public void testPaoIntegral() {
        Pao pao = new PaoIntegral();
        assertTrue(pao instanceof PaoIntegral);
    }
}
