import java.awt.*;
import javax.swing.JFrame;

public class SimpleFrame extends JFrame {
    
    SimpleFrame(){

        //Creates a simple 500x500 JFrame

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

    }

    SimpleFrame(boolean visibility){

        //Creates a simple 500x500 JFrame with preferred visibility setting

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(visibility){
            frame.setSize(500,500);
            frame.setVisible(visibility);
        } 

    }

    SimpleFrame(int dim1, int dim2){

        //Creates a simple dim1xdim2 JFrame

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(dim1,dim2);
        frame.setVisible(true);

    }

    SimpleFrame(LayoutManager layoutManager){

        //Creates a simple 500x500 JFrame

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(layoutManager);
        frame.setVisible(true);

    }
}
