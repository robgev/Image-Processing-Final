import ij.ImagePlus;
import ij.IJ;
import ij.process.ImageProcessor;
import ij.plugin.filter.PlugInFilter;
import java.awt.Color;

public class Normalized_Histogram implements PlugInFilter {
 public int setup(String args, ImagePlus im) {
  return DOES_RGB;
 }

 public void run(ImageProcessor ip) {
  int width = ip.getWidth(), 
        height = ip.getHeight(),
        totalR = 0,
        totalG = 0,
        totalB = 0;
  double coeff = width * height;
  Color color;
  double[] r = new double[256],
            g = new double[256],
            b = new double[256];
  for (int row = 0; row < height; row++)
   for (int col = 0; col < width; col++) {
    color = new Color(ip.getPixel(col, row));
    r[color.getRed()] += 1;
    g[color.getGreen()] += 1;
    b[color.getBlue()] += 1;
   }
   String rvals = String.format("%3s ", "R:");
   String gvals = String.format("%3s ", "G:");
   String bvals = String.format("%3s ", "B:");
  for (int i = 0; i < 256; i++) {
      totalR += r[i];
      totalG += g[i];
      totalB += b[i];
      r[i] = totalR / coeff;
      g[i] = totalG / coeff;
      b[i] = totalB / coeff;
      
      rvals += String.format("%.5f ", r[i]);
      gvals += String.format("%.5f ", g[i]);
      bvals += String.format("%.5f ", b[i]);
  }
 IJ.log(rvals + "\n" + gvals + "\n" + bvals + "\n");
 }
}