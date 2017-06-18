package util.ltd.deysoftwares.birthdayreminders;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static util.ltd.deysoftwares.birthdayreminders.scrn_1.arr;
import static util.ltd.deysoftwares.birthdayreminders.scrn_1.myDb;

public class MainActivity extends AppCompatActivity {

    Button button10,button15,button12,button13,button14;int c;
    EditText editText3,editText4,editText13,editText14,editText16,editText17,editText18;
    TextView textView,textView2;
    RelativeLayout lambda;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button15=(Button)findViewById(R.id.button15);
        lambda=(RelativeLayout)findViewById(R.id.lambda);
        button12=(Button)findViewById(R.id.button12);
        button13=(Button)findViewById(R.id.button13);
        button14=(Button)findViewById(R.id.button14);
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);


        editText3= (EditText)findViewById(R.id.editText3);
        editText4= (EditText)findViewById(R.id.editText4);
        editText13= (EditText)findViewById(R.id.editText13);
        editText14= (EditText)findViewById(R.id.editText14);
        editText16= (EditText)findViewById(R.id.editText16);
        editText17= (EditText)findViewById(R.id.editText17);
        editText18= (EditText)findViewById(R.id.editText18);



        clear();
        AddData();
        UpdateData();
        DeleteData();
        feedprestoredval();



    }
    public void feedprestoredval()
    {

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // StringBuffer buffer = new StringBuffer();

                String arr[][]={
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
                        {"Rani Prabha Dey","Didu","31","Moradabad","December",""},
                };



                for(c=0;c<arr.length;c++)
                {
                    myDb.insertData(arr[c][0],arr[c][1],arr[c][2],arr[c][3],arr[c][4],arr[c][5]);

                }


                // showMessage("Arr",buffer.toString());
            }
        });

    }
    public void clear() {
        editText3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText3.setText("");
                return false;

            }
        });

        editText4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText4.setText("");
                return false;

            }
        });

        editText13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText13.setText("");
                return false;

            }
        });

        editText14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText14.setText("");
                return false;

            }
        });

        editText16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText16.setText("");
                return false;

            }
        });

        editText17.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText17.setText("");
                return false;

            }
        });

        editText18.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText18.setText("");
                return false;

            }
        });
    }

    public void DeleteData() {
        button14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb.deleteData(editText18.getText().toString());
                        if(deletedRows > 0)
                            Toast.makeText(MainActivity.this,"Data Deleted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void UpdateData() {
        button13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = myDb.updateData(editText18.getText().toString(),editText3.getText().toString(),editText4.getText().toString(),editText13.getText().toString(), editText17.getText().toString(), editText14.getText().toString(), editText16.getText().toString());
                        if(isUpdate == true)
                            Toast.makeText(MainActivity.this,"Data Updated",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not Updated",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    public  void AddData() {
        button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editText3.getText().toString(),editText4.getText().toString(),editText13.getText().toString(), editText17.getText().toString(), editText14.getText().toString(), editText16.getText().toString() );
                        if(isInserted == true)
                            Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }




}
