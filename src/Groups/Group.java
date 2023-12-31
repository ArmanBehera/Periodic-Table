package Groups;

import ObjectReference.Frame;
import ObjectReference.TextArea;
import ObjectReference.Heading;

import java.awt.Dimension;
import java.awt.Rectangle;

public class Group {

    Group(String frameTitle, String[] lines){

        Frame frame = new Frame(new Dimension(650, 500), frameTitle);

        new Heading(frame, frameTitle, new Rectangle(10, 10, 150, 30));

        new TextArea(frame, lines, 20, 60);

        frame.setVisible(true);
    }
}
