package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.chip.ChipGroup;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: w00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7308w00 extends AbstractC7098v00 {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.messageContainer, 5);
        sparseIntArray.put(R.id.message, 6);
        sparseIntArray.put(R.id.buttons, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7308w00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 8, H);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArrS[2];
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrS[1];
        ChipGroup chipGroup = (ChipGroup) objArrS[7];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArrS[3];
        TextView textView = (TextView) objArrS[6];
        super(interfaceC5089lS, view, appCompatTextView, appCompatImageView, chipGroup, appCompatTextView2, textView, (TextView) objArrS[4]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrS[0]).setTag(null);
        this.D.setTag(null);
        y(view);
        synchronized (this) {
            this.G = 128L;
        }
        v();
    }

    @Override // defpackage.AbstractC7098v00
    public final void A(C5454n9 c5454n9) {
        this.E = c5454n9;
        synchronized (this) {
            this.G |= 64;
        }
        j(3);
        v();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 long) = (r2v0 long), (r2v7 long) binds: [B:18:0x003d, B:32:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        long j2;
        int i;
        int i2;
        String str;
        C7129v8 c7129v8;
        Long l;
        Long l2;
        int i3;
        C7129v8 c7129v9;
        String str2;
        long j3;
        EY0 ey0;
        Boolean bool;
        boolean zW;
        long j4;
        EY0 ey1;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        C5454n9 c5454n9 = this.E;
        if ((223 & j) != 0) {
            if ((j & 193) == 0) {
                l2 = null;
            } else {
                EY0 ey2 = c5454n9 != null ? c5454n9.j : null;
                z(0, ey2);
                if (ey2 != null) {
                    l2 = (Long) ey2.d();
                } else {
                    l2 = null;
                }
            }
            long j5 = j & 194;
            if (j5 == 0) {
                i3 = 0;
            } else {
                EY0 ey3 = c5454n9 != null ? c5454n9.i : null;
                z(1, ey3);
                boolean zW2 = ViewDataBinding.w(ey3 != null ? (Boolean) ey3.d() : null);
                if (j5 != 0) {
                    j |= zW2 ? 512L : 256L;
                }
                if (zW2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
            }
            if ((j & 196) != 0) {
                EY0 ey4 = c5454n9 != null ? c5454n9.e : null;
                j2 = 208;
                z(2, ey4);
                c7129v9 = ey4 != null ? (C7129v8) ey4.d() : null;
                if ((j & 200) == 0) {
                    str2 = null;
                } else {
                    if (c5454n9 != null) {
                        ey1 = c5454n9.g;
                    } else {
                        ey1 = null;
                    }
                    z(3, ey1);
                    if (ey1 != null) {
                        str2 = (String) ey1.d();
                    } else {
                        str2 = null;
                    }
                }
                j3 = j & j2;
                if (j3 != 0) {
                    if (c5454n9 != null) {
                        ey0 = c5454n9.f;
                    } else {
                        ey0 = null;
                    }
                    z(4, ey0);
                    if (ey0 != null) {
                        bool = (Boolean) ey0.d();
                    } else {
                        bool = null;
                    }
                    zW = ViewDataBinding.w(bool);
                    if (j3 != 0) {
                        if (zW) {
                            j4 = 2048;
                        } else {
                            j4 = 1024;
                        }
                        j |= j4;
                    }
                    int i4 = zW ? 0 : 8;
                    Long l3 = l2;
                    c7129v8 = c7129v9;
                    str = str2;
                    l = l3;
                    i = i3;
                    i2 = i4;
                } else {
                    Long l4 = l2;
                    c7129v8 = c7129v9;
                    str = str2;
                    l = l4;
                    i = i3;
                    i2 = 0;
                }
            } else {
                j2 = 208;
            }
            if ((j & 200) == 0) {
                str2 = null;
            } else {
                if (c5454n9 != null) {
                    ey1 = c5454n9.g;
                } else {
                    ey1 = null;
                }
                z(3, ey1);
                if (ey1 != null) {
                    str2 = (String) ey1.d();
                } else {
                    str2 = null;
                }
            }
            j3 = j & j2;
            if (j3 != 0) {
                if (c5454n9 != null) {
                    ey0 = c5454n9.f;
                } else {
                    ey0 = null;
                }
                z(4, ey0);
                if (ey0 != null) {
                    bool = (Boolean) ey0.d();
                } else {
                    bool = null;
                }
                zW = ViewDataBinding.w(bool);
                if (j3 != 0) {
                    if (zW) {
                        j4 = 2048;
                    } else {
                        j4 = 1024;
                    }
                    j |= j4;
                }
                if (zW) {
                }
                Long l5 = l2;
                c7129v8 = c7129v9;
                str = str2;
                l = l5;
                i = i3;
                i2 = i4;
            } else {
                Long l6 = l2;
                c7129v8 = c7129v9;
                str = str2;
                l = l6;
                i = i3;
                i2 = 0;
            }
        } else {
            j2 = 208;
            i = 0;
            i2 = 0;
            str = null;
            c7129v8 = null;
            l = null;
        }
        if ((j & 200) != 0) {
            AppCompatTextView view = this.y;
            Intrinsics.checkNotNullParameter(view, "view");
            if (str == null || StringsKt.I(str)) {
                view.setText(R.string.agent_name_default);
            } else {
                view.setText(str);
            }
        }
        if ((j & j2) != 0) {
            this.z.setVisibility(i2);
        }
        if ((j & 196) != 0) {
            N7.r(this.z, c7129v8);
        }
        if ((j & 194) != 0) {
            this.B.setVisibility(i);
        }
        if ((j & 193) != 0) {
            N7.z(this.D, l);
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
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 8;
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 16;
        }
        return true;
    }
}
