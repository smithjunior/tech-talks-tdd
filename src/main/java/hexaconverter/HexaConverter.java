package hexaconverter;

import java.security.InvalidParameterException;
import java.util.Locale;

//*
// Criar um programa que converta caracteres hexadecimais em número Inteiro.
//
//Caso seja passado um valor nulo deve lançar uma exceção.
//Caso Seja passado um caractere invalido retornar um exceção de parâmetro invalido
//
//Exemplos:
//
//“A” retorna 10
//“1” retorna 1
//“” lança exceção
//null lança exceção
// */
public class HexaConverter {
    public static Integer convertToInteger(String hexaChar) {
        if (hexaChar.equalsIgnoreCase("")) throw new InvalidParameterException();
        if (hexaChar == null) throw new NullPointerException();

        var retorno = 0;
        switch (hexaChar.toUpperCase(Locale.ROOT)) {
            case "0":
                retorno = 0;
                break;
            case "1":
                retorno = 1;
                break;
            case "2":
                retorno = 2;
                break;
            case "3":
                retorno = 3;
                break;
            case "4":
                retorno = 4;
                break;
            case "5":
                retorno = 5;
                break;
            case "6":
                retorno = 6;
                break;
            case "7":
                retorno = 7;
                break;
            case "8":
                retorno = 8;
                break;
            case "9":
                retorno = 9;
                break;
            case "A":
                retorno = 10;
                break;
            case "B":
                retorno = 11;
                break;
            case "C":
                retorno = 12;
                break;
            case "D":
                retorno = 13;
                break;
            case "E":
                retorno = 14;
                break;
            case "F":
                retorno = 15;
                break;
            default:  throw new InvalidParameterException();
        }
        return retorno;
    }
}
