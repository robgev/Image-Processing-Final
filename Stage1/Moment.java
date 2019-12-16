import ij.ImagePlus;
import ij.IJ;
import ij.process.ImageProcessor;
import ij.plugin.filter.PlugInFilter;
import java.awt.Color;
import java.lang.Math; 

public class Moment implements PlugInFilter {
 public int setup(String args, ImagePlus im) {
  return DOES_RGB;
 }

 double moment(ImageProcessor ip, int p, int q) {
     double Mpq = 0.0;
     for (int v = 0; v < ip.getHeight(); v++) {
         for (int u = 0; u < ip.getWidth(); u++) {
            if (ip.getPixel(u, v) > 0) {
                Mpq+= Math.pow(u, p) * Math.pow(v, q);
            }
        }
     }
    return Mpq;
 }

double centralMoment(ImageProcessor ip, int p, int q) {
    double m00 = moment(ip, 0, 0); // region area
    double xCtr = moment(ip, 1, 0) / m00;
    double yCtr = moment(ip, 0, 1) / m00;
    double cMpq = 0.0;
    for (int v = 0; v < ip.getHeight(); v++) {
        for (int u = 0; u < ip.getWidth(); u++) {
            if (ip.getPixel(u, v) > 0) {
                cMpq+= Math.pow(u-xCtr, p) * Math.pow(v-yCtr, q);
            }
        }
    }
    return cMpq;
}

 double nCentralMoment(ImageProcessor ip, int p, int q) {
    double m00 = moment(ip, 0, 0);
    double norm = Math.pow(m00, 0.5 * (p + q + 2));
    return centralMoment(ip, p, q) / norm;
 }

 double orientation(ImageProcessor ip) {
     double mu11 = centralMoment(ip, 1, 1)
     double mu20 = centralMoment(ip, 2, 0)
     double mu02 = centralMoment(ip, 0, 2)
     return 0.5 * Math.atan2(2 * mu11, mu20 - mu02)
 }

  double eccentricity(ImageProcessor ip) {
     double mu11 = centralMoment(ip, 1, 1)
     double mu20 = centralMoment(ip, 2, 0)
     double mu02 = centralMoment(ip, 0, 2)
     double root = Math.sqrt(Math.pow(mu20 - mu02, 2) + 4 * Math.pow(mu11, 2));
     return (mu20 + mu02 + root) / (mu20 + mu02 - root)
 }

 public void run(ImageProcessor ip) {
    IJ.log(String.format("MOMENT 1 1: %10f", moment(ip, 1, 1)));
    IJ.log(String.format("ORIENTATION %10f", orientation(ip)));
    IJ.log(String.format("ECCENTRICITY %10f", eccentricity(ip)));
 }
}