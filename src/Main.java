import builder.SanduicheBuilder;
import criadoresConcretos.SanduicheArtesanalFactory;
import criadoresConcretos.SanduicheIntegralFactory;
import criadoresConcretos.SanduicheXTudoFactory;
import modelo.Sanduiche;

public class Main {
    public static void main(String[] args) {
        SanduicheBuilder builder = new SanduicheBuilder();

        // Cria um sanduíche artesanal
        SanduicheArtesanalFactory artesanalFactory = new SanduicheArtesanalFactory();
        Sanduiche sanduicheArtesanal = builder.montaSanduiche(artesanalFactory);
        System.out.println("Sanduíche Artesanal: " + sanduicheArtesanal);

        // Cria um sanduíche integral
        SanduicheIntegralFactory integralFactory = new SanduicheIntegralFactory();
        Sanduiche sanduicheIntegral = builder.montaSanduiche(integralFactory);
        System.out.println("Sanduíche Integral: " + sanduicheIntegral);

        // Cria um sanduíche X-Tudo
        SanduicheXTudoFactory xTudoFactory = new SanduicheXTudoFactory();
        Sanduiche sanduicheXTudo = builder.montaSanduiche(xTudoFactory);
        System.out.println("Sanduíche X-Tudo: " + sanduicheXTudo);
    }
}
