package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.InterfaceC6265r2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC6265r2 {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = i;
    }

    @Override // defpackage.InterfaceC6265r2
    public final boolean a(@NonNull View view) {
        View view2 = this.c;
        int i = this.d;
        this.e.E(this.a, this.b, view2, i, new int[]{0, 0});
        return true;
    }
}
