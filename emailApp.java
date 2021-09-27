package EmailApp;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class emailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Joyce", "Shu");
        em1.setAlternateMail("xujoyce03@gmail.com");
        em1.changePassword("xxyyzz");
        em1.setMailBoxCapacity(10);
        System.out.println(em1.PersonInfo());



    }
}
