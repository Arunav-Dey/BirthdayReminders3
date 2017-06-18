package  util.ltd.deysoftwares.birthdayreminders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class scrn_1 extends AppCompatActivity {

    public static DatabaseHelper myDb;String val="";String location;String month;String nickname;int c;
    EditText editText,editText6,editText7,editText8,editText9,editText10,editText12;

    Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;int i=0;
    TextView textView3;

    String mnth[]=new String[12];//nexus
    public static String arr[][]={

            {"Shivankar Bose","Chunna","21","Delhi","January","1995"},
            {"Shivam Debnath","Shivam","15","Moradabad","June","1999"},
            {"Neha Nandan","Meenu","21","Indore","January","1983"},
            {"Debashish Ray","Munna","07","Hyderabad","January","1981"},
            {"Jyoti Ranjan Mohanty","Jyoti","27","Kolkata","January",""},
            {"Sumanta Nandan","Sumanto","01","Indore","January","1978"},
            {"Aryan Singh","Aryan","27","London","January",""},
            {"Ishita Nandan","Ishita","18","Indore","January","2017"},
            {"Shubhramani Mazumdar","Raja","25","Banglore","February","1986"},
            {"Swarnima Mazumdar","Shivi","25","Aligarh","February","1999"},
            {"Gurjit Singh","Chinu","27","London","March","1978"},
            {"Devolina Mazumdar","Shunu","27","Meerut","March","1975"},
            {"Samriddhi Mazumdar","Diya","24","Meerut","March","2008"},
            {"Poornima Dutta","Punni","01","Delhi","March",""},
            {"Pradeep Kumar Dey","Bhaiya","06","Delhi","March",""},
            {"Sushmita Dutta","Rima","26","Delhi","March","1990"},
            {"Arjun Singh","Arjun","05","London","March",""},
            {"Dhrubika Nandi","Dhrubika","10","Vadodara","March","2016"},
            {"Diwaker Dutta","Gummi","28","Delhi","April","1991"},
            {"Runa Dey","Runa-Mami","06","Delhi","April",""},
            {"Sujata Dutta","Elu","27","Delhi","April","1959"},
            {"Santosh Singh","Bade Jijaji","10","Meerut","May","1947"},
            {"Sanjay Basu","Sanjay pesho","28","Delhi","May",""},
            {"Subodh Mazumdar","Nandu","02","Meerut","June","1974"},
            {"Ashit Nayak","Bablu","18","Moradabad","June",""},
            {"Lakshmi Ray","Lokkhi","21","Delhi","June","1954"},
            {"Jharna Nayak","Mona","11","Moradabad","July",""},
            {"Rita Dey","Rita","30","Moradabad","July",""},
            {"Abhinav Dey","Guddu","07","Delhi","August",""},
            {"Vanadana Basu","Khucchu","17","Moradabad","August",""},
            {"Nandini Ray","Mini","26","Delhi","August","1987"},
            {"Deependra Narayan Dutta","Dipu","24","Delhi","August","1954"},
            {"Saurabh Nag","Monty","07","Delhi","September","1992"},
            {"Jagriti Sarkar","Bonu","21","Georgia-USA","October",""},
            {"Soma Mazumdar","Soma","05","Aligarh","October","1970"},
            {"Shivani Singh","Mona","10","London","October",""},
            {"Arna Ray","Arnu","04","Hyderabad","October","2012"},
            {"Mandakini Ghosh Mohanti","Mou","24","Kolkata","October","1986"},
            {"Shambhu Nath Mazumdar","khokon","10","Meerut","November","1951"},
            {"Usha Malhi","Bodo-Didi","14","Meerut","November","1950"},
            {"Shilpa Ray","Shilpa Bhabhi","14","Hyderabad","November","1983"},
            {"Subhash Chandra Dey","Khokon","14","Moradabad","November",""},
            {"Arunav Dey","Manu","16","Moradabad","November",""},
            {"Shushil Mazumdar","Vishnu","05","Aligarh","November","1965"},
            {"Rooposhi Saha Nandi","Roopa","18","Vadodara","November","1982"},
            {"Aditya Mazumdar","Shivesh","26","Aligarh","November","2001"},
            {"Arnab Nandan","Arnab","23","Indore","November","2010"},
            {"Ipshita Dutta Mazumdar","Ria","17","Banglore","December","1987"},
            {"Anjana Mazumdar","Guddi","17","Moradabad","December","1954"},
            {"Radha Nag","Radha","28","Meerut","December",""},
            {"Rani Bala Saha","Rani","03","Meerut","December",""},
            {"Shivam Saha","Patku","25","Chennai","December",""},
            {"Itika Saha","Iti","27","Germany","December",""},
            {"Dhruba Roy","Dhrubo","16","Delhi","December",""},
            {"Rani Prabha Dey","Didu","31","Moradabad","December",""}

    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrn_1);

        myDb = new DatabaseHelper(this);

        editText= (EditText)findViewById(R.id.editText);
        //textView6=(TextView)findViewById(R.id.textView6);
       // editText6= (EditText)findViewById(R.id.editText6);
        //editText7= (EditText)findViewById(R.id.editText7);
       // editText8= (EditText)findViewById(R.id.editText8);
        //editText9= (EditText)findViewById(R.id.editText9);
       // editText10= (EditText)findViewById(R.id.editText10);
       // editText12= (EditText)findViewById(R.id.editText12);
       // button=(Button)findViewById(R.id.button) ;
        button2=(Button)findViewById(R.id.button2) ;
       // button3=(Button)findViewById(R.id.button3) ;
       // button4=(Button)findViewById(R.id.button4) ;
        button5=(Button)findViewById(R.id.button5) ;
        button6=(Button)findViewById(R.id.button6) ;
        button7=(Button)findViewById(R.id.button7) ;
        button8=(Button)findViewById(R.id.button8) ;
        textView3=(TextView)findViewById(R.id.textView3);
       // button9=(Button)findViewById(R.id.button9) ;
        button11=(Button)findViewById(R.id.button11) ;
        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText.setText("");
                return false;

            }
        });


        Toast.makeText(scrn_1.this,"Created and developed by Arunav Dey",Toast.LENGTH_LONG).show();


        viewAll();



        search();
        age();
        location();
        month();


      showdate();
        launchactivity();





    }
    public void launchactivity()
    {
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent("util.ltd.deysoftwares.birthdayreminders.MainActivity");
                startActivity(intent);

            }
        });

    }

    public void showdate()
    {



        String mnth[]= {"january","february","march","april","may","june","july","august","september","october","november","december"};
        Calendar c = Calendar.getInstance();
        //System.out.println("Current time => "+c.getTime());int p=0;

        SimpleDateFormat dat = new SimpleDateFormat("dd");
        SimpleDateFormat mo = new SimpleDateFormat("MM");
        String month=mo.format(c.getTime());
        String date=dat.format(c.getTime());

        int k=Integer.parseInt(month);
        String g=mnth[k-1];
        String wrap=date+g;
       // textView3.setText(wrap);



        Cursor res = myDb.getAllData();
        res.moveToFirst();
        StringBuffer ob = new StringBuffer();

        while(res.moveToNext())
       {
           if((res.getString(3)+res.getString(5)).equalsIgnoreCase(wrap)||("0"+(res.getString(3)+res.getString(5))).equalsIgnoreCase(wrap)) {
              i++;
                ob.append(res.getString(1)+" Has Birthday Today"+"\n");
//
            }


        }
        showMessage(i+" People have their Birthday Today ",ob.toString());
        //textView3.setText("0"+(res.getString(3)+res.getString(5)));


    }



    public void viewAll() {
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Serial No. :"+ res.getString(0)+"\n");
                            buffer.append("Name :"+ res.getString(1)+"\n");
                            buffer.append("Nickname :"+ res.getString(2)+"\n");
                            buffer.append("Location:"+ res.getString(4)+"\n");
                            buffer.append("Birthdate :"+res.getString(3)+" "+res.getString(5)+" "+res.getString(6)+"\n\n");


                        }

                        // Show all data
                        showMessage("Birthday Calender",buffer.toString());
                    }
                }
        );
    }









    public void age()
    {

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nickname=editText.getText().toString();
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                while(!(nickname.equalsIgnoreCase(val)))
                {
                    val=res.getString(2);
                    res.moveToNext();
                }
                res.moveToPrevious();
                StringBuffer buffer = new StringBuffer();
                buffer.append("Age of "+nickname+" is "+(2017-Integer.parseInt(res.getString(6))+" years."));
                showMessage("Age",buffer.toString());

            }
        });

    }


    public void location()
    {


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                StringBuffer ob = new StringBuffer();
                location=editText.getText().toString();
                if(res.getString(4).equalsIgnoreCase(location))
                {
                    i++;
                    ob.append("Name : "+res.getString(1)+"\n");
                    ob.append("Birthdate :"+res.getString(3)+" "+res.getString(5)+" "+res.getString(6)+"\n\n");


                }
                while(res.moveToNext())
                {
                    if(res.getString(4).equalsIgnoreCase(location)) {
                        i++;
                        ob.append("Name : " + res.getString(1) + "\n");
                        ob.append("Birthdate :" + res.getString(3) + " " + res.getString(5) + " " + res.getString(6) + "\n\n");
                    }


                }
                showMessage(i+" People live in "+location,ob.toString());

            }
        });
    }


    public void month()
    {
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                StringBuffer ob = new StringBuffer();
                month=editText.getText().toString();
                if(res.getString(5).equalsIgnoreCase(month))
                {
                    i++;
                    ob.append("Name : "+res.getString(1)+"\n");
                    ob.append("Birthdate :"+res.getString(3)+"\n\n");


                }
                while(res.moveToNext())
                {
                    if(res.getString(5).equalsIgnoreCase(month)) {
                        i++;
                        ob.append("Name : " + res.getString(1) + "\n");
                        ob.append("Birthdate :" + res.getString(3) + "\n\n");
                    }


                }
                showMessage(i+" People have their B'days in the month of "+month,ob.toString());

            }
        });

    }

    public void search()
    {
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key = editText.getText().toString();
                Cursor res = myDb.getAllData();
                res.moveToFirst();
                while(!(key.equalsIgnoreCase(val)))
                {
                    val=res.getString(2);
                    res.moveToNext();
                }
                res.moveToPrevious();
                StringBuffer buffer = new StringBuffer();
                buffer.append("Name :"+res.getString(1)+"\n");
                buffer.append("Birthdate :"+res.getString(3)+" "+res.getString(5)+" "+res.getString(6)+"\n\n");
                showMessage("Results",buffer.toString());


            }
        });

    }



    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }


}
