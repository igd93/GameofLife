import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame() {
        this.setTitle("Connor's Game of Life");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    
}
