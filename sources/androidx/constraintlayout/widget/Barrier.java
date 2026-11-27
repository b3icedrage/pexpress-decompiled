package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import defpackage.C2425Xl1;
import defpackage.C6017pq;
import defpackage.C6641so0;
import defpackage.TK;
import defpackage.UK;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {
    public int m;
    public int n;
    public C6017pq o;

    public Barrier(Context context) {
        super(context);
        this.d = new int[32];
        this.k = null;
        this.l = new HashMap<>();
        this.g = context;
        j(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.o.x0;
    }

    public int getMargin() {
        return this.o.y0;
    }

    public int getType() {
        return this.m;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.o = new C6017pq();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2425Xl1.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.o.x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.o.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.h = this.o;
        n();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void k(c.a aVar, C6641so0 c6641so0, d.a aVar2, SparseArray sparseArray) {
        super.k(aVar, c6641so0, aVar2, sparseArray);
        if (c6641so0 instanceof C6017pq) {
            C6017pq c6017pq = (C6017pq) c6641so0;
            boolean z = ((UK) c6641so0.V).z0;
            c.b bVar = aVar.e;
            o(c6017pq, bVar.g0, z);
            c6017pq.x0 = bVar.o0;
            c6017pq.y0 = bVar.h0;
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public final void l(TK tk, boolean z) {
        o(tk, this.m, z);
    }

    public final void o(TK tk, int i, boolean z) {
        this.n = i;
        if (z) {
            int i2 = this.m;
            if (i2 == 5) {
                this.n = 1;
            } else if (i2 == 6) {
                this.n = 0;
            }
        } else {
            int i3 = this.m;
            if (i3 == 5) {
                this.n = 0;
            } else if (i3 == 6) {
                this.n = 1;
            }
        }
        if (tk instanceof C6017pq) {
            ((C6017pq) tk).w0 = this.n;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.x0 = z;
    }

    public void setDpMargin(int i) {
        this.o.y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.o.y0 = i;
    }

    public void setType(int i) {
        this.m = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
