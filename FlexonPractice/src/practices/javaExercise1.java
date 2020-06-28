package practices;

import javax.swing.*;
import java.util.Random;

public class javaExercise1 {
    public static void main(String[] args) {
        String[] names = new String[]{"a","b","c"};
        Random rand = new Random();
        int upperbound = names.length - 1;
        int int_random = rand.nextInt(upperbound);
        JOptionPane.showMessageDialog(null, names[int_random], "Random pick system", JOptionPane.INFORMATION_MESSAGE);
    }
}
