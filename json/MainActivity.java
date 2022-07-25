package com.varshith.parsexmlandjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {
    public static final String JSON_STRING="{\"city\": {\"City_Name\": \"Mysore\", \"Latitude\": \"12.295\", \"Longitude\": \"76.639\", \"Temperature\": \"22\", \"Humidity\": \"90%\"}}";
    TextView tv1;
    TextView textView1;
    Button xml;
    Button json;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView1);
        textView1 = (TextView) findViewById(R.id.textView2);
        xml = (Button) findViewById(R.id.xml);
        json = (Button) findViewById(R.id.json);
        xml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml.setEnabled(false);
                tv1.setText("");
                try {
                    InputStream is = getAssets().open("demo.xml");

                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(is);

                    Element element = (Element) doc.getDocumentElement();
                    element.normalize();

                    NodeList nList = doc.getElementsByTagName("city");

                    for (int i = 0; i < nList.getLength(); i++) {

                        Node node = nList.item(i);
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element element2 = (Element) node;
                            tv1.setText(tv1.getText() + "\nCity Name : " + getValue("City_Name", element2) + "\n");
                            tv1.setText(tv1.getText() + "Latitude : " + getValue("Latitude", element2) + "\n");
                            tv1.setText(tv1.getText() + "Longitude : " + getValue("Longitude", element2) + "\n");
                            tv1.setText(tv1.getText() + "Temperature : " + getValue("Temperature", element2) + "\n");
                            tv1.setText(tv1.getText() + "Humidity : " + getValue("Humidity", element2) + "\n");
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            private String getValue(String tag, Element element) {
                NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
                Node node = nodeList.item(0);
                return node.getNodeValue();
            }

        });
        json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                json.setEnabled(false);
                try{
                    JSONObject emp=(new JSONObject(JSON_STRING)).getJSONObject("city");
                    String cityname=emp.getString("City_Name");
                    String Latitude=emp.getString("Latitude");
                    String Longitude=emp.getString("Longitude");
                    String Temperature=emp.getString("Temperature");
                    String Humidity=emp.getString("Humidity");
                    String str="City Name : "+cityname+"\n"+"Latitude : "+Latitude+"\n"+"Longitude : "+Longitude+"\n"+"Temperature : "+Temperature+"\n"+"Humidity : "+Humidity;
                    textView1.setText(str);

                }catch (Exception e) {e.printStackTrace();}

            }

        });

    }
}
