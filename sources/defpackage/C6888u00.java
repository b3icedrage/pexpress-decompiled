package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: u00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6888u00 extends AbstractC6678t00 implements T81.a {
    public static final SparseIntArray H;
    public final T81 F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.cardView, 5);
        sparseIntArray.put(R.id.placeholder, 6);
        sparseIntArray.put(R.id.progress, 7);
        sparseIntArray.put(R.id.error, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6888u00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 9, H);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrS[1];
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) objArrS[3];
        LinearLayout linearLayout = (LinearLayout) objArrS[2];
        super(interfaceC5089lS, view, appCompatImageView, appCompatImageView2, linearLayout, (TextView) objArrS[4]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        ((FrameLayout) objArrS[0]).setTag(null);
        this.B.setTag(null);
        y(view);
        this.F = new T81(this, 1);
        synchronized (this) {
            this.G = 64L;
        }
        v();
    }

    @Override // defpackage.AbstractC6678t00
    public final void A(I8 i8) {
        this.C = i8;
        synchronized (this) {
            this.G |= 16;
        }
        j(2);
        v();
    }

    @Override // defpackage.AbstractC6678t00
    public final void B(J8 j8) {
        this.D = j8;
        synchronized (this) {
            this.G |= 32;
        }
        j(3);
        v();
    }

    @Override // T81.a
    public final void b(int i) {
        I8 i8 = this.C;
        if (i8 != null) {
            i8.t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        long j2;
        long j3;
        AbstractC4688jY0 abstractC4688jY0;
        C7129v8 c7129v8;
        Long l;
        long j4;
        EY0 ey0;
        boolean zW;
        long j5;
        EY0 ey1;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        J8 j8 = this.D;
        int i = 0;
        if ((111 & j) != 0) {
            if ((j & 97) == 0) {
                l = null;
            } else {
                EY0 ey2 = j8 != null ? j8.j : null;
                z(0, ey2);
                if (ey2 != null) {
                    l = (Long) ey2.d();
                } else {
                    l = null;
                }
            }
            if ((j & 98) != 0) {
                j2 = 0;
                EY0 ey3 = j8 != null ? j8.l : null;
                z(1, ey3);
                if (ey3 != null) {
                    abstractC4688jY0 = (AbstractC4688jY0) ey3.d();
                }
                if ((j & 100) != j2) {
                    if (j8 != null) {
                        ey1 = j8.e;
                    } else {
                        ey1 = null;
                    }
                    j3 = 104;
                    z(2, ey1);
                    if (ey1 != null) {
                        c7129v8 = (C7129v8) ey1.d();
                    }
                    j4 = j & j3;
                    if (j4 != j2) {
                        if (j8 != null) {
                            ey0 = j8.f;
                        } else {
                            ey0 = null;
                        }
                        z(3, ey0);
                        zW = ViewDataBinding.w(ey0 != null ? (Boolean) ey0.d() : null);
                        if (j4 != j2) {
                            if (zW) {
                                j5 = 256;
                            } else {
                                j5 = 128;
                            }
                            j |= j5;
                        }
                        if (!zW) {
                            i = 8;
                        }
                    }
                } else {
                    j3 = 104;
                }
                c7129v8 = null;
                j4 = j & j3;
                if (j4 != j2) {
                    if (j8 != null) {
                        ey0 = j8.f;
                    } else {
                        ey0 = null;
                    }
                    z(3, ey0);
                    zW = ViewDataBinding.w(ey0 != null ? (Boolean) ey0.d() : null);
                    if (j4 != j2) {
                        if (zW) {
                            j5 = 256;
                        } else {
                            j5 = 128;
                        }
                        j |= j5;
                    }
                    if (!zW) {
                        i = 8;
                    }
                }
            } else {
                j2 = 0;
            }
            abstractC4688jY0 = null;
            if ((j & 100) != j2) {
                if (j8 != null) {
                    ey1 = j8.e;
                } else {
                    ey1 = null;
                }
                j3 = 104;
                z(2, ey1);
                if (ey1 != null) {
                    c7129v8 = (C7129v8) ey1.d();
                }
                j4 = j & j3;
                if (j4 != j2) {
                    if (j8 != null) {
                        ey0 = j8.f;
                    } else {
                        ey0 = null;
                    }
                    z(3, ey0);
                    zW = ViewDataBinding.w(ey0 != null ? (Boolean) ey0.d() : null);
                    if (j4 != j2) {
                        if (zW) {
                            j5 = 256;
                        } else {
                            j5 = 128;
                        }
                        j |= j5;
                    }
                    if (!zW) {
                        i = 8;
                    }
                }
            } else {
                j3 = 104;
            }
            c7129v8 = null;
            j4 = j & j3;
            if (j4 != j2) {
                if (j8 != null) {
                    ey0 = j8.f;
                } else {
                    ey0 = null;
                }
                z(3, ey0);
                zW = ViewDataBinding.w(ey0 != null ? (Boolean) ey0.d() : null);
                if (j4 != j2) {
                    if (zW) {
                        j5 = 256;
                    } else {
                        j5 = 128;
                    }
                    j |= j5;
                }
                if (!zW) {
                    i = 8;
                }
            }
        } else {
            j2 = 0;
            j3 = 104;
            abstractC4688jY0 = null;
            c7129v8 = null;
            l = null;
        }
        if ((j & j3) != j2) {
            this.y.setVisibility(i);
        }
        if ((j & 100) != j2) {
            N7.r(this.y, c7129v8);
        }
        if ((64 & j) != j2) {
            this.z.setOnClickListener(this.F);
        }
        if ((j & 98) != j2) {
            N7.a(this.A, abstractC4688jY0);
        }
        if ((j & 97) != j2) {
            N7.z(this.B, l);
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
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 4;
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
            this.G |= 8;
        }
        return true;
    }
}
