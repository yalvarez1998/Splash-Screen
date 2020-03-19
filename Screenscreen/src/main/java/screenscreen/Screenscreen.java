/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenscreen;

/**
 *
 * @author yitzhakalvarez
 */
public class Screenscreen {

    public static void main(String[] args) {
        splash Splash = new splash();
        Splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                Splash.loadingnumber.setText(Integer.toString(i) + "%");
                Splash.loadingbar.setValue(i);
        }
        }
        catch (Exception e)
        {
            
        }
    }
}

    
    
