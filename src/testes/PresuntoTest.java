package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import produtosConcretos.PresuntoFrango;
import produtosConcretos.PresuntoPeru;
import interfacesProdutos.Presunto;

public class PresuntoTest {

    @Test
    public void testPresuntoFrango() {
        Presunto presunto = new PresuntoFrango();
        assertTrue(presunto instanceof PresuntoFrango);
    }

    @Test
    public void testPresuntoPeru() {
        Presunto presunto = new PresuntoPeru();
        assertTrue(presunto instanceof PresuntoPeru);
    }
}
