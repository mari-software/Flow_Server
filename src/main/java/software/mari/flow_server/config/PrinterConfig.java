package software.mari.flow_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.mari.flow_server.services.BluePrinter;
import software.mari.flow_server.services.ColourPrinter;
import software.mari.flow_server.services.GreenPrinter;
import software.mari.flow_server.services.RedPrinter;
import software.mari.flow_server.services.impl.ColourPrinterImpl;
import software.mari.flow_server.services.impl.EnglishBluePrinter;
import software.mari.flow_server.services.impl.EnglishGreenPrinter;
import software.mari.flow_server.services.impl.EnglishRedPrinter;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return  new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }

}
