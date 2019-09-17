import static org.junit.jupiter.api.Assertions.*;

class LommeregnerTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Lommeregner lommeregner = new Lommeregner();
        int y =13;
        int x = 23;
        int resultat = lommeregner.sum(x , y);
        assertEquals(36, resultat);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Lommeregner lommeregner = new Lommeregner();
        int y =13;
        int x = 23;
        int resultat = lommeregner.minus(x , y);
        assertEquals(10, resultat);
    }

    @org.junit.jupiter.api.Test
    void multi() {
        Lommeregner lommeregner = new Lommeregner();
        int y =13;
        int x = 23;
        int resultat = lommeregner.multi(x , y);
        assertEquals(299, resultat);
    }

    @org.junit.jupiter.api.Test
    void divi() {
        Lommeregner lommeregner = new Lommeregner();
        int y =13;
        int x = 23;
        int resultat = lommeregner.divi(x , y);
        assertEquals(1, resultat);
    }
}