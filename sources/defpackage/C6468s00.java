package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: s00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6468s00 extends AbstractC6258r00 implements T81.a {
    public final T81 I;
    public long J;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6468s00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 8, null);
        super(interfaceC5089lS, view, (AppCompatTextView) objArrS[6], (TextView) objArrS[2], (AppCompatImageView) objArrS[1], (AppCompatTextView) objArrS[5], (AppCompatTextView) objArrS[3], (ShapeableImageView) objArrS[4], (TextView) objArrS[7]);
        this.J = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ((FrameLayout) objArrS[0]).setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        y(view);
        this.I = new T81(this, 1);
        synchronized (this) {
            this.J = 1024L;
        }
        v();
    }

    @Override // defpackage.AbstractC6258r00
    public final void A(C8 c8) {
        this.F = c8;
        synchronized (this) {
            this.J |= 256;
        }
        j(2);
        v();
    }

    @Override // defpackage.AbstractC6258r00
    public final void B(E8 e8) {
        this.G = e8;
        synchronized (this) {
            this.J |= 512;
        }
        j(3);
        v();
    }

    @Override // T81.a
    public final void b(int i) {
        C8 c8 = this.F;
        if (c8 != null) {
            c8.s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142 A[PHI: r2
      0x0142: PHI (r2v8 long) = (r2v7 long), (r2v10 long) binds: [B:95:0x0114, B:109:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[PHI: r2
      0x006f: PHI (r2v3 long) = (r2v0 long), (r2v15 long) binds: [B:18:0x0042, B:32:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db A[PHI: r2
      0x00db: PHI (r2v5 long) = (r2v4 long), (r2v13 long) binds: [B:57:0x00af, B:71:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        long j2;
        long j3;
        long j4;
        String str;
        boolean z;
        AbstractC4688jY0 abstractC4688jY0;
        int i;
        int i2;
        int i3;
        Long l;
        C7129v8 c7129v8;
        String str2;
        String string;
        int i4;
        C7129v8 c7129v9;
        long j5;
        long j6;
        boolean z2;
        long j7;
        EY0 ey0;
        EY0 ey1;
        Boolean bool;
        boolean zW;
        long j8;
        EY0 ey2;
        long j9;
        EY0 ey3;
        Boolean bool2;
        boolean zW2;
        long j10;
        EY0 ey4;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        E8 e8 = this.G;
        if ((1791 & j) != 0) {
            if ((j & 1537) == 0) {
                l = null;
            } else {
                EY0 ey5 = e8 != null ? e8.j : null;
                z(0, ey5);
                if (ey5 != null) {
                    l = (Long) ey5.d();
                } else {
                    l = null;
                }
            }
            long j11 = j & 1538;
            if (j11 == 0) {
                i4 = 0;
            } else {
                EY0 ey6 = e8 != null ? e8.i : null;
                z(1, ey6);
                boolean zW3 = ViewDataBinding.w(ey6 != null ? (Boolean) ey6.d() : null);
                if (j11 != 0) {
                    j |= zW3 ? 65536L : 32768L;
                }
                if (zW3) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            }
            if ((j & 1540) != 0) {
                EY0 ey7 = e8 != null ? e8.l : null;
                j3 = 1664;
                z(2, ey7);
                AbstractC4688jY0 abstractC4688jY1 = ey7 != null ? (AbstractC4688jY0) ey7.d() : null;
                if ((j & 1544) == 0) {
                    c7129v9 = null;
                } else {
                    if (e8 != null) {
                        ey4 = e8.e;
                    } else {
                        ey4 = null;
                    }
                    z(3, ey4);
                    if (ey4 != null) {
                        c7129v9 = (C7129v8) ey4.d();
                    } else {
                        c7129v9 = null;
                    }
                }
                j5 = j & 1552;
                j4 = 1600;
                if (j5 == 0) {
                    i3 = 0;
                } else {
                    if (e8 != null) {
                        ey3 = e8.h;
                    } else {
                        ey3 = null;
                    }
                    z(4, ey3);
                    if (ey3 != null) {
                        bool2 = (Boolean) ey3.d();
                    } else {
                        bool2 = null;
                    }
                    zW2 = ViewDataBinding.w(bool2);
                    if (j5 != 0) {
                        if (zW2) {
                            j10 = 16384;
                        } else {
                            j10 = 8192;
                        }
                        j |= j10;
                    }
                    if (zW2) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                }
                j6 = j & 1568;
                if (j6 != 0) {
                    if (e8 != null) {
                        ey2 = e8.g;
                    } else {
                        ey2 = null;
                    }
                    j2 = 1568;
                    z(5, ey2);
                    if (ey2 != null) {
                        str2 = (String) ey2.d();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j6 != 0) {
                        if (z2) {
                            j9 = 4096;
                        } else {
                            j9 = 2048;
                        }
                        j |= j9;
                    }
                } else {
                    j2 = 1568;
                    str2 = null;
                    z2 = false;
                }
                j7 = j & 1600;
                if (j7 == 0) {
                    i = 0;
                } else {
                    if (e8 != null) {
                        ey1 = e8.f;
                    } else {
                        ey1 = null;
                    }
                    z(6, ey1);
                    if (ey1 != null) {
                        bool = (Boolean) ey1.d();
                    } else {
                        bool = null;
                    }
                    zW = ViewDataBinding.w(bool);
                    if (j7 != 0) {
                        if (zW) {
                            j8 = 262144;
                        } else {
                            j8 = 131072;
                        }
                        j |= j8;
                    }
                    if (zW) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                }
                if ((j & j3) == 0) {
                    str = null;
                } else {
                    if (e8 != null) {
                        ey0 = e8.m;
                    } else {
                        ey0 = null;
                    }
                    z(7, ey0);
                    if (ey0 != null) {
                        str = (String) ey0.d();
                    } else {
                        str = null;
                    }
                }
                c7129v8 = c7129v9;
                i2 = i4;
                abstractC4688jY0 = abstractC4688jY1;
                z = z2;
            } else {
                j3 = 1664;
            }
            if ((j & 1544) == 0) {
                c7129v9 = null;
            } else {
                if (e8 != null) {
                    ey4 = e8.e;
                } else {
                    ey4 = null;
                }
                z(3, ey4);
                if (ey4 != null) {
                    c7129v9 = (C7129v8) ey4.d();
                } else {
                    c7129v9 = null;
                }
            }
            j5 = j & 1552;
            j4 = 1600;
            if (j5 == 0) {
                i3 = 0;
            } else {
                if (e8 != null) {
                    ey3 = e8.h;
                } else {
                    ey3 = null;
                }
                z(4, ey3);
                if (ey3 != null) {
                    bool2 = (Boolean) ey3.d();
                } else {
                    bool2 = null;
                }
                zW2 = ViewDataBinding.w(bool2);
                if (j5 != 0) {
                    if (zW2) {
                        j10 = 16384;
                    } else {
                        j10 = 8192;
                    }
                    j |= j10;
                }
                if (zW2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
            }
            j6 = j & 1568;
            if (j6 != 0) {
                if (e8 != null) {
                    ey2 = e8.g;
                } else {
                    ey2 = null;
                }
                j2 = 1568;
                z(5, ey2);
                if (ey2 != null) {
                    str2 = (String) ey2.d();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (j6 != 0) {
                    if (z2) {
                        j9 = 4096;
                    } else {
                        j9 = 2048;
                    }
                    j |= j9;
                }
            } else {
                j2 = 1568;
                str2 = null;
                z2 = false;
            }
            j7 = j & 1600;
            if (j7 == 0) {
                i = 0;
            } else {
                if (e8 != null) {
                    ey1 = e8.f;
                } else {
                    ey1 = null;
                }
                z(6, ey1);
                if (ey1 != null) {
                    bool = (Boolean) ey1.d();
                } else {
                    bool = null;
                }
                zW = ViewDataBinding.w(bool);
                if (j7 != 0) {
                    if (zW) {
                        j8 = 262144;
                    } else {
                        j8 = 131072;
                    }
                    j |= j8;
                }
                if (zW) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            if ((j & j3) == 0) {
                str = null;
            } else {
                if (e8 != null) {
                    ey0 = e8.m;
                } else {
                    ey0 = null;
                }
                z(7, ey0);
                if (ey0 != null) {
                    str = (String) ey0.d();
                } else {
                    str = null;
                }
            }
            c7129v8 = c7129v9;
            i2 = i4;
            abstractC4688jY0 = abstractC4688jY1;
            z = z2;
        } else {
            j2 = 1568;
            j3 = 1664;
            j4 = 1600;
            str = null;
            z = false;
            abstractC4688jY0 = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            l = null;
            c7129v8 = null;
            str2 = null;
        }
        long j12 = j & j2;
        if (j12 != 0) {
            string = z ? this.z.getResources().getString(R.string.agent_name_default) : str2;
        } else {
            string = null;
        }
        if ((j & 1024) != 0) {
            this.y.setOnClickListener(this.I);
        }
        if ((j & 1540) != 0) {
            N7.x(this.y, abstractC4688jY0);
            N7.w(this.B, abstractC4688jY0);
        }
        if (j12 != 0) {
            C4689jY1.a(this.z, string);
        }
        if ((j & 1552) != 0) {
            this.z.setVisibility(i3);
        }
        if ((j & j4) != 0) {
            this.A.setVisibility(i);
        }
        if ((j & 1544) != 0) {
            N7.r(this.A, c7129v8);
        }
        if ((j & 1538) != 0) {
            this.C.setVisibility(i2);
        }
        if ((j & j3) != 0) {
            N7.v(this.D, str);
        }
        if ((j & 1537) != 0) {
            N7.z(this.E, l);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 1;
                    break;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 2;
                    break;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 4;
                    break;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 8;
                    break;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 16;
                    break;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 32;
                    break;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 64;
                    break;
                }
                return true;
            case 7:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 128;
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
