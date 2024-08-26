import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCountApp {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Word Count Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create components
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 340, 150);

        JButton countButton = new JButton("Count Words");
        countButton.setBounds(20, 180, 150, 30);

        JLabel resultLabel = new JLabel("Word Count: ");
        resultLabel.setBounds(20, 220, 340, 30);

        // Add components to frame
        frame.add(textArea);
        frame.add(countButton);
        frame.add(resultLabel);

        // Add action listener for button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from text area
                String text = textArea.getText();
                
                // Count words
                int wordCount = countWords(text);
                
                // Display result
                resultLabel.setText("Word Count: " + wordCount);
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }

    // Method to count words in a string
    private static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
