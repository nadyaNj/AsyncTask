package com.mlab.asynctask;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomFontTextView extends TextView
{

	public CustomFontTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		init(attrs);
	}

	public CustomFontTextView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		init(attrs);
	}

	public CustomFontTextView(Context context)
	{
		super(context);
	}

	private void init(AttributeSet attrs)
	{
		if (attrs != null)
		{
			TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.MyCustomFontStyle);
			String fontName = a.getString(R.styleable.MyCustomFontStyle_fontName);
			if (fontName != null)
			{
				Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + fontName + ".ttf");
				setTypeface(myTypeface);
			}
			a.recycle();
		}
	}

}
