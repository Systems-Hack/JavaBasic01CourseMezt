
package javabasic01coursemezt.clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    
    public static void queHoraEs () {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("La fecha y hora actual es: "+  dtf.format(LocalDateTime.now()));
    }
    
}
