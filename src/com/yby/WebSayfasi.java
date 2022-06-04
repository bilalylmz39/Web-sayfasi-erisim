package com.yby;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebSayfasi extends JFrame{

    private JPanel panel1;
    private JButton tikla;
    private JTextField web_sayfasi;

    public WebSayfasi() {
add(panel1);
setSize(800,500);
setTitle("Web Sayfası");
setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tikla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String internet_adresi = web_sayfasi.getText();
                Desktop desktop = Desktop.getDesktop();

                try {
                    desktop.browse(new URI(internet_adresi));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }




    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {

                 WebSayfasi webSayfasi = new WebSayfasi();
                 webSayfasi.setVisible(true);
             }
         });
    }
}
