package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import produtosConcretos.OvoCapoeira;
import produtosConcretos.OvoGranja;
import interfacesProdutos.Ovo;

public class OvoTest {

    @Test
    public void testOvoCapoeira() {
        Ovo ovo = new OvoCapoeira();
        assertTrue(ovo instanceof OvoCapoeira);
    }

    @Test
    public void testOvoGranja() {
        Ovo ovo = new OvoGranja();
        assertTrue(ovo instanceof OvoGranja);
    }
}
