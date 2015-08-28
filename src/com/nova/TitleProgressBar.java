package com.nova;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * 
 * @author Xavier
 *
 */
public class TitleProgressBar extends ProgressBar {

	private Paint mPaint;
	
	private String mTitle;

	public TitleProgressBar(Context context) {
		super(context);
		init();
	}
	
	public TitleProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public TitleProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	private void init() {
		mPaint = new Paint();
		mPaint.setColor(Color.RED);
	}

	@Override
	protected synchronized void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		Rect rect = new Rect();
		this.mPaint.getTextBounds(mTitle, 0, this.mTitle.length(), rect);
		float x = getWidth()/2 - rect.centerX() ;
		float y = getHeight()/2 -rect.centerY();
		canvas.drawText(mTitle, x, y, mPaint);
		
	}
	
	public void setTitle(String title){
		mTitle = title;
	}
}
















