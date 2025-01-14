package com.hcilearnmix.learnmixer;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class FriendActivity extends Activity{

	RelativeLayout addGroupContainer;
	ImageView addGroup,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12
	,img13,img14,img15,img16,img17,img18,img19;
	static private int failure,istch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_friends);
		loadUI();
		dragAndDrop();
		addGroup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in =  new Intent(getApplicationContext(),GroupActivity.class);
				startActivity(in);
						
				
			}
		});
	}
	private void loadUI() {
		addGroupContainer = (RelativeLayout)findViewById(R.id.addgroupContainer);
		addGroup = (ImageView)findViewById(R.id.addGroup);
		img1 = (ImageView)findViewById(R.id.fimg_1);
		img2 = (ImageView)findViewById(R.id.fimg_2);
		img3 = (ImageView)findViewById(R.id.fimg_3);
		img4 = (ImageView)findViewById(R.id.fimg_4);
		img5 = (ImageView)findViewById(R.id.fimg_5);
		img6 = (ImageView)findViewById(R.id.fimg_6);
		img7 = (ImageView)findViewById(R.id.fimg_7);
		img8 = (ImageView)findViewById(R.id.fimg_8);
		img9 = (ImageView)findViewById(R.id.fimg_9);
		img10 = (ImageView)findViewById(R.id.fimg_10);
		img11 = (ImageView)findViewById(R.id.fimg_11);
		img12 = (ImageView)findViewById(R.id.fimg_12);
		img13 = (ImageView)findViewById(R.id.fimg_13);
		img14 = (ImageView)findViewById(R.id.fimg_14);
		img15 = (ImageView)findViewById(R.id.fimg_15);
		img16 = (ImageView)findViewById(R.id.fimg_16);
		img17 = (ImageView)findViewById(R.id.fimg_17);
		img18 = (ImageView)findViewById(R.id.fimg_18);
		img19 = (ImageView)findViewById(R.id.fimg_19);
	}

	public void dragAndDrop()
	{
		addGroupContainer.setOnDragListener(new View.OnDragListener() {



			@Override
			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch(action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP:{
					failure =1;
					//					failure = failure+1;
					return(true);
				}
				case DragEvent.ACTION_DRAG_ENDED:{
					Log.e("", "faliur"+1);
					if(istch==1&&failure==1)
					{
						img1.setVisibility(View.GONE);
						failure = 0;
						istch =0;
					}
					else if (istch==2&&failure==1)
					{
						failure = 0;
						img2.setVisibility(View.GONE);
						istch =0;
					}
					else if (istch==3&&failure==1)
					{
						failure = 0;
						img3.setVisibility(View.GONE);
						istch =0;
					}
					else if (istch==4&&failure==1)
					{failure = 0;
					img4.setVisibility(View.GONE);
					istch =0;
					}
					else  if (istch==5&&failure==1)
					{failure = 0;
					img5.setVisibility(View.GONE);
					istch =0;
					}

					//					sucess.setText("Sucessful Drops :"+suc);
					//					text.setText("Total Drops: "+total);
					return(true);
				}
				default:
					break;
				}
				return true;
			}});



		img1.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				istch=1;
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(img1);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});
		img2.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				istch=2;
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(img2);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});
		img3.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				istch=3;
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(img3);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});


		img4.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				istch=4;
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(img4);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});
		img5.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				istch=5;
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(img5);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});


	}

}
