package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static java.lang.System.getProperties;

public class ConfigReader {
    private  static Properties properties; //java cekmesi icin

    public static Properties initialize_Properties(){
        properties=new Properties();

        //DOSYA YOLU VERIYORUZ O DOSYA YOLUNA GIDIYOR ERILERI OKUYOR JAVADA KULLANILAN YAPI

        try {
            FileInputStream fileInputStream =new FileInputStream("src/test/resources/config.properties");//YOL GELICEK AMA TRY  ICIJNDE BIZIM BUNU LOAD YAPMAMIS GEREKIYOR
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return getProperties();

    }

    public static Properties getProperties(){
        return properties;
    }

}
//confıg reader aldıgımız verılerı kullanmamız ıcın gereklı dosya olusturucakz verılerı bıreabır okumak ıcın kullanıyoruz