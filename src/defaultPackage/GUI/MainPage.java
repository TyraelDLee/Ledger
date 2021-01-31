package defaultPackage.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPage {
    private static final int WINDOW_HEIGHT = 420;
    private static final int WINDOW_WIDTH = 720;

    private JFrame mainWindow = new JFrame("万千烦恼帐");
    private MenuButton menuButton = new MenuButton(20, 16);
    private boolean buttonControl = false;
    private boolean resizeSmall = true, resizeBig = false;

    public static void main(String[] args) {
        //Main window define, set propriety
        MainPage mainPage = new MainPage();
        mainPage.init();
    }

    public void init() {
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setMinimumSize(new Dimension(720, 420));
        mainWindow.setLayout(null);
        resize();
        //main window resize listener
        mainWindow.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resize();
            }
        });
        // set the menu button listener.
        menuButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuButton.onclick();
                buttonControl = true;
                if(!menuButton.getState()){

                }
                else{
                }
            }
        });

        mainWindow.add(menuButton);
        mainWindow.setVisible(true);
    }

    /**
     * Resize all components which need to be resized.
     * included main window, menu, and draw board.
     * */
    private void resize() {

        menuButton.setBounds(mainWindow.getWidth() - 80, 25, menuButton.getEdge(), menuButton.getEdge());
        // set the menu auto appear when window width >= 1280 and auto close when < 1280.
        if(mainWindow.getWidth() >= 1280 && resizeSmall){
            this.buttonControl = false;
        }
        if(mainWindow.getWidth() < 1280 && resizeBig)
            this.buttonControl = false;
        if (!buttonControl && mainWindow.getWidth() >= 1280 && resizeSmall) {
            resizeSmall = false;
            resizeBig = true;
            menuButton.closeTransform();

        }
        if (!buttonControl && mainWindow.getWidth() < 1280 && resizeBig) {
            resizeSmall = true;
            resizeBig = false;
            menuButton.menuTransform();
        }
    }
}
