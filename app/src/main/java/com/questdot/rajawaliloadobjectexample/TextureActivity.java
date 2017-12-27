package com.questdot.rajawaliloadobjectexample;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import org.rajawali3d.view.ISurface;
import org.rajawali3d.view.SurfaceView;


public class TextureActivity extends AppCompatActivity {

    TextureRenderer textureRenderer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texture);

        final SurfaceView surface = new SurfaceView(this);
        surface.setFrameRate(60.0);
        surface.setRenderMode(ISurface.RENDERMODE_WHEN_DIRTY);

        // Add mSurface to your root view
        addContentView(surface, new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT));

        textureRenderer = new TextureRenderer(this);
        surface.setSurfaceRenderer(textureRenderer);
    }
}
