package com.example.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/*
   Writed by yasineryigit on 24/05/2020
 */
//View classını extend ederek kendi özel drawing classımızı yazıyoruz
public class drawing extends View {
    //Path: neyi çizeceğimiz
    Path path = new Path();
    //Paint: çizeceğimiz ortam
    Paint paint = new Paint();

    //View'i extend ediyorsan constructor oluşturman, superini çağırman lazım
    //Burda painti tanımlıyoruz
    public drawing(Context c){
        super(c);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);



    }

    //Burda yaptığımız iş canvasa verdiğimiz path ve paint objelerini çizdirmek
    @Override
    protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawPath(path,paint);

    }

    //Dokunma eylemini algıladığımız yer
    //Dokunulan yerin koordinatlarına bir tane circle ekliyor
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //Dokunulan noktanın x koordinatını getirir.
        float x = event.getX();
        //Dokunulan noktanın y koordinatını getirir.
        float y = event.getY();
        //Direction parametresi burda yönle alakalı
        path.addCircle(x,y,10,Path.Direction.CW);
        //Canvasın onDraw ın içindeki metodların güncellenebilmesi için invalidate çağırmak lazm
        invalidate();
        return true;

    }
}
