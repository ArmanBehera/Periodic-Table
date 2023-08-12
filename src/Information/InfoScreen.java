package Information;

import ObjectReference.Frame;
import ObjectReference.TextArea;

import javax.swing.*;

import java.awt.*;

import static Reference.Reference.*;

public class InfoScreen {

    Icon elementIcon;
    static float atomicWeight;
    static float boilingPoint;
    static float meltingPoint;
    static float density;
    static float electronegativity;
    static float atomicRadius;
    String[] line ;

    private static void checkAndDisplay(boolean isImagePresent, JFrame frame){

        int x;

        if (isImagePresent)
            x = 370;
        else
            x = 10;

        // For the quick glance information
        if (atomicWeight != 0){

            new TextArea(frame, "• Atomic Weight : " + atomicWeight + " amu", x, 10);
        } else {

            new TextArea(frame, "• Atomic Weight : Unknown", x, 10);
        }

        if (boilingPoint != 0){

            new TextArea(frame, "• Boiling Point : " + boilingPoint + " °C", x, 50);
        } else {

            new TextArea(frame, "• Boiling Point : Unknown", x, 50);
        }

        if (meltingPoint != 0){

            new TextArea(frame, "• Melting Point : " + meltingPoint + " °C", x, 90);
        } else {

            new TextArea(frame, "• Melting Point : Unknown", x, 90);
        }

        if (density != 0){

            new TextArea(frame, "• Density : " + density + " kg/m³", x, 130);
        } else {

            new TextArea(frame, "• Density : Unknown", x, 130);
        }

        if (electronegativity != 0){

            new TextArea(frame, "• Electronegativity : " + electronegativity, x, 170);
        } else {

            new TextArea(frame, "• Electronegativity : Unknown", x, 170);
        }

        if (atomicRadius != 0){

            new TextArea(frame, "• Atomic Radius : " + atomicRadius, x, 210);
        } else {

            new TextArea(frame, "• Atomic Radius : Unknown", x, 210);
        }
    }

    public InfoScreen(int atomicNumber){

        // Getting all the information for easy use
        elementIcon = iconsRef[atomicNumber];
        atomicWeight = atomicWeightRef[atomicNumber];
        boilingPoint = boilingPointRef[atomicNumber];
        meltingPoint = meltingPointRef[atomicNumber];
        density = densityRef[atomicNumber];
        electronegativity = electronegativityRef[atomicNumber];
        atomicRadius = atomicRadiusRef[atomicNumber];
        line = informationRef[atomicNumber];

        // If the element has its image
        if (elementIcon != null){

            int frameHeight = elementIcon.getIconHeight() + 440;

            if (elementIcon.getIconHeight() < 210){
                frameHeight = 700;
            }

            // Creating the frame with its attributes
            Frame frame = new Frame(new Dimension(920, frameHeight),fullNameRef[atomicNumber] + " - "+atomicNumber);

            checkAndDisplay(true, frame);

            // Adding the image
            JLabel image = new JLabel(elementIcon);
            image.setBounds(0, 0, 350, elementIcon.getIconHeight());
            frame.add(image);

            // For the information lines
            int x = 10, y = image.getHeight();

            // If the image height is small, then the text gets shifted downwards
            if (y < 270){

                y = 270;
            }

            for (String s : line) {

                new TextArea(frame, "• "+s, x, y);
                y += 35;
            }

            frame.setVisible(true);
        }
        // If the element does not have its image
        else {

            Frame frame = new Frame(new Dimension(920, 730), fullNameRef[atomicNumber] + " - "+atomicNumber);

            checkAndDisplay(false, frame);

            int x = 10, y = 270;

            for (String s : line) {

                new TextArea(frame, "• " + s, x, y);
                y += 35;
            }

            frame.setVisible(true);
        }
    }
}