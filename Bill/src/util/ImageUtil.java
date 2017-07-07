/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.Index;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class ImageUtil {
    private final int ICON_WIDTH = 50;
    private final int ICON_HEIGHT = 50;
    public ImageIcon prepareIcon(String imageName) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(getClass().getResource("/image/"+imageName).toURI()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image dimg = img.getScaledInstance(ICON_WIDTH, ICON_HEIGHT, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        return imageIcon;
    }
}
