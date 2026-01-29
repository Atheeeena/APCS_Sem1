
package pkg;
import java.awt.image.BufferedImage;
import java.io.File;

public class vidToText{
    String [][] image = new String[16][16];
    File myImage;
    public vidToText(String a) {
        myImage = new File(a);
        BufferedImage buffImg = new BufferedImage(16, 16, TYPE_INT_ARGB);
        for(int r = 0; r < 16; r++) {
            for(int c = 0; c < 16; c++) {
                if(buffImg.getRgb(r, c) == -1) {
                    image[r][c] = "◻";
                }
                else {
                    image[r][c] = "◼";
                }
            }
        }
    }
    public void printImage() {
        for(int r = 0; r < 16; r++) {
            for(int c = 0; c < 16; c++) {
                System.out.print(image[r][c]);
            }
            System.out.println();
        }
    }
}