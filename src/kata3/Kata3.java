/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram<String> histogram =  new Histogram<>();
        histogram.increment("gmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("ulpgc.es");
         histogram.increment("ulpgc.es");
        new HistogramDisplay(histogram).execute();
    }
}
