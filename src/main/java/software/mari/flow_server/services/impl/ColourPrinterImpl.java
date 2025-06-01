package software.mari.flow_server.services.impl;

import software.mari.flow_server.services.BluePrinter;
import software.mari.flow_server.services.ColourPrinter;
import software.mari.flow_server.services.GreenPrinter;
import software.mari.flow_server.services.RedPrinter;

public class ColourPrinterImpl implements  ColourPrinter{

    private final RedPrinter redPrinter;

    private final BluePrinter bluePrinter;

    private final GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }
}
