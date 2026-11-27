package com.google.android.material.tabs;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnLayoutChangeListener {
    public final /* synthetic */ View d;
    public final /* synthetic */ TabLayout.h e;

    public b(TabLayout.h hVar, View view) {
        this.e = hVar;
        this.d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.d;
        if (view2.getVisibility() == 0) {
            this.e.c(view2);
        }
    }
}
