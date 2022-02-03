package hexaconverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class HexaConverterTest {
    @Test
    @DisplayName("Quando passar um valor nulo deve lançar uma exceção")
    void test1() {
        Assertions.assertThrows(NullPointerException.class, () -> HexaConverter.convertToInteger(null));
    }

    @Test
    @DisplayName("Quando passar um char invalido retornar InvalidParameterException")
    void test2() {
        Assertions.assertThrows(InvalidParameterException.class, () -> HexaConverter.convertToInteger(""));
        Assertions.assertThrows(InvalidParameterException.class, () -> HexaConverter.convertToInteger("^"));
    }
    @Test
    @DisplayName("Quando passar um char válido retornar o conversão correta")
    void test3() {

        var expectResponse0 = 0;
        var response0 = HexaConverter.convertToInteger("0");

        Assertions.assertEquals(expectResponse0, response0);

        var expectResponse1 = 1;
        var response1 = HexaConverter.convertToInteger("1");

        Assertions.assertEquals(expectResponse1, response1);

        var expectResponse2 = 2;
        var response2 = HexaConverter.convertToInteger("2");

        Assertions.assertEquals(expectResponse2, response2);

        var expectResponse3 = 3;
        var response3 = HexaConverter.convertToInteger("3");

        Assertions.assertEquals(expectResponse3, response3);

        var expectResponse4 = 4;
        var response4 = HexaConverter.convertToInteger("4");

        Assertions.assertEquals(expectResponse4, response4);

        var expectResponse5 = 5;
        var response5 = HexaConverter.convertToInteger("5");

        Assertions.assertEquals(expectResponse5, response5);

        var expectResponse6 = 6;
        var response6 = HexaConverter.convertToInteger("6");

        Assertions.assertEquals(expectResponse6, response6);

        var expectResponse7 = 7;
        var response7 = HexaConverter.convertToInteger("7");

        Assertions.assertEquals(expectResponse7, response7);

        var expectResponse8 = 8;
        var response8 = HexaConverter.convertToInteger("8");

        Assertions.assertEquals(expectResponse8, response8);

        var expectResponse9 = 9;
        var response9 = HexaConverter.convertToInteger("9");

        Assertions.assertEquals(expectResponse9, response9);

        var expectResponse10 = 10;
        var responsea = HexaConverter.convertToInteger("a");

        Assertions.assertEquals(expectResponse10, responsea);

        var expectResponse11 = 11;
        var responseb = HexaConverter.convertToInteger("b");

        Assertions.assertEquals(expectResponse11, responseb);

        var expectResponse12 = 12;
        var responsec = HexaConverter.convertToInteger("c");

        Assertions.assertEquals(expectResponse12, responsec);

        var expectResponse13 = 13;
        var responsed = HexaConverter.convertToInteger("d");

        Assertions.assertEquals(expectResponse13, responsed);

        var expectResponse14 = 14;
        var responsee = HexaConverter.convertToInteger("e");

        Assertions.assertEquals(expectResponse14, responsee);

        var expectResponse15 = 15;
        var responsef = HexaConverter.convertToInteger("f");

        Assertions.assertEquals(expectResponse15, responsef);
    }
}
