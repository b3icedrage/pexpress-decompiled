package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import defpackage.InterfaceC6265r2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC6265r2 {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public c(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.InterfaceC6265r2
    public final boolean a(@NonNull View view) {
        this.a.setExpanded(this.b);
        return true;
    }
}
