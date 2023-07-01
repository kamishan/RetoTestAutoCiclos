package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class WebUtils {

    /**
     *
     * @param property Me indica la propiedad a leer
     * @return return el valor de la propiedad
     * @throws IOException
     */
    public static String readProperty(String property) throws IOException {
        Properties propiedades = new Properties();
        propiedades.load(new FileReader("configurations.properties"));
        return propiedades.getProperty(property);
    }
}
