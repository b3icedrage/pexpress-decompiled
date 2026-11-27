package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public class Xd2<V extends View> extends CoordinatorLayout.c<V> {
    public Yd2 a;
    public int b;

    public Xd2() {
        this.b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        u(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new Yd2(v);
        }
        Yd2 yd2 = this.a;
        View view = yd2.a;
        yd2.b = view.getTop();
        yd2.c = view.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        Yd2 yd3 = this.a;
        if (yd3.d != i2) {
            yd3.d = i2;
            yd3.a();
        }
        this.b = 0;
        return true;
    }

    public final int s() {
        Yd2 yd2 = this.a;
        if (yd2 != null) {
            return yd2.d;
        }
        return 0;
    }

    public int t() {
        return s();
    }

    public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.r(v, i);
    }

    public Xd2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
