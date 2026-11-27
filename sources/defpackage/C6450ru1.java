package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: ru1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6450ru1 extends KK1 {
    public final SideSheetBehavior<? extends View> a;

    public C6450ru1(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.n);
    }
}
