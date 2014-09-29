package com.kyon.ui.kcoverflow.activity;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.kyon.ui.kcoverflow.glutils.KGLSurfaceView;


public class OpenGLES20Activity extends Activity {

    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        mGLView = new KGLSurfaceView(this);
        setContentView(mGLView);
    }


}
