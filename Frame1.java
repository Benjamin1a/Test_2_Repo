import javax.swing.*;

public class Frame1 {

    public static void main(String[] args) {

        // The frame object
         JFrame obj = new JFrame();

               // The Frame title
               obj.setTitle("Frame 1");
               //The Frame size or boundary
               obj.setBounds(40, 60, 700, 400);
               // To prevent the user from resizing the frame
               obj.setResizable(false);
               // To close or exit the frame
               obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               // Make the frame visible
               obj.setVisible(true);
    }
}