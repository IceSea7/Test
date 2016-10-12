package com.icesea.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setContentView(R.layout.activity_main);
		//��ȡTextView,CheckBox,RadioButton
		final TextView textView = (TextView)findViewById(R.id.TextView01);
		CheckBox checkBox01 = (CheckBox)findViewById(R.id.CheckBox01);
		CheckBox checkBox02 = (CheckBox)findViewById(R.id.CheckBox02);
		RadioButton radioButton01 = (RadioButton)findViewById(R.id.RadioButton01);
		RadioButton radioButton02 = (RadioButton)findViewById(R.id.RadioButton02);
		
		//����CheckBox�Ĺ�������¼�(����������ע�ᵽͬһ����¼��ļ�����),��ѡ��ͬCheckBoxʱ�ı�TextView��ʾ������
		CheckBox.OnClickListener checkBoxListener = new CheckBox.OnClickListener(){
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
					case R.id.CheckBox01:
						//�ڲ������Ҫ�����ⲿ��ı�������ñ�������Ϊfinal
						textView.setText("this is CheckBox01"); 
					break;
					case R.id.CheckBox02:
						textView.setText("this is CheckBox02");
					default:
					break;
				}
			}
		};
		checkBox01.setOnClickListener(checkBoxListener);
		checkBox02.setOnClickListener(checkBoxListener);
		
		//����RadioButton�Ĺ�������¼�
		RadioButton.OnClickListener radioButtonListener = new RadioButton.OnClickListener(){
			@Override
			public void onClick(View v){
				switch (v.getId()) {
					case R.id.RadioButton01:
						textView.setText("this is RadioButton01 is modify");
						break;
					case R.id.RadioButton02:
						textView.setText("this is RadioButton02");
						break;
					default:
						break;
				}
			}
		};
		radioButton01.setOnClickListener(radioButtonListener);
		radioButton02.setOnClickListener(radioButtonListener);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
