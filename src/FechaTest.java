import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FechaTest {
    private Fecha mesMal1 = new Fecha(21,0,3000);
    private Fecha mesMal2 = new Fecha(21,13,3000);
    private Fecha diaMal1 = new Fecha(0,11,2000);
    private Fecha diaMal2 = new Fecha(32,11,2000);
    private Fecha diaMalNoviembre= new Fecha(31,11,2000);
    private Fecha diaMalFebrero= new Fecha(30,2,2000);
    private Fecha diaMalFebreroBisiesto1= new Fecha(29,2,2007);
    private Fecha diaMalFebreroBisiesto2= new Fecha(29,2,1900);


    private Fecha diaBienFebreroBisiesto1= new Fecha(29,2,2008);
    private Fecha diaBienFebreroBisiesto2= new Fecha(29,2,2007);
    private Fecha diaBienDiciembre= new Fecha(31,12,2000);
    private Fecha fechaCorrecta= new Fecha(20,6,2000);

    @Test
    void valid(){
        assertTrue(diaBienDiciembre.valida());
        assertTrue(diaBienFebreroBisiesto1.valida());
        assertTrue(diaBienFebreroBisiesto2.valida());
        assertTrue(fechaCorrecta.valida());
    }

    @Test
    void notValid(){
        assertFalse(mesMal1.valida());
        assertFalse(mesMal2.valida());
        assertFalse(diaMal1.valida());
        assertFalse(diaMal2.valida());
        assertFalse(diaMalNoviembre.valida());
        assertFalse(diaMalFebrero.valida());
        assertFalse(diaBienFebreroBisiesto1.valida());
        assertFalse(diaMalFebreroBisiesto1.valida());
        assertFalse(diaMalFebreroBisiesto2.valida());
    }

    @Test
    void diasMes(){
        assertNotEquals(29,diaBienDiciembre.diasMesM());
        assertEquals(31,diaBienDiciembre.diasMesM());
        assertEquals(29,diaBienFebreroBisiesto1.diasMesM());
        assertEquals(29,diaBienFebreroBisiesto1.diasMesM());
        assertEquals(28,diaMalFebreroBisiesto1.diasMesM());
    }

    @Test
    void diasMesFebrero(){
        assertEquals(29,diaBienFebreroBisiesto1.diasMesFebrero());

    }
}