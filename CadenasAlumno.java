/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit9;

/**
 *
 * @author Alberto del Hierro
 */
public class CadenasAlumno {
    
    public boolean sonIguales(String cadena1, String cadena2)
    {
        return cadena1.equals(cadena2);
    }
    
    public int testEsMayor(String cadena1, String cadena2) {

        return cadena1.compareTo(cadena2);
    }
    
    public int testEsMenor(String cadena1, String cadena2) {

        return cadena1.compareTo(cadena2);
    }
    
    public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
    {
        return cadena1.equalsIgnoreCase(cadena2);
    }
    
    public String reemplazaTodos(String cadena1, String cadena2, String cambio)
    {
        return cadena1.replaceAll(cadena2, cambio);
    }
    
    public String reemplazaPrimero(String cadena1, String cadena2, String cambio)
    {
        return cadena1.replaceFirst(cadena2, cambio);
        
    }
    
    public String testQuitaEspacios(String cadena1)
    {
        return cadena1.trim();
        
    }
    
    public String convertirMayusculas(String cadena1)
    {
        return cadena1.toUpperCase();
    }
    
    public String convertirMinusculas(String cadena1)
    {
        return cadena1.toLowerCase();
    }
    
    public int longitudCadena(String cadena1)
    {
        return cadena1.length();
    }
    
    public boolean empiezaCon(String cadena1, String prefijo)
    {
        return cadena1.startsWith(prefijo, 0);
    }
    
    public boolean acabaEn(String cadena1, String prefijo)
    {
        return cadena1.endsWith(prefijo);
    }
    
    public int posicionPrimeraCadena(String cadena1, String cadena2)
    {
        return cadena1.indexOf(cadena2);
        
    }
    
    public String extraerSubstring(String cadena1, int posicion)
    {
        return cadena1.substring(posicion);
    }
    
    public String concatenaCadenas(String cadena1, String cadena2)
    {
        return cadena1.concat(cadena2);
    }
}