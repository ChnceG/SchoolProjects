import java.util.ArrayList;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Friend> party = new ArrayList<>();
        String firstName, lastName, foodToBring, guests = "";
        Object[] invite = { "Invite", "Don't Invite" };
        int checkInvite, checkRepeat;
        boolean isInvited, flag = true;

        JOptionPane.showMessageDialog(null,"Welcome! Please enter the guest information!", "Party Invite Software", JOptionPane.INFORMATION_MESSAGE);
        do {
            firstName = JOptionPane.showInputDialog(null, "Enter first name", "Party Invite Software", JOptionPane.QUESTION_MESSAGE);
            lastName = JOptionPane.showInputDialog(null, "Enter Last name", "Party Invite Software", JOptionPane.QUESTION_MESSAGE);
            foodToBring = JOptionPane.showInputDialog(null, "Enter food they usually bring", "Party Invite Software", JOptionPane.QUESTION_MESSAGE);
            checkInvite = JOptionPane.showOptionDialog(null, "Is this guest invited?", "Party Invite Software",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, invite, invite[0]);
            isInvited = checkInvite == 0;

            Friend friend = new Friend(firstName, lastName, isInvited, foodToBring);
            party.add(friend);

            checkRepeat = JOptionPane.showConfirmDialog(null, "Enter another guest?", "Party Invite Software", JOptionPane.YES_NO_OPTION);
            if(checkRepeat != 0) {
                flag = false;
            }
        }
        while (flag);

        for(Friend friend : party) {
            guests += friend + "\n";
        }
        JOptionPane.showMessageDialog(null, "Guests: \n" + guests + "\n", "Party Invite Software", JOptionPane.INFORMATION_MESSAGE);
    }
}