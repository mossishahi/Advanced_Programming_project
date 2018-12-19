package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Vector;

public class Main {


    ////// Initializi Items /////
    JFrame mainframe;

    // Firstpage Items ....
    JPanel firsLoginPanel;
    JLabel Title;
    JLabel usernamelabelFirstpage;
    JLabel passwordlabelFirstpage;
    JLabel passwordlabelFirstpagep;
    JTextField usernametextfieldFirstpage;
    JPasswordField passwordfieldFirstpage;
    JButton Login;
    JButton SignUp;
    JLabel image;

    // Signup page Items ...

    JPanel SignUpPanel;
    JLabel firstnameLabelSingupForm;
    JLabel lastnameLabelSignupForm;
    JLabel emailLabelSingupForm;
    JLabel usernameLabelSignUpForm;
    JLabel passwordLabelSignUpForm;
    JLabel retypePasswordLabelSignUpForm;
    JTextField firstnameTextfieldSignupForm;
    JTextField lastnameTextfieldSignupForm;
    JTextField usernameTextfieldSignupForm;
    JTextField emailTextfieldSignupform;
    JPasswordField passwordFieldSignupForm;
    JPasswordField retypepasswordFieldSignupForm;
    JButton SignUpButtonInForm;
    JPanel SignupSucceedPanel;
    JLabel SucceedSignUpMessage;
    ArrayList<flight> flightdatabase;
    user Admin;

    /// User profile Items ...
    JPanel userprofile;
    JButton back;
    JButton back2;
    JLabel from = new JLabel("from");
    JLabel to = new JLabel("to");
    JLabel DepartureDate = new JLabel("Departure Date ");
    JLabel passengernumber = new JLabel("Passenger Number ");

    Vector<String> cities=new Vector<String>();

    JComboBox<String> departures=new JComboBox<>(cities);

    ///Admin profile Items ...

    JPanel adminprofile;
    JLabel from2 ;
    JLabel to2 ;
    JLabel DepartureDate2 ;
    JLabel flightcapacity ;


    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        SwingUtilities.invokeAndWait(() -> {
            try {
                new Main().initialize();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

//        SwingUtilities.invokeAndWait(()-> new Main().showoff());
    }

    public void initialize() throws ClassNotFoundException {
        JFrame mainframe = new JFrame("FlowLayout");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setLayout(null);
        mainframe.setSize(1000, 600);

        // Firstpage Items ....

        JPanel firsLoginPanel = new JPanel(null);
//        firsLoginPanel.setVisible(true);
        JPanel userprofile = new JPanel(null);
        userprofile.setBounds(500,0,500,600);


        JLabel Title = new JLabel(" Travel Agency ");
        Title.setForeground(Color.gray);
//        firsLoginPanel.add(Title);

        JLabel usernamelabelFirstpage = new JLabel("Username");
        usernamelabelFirstpage.setBounds(80, 170, 200, 30);
        usernamelabelFirstpage.setForeground(Color.WHITE);
        firsLoginPanel.add(usernamelabelFirstpage);

        JLabel passwordlabelFirstpage = new JLabel("Password");
        passwordlabelFirstpage.setBounds(80, 210, 200, 30);
        passwordlabelFirstpage.setForeground(Color.WHITE);
        firsLoginPanel.add(passwordlabelFirstpage);

        JTextField usernametextfieldFirstpage = new JTextField();
        usernametextfieldFirstpage.setBackground(Color.lightGray);
        usernametextfieldFirstpage.setBounds(170, 170, 200, 30);
        firsLoginPanel.add(usernametextfieldFirstpage);

        JPasswordField passwordfieldFirstpage = new JPasswordField(10);
        passwordfieldFirstpage.setBackground(Color.lightGray);
        passwordfieldFirstpage.setBounds(170, 210, 200, 30);
        firsLoginPanel.add(passwordfieldFirstpage);

        JButton Login = new JButton("Login");
        Login.setBounds(190, 260, 150, 30);
        firsLoginPanel.add(Login);

        JButton SignUp = new JButton("SignUp");
        SignUp.setBounds(190, 300, 150, 30);
        firsLoginPanel.add(SignUp);

        JLabel firstpageLabel = new JLabel(new ImageIcon("firstpage.jpg"));
        firstpageLabel.setSize(1000, 600);
        mainframe.setContentPane(firstpageLabel);
        firsLoginPanel.add(firstpageLabel);

        JLabel signuppageLabel = new JLabel(new ImageIcon("signuppage.jpg"));
        signuppageLabel.setSize(1000, 600);
        mainframe.setContentPane(signuppageLabel);

        JLabel adminimage = new JLabel(new ImageIcon("adminimage.jpg"));
        adminimage.setSize(1000, 600);
        mainframe.setContentPane(adminimage);

        JLabel userimage = new JLabel(new ImageIcon("userimage.jpg"));
        userimage.setSize(1000, 600);
        mainframe.setContentPane(userimage);







        // Signup page Items ...

        JPanel SignUpPanel = new JPanel(null);


//        JLabel SignUpFormUsernameLabel = new JLabel("Username");
        JLabel firstnameLabelSingupForm = new JLabel("First Name : ");
        firstnameLabelSingupForm.setBounds(140, 120, 200, 30);
        SignUpPanel.add(firstnameLabelSingupForm);

        JLabel lastnameLabelSignupForm = new JLabel("Last Name : ");
        lastnameLabelSignupForm.setBounds(140, 160, 200, 30);
        SignUpPanel.add(lastnameLabelSignupForm);

        JLabel emailLabelSingupForm = new JLabel("Your E-Mail : ");
        emailLabelSingupForm.setBounds(140, 200, 200, 30);
        SignUpPanel.add(emailLabelSingupForm);

        JLabel usernameLabelSignUpForm = new JLabel("Choose a user Name : ");
        usernameLabelSignUpForm.setBounds(85, 280, 200, 30);
        SignUpPanel.add(usernameLabelSignUpForm);

        JLabel passwordLabelSignUpForm = new JLabel("Choose a Password   : ");
        passwordLabelSignUpForm.setBounds(85, 320, 200, 30);
        SignUpPanel.add(passwordLabelSignUpForm);

        JLabel retypePasswordLabelSignUpForm = new JLabel("Re-type your Password : ");
        retypePasswordLabelSignUpForm.setBounds(75, 360, 200, 30);

        JTextField firstnameTextfieldSignupForm = new JTextField();
        firstnameTextfieldSignupForm.setBounds(220, 120, 200, 30);
        SignUpPanel.add(firstnameTextfieldSignupForm);

        JTextField lastnameTextfieldSignupForm = new JTextField();
        lastnameTextfieldSignupForm.setBounds(220, 160, 200, 30);
        SignUpPanel.add(lastnameTextfieldSignupForm);

        JTextField usernameTextfieldSignupForm = new JTextField();
        usernameTextfieldSignupForm.setBounds(220, 280, 200, 30);
        SignUpPanel.add(usernameTextfieldSignupForm);

        JTextField emailTextfieldSignupform = new JTextField();
        emailTextfieldSignupform.setBounds(220, 200, 200, 30);
        SignUpPanel.add(emailTextfieldSignupform);

        JPasswordField passwordFieldSignupForm = new JPasswordField();
        passwordFieldSignupForm.setBounds(220, 320, 200, 30);
        passwordFieldSignupForm.setBackground(Color.WHITE);
        SignUpPanel.add(passwordFieldSignupForm);

        JPasswordField retypepasswordFieldSignupForm = new JPasswordField();
        retypepasswordFieldSignupForm.setBounds(220, 360, 200, 30);
        SignUpPanel.add(retypepasswordFieldSignupForm);
        SignUpPanel.add(retypePasswordLabelSignUpForm);

        JButton SignUpButtonInForm = new JButton(" SignUp  ");
        SignUpButtonInForm.setBounds(220, 420, 200, 30);
        SignUpButtonInForm.setBackground(Color.lightGray);
        SignUpPanel.add(SignUpButtonInForm);

        SignUpPanel.add(signuppageLabel);

        Title.setBounds(100, 30, 400, 30);
        mainframe.setContentPane(firsLoginPanel);

        JPanel SignupSucceedPanel = new JPanel(null);

        SignupSucceedPanel.setBounds(400, 200, 200, 50);

        JLabel SucceedSignUpMessage = new JLabel("Registered Successfully");
        SucceedSignUpMessage.setBounds(450, 200, 180, 30);

        /// User profile Items ...

        JButton back=new JButton("back");
        JButton back2=new JButton("back");
//        back.setSize(70,30);
        back.setBounds(310,300,90,25);
        back2.setBounds(550,350,90,25);

        Vector<String> cities=new Vector<>();
        JComboBox<String> departures=new JComboBox<>(cities);
        JComboBox<String> arrivals=new JComboBox<>(cities);
        cities.add("tehran");
        cities.add("New York");
        cities.add("Dubai");
        cities.add("Washington");
        cities.add("Berlin");
        JLabel from = new JLabel("from");
        JLabel to = new JLabel("to");
        JLabel DepartureDate = new JLabel("Departure Date ");
        JLabel year = new JLabel(" Year  ");
        JLabel month = new JLabel(" Month ");
        JLabel day = new JLabel(" Day ");
        JLabel nonstop=new JLabel("Non Stop flight");

        JButton search=new JButton("Search");

        JTextField yearTextfield =new JTextField(2016);
        JTextField monthTextfield =new JTextField();
        JTextField dayTextfield =new JTextField();
        JTextField numbertextfield =new JTextField();

        JCheckBox isdirect=new JCheckBox();

        JLabel number = new JLabel("Number ");

        userprofile.add(from);
        from.setBounds(460,150,120,25);
        userprofile.add(to);
        to.setBounds(680,150,120,25);
        userprofile.add(arrivals);
        arrivals.setBounds(700,150,120,25);
        userprofile.add(DepartureDate);
        DepartureDate.setBounds(520,200,120,25);

        userprofile.add(year);
        year.setBounds(650,200,120,25);

        userprofile.add(yearTextfield);
        yearTextfield.setBounds(700,200,70,25);

        userprofile.add(month);
        month.setBounds(650,230,120,25);

        userprofile.add(monthTextfield);
        monthTextfield.setBounds(700,230,70,25);

        userprofile.add(day);
        day.setBounds(650,260,120,25);

        userprofile.add(dayTextfield);
        dayTextfield.setBounds(700,260,70,25);

        userprofile.add(number);
        number.setBounds(520,300,100,25);

        userprofile.add(numbertextfield);
        numbertextfield.setBounds(580,300,70,25);

        userprofile.add(departures);
        departures.setBounds(500,150,120,25);

        userprofile.add(nonstop);
        nonstop.setBounds(680,285,120,50);
        userprofile.add(isdirect);
        isdirect.setBounds(780,300,20,20);

        search.setBounds(650,350,90,25);
        userprofile.add(search);
        userprofile.add(back2);
        userprofile.add(userimage);

        departures.setForeground(Color.BLACK);
        departures.setBackground(Color.WHITE);
        arrivals.setForeground(Color.BLACK);
        arrivals.setBackground(Color.WHITE);

        /// Admin profile Items

        JPanel adminprofile=new JPanel(null);
        JLabel from2 = new JLabel("from");
        JLabel to2 = new JLabel("to");
        JLabel DepartureDate2 = new JLabel("Departure Date ");
        JLabel flightcapacity = new JLabel("Flight Capacity ");
        JLabel year2 = new JLabel(" Year  ");
        JLabel month2 = new JLabel(" Month ");
        JLabel day2 = new JLabel(" Day ");
        JLabel ischarter=new JLabel("charter");
        JLabel Durance =new JLabel("Durance");
        JLabel minute=new JLabel("minutes");


        JTextField yearTextfield2 =new JTextField();
        JTextField monthTextfield2 =new JTextField();
        JTextField dayTextfield2=new JTextField();
        JTextField numbertextfield2 =new JTextField();
        JTextField flightcapacitytextfield =new JTextField();
        JTextField durancetextfield = new JTextField();


        JCheckBox ischarterbox=new JCheckBox();

        JLabel capacity = new JLabel("Number ");


        JButton setflight=new JButton(" Set Flight ");
        adminprofile.add(from2);
        from2.setBounds(50,150,100,25);

        JComboBox<String> departures2=new JComboBox<>(cities);
        JComboBox<String> arrivals2=new JComboBox<>(cities);

        adminprofile.add(to2);
        to2.setBounds(250,150,100,25);

        departures2.setBounds(90,150,100,25);

        adminprofile.add(arrivals2);
        arrivals2.setBounds(280,150,100,25);

        adminprofile.add(flightcapacity);
        flightcapacity.setBounds(50,200,100,25);

        adminprofile.add(flightcapacitytextfield);
        flightcapacitytextfield.setBounds(150,200,70,25);

        adminprofile.add(DepartureDate2);
        DepartureDate2.setBounds(50,250,120,25);


        adminprofile.add(year2);
        year2.setBounds(150,250,120,25);

        adminprofile.add(yearTextfield2);
        yearTextfield2.setBounds(190,250,70,25);

        adminprofile.add(month2);
        month2.setBounds(280,250,120,25);

        adminprofile.add(monthTextfield2);
        monthTextfield2.setBounds(320,250,70,25);

        adminprofile.add(day2);
        day2.setBounds(410,250,70,25);

        adminprofile.add(dayTextfield2);
        dayTextfield2.setBounds(440,250,70,25);


        adminprofile.add(ischarterbox);
        ischarterbox.setBounds(300,200,70,25);

        adminprofile.add(ischarter);
        ischarter.setBounds(250,200,70,25);
        ischarterbox.setBackground(null);
        adminprofile.add(Durance);
        Durance.setBounds(50,300,120,25);

        durancetextfield.setBounds(110,300,70,25);
        minute.setBounds(190,300,120,25);

        adminprofile.add(setflight);
        setflight.setBounds(410,300,110,25);

        adminprofile.add(durancetextfield);
        adminprofile.add(minute);
        adminprofile.add(departures2);

        adminprofile.add(back);
        adminprofile.add(adminimage);

        JLabel LoginError=new JLabel(" Username or password is Wrong ");
        LoginError.setForeground(Color.RED);
        LoginError.setFont(new Font("font",Font.PLAIN,13));
        LoginError.setBounds(170,350,200,30);
//        LoginError.setVisible(true);
//        firsLoginPanel.add(LoginError);
        JLabel notfilled=new JLabel(" Username or password is not filled ");
        notfilled.setForeground(Color.RED);
        notfilled.setFont(new Font("font",Font.PLAIN,13));
        notfilled.setBounds(150,350,220,30);
//        notfilled.setVisible(true);

        JLabel notvalidemail=new JLabel(" E-mail is Wrong ");
        notvalidemail.setForeground(Color.RED);
//        notvalidemail.setFont(new Font("font",Font.PLAIN,13));
        notvalidemail.setBounds(170,350,200,30);
//        notvalidemail.setVisible(true);


        JPanel searchResultspanel= new JPanel(null);

//        userprofile.setBorder(new Border() {});



        FileReader inf = null;/// Checking file if is empty or not . is empty Write Admin .
        try {
            inf = new FileReader("usersdatabase.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int chCode=0;

        try {
            chCode = inf.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("chCode :"+chCode);
        if (-1==chCode) {
            ArrayList<user> usersDataBase = new ArrayList<user>();
            user Admin = new user("Ad", "12");
            usersDataBase.add(0, Admin);

            try {
                writeonFile(usersDataBase,"usersdatabase.txt");
            } catch (IOException e) {
                System.out.println("avval ");
                e.printStackTrace();
            }
            System.out.println(usersDataBase.get(0).username);
        }

        SignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firsLoginPanel.setVisible(false);
                mainframe.setContentPane(SignUpPanel);
                System.out.println("hello");

            }
        });


        Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firsLoginPanel.setVisible(false);

                String username = new String(usernametextfieldFirstpage.getText());
                String password = new String(passwordfieldFirstpage.getPassword());
                user loginuser = new user(username, password);

                ArrayList<user> usersDataBase = new ArrayList<user>();
                try {
                    usersDataBase = readFile("c:/New folder/usersdatabase.txt");
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }

                boolean notFilled = false;

                if ((username.trim().isEmpty()) || (password.trim().isEmpty()))
                    notFilled = true;

                if(notFilled)
                    mainframe.setContentPane(notfilled);
                if (usersDataBase.contains(loginuser)) {
                    if ((usersDataBase.indexOf(loginuser)) == 0)
                        mainframe.setContentPane(adminprofile);
                    else if (!notFilled)
                        mainframe.setContentPane(userprofile);
                }
            }
        });

        setflight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String start=new String(departures2.getSelectedItem().toString());
                String destination=new String(arrivals2.getSelectedItem().toString());

                String year=new String(yearTextfield2.getText());
                String month=new String(monthTextfield2.getText());
                String day=new String(dayTextfield2.getText());
                date flightdate=new date (year ,month,day);

                String capacity = new String(flightcapacitytextfield.getText());
                int iCapacity=Integer.parseInt(capacity);
                int time=Integer.parseInt(durancetextfield.getText());

                flight newflight =new flight(start,destination);///Making new flight
                newflight.setFlightdate(flightdate);
                newflight.setCapacity(iCapacity);
                newflight.setTime(time);
                if(ischarterbox.isSelected())
                    newflight.setcharter(true);

                System.out.println(newflight.start);
                System.out.println(newflight.destination);
                System.out.println(newflight.capacity);

                ArrayList<flight> flightdatabase=new ArrayList<>();


                FileReader inf = null;
                try {
                    inf = new FileReader("flightdatabase.txt");
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                int chCode;
                try {
                    if(-1 != (chCode=inf.read()))
                        flightdatabase = readFile("flightdatabase.txt");
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }

                flightdatabase.add(newflight);

                System.out.println(flightdatabase.size());
                try {
                    writeonFile(flightdatabase,"flightdatabase.txt");
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });

        Vector<String> resultsVector =new Vector<String>();

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String start=new String(departures.getSelectedItem().toString());
                String destination=new String(arrivals.getSelectedItem().toString());

                String year=new String(yearTextfield.getText());
                String month=new String(monthTextfield.getText());
                String day=new String(dayTextfield.getText());

                date flightDate=new date(year,month,day);

                flight testflight=new flight(start,destination);
                testflight.setFlightdate(flightDate);
//
                ArrayList<flight> flightdatabase=new ArrayList<>();


                FileReader inf = null;/// these lines are for loading Flights database from file
                try {
                    inf = new FileReader("flightdatabase.txt");
                } catch (FileNotFoundException e1) {
                    System.out.println("e11");
                    e1.printStackTrace();
                }
                int chCode;
                try {
                    if(-1 != (chCode=inf.read()))
                        flightdatabase = readFile("flightdatabase.txt");
                    else
                    resultsVector.add(" .: No Flight : . ");
                    inf.close();
                } catch (IOException e1) {
                    System.out.println("e12");
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    System.out.println("e13");
                    e1.printStackTrace();
                }////// |||||||||||||||||||||||||||||||

                for(int i=0;i<flightdatabase.size();i++){
                    System.out.println(flightdatabase.get(i).start);
                    System.out.println(flightdatabase.get(i).destination);
                    System.out.println(flightdatabase.get(i).flightdate.year+flightdatabase.get(i).flightdate.month+flightdatabase.get(i).flightdate.day);
                }

                System.out.println("test : \n "+testflight.start);
                System.out.println(testflight.destination);
                System.out.println("equals:"+testflight.flightdate.equals(flightdatabase.get(0).flightdate));

////                System.out.println(findPath(flightdatabase,testflight));
                ticket test=findPath(flightdatabase,testflight);
                if(test.numofFlight!=0) {
                    for (int i = 0; i < test.path.size(); i+=2) {
//                        System.out.println(test.path.get(i).start +"--->" +test.path.get(i).destination);
                            if (!(test.path.get(i).equals(test.path.get(i+1)))) {
                                String date="       "+test.path.get(i).flightdate.year+"/"+test.path.get(i).flightdate.month+"/"+test.path.get(i).flightdate.day;
                                resultsVector.add(test.path.get(i).start +"  >>>  " +test.path.get(i).destination+ " + "+test.path.get(i+1).start +"  >>>  " +test.path.get(i+1).destination+date);
                            }
                        else {
                                String result="  "+test.path.get(i).start +"  >>>  "+ test.path.get(i).destination +"       "+test.path.get(i).flightdate.year+"/"+test.path.get(i).flightdate.month+"/"+test.path.get(i).flightdate.day;
                                resultsVector.add(result);
                            }
                    }
                }else{
                    System.out.println("no flight");
                    resultsVector.add("no flight ");
                }
                JList<String> resultList = new JList<>(resultsVector);
                resultList.setBounds(450,400,500,80);
                searchResultspanel.setBounds(400,400,600,200);
//                searchResultspanel.add(resultList);

                System.out.println(test.numofFlight);

//                resultList.setVisible(true);
                mainframe.setContentPane(resultList);
                System.out.println("hello");

            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("back");
                mainframe.setContentPane(firsLoginPanel);
                firsLoginPanel.setVisible(true);
                userprofile.setVisible(false);
            }
        });
        back2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("back");
                mainframe.setContentPane(firsLoginPanel);
                firsLoginPanel.setVisible(true);
                userprofile.setVisible(false);
            }
        });


        SignUpButtonInForm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ArrayList<user> usersDataBase=new ArrayList<user>();

                try {
                    usersDataBase=readFile("usersdatabase.txt");
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }

                String lastname = lastnameTextfieldSignupForm.getText();///extract user properties from textfields ...
                String email = emailTextfieldSignupform.getText();
                String username = usernameTextfieldSignupForm.getText();
                char[] password = passwordFieldSignupForm.getPassword();
                String passwordSTR = new String(password);
                String firstname = firstnameTextfieldSignupForm.getText();

                if ((firstname.trim().isEmpty()) || (lastname.trim().isEmpty()) || (email.trim().isEmpty()) || (username.trim().isEmpty())) {
                    mainframe.setContentPane(notvalidemail);
                    System.out.println("not");
                }
                if(!validEmail(email))
                    mainframe.setContentPane(notvalidemail);

                user newUser = new user(username, passwordSTR);/// Making user and setting properties
                newUser.setFirstname(firstname);
                newUser.setLastname(lastname);
                newUser.setEmail(email);

                usersDataBase.add(newUser);/// add user to users database List

                try {
                    writeonFile(usersDataBase,"usersdatabase.txt");
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                SignUpPanel.setVisible(false);
                SignupSucceedPanel.add(SucceedSignUpMessage);
                SignupSucceedPanel.setVisible(true);
                mainframe.setContentPane(SignupSucceedPanel);
//              System.out.println("hello2");
            }
        });
        mainframe.setVisible(true);
    }
    public void showoff() throws ClassNotFoundException {
        initialize();
        JFrame mainframe = new JFrame("FlowLayout");
        mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainframe.setLayout(null);
        mainframe.setSize(500, 300);
        mainframe.setBackground(Color.BLACK);
        mainframe.setVisible(true);
    }
    public void writeonFile(ArrayList list,String path) throws IOException, ClassNotFoundException {
//        ArrayList database=new ArrayList();
//        database=readFile(path);
//        database=list;
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
    }

    public ArrayList readFile(String path) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList readFiledatabase ;
        readFiledatabase = (ArrayList) ois.readObject();
        return readFiledatabase;
    }

    public boolean validEmail(String email) {

        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    public ArrayList<flight> searchflight(date date,String from,String to){

        ArrayList<flight> flightlist = new ArrayList<>();
        return flightlist;
    }
    public ticket findPath(ArrayList<flight> a, flight b)
    {

        ticket ans = new ticket();

        for(int i = 0; i < a.size(); i++)
        {
            if(a.get(i).flightdate.equals(b.flightdate)) {
                if (a.get(i).equals(b)) {
                    ans.numofFlight++;
                    ans.path.add(a.get(i));
                    ans.path.add(a.get(i));
                }
            }
        }
        for(int i = 0; i < a.size()-1; i++)
            for(int j = i+1; j < a.size(); j++)
            {
                if(a.get(i).flightdate.equals(a.get(j).flightdate) && a.get(i).flightdate.equals(b.flightdate)) {
                    if (i != j) {
                        if (a.get(i).destination.equals(a.get(j).start)) {
                            flight tmp = new flight(a.get(i).start, a.get(j).destination);
                            if (b.equals(tmp)) {
                                ans.numofFlight++;
                                ans.path.add(a.get(i));
                                ans.path.add(a.get(j));
                            }
                        }
                        else if(a.get(i).start.equals(a.get(j).destination))
                        {
                            flight tmp = new flight(a.get(j).start, a.get(i).destination);
                            if (b.equals(tmp))
                            {
                                ans.numofFlight++;
                                ans.path.add(a.get(j));
                                ans.path.add(a.get(i));
                            }
                        }
                    }
                }
            }
        return ans;
    }
}

