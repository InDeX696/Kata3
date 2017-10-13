package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
        
    }
   public void execute(){
       setVisible(true);
   }
   private JPanel createPanel(){
      ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
      setPreferredSize(new Dimension(500,400));
      return chartpanel;
   }
   private JFreeChart createChart(DefaultCategoryDataset dataSet){
       JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart","Dominios email"
               ,"Nº de emails",dataSet,PlotOrientation.VERTICAL,false,rootPaneCheckingEnabled, rootPaneCheckingEnabled);
       return chart;
   }
   private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        dataSet.addValue(12,"","ulpgc.es");
         dataSet.addValue(2,"","gmail.es");
          dataSet.addValue(15,"","hotmail.es");
        return dataSet;
       
   }
   
    
}
