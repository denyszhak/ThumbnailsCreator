package com.denyszhak.training.tncreator.func;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Converter {

    private File[] files;
    private String type;
    private int width, height;

    public void setFiles(File[] files) {
        this.files = files;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*Converts an array of files into a new files with a specified type and sizes. New images saves as
    thumbnail_(filename) and placed into the same folder as the original image*/
    public String convertTo(){
        try {
            for(int i = 0; i < files.length; i++){
                File file = files[i];
                String filename = file.getName().substring(0, file.getName().lastIndexOf(".")) + "." + type;
                String newName = file.getAbsolutePath().replace(file.getName(), "thumbnail_" + filename);
                BufferedImage originalImage = ImageIO.read(file);
                int typeImage = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
                BufferedImage resizedImageHint = resizeImageWithHint(originalImage, typeImage);
                ImageIO.write(resizedImageHint, type, new File(newName));
            }
            return "File(s) converted.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }

    }

    private BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){
        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g2D = resizedImage.createGraphics();
        g2D.drawImage(originalImage, 0, 0, width, height, null);
        g2D.dispose();
        g2D.setComposite(AlphaComposite.Src);

        g2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2D.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        return resizedImage;
    }
}
