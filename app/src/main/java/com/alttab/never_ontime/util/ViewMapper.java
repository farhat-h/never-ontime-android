package com.alttab.never_ontime.util;
import android.view.View;

public class ViewMapper {

    public View[] populateViews(int[] ids, View root) {
        View[] views;
        views = new View[ids.length];
        for (int i = 0; i < ids.length; i++)
            views[i] = root.findViewById(ids[i]);
        return views;
    }

}
