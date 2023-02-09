package com.yiwen.mycommonlibrary;

import android.content.Context;
import android.widget.Toast;

public class myFunction {

    public void myFunction(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
