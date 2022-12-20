package main;

import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

import java.util.List;

public class kata4 {

    public static void main(String[] args) {
	// write your code here
        List<Mail> emails = MailListReader.read("email.txt");

        for (int i = 0; i < emails.size();i++) {
            System.out.println(emails.get(i).getDomain());
        }
       Histogram<String> histogram = MailHistogramBuilder.build(emails);
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();

    }
}
