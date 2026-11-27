package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: y00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7729y00 extends AbstractC7519x00 implements T81.a {
    public static final SparseIntArray I;
    public final T81 G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.bubble, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7729y00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 7, I);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArrS[3];
        super(interfaceC5089lS, view, appCompatTextView, (AppCompatTextView) objArrS[2], (ShapeableImageView) objArrS[1], (AppCompatImageView) objArrS[5], (TextView) objArrS[4]);
        this.H = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((LinearLayout) objArrS[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        y(view);
        this.G = new T81(this, 1);
        synchronized (this) {
            this.H = 64L;
        }
        v();
    }

    @Override // defpackage.AbstractC7519x00
    public final void A(HD hd) {
        this.D = hd;
        synchronized (this) {
            this.H |= 16;
        }
        j(2);
        v();
    }

    @Override // defpackage.AbstractC7519x00
    public final void B(KD kd) {
        this.E = kd;
        synchronized (this) {
            this.H |= 32;
        }
        j(3);
        v();
    }

    @Override // T81.a
    public final void b(int i) {
        HD hd = this.D;
        if (hd != null) {
            hd.s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        long j2;
        long j3;
        String str;
        TZ0 tz0;
        Long l;
        AbstractC4688jY0 abstractC4688jY0;
        EY0 ey0;
        EY0 ey1;
        EY0 ey2;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        KD kd = this.E;
        AbstractC4688jY0 abstractC4688jY1 = null;
        str = null;
        String str2 = null;
        if ((111 & j) != 0) {
            if ((j & 97) != 0) {
                EY0 ey3 = kd != null ? kd.n : null;
                j2 = 0;
                z(0, ey3);
                if (ey3 != null) {
                    tz0 = (TZ0) ey3.d();
                }
                if ((j & 98) == j2) {
                    l = null;
                } else {
                    if (kd != null) {
                        ey2 = kd.j;
                    } else {
                        ey2 = null;
                    }
                    z(1, ey2);
                    if (ey2 != null) {
                        l = (Long) ey2.d();
                    } else {
                        l = null;
                    }
                }
                if ((j & 100) != j2) {
                    if (kd != null) {
                        ey1 = kd.l;
                    } else {
                        ey1 = null;
                    }
                    j3 = 104;
                    z(2, ey1);
                    if (ey1 != null) {
                        abstractC4688jY0 = (AbstractC4688jY0) ey1.d();
                    }
                    if ((j & j3) != j2) {
                        if (kd != null) {
                            ey0 = kd.m;
                        } else {
                            ey0 = null;
                        }
                        z(3, ey0);
                        if (ey0 != null) {
                            str2 = (String) ey0.d();
                        }
                    }
                    str = str2;
                    abstractC4688jY1 = abstractC4688jY0;
                } else {
                    j3 = 104;
                }
                abstractC4688jY0 = null;
                if ((j & j3) != j2) {
                    if (kd != null) {
                        ey0 = kd.m;
                    } else {
                        ey0 = null;
                    }
                    z(3, ey0);
                    if (ey0 != null) {
                        str2 = (String) ey0.d();
                    }
                }
                str = str2;
                abstractC4688jY1 = abstractC4688jY0;
            } else {
                j2 = 0;
            }
            tz0 = null;
            if ((j & 98) == j2) {
                l = null;
            } else {
                if (kd != null) {
                    ey2 = kd.j;
                } else {
                    ey2 = null;
                }
                z(1, ey2);
                if (ey2 != null) {
                    l = (Long) ey2.d();
                } else {
                    l = null;
                }
            }
            if ((j & 100) != j2) {
                if (kd != null) {
                    ey1 = kd.l;
                } else {
                    ey1 = null;
                }
                j3 = 104;
                z(2, ey1);
                if (ey1 != null) {
                    abstractC4688jY0 = (AbstractC4688jY0) ey1.d();
                }
                if ((j & j3) != j2) {
                    if (kd != null) {
                        ey0 = kd.m;
                    } else {
                        ey0 = null;
                    }
                    z(3, ey0);
                    if (ey0 != null) {
                        str2 = (String) ey0.d();
                    }
                }
                str = str2;
                abstractC4688jY1 = abstractC4688jY0;
            } else {
                j3 = 104;
            }
            abstractC4688jY0 = null;
            if ((j & j3) != j2) {
                if (kd != null) {
                    ey0 = kd.m;
                } else {
                    ey0 = null;
                }
                z(3, ey0);
                if (ey0 != null) {
                    str2 = (String) ey0.d();
                }
            }
            str = str2;
            abstractC4688jY1 = abstractC4688jY0;
        } else {
            j2 = 0;
            j3 = 104;
            str = null;
            tz0 = null;
            l = null;
        }
        if ((64 & j) != j2) {
            this.y.setOnClickListener(this.G);
        }
        if ((j & 100) != j2) {
            N7.x(this.y, abstractC4688jY1);
            N7.w(this.z, abstractC4688jY1);
        }
        if ((j & j3) != j2) {
            N7.v(this.A, str);
        }
        if ((j & 97) != j2) {
            N7.y(this.B, tz0);
        }
        if ((j & 98) != j2) {
            N7.z(this.C, l);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
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
                this.H |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.H |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.H |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.H |= 8;
        }
        return true;
    }
}
