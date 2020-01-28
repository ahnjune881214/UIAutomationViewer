package test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedImage crop = new Test().crop(0.8509);
        System.out.println(crop.getWidth() + "x" + crop.getHeight());
        ImageIO.write(crop, "png", new File("aa.png"));
    }

    public BufferedImage crop(double amount) throws IOException {
        BufferedImage originalImage = ImageIO.read(Test.class.getResource("/Users/juneahn/git/UiAutomatorView/elio.png"));
//        int height = originalImage.getHeight();
//        int width = originalImage.getWidth();
//
//        int targetWidth = (int)(width * amount);
//        int targetHeight = (int)(height * amount);
//        // Coordinates of the image's middle
//        int xc = (width - targetWidth) / 2;
//        int yc = (height - targetHeight) / 2;

        
        int xc = 547;
        int yc = 1071;
        
        int targetWidth = 917;
        int targetHeight = 1343;
        
        // Crop
        BufferedImage croppedImage = originalImage.getSubimage(
                        xc, 
                        yc,
                        targetWidth, // widht
                        targetHeight // height
        );
        return croppedImage;
    }

}

