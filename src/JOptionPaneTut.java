import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneTut {

    public static void main(String[] args) {

        //JOptionPane: A standard dialog box that prompts the user for a value or 
        //             informs them of something.

        //JOptionPane.showMessageDialog(null, "Sample Text", "Plain Message", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Sample text", "Info", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Question?", "Question", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Warning", "Warning", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "Sample Question?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);

        //answer = 0 for Yes, 1 for No, 2 for Cancel, -1 if Window is Closed

        System.out.println(answer);

        String name = JOptionPane.showInputDialog("What is Your Name?");

        System.out.println(name);

        ImageIcon icon = new ImageIcon("thumbsup.png");

        String[] responses = {"response", "acknowledgement", "ignore"};

        JOptionPane.showOptionDialog(null, "message", "text", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
        
        
    }

}