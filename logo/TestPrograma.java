package logo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrograma {
    
    @Test
    public void testMensalidadeMasculinoIdadeMenorOuIgual15() {
        double expected = 60.0;
        double actual = calcularMensalidade("M", 10);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMensalidadeMasculinoIdadeEntre16E18() {
        double expected = 75.0;
        double actual = calcularMensalidade("M", 17);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMensalidadeMasculinoIdadeEntre19E30() {
        double expected = 90.0;
        double actual = calcularMensalidade("M", 25);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMensalidadeMasculinoIdadeEntre31E40() {
        double expected = 85.0;
        double actual = calcularMensalidade("M", 35);
        assertEquals(expected, actual);
    }

    @Test
    public void testMensalidadeFemininoIdadeMenorOuIgual18() {
        double expected = 60.0;
        double actual = calcularMensalidade("F", 15);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMensalidadeFemininoIdadeEntre19E26() {
        double expected = 85.0;
        double actual = calcularMensalidade("F", 24);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMensalidadeFemininoIdadeEntre27E40() {
        double expected = 65.0;
        double actual = calcularMensalidade("F", 35);
        assertEquals(expected, actual);
    }
    

    @Test
    public void testMensalidadeSexoInvalido() {
        double expected = 0.0;
        double actual = calcularMensalidade("X", 30);
        assertEquals(expected, actual);
    }
    
    private double calcularMensalidade(String sexo, int idade) {
    	TestPrograma programa = new TestPrograma();
        return programa.calcularMensalidade(sexo, idade);
    }
}
