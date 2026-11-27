package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes3.dex */
public final class A00 extends AbstractC7939z00 implements T81.a {
    public static final SparseIntArray H;

    @NonNull
    public final TextView D;

    @NonNull
    public final AppCompatImageView E;
    public final T81 F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.cardView, 5);
        sparseIntArray.put(R.id.placeholder, 6);
        sparseIntArray.put(R.id.progress, 7);
        sparseIntArray.put(R.id.error, 8);
        sparseIntArray.put(R.id.statusContainer, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 10, H);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrS[2];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrS[1];
        super(interfaceC5089lS, view, appCompatImageView, constraintLayout);
        this.G = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrS[0]).setTag(null);
        TextView textView = (TextView) objArrS[3];
        this.D = textView;
        textView.setTag(null);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) objArrS[4];
        this.E = appCompatImageView2;
        appCompatImageView2.setTag(null);
        this.z.setTag(null);
        y(view);
        this.F = new T81(this, 1);
        synchronized (this) {
            this.G = 32L;
        }
        v();
    }

    @Override // defpackage.AbstractC7939z00
    public final void A(OD od) {
        this.A = od;
        synchronized (this) {
            this.G |= 8;
        }
        j(2);
        v();
    }

    @Override // defpackage.AbstractC7939z00
    public final void B(QD qd) {
        this.B = qd;
        synchronized (this) {
            this.G |= 16;
        }
        j(3);
        v();
    }

    @Override // T81.a
    public final void b(int i) {
        OD od = this.A;
        if (od != null) {
            od.t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        AbstractC4688jY0 abstractC4688jY0;
        TZ0 tz0;
        Long l;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        QD qd = this.B;
        Long l2 = null;
        abstractC4688jY0 = null;
        AbstractC4688jY0 abstractC4688jY1 = null;
        if ((55 & j) != 0) {
            if ((j & 49) == 0) {
                tz0 = null;
            } else {
                EY0 ey0 = qd != null ? qd.m : null;
                z(0, ey0);
                if (ey0 != null) {
                    tz0 = (TZ0) ey0.d();
                } else {
                    tz0 = null;
                }
            }
            if ((j & 50) == 0) {
                l = null;
            } else {
                EY0 ey1 = qd != null ? qd.j : null;
                z(1, ey1);
                if (ey1 != null) {
                    l = (Long) ey1.d();
                } else {
                    l = null;
                }
            }
            if ((j & 52) != 0) {
                EY0 ey2 = qd != null ? qd.l : null;
                z(2, ey2);
                if (ey2 != null) {
                    abstractC4688jY1 = (AbstractC4688jY0) ey2.d();
                }
            }
            abstractC4688jY0 = abstractC4688jY1;
            l2 = l;
        } else {
            abstractC4688jY0 = null;
            tz0 = null;
        }
        if ((32 & j) != 0) {
            this.y.setOnClickListener(this.F);
        }
        if ((50 & j) != 0) {
            N7.z(this.D, l2);
        }
        if ((j & 49) != 0) {
            N7.y(this.E, tz0);
        }
        if ((j & 52) != 0) {
            N7.a(this.z, abstractC4688jY0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 4;
        }
        return true;
    }
}
