package com.ihunter.recyclerviewtutorial;

import android.app.Application;

import com.mikepenz.iconics.Iconics;
import com.mikepenz.material_design_iconic_typeface_library.MaterialDesignIconic;

/**
 * Created by Master Bison on 1/28/2017.
 */

public class RecyclerViewApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Iconics.registerFont(new MaterialDesignIconic());
    }
}
