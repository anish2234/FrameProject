import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropoutFrame extends JFrame {

    private MainFrame mainFrame;

    public DropoutFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        // Set up the dropout frame
        setTitle("Dropout Frame");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backToMainFrame();
            }
        });

        // Add the back button to the dropout frame
        setLayout(new FlowLayout());
        add(backButton);
    }

    private void backToMainFrame() {
        mainFrame.setVisible(true);
        this.dispose();
    }
}
