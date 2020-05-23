import java.awt.Component;
import javax.swing.JOptionPane;

// 
// Decompiled by Procyon v0.5.36
// 

public class InviteValidator
{
    public static void main(final String[] args) {
        final String response = JOptionPane.showInputDialog(null, "Enter your invitation code:", "Minesweeper Championship 2018", 3);
        if (response.equals("GoldenTicket2018@flare-on.com")) {
            JOptionPane.showMessageDialog(null, "Welcome to the Minesweeper Championship 2018!\nPlease enter the following code to the ctfd.flare-on.com website to compete:\n\n" + response, "Success!", -1);
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect invitation code. Please try again next year.", "Failure", 0);
        }
    }
}
