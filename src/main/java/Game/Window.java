package Game;
import javax.swing.JFrame;
import Game.Panel;
public class Window {
    final Panel gamePanel = new Panel();
    
    public Window(){
    
    }
    
    public void createWindow(){
        JFrame window = new JFrame();
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Pokemon DS");
        window.add(gamePanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.startGameThread();
    
    }
}
