package com.example.kite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class books extends Activity {
	Button newp,viewp;
	ListView book;
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	      setContentView(R.layout.books);
	    book=(ListView)findViewById(R.id.book);
	    newp=(Button)findViewById(R.id.newp);
	    viewp=(Button)findViewById(R.id.viewp);
	    newp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				
				Intent k = new Intent(books.this,post.class);
				startActivity(k);  
			}
		});
	    viewp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				
				Intent k = new Intent(books.this,view.class);
				startActivity(k);  
			}
		});
	}
}