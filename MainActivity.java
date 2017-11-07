package id.corporation.samsung.sms;

import android.content.Intent;
import android.provider.ContactsContract;
import android.service.carrier.CarrierMessagingService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import  android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
private  EditText txtnumber;
private EditText Txt2;
private Button Send;
private Button shareInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnumber= (EditText) findViewById(R.id.txtnumber);
                Txt2= (EditText) findViewById(R.id.text2);
                Send = (Button) findViewById(R.id.send);
                Send.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SendMessage();
                    }

                    private void SendMessage() {
                        Log.i("SEND SMS","");
                        String NoHp = txtnumber.getText().toString();
                        String pesan = Txt2.getText().toString();

                        try{
                            SmsManager smsManager= SmsManager.getDefault();
                            smsManager.sendTextMessage(NoHp,null,pesan,null,null);
                            Toast.makeText(getApplicationContext(),"SMS TERKIRIM",Toast.LENGTH_LONG).show();
                        }
                        catch (Exception e) {
                            Toast.makeText(getApplicationContext(),"GAGAL MENGIRIM PESAN",Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });

    }

    }


