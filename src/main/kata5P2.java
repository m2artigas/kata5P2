package main;

import model.*;
import view.*;

import java.util.*;

public class kata5P2 {

    public static void main(String[] args) {

        MailListReaderBD reader = new MailListReaderBD();
        List<Mail> emails = reader.readMailBD();



        Histogram<String> histogram = MailHistogramBuilder.build(emails);
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();


    }
}
