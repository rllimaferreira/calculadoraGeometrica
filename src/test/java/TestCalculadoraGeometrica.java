// pacote

// biblioteca

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.calculadorageometrica.Main;

// classe
public class TestCalculadoraGeometrica {
    // atributos

    // funções e métodos
    @Test
    public void testCalcularAreaDoQuadrado(){
        
        // AAA - Arrange / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Dados de Entrada
        float numLado = 5;
        // Dados de Saída / Resultado Esperado
        float resultadoEsperado = 25;

        // Executa
        float resultadoAtual = Main.calcularAreaDoQuadrado(numLado);
        
        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }
    
    
    // DDT: Data Driven Testing
    @ParameterizedTest
    @CsvSource(value = {
        "5, 25",
        "6, 36",
        "7, 49",
    }, delimiter = ',')
    public void testCalcularAreaDoQuadradoDDT(float numLado, float resultadoEsperado){
        
        // AAA - Arrange / Act / Assert
        // CEV - Configura / Executa / Valida

        // Configura
        // Os dados de entrada e o resultado esperado são lidos da masssa de teste acima

        // Executa
        float resultadoAtual = Main.calcularAreaDoQuadrado(numLado);
        
        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/calcularAreaTriangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void testCalcularAreaTrianguloCSV(double numBase, double numAltura, double resultadoEsperado){
        double resultadoAtual = Main.calcularAreaDoTriangulo(numBase, numAltura);
        assertEquals(resultadoEsperado, resultadoAtual);
    }
}