package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes3.dex */
public final class C00 extends B00 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.bubble, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 5, E);
        super(interfaceC5089lS, view, (AppCompatTextView) objArrS[1], (AppCompatImageView) objArrS[3], (TextView) objArrS[2]);
        this.D = -1L;
        ((LinearLayout) objArrS[0]).setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        y(view);
        synchronized (this) {
            this.D = 16L;
        }
        v();
    }

    @Override // defpackage.B00
    public final void A(C2677aE c2677aE) {
        this.B = c2677aE;
        synchronized (this) {
            this.D |= 8;
        }
        j(3);
        v();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        Long l;
        TZ0 tz0;
        String str;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        C2677aE c2677aE = this.B;
        String str2 = null;
        l = null;
        Long l2 = null;
        if ((31 & j) != 0) {
            if ((j & 25) == 0) {
                str = null;
            } else {
                EY0 ey0 = c2677aE != null ? c2677aE.k : null;
                z(0, ey0);
                if (ey0 != null) {
                    str = (String) ey0.d();
                } else {
                    str = null;
                }
            }
            if ((j & 26) == 0) {
                tz0 = null;
            } else {
                EY0 ey1 = c2677aE != null ? c2677aE.l : null;
                z(1, ey1);
                if (ey1 != null) {
                    tz0 = (TZ0) ey1.d();
                } else {
                    tz0 = null;
                }
            }
            if ((j & 28) != 0) {
                EY0 ey2 = c2677aE != null ? c2677aE.j : null;
                z(2, ey2);
                if (ey2 != null) {
                    l2 = (Long) ey2.d();
                }
            }
            l = l2;
            str2 = str;
        } else {
            l = null;
            tz0 = null;
        }
        if ((25 & j) != 0) {
            C4689jY1.a(this.y, str2);
        }
        if ((26 & j) != 0) {
            N7.y(this.z, tz0);
        }
        if ((j & 28) != 0) {
            N7.z(this.A, l);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
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
                this.D |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.D |= 2;
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
            this.D |= 4;
        }
        return true;
    }
}
