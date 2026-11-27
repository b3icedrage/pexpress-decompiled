package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3249cu implements Fe2.b {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ BottomSheetBehavior b;

    public C3249cu(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.b = bottomSheetBehavior;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    @Override // Fe2.b
    public final C3006bj2 a(View view, C3006bj2 c3006bj2, Fe2.c cVar) {
        boolean z;
        C3006bj2.k kVar = c3006bj2.a;
        LA0 la0F = kVar.f(7);
        LA0 la0F2 = kVar.f(32);
        int i = la0F.b;
        BottomSheetBehavior bottomSheetBehavior = this.b;
        bottomSheetBehavior.w = i;
        boolean zC = Fe2.c(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.o) {
            int iA = c3006bj2.a();
            bottomSheetBehavior.v = iA;
            paddingBottom = iA + cVar.d;
        }
        boolean z2 = bottomSheetBehavior.p;
        int i2 = la0F.a;
        if (z2) {
            paddingLeft = (zC ? cVar.c : cVar.a) + i2;
        }
        boolean z3 = bottomSheetBehavior.q;
        int i3 = la0F.c;
        if (z3) {
            paddingRight = (zC ? cVar.a : cVar.c) + i3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z4 = true;
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i2) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i3) {
            marginLayoutParams.rightMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = la0F.b;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
            } else {
                z4 = z;
            }
        } else {
            z4 = z;
        }
        if (z4) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z5 = this.a;
        if (z5) {
            bottomSheetBehavior.m = la0F2.d;
        }
        if (!bottomSheetBehavior.o && !z5) {
            return c3006bj2;
        }
        bottomSheetBehavior.J();
        return c3006bj2;
    }
}
