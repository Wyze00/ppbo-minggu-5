package util;

import javax.swing.JOptionPane;

public class Dialog {

    public static void outputPlain(String message) {
        JOptionPane.showMessageDialog(null, message, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void outputInfo(String message) {
        JOptionPane.showMessageDialog(null, message, "", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void outputWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "", JOptionPane.WARNING_MESSAGE);
    }

    public static void outputError(String message) {
        JOptionPane.showMessageDialog(null, message, "", JOptionPane.ERROR_MESSAGE);
    }

    public static String inputString(String message) {
        return JOptionPane.showInputDialog(null, message, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static int inputInt(String message) {
        String input = JOptionPane.showInputDialog(null, message, "", JOptionPane.PLAIN_MESSAGE);
        return Integer.parseInt(input);
    }
}

