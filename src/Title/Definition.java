package Title;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import ObjectReference.Heading;
import ObjectReference.TextArea;
import ObjectReference.Frame;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Dimension;

public class Definition {

    Definition(){

        Frame frame = new Frame(new Dimension(800, 760), "Definition");

        String[][] lines = {{"Atomic Weight", " : It is the mass of a chemical element's atoms. The standard unit of atomic mass has been one-twelfth the mass of an atom of the isotope carbon-12."},
                {"Atomic Radius", " : It is a measure of the size of its atoms, usually the mean or typical distance from the center of the nucleus  to the boundary of the surrounding shells of electrons."},
                {"Boiling Point", " : The boiling point of a substance is the temperature at which it can change its state from a liquid to a gas."},
                {"Density", " : Density of a substance is its mass per unit volume.  The symbol most often used for density is ρ(rho). Mathematically, density is defined as mass divided by volume."},
                {"Electronegativity", " : The tendency of an atom in a molecule to attract the shared pair of electrons towards itself. It is a dimensionless property because it is only a tendency."},
                {"Melting Point", " : It is the temperature at which a substance changes state from solid to liquid. "},
                {"Oxidation State", "Valency", " : A number assigned to an element which represents the number of electrons lost or gained by an atom of that element in the compound."},
                {"Valence Electrons", "Vacancies", " : An electron of an atom, located in the outermost shell (valence shell ) of the atom, that can be transferred to or shared with another atom. "},
                {"Molecular Mass", " : The mass of a molecule that is equal to the sum of the masses of all the atoms contained in the molecule."},
                {"Base", "Basic", " : Substances having a pH above 7 and turns red litmus paper blue."},
                {"Acid", "Acidic", " : Substances having a pH below 7 and turns blue litmus paper red."},
                {"Atomicity"," : the number of atoms in the molecule of an element. Example : H₂ is a diatomic molecule."},
                {"Covalent", "Covalent bond", " : Chemical bonds formed by the sharing of electrons between atoms."},
                {"Electrovalent", "Ionic", " : Chemical bonds formed by transferring electrons from from a negative to a positive ion."},
                {"Electron", "Electrons", " : A stable subatomic particle with a charge of negative electricity, has a mass of 9.1 X 10⁻³¹ kilogram and an electric charge of 1.602 X 10⁻¹⁹ Coulomb."},
                {"Proton", "Protons", " : A stable subatomic particle with a positive electric charge equal in magnitude to that of electron, has a mass of 1.67 X 10⁻²⁷."},
                {"Neutron", "Neutrons", " : A subatomic particle of about the same mass as a proton but without an electric charge."},
                {"Compound", "Compounds", " : A substance that is composed of two or more separate elements in a fixed ratio."},
                {"Electronic Configuration", " : It is the distribution of electrons of an atom or molecule is atomic or molecular orbitals."},
                {"Cryogenics", "Cryogenic", " : It is the production and behaviour of materials at very low temperatures."},
                {"Oxidation", " : Oxidation is the loss of electrons or an increase in the oxidation state of an atom."},
                {"Reduction", " : Reduction is the gain of electrons or a decrease in the oxidation state of an atom."},
                {"Flexural rigidity", " : Flexural rigidity is defined as the force couple required to bend a fixed non-rigid structure by one unit of curvature."},
                {"Thermal conductivity", " : The thermal conductivity of a material is a measure of its ability to conduct heat."},
                {"Crystal", "Crystalline", " : Crystals are solid materials where atoms and molecules are arranged in a highly ordered (periodic) microscopic structure"},
                {"Amorphous", " : Without a clearly defined shape or form, non-crystalline"},
                {"Electrical conductivity", " : It represents a material's ability to conduct electrical current."},
                {"Block", " : It is a set of elements unified by the atomic orbitals their valence electrons or vacancies lie in."},
                {"Dielectric", "Dielectric material", " : It is an electrical insulator that can be polarised by an applied electric field."},
                {"Electron affinity", " : The electron affinity of an atom or molecule is defined as the amount of energy released when an electron is attached to a neutral atom or molecule in the gaseous state to form an anion."},
                {"Isoelectronicity", "Isoelectronic", " : It is a phenomenon observed when two or more molecules have the same structure and electronic configurations, but differ by what specific elements are at certain locations in the structure."},
                {"Electrolyte", " : An electrolyte is a medium containing ions that is electrically conducting through the movement of ions, but not conducting electrons."},
                {"Helium neon lasers", "Helium Neon laser", " : It is a type of gas laser whose high energetic medium gain medium consists of a mixture of 10:1 ratio of helium and neon at a total pressure of about 1 torr inside of a small electrical discharge."},
                {"Wavemeter tubes", "Wavemeter tube", " : These are devices for precise measurements of laser wavelengths. They are usually based on interferometric effects."},
                {"Television tubes", "Television tube", " : Also known as Cathode Ray Tube. It  is a vacuum tube containing one or more electron guns, the beams of which are manipulated to display images on a phosphorescent screen."},
                {"Enzymes", "Enzyme", " : Enzymes are proteins that act as biological catalysts and accelerate chemical reactions."},
                {"Plasticiser", " : It is a substance that is added to a material to make it softer and more flexible, to increase its plasticity, to decrease its viscosity, or to decrease friction during its handling in manufacture."},
                {"Antisepsis", " : The practice of using antiseptics to eliminate the microorganisms that cause disease."},
                {"Radiogenic", " : "},
                {"Nucleosynthesis", " : "},
                {"Supernova", "Supernovas", " : "},
                {"Half life", " : "},
                {"Aqua regia", " : "},
                {"Coenzyme", " : "},
                {"Crankshafts", " : "},
                {"Free element", "Free elements", " : "},
                {"Ferromagnetic", " : "},
                {"Superalloys", "Super alloy", " : "},
                {"Mono clinic", " : "},
                {"Isomers", "Isomer", " : "},
                {"Polymer", " : "},
                {"Ceramic", " : "},
                {"Aerospace", " : "},
                {"Aerospace Material", "Aerospace materials", " : "},
                {"X Ray", "X Rays", " : "},
                {"Particle Detectors", "Particle detector", " : "},
                {"Primordial Nuclide", " : "},
                {"Radio Nuclide", " : "},
                {"Ionization Energy", " : "},
                {"Post transition metal", " : "},
                {"Interferometric", "Interferometric effects", " : "},
                {"Radioisotope", " : "},
                {"Pyrophoric", " : "},
                {"Gas mantles", " : "},
                {"Phosphors", " : "},
                {"", " : "},
                {"", " : "},
                {"", " : "},
                {"", " : "},
                {"", " : "},
                {"", " : "}
        };

        new Heading(frame, "Definitions", new Rectangle(10, 10, 400, 30));

        // Search area
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(null);
        searchPanel.setBounds(30, 50, 740, 140);
        frame.add(searchPanel);

        JTextArea textArea = new JTextArea("Can't find the required definition? Search it!");
        textArea.setFont(new Font("Scheherazade New", Font.PLAIN, 15));
        textArea.setBounds(10, 50, searchPanel.getWidth() - 30, 90);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(frame.getBackground());
        searchPanel.add(textArea);

        // Search bar
        JTextField textField = new JTextField();
        textField.setBounds(10, 10, 460, 30);
        searchPanel.add(textField);

        JButton search = new JButton("Search");
        search.setBounds(480, 10, 100, 30);
        search.setFocusable(false);
        search.setFont(new Font("Didot", Font.PLAIN, 15));
        searchPanel.add(search);
        search.addActionListener(e -> {

            // Removes the dashes and changes double spaces into single space
            String text = textField.getText().replace('-', ' ').replace("  ", "");

            // A for loop that checks the lines array to find if there is any definition similar to the text entered.
            for (String[] line : lines) {

                if (line.length == 3) {

                    if (line[0].equalsIgnoreCase(text) || line[1].equalsIgnoreCase(text)){

                        textArea.setText(line[0] + line[2]);

                        // Used a break to exit the for loop when the match is found, otherwise the text is replaced with no def
                        break;
                    } else {

                        textArea.setText("Sorry! There is no available definition for " + textField.getText() + ".");
                    }
                } else if (line.length == 2) {

                    if (line[0].equalsIgnoreCase(text)) {

                        textArea.setText(line[0] + line[1]);
                        break;
                    } else {

                        textArea.setText("Sorry! There is no available definition for " + textField.getText() + ".");
                    }
                }
            }
        });

        int y = 190;

        // To display the first 9 lines on the screen
        for (int i = 0; i <= 9; i++){


            if (lines[i].length == 2)
                new TextArea(frame, lines[i][0] + lines[i][1], new Rectangle(20,  y, frame.getWidth() - 50, 50));

            else
                new TextArea(frame, lines[i][0] + lines[i][2], new Rectangle(20, y, frame.getWidth() - 50, 50));

            y += 55;
        }

        frame.setVisible(true);
    }
}
