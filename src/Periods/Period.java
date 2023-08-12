package Periods;

import ObjectReference.Frame;
import ObjectReference.Heading;
import ObjectReference.TextArea;

import java.awt.Rectangle;
import java.awt.Dimension;

public class Period {

    Period(String frameTitle, String[] lines){

        Frame frame = new Frame(new Dimension(650, 500), frameTitle);

        new Heading(frame, frameTitle, new Rectangle(10, 10, 150, 30));

        new TextArea(frame, lines, 20, 60);

        frame.setVisible(true);
    }
}
