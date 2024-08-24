package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import produtosConcretos.QueijoCheddar;
import produtosConcretos.QueijoMussarela;
import produtosConcretos.QueijoPrato;
import interfacesProdutos.Queijo;

public class QueijoTest {

    @Test
    public void testQueijoCheddar() {
        Queijo queijo = new QueijoCheddar();
        assertTrue(queijo instanceof QueijoCheddar);
    }

    @Test
    public void testQueijoMussarela() {
        Queijo queijo = new QueijoMussarela();
        assertTrue(queijo instanceof QueijoMussarela);
    }

    @Test
    public void testQueijoPrato() {
        Queijo queijo = new QueijoPrato();
        assertTrue(queijo instanceof QueijoPrato);
    }
}
