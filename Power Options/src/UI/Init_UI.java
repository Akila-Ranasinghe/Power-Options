/*
 * Copyright (c) 2014  Akila Ranasinghe </ SPYD3R-X >
 * All rights reserved.
 * GitHub: https://github.com/SPYD3R-X
 * 03 Oct 2014 07:02:20 PM By AKILA.
 */
package UI;

import com.alee.laf.WebLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsButtonUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author AKILA
 */
public class Init_UI {

    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
            WebLookAndFeel.setDecorateAllWindows(true);
            new PowerOptions_UI().setVisible(true);

            Settings_UI.btnOpt = 0;
            PowerOptions_UI.Button_Restart.setUI(new WindowsButtonUI());
            PowerOptions_UI.Button_ShutDown.setUI(new WindowsButtonUI());
            PowerOptions_UI.Button_Hibernate.setUI(new WindowsButtonUI());
            PowerOptions_UI.btn_info.setUI(new WindowsButtonUI());
            PowerOptions_UI.btn_SetTimer.setUI(new WindowsButtonUI());

            PowerOptions_UI.Button_Restart.setContentAreaFilled(false);
            PowerOptions_UI.Button_ShutDown.setContentAreaFilled(false);
            PowerOptions_UI.Button_Hibernate.setContentAreaFilled(false);
            PowerOptions_UI.btn_info.setContentAreaFilled(false);
            PowerOptions_UI.btn_SetTimer.setContentAreaFilled(false);

            PowerOptions_UI.btn_info.setFocusPainted(false);
            PowerOptions_UI.Button_Restart.setFocusPainted(false);
            PowerOptions_UI.Button_ShutDown.setFocusPainted(false);
            PowerOptions_UI.Button_Hibernate.setFocusPainted(false);
            PowerOptions_UI.btn_SetTimer.setFocusPainted(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
