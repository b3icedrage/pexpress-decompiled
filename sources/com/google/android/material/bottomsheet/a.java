package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.C3006bj2;
import defpackage.K81;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements K81 {
    public final /* synthetic */ b d;

    public a(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.K81
    public final C3006bj2 N(View view, C3006bj2 c3006bj2) {
        b bVar = this.d;
        b.C0307b c0307b = bVar.q;
        if (c0307b != null) {
            bVar.j.W.remove(c0307b);
        }
        b.C0307b c0307b2 = new b.C0307b(bVar.m, c3006bj2);
        bVar.q = c0307b2;
        c0307b2.e(bVar.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.j;
        b.C0307b c0307b3 = bVar.q;
        ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(c0307b3)) {
            arrayList.add(c0307b3);
        }
        return c3006bj2;
    }
}
