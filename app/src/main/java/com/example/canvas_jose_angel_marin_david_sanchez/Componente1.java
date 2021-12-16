package com.example.canvas_jose_angel_marin_david_sanchez;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class Componente1 extends View {

    public Componente1(Context context, AttributeSet argumentos) {
        super(context,argumentos);
    }
    boolean chequeado=false;
    protected void onDraw(Canvas canvas){
        Paint pincel= new Paint();
        pincel.setColor(0xffff0000);
        pincel.setStrokeWidth(5);
        if(chequeado==true){
            pincel.setStyle(Paint.Style.STROKE);

        }else if(chequeado==false){
            pincel.setStyle(Paint.Style.FILL_AND_STROKE);

        }
        canvas.drawCircle(100,200,50, pincel);

    }

    public boolean onTouchEvent(MotionEvent tocado){
        if(tocado.getAction()==MotionEvent.ACTION_DOWN){
            chequeado=!chequeado;
        }
        invalidate();
        return true;
    }
    public boolean getEstado(){
        return chequeado;
    }


}
