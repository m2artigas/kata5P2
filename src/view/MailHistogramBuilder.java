package view;

import model.*;

import java.util.List;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> emails) {
        Histogram<String> histogram = new Histogram<String>();
        for (Mail email: emails) {
            histogram.increment(email.getDomain());
        }
        return histogram;
    }
}
