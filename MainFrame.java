import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame () {
        // Set up the main frame
        setTitle("Main Frame");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create buttons
        JButton displayButton = new JButton("Display");
        JButton dropoutButton = new JButton("Dropout");
        JButton regularButton = new JButton("Regular");

        // Add button listeners
        dropoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDropoutFrame();
            }
        });

        regularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegularFrame();
            }
        });

        // Add buttons to the main frame
        setLayout(new FlowLayout());
        add(displayButton);
        add(dropoutButton);
        add(regularButton);
    }

    private void openDropoutFrame() {
        DropoutFrame dropoutFrame = new DropoutFrame(this);
        dropoutFrame.setVisible(true);
        this.setVisible(false);
    }

    private void openRegularFrame() {
        RegularFrame regularFrame = new RegularFrame(this);
        regularFrame.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });
    }
}
