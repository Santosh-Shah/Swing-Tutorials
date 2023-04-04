package unitOne;

import java.awt.*;

public class AWTUse {
     Frame frame;
     Label userLbl, passLbl, conPassLbl;
     TextField userTxt, passTxt, conPassTxt;
     Button submit;

     AWTUse() {
         frame = new Frame();
         userLbl = new Label("Username");
         passLbl = new Label("Password");
         conPassLbl = new Label("Confirm Password");
         userTxt = new TextField(20);
         passTxt = new TextField(20);
         conPassTxt = new TextField(20);
         submit = new Button("Submit");
         submit.addActionListener(e -> System.exit(0));
         frame.setTitle("Reg. Frame");
         frame.add(userLbl);
         frame.add(userTxt);
         frame.add(passLbl);
         frame.add(passTxt);
         frame.add(conPassLbl);
         frame.add(conPassTxt);
         frame.add(submit);
         frame.setSize(300, 300);
         frame.setVisible(true);
     }

    public static void main(String[] args) {
        new AWTUse();
    }
}
