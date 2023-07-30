import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegularFrame extends JFrame {

    private MainFrame mainFrame;

    public RegularFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        // Set up the regular frame
        setTitle("Regular Frame");
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

        // Add the back button to the regular frame
        setLayout(new FlowLayout());
        add(backButton);
    }

    private void backToMainFrame() {
        mainFrame.setVisible(true);
        this.dispose();
    }
}
