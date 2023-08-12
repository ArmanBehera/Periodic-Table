package Title;

// Importing all the packages

import ObjectReference.Frame;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class GuessTheElement {

    // A global variable for the next button to access without creating a final array
    private static int randNumber;

    // Setting up global variables for button
    JButton next;
    JButton submit;
    JButton revealAnswer;

    public GuessTheElement(){

        // The index 0 of the double array is the question and the strings after that are the answers
        // Questions relating to the periodic table
        String[][] qAndA = {{}, {"On moving from left to right in a periodic table, size of an atom ?", "Decreases", "Decrease"},
                {"In periodic table elements with similar valence shell configuration are placed in __", "Same Group", "Same Groups"},
                {"All the elements in a group in the periodic table have the same __", "Valence electrons", "Valence Electron"},
                {"The law that \"the physical and chemical properties of elements are periodic functions of their atomic weights\" was given by ___", "Mendeleev", "Dmitri Mendeleev"},
                {"The arrangement of elements in the Modern Periodic Table is based on their __", "Increasing atomic number", "Atomic number"},
                {"How many elements are present in the modern periodic table?", "118", "One hundred and eighteen"},
                {"Why is it that the reactivity of Group I metals increases down the group?", "Atomic number increases", "Increasing atomic number"},
                // Random questions about elements
                {"A lot of the elements we see on the periodic table are useful. But others... not so much. Some of these element are actually toxic, and ingesting them into your body could be fatal. Some of these toxic elements are lead, mercury and __", "Arsenic", "As"},
                {"This element is essential. You must have a proper amount of _____ in your body to prevent high and low blood pressure.", "Sodium", "Na"},
                {"This gaseous element is normally used in brightly-lit signs. Which element am I talking about?", "Neon", "Ne"},
                {"The chemical symbol is Ta. Which element am i talking about?", "Tantalum", "Blank Space"},
                {"This element is usually found in light bulbs. What is the element?", "Tungsten", "W"},
                {"A lot of elements have weird names just like this one. Which element was named after a US state?", "Californium", "Cf"},
                {"This metallic element is the most abundant in the Earth's crust. Which element is this?", "Aluminium", "Al"},
                {"This gaseous element has no neutrons in its nucleus. Which element is this?", "Hydrogen", "H"},
                {"Element X dissolves in water to give a colourless and odourless gas. It reacts with Cl2 to give a white solid XCl. Which could be the identity of X ?", "Sodium", "Na"},
                {"Which of the halogen has the strongest oxidising power?", "Fluorine", "F"},
                {"Which is the strongest reducing agent?", "Lithium", "Li"},
                {"Which element is present in period 4 group 2", "Calcium", "Ca"},
                {"How many protons are there in a zinc atom ?", "30", "Blank Space"},
                {"What are different physical forms of a element called?", "Allotropes", "Allotrope"},
                {"What are atoms of the same element that have a different number of neutrons called?", "Isotopes", "Isotope"},
                {"What are the atoms of different element having different atomic number but same atomic weight?", "Isobars", "Isobar"},
                {"What are the atoms of different element called having same number of neutrons?", "Isotones", "Isotone"}
                };

        // Setting up the random number generator
        int max = qAndA.length - 1;
        int min = 1;

        // System.out.println(qAndA.length);

        randNumber = (int)(Math.random() * (max - min + 1) + min);

        // Setting up the frame
        Frame frame = new Frame(new Dimension(500, 400), "Guess The Element");

        // Setting up the question panel where the question will appear
        JPanel questionPanel = new JPanel();
        questionPanel.setBounds(40, 20, 300, 250);
        questionPanel.setBackground(Color.WHITE);
        frame.add(questionPanel);

        // The question
        // Used JTextArea instead of JLabel as the former has setLineWrap methods to display long questions in multiple lines
        JTextArea questionText = new JTextArea();
        questionText.setFont(new Font("Didot", Font.ITALIC, 16));
        questionText.setBounds(20, 20, 260, 200);
        questionText.setText("" + qAndA[randNumber][0]);
        questionText.setLineWrap(true);
        questionText.setWrapStyleWord(true);
        questionText.setEditable(false);
        questionPanel.add(questionText);

        // Answer text field
        JTextField answer = new JTextField();
        answer.setText("Your answer");
        answer.setBackground(Color.WHITE);
        answer.setBounds(40, 300, 400, 30);
        frame.add(answer);

        // Setting up the buttons
        // Shows the next question
        next = new JButton("Next");
        next.setFocusable(false);
        next.setEnabled(false);
        next.setBounds(350, 100, 90, 30);
        frame.add(next);
        next.addActionListener(e -> {

            // Searches for the next random question
            randNumber = (int)(Math.random() * (max - min + 1) + min);
            submit.setEnabled(true);
            questionText.setText(qAndA[randNumber][0]);
        });

        JTextArea answerArea = new JTextArea();
        answerArea.setText("");
        answerArea.setFont(new Font("Didot", Font.PLAIN, 15));
        answerArea.setBounds(350, 150, 90, 250);
        answerArea.setFocusable(false);
        answerArea.setBackground(frame.getContentPane().getBackground());
        answerArea.setEditable(false);
        answerArea.setWrapStyleWord(true);
        answerArea.setLineWrap(true);
        frame.add(answerArea);

        submit = new JButton("Submit");
        submit.setFocusable(false);
        submit.setBounds(350, 20, 90, 30);
        frame.add(submit);
        submit.addActionListener(e -> {

            if (answer.getText().equalsIgnoreCase(qAndA[randNumber][1]) || answer.getText().equals(qAndA[randNumber][2])){

                answerArea.setText("Correct answer!");

                randNumber = (int)(Math.random() * (max - min + 1) + min);
                answer.setText("Your answer");
                questionText.setText(qAndA[randNumber][0]);

            } else if (answer.getText().equals("Your answer")){

                answer.setText("Please enter an answer!");

            } else {

                answerArea.setText("Wrong answer!");

                randNumber = (int)(Math.random() * (max - min + 1) + min);
                answer.setText("Your answer.");
                questionText.setText(qAndA[randNumber][0]);
            }
        });

        revealAnswer = new JButton("Reveal");
        revealAnswer.setFocusable(false);
        revealAnswer.setBounds(350, 60, 90, 30);
        frame.add(revealAnswer);
        revealAnswer.addActionListener(e -> {

            answer.setText(qAndA[randNumber][1]);
            submit.setEnabled(false);
            next.setEnabled(true);
        });

        frame.setVisible(true);
    }
}
