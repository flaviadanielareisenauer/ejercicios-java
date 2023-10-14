package src;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatoDecimales {
    public static void main(String[] args) {
        double numero = 3.21231;
        
        /*
        La variable Locale va a definir la configuracion regional, y nos va a permitir, entre otras cosas, 
        usar el punto como separador decimal en lugar de la coma.       
        */
        
        Locale locale = Locale.ENGLISH;
        
        // Con String.format
        System.out.println(String.format(locale,"%.3f", numero));
        
        // Con NumberFormat
        NumberFormat formatoNumero = NumberFormat.getNumberInstance(locale);
        formatoNumero.setMaximumFractionDigits(2);
        System.out.println(formatoNumero.format(numero));
        
        
        // Con DecimalFormat (subclase de NumberFormat)
        DecimalFormatSymbols simbolos = DecimalFormatSymbols.getInstance(locale);
        DecimalFormat formato = new DecimalFormat("#.##", simbolos);
        System.out.println(formato.format(numero));        
    }    
}