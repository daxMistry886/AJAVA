import java.awt.*;
import java.awt.event.*;

class pra12 extends Frame implements ActionListener {
    Label lsname, lsrollno, lsclass, lgander, lsbg, lsmob, lsadrs;
    CheckboxGroup gander;
    Checkbox male, female;
    Choice csclass;
    TextField tfsname, tfsrollno, tfsmob;
    TextArea tasadrs;
    Button submit;

    TextArea display_details;

    pra12() {
        lsname = new Label("Name : ");
        lsrollno = new Label("Roll No : ");
        lsclass = new Label("Class : ");
        lgander = new Label("Gander : ");
        lsbg = new Label("Blood Group : ");
        lsmob = new Label("Mobile : ");
        lsadrs = new Label("Address : ");

        gander = new CheckboxGroup();
        male = new Checkbox("Male", gander, false);
        female = new Checkbox("Female", gander, false);

        csclass = new Choice();
        csclass.add("BSc IT");
        csclass.add("BSc CS");
        csclass.add("BCA");
        csclass.add("MSc IT");
        csclass.add("MSc CS");
        csclass.add("MCA");

        tfsname = new TextField();
        tfsrollno = new TextField();
        tfsmob = new TextField();

        tasadrs = new TextArea("", 2, 100, TextArea.SCROLLBARS_NONE);

        submit = new Button("Submit");

        display_details = new TextArea("", 2, 100, TextArea.SCROLLBARS_NONE);
        display_details.setEditable(false);

        lsname.setBounds(10, 40, 50, 20);
        tfsname.setBounds(70, 40, 150, 20);

        lsrollno.setBounds(240, 40, 50, 20);
        tfsrollno.setBounds(300, 40, 150, 20);

        lsclass.setBounds(10, 70, 50, 20);
        csclass.setBounds(70, 70, 150, 20);

        lgander.setBounds(240, 80, 50, 20);
        male.setBounds(300, 80, 50, 20);
        female.setBounds(360, 80, 50, 20);

        lsmob.setBounds(10, 100, 50, 20);
        tfsmob.setBounds(70, 100, 150, 20);


        lsadrs.setBounds(10, 130, 50, 20);
        tasadrs.setBounds(70, 130, 380, 70);

        submit.setBounds(10, 210, 440, 30);

        display_details.setBounds(10, 250, 440, 130);

        add(lsname);
        add(lsrollno);
        add(lsclass);
        add(lgander);
        add(lsbg);
        add(lsadrs);
        add(lsmob);

        add(male);
        add(female);

        add(csclass);

        add(tfsname);
        add(tfsrollno);
        add(tasadrs);
        add(tfsmob);


        add(submit);

        add(display_details);

        submit.addActionListener(this);

        setTitle("Students Details");
        setSize(490, 410);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            String sdetails = " ***** Students Details *****\n Name : " + tfsname.getText() + "\n Roll No. :"
                    + tfsrollno.getText() + "\n Class : " + csclass.getSelectedItem() + "\n Gander : "
                    + gander.getSelectedCheckbox().getLabel() + "\n Mobile : " + tfsmob.getText() + "\n Address : "
                    + tasadrs.getText();

            display_details.setText(sdetails);
        }
    }

    public static void main(String[] args) {
        new pra12();
    }
}