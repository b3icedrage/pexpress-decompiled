package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.C5345me2;
import defpackage.Cd2;
import defpackage.InterfaceC6586sa0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View d;
        public final /* synthetic */ int e;
        public final /* synthetic */ InterfaceC6586sa0 g;

        public a(View view, int i, InterfaceC6586sa0 interfaceC6586sa0) {
            this.d = view;
            this.e = i;
            this.g = interfaceC6586sa0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.d;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.e) {
                InterfaceC6586sa0 interfaceC6586sa0 = this.g;
                expandableBehavior.s((View) interfaceC6586sa0, view, interfaceC6586sa0.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC6586sa0 interfaceC6586sa0 = (InterfaceC6586sa0) view2;
        if (interfaceC6586sa0.a()) {
            int i = this.a;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.a != 1) {
            return false;
        }
        this.a = interfaceC6586sa0.a() ? 1 : 2;
        s((View) interfaceC6586sa0, view, interfaceC6586sa0.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        InterfaceC6586sa0 interfaceC6586sa0;
        int i2;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (!view.isLaidOut()) {
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    interfaceC6586sa0 = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i3);
                if (b(view, view2)) {
                    interfaceC6586sa0 = (InterfaceC6586sa0) view2;
                    break;
                }
                i3++;
            }
            if (interfaceC6586sa0 != null && (!interfaceC6586sa0.a() ? this.a == 1 : !((i2 = this.a) != 0 && i2 != 2))) {
                int i4 = interfaceC6586sa0.a() ? 1 : 2;
                this.a = i4;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, interfaceC6586sa0));
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
