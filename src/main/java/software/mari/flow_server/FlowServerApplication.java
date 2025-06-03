package software.mari.flow_server;

import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.mari.flow_server.services.ColourPrinter;
import software.mari.flow_server.services.impl.ColourPrinterImpl;

@SpringBootApplication
@Log
public class FlowServerApplication implements CommandLineRunner {

	private final ColourPrinter colourPrinter;

	public FlowServerApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	private static final Logger log = LoggerFactory.getLogger(FlowServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FlowServerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}
}
