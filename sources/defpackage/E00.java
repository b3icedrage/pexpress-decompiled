package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.jivosite.sdk.model.repository.contacts.ContactForm;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E00 extends D00 implements T81.a {
    public static final SparseIntArray O;

    @NonNull
    public final TextInputLayout F;

    @NonNull
    public final TextInputLayout G;

    @NonNull
    public final TextInputLayout H;

    @NonNull
    public final AppCompatTextView I;
    public final T81 J;
    public final a K;
    public final b L;
    public final c M;
    public long N;

    public class a implements AC0 {
        public a() {
        }

        @Override // defpackage.AC0
        public final void a() {
            EY0<String> ey0;
            E00 e00 = E00.this;
            String string = e00.A.getText().toString();
            C6960uL c6960uL = e00.D;
            if (c6960uL == null || (ey0 = c6960uL.i) == null) {
                return;
            }
            ey0.k(string);
        }
    }

    public class b implements AC0 {
        public b() {
        }

        @Override // defpackage.AC0
        public final void a() {
            EY0<String> ey0;
            E00 e00 = E00.this;
            String string = e00.B.getText().toString();
            C6960uL c6960uL = e00.D;
            if (c6960uL == null || (ey0 = c6960uL.g) == null) {
                return;
            }
            ey0.k(string);
        }
    }

    public class c implements AC0 {
        public c() {
        }

        @Override // defpackage.AC0
        public final void a() {
            EY0<String> ey0;
            E00 e00 = E00.this;
            String string = e00.C.getText().toString();
            C6960uL c6960uL = e00.D;
            if (c6960uL == null || (ey0 = c6960uL.h) == null) {
                return;
            }
            ey0.k(string);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.contactFormPlaceholder, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public E00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 10, O);
        super(interfaceC5089lS, view, (AppCompatTextView) objArrS[9], (MaterialButton) objArrS[7], (TextInputEditText) objArrS[6], (TextInputEditText) objArrS[2], (TextInputEditText) objArrS[4]);
        this.K = new a();
        this.L = new b();
        this.M = new c();
        this.N = -1L;
        ((LinearLayoutCompat) objArrS[0]).setTag(null);
        TextInputLayout textInputLayout = (TextInputLayout) objArrS[1];
        this.F = textInputLayout;
        textInputLayout.setTag(null);
        TextInputLayout textInputLayout2 = (TextInputLayout) objArrS[3];
        this.G = textInputLayout2;
        textInputLayout2.setTag(null);
        TextInputLayout textInputLayout3 = (TextInputLayout) objArrS[5];
        this.H = textInputLayout3;
        textInputLayout3.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArrS[8];
        this.I = appCompatTextView;
        appCompatTextView.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        y(view);
        this.J = new T81(this, 1);
        synchronized (this) {
            this.N = 2048L;
        }
        v();
    }

    @Override // defpackage.D00
    public final void A(C6960uL c6960uL) {
        this.D = c6960uL;
        synchronized (this) {
            this.N |= 1024;
        }
        j(3);
        v();
    }

    @Override // T81.a
    public final void b(int i) {
        C6960uL c6960uL = this.D;
        if (c6960uL != null) {
            EY0<String> ey0 = c6960uL.g;
            String strD = ey0.d();
            if (strD == null) {
                throw new IllegalStateException("Value is null for ".concat(ey0.getClass().getSimpleName()));
            }
            Intrinsics.checkNotNullExpressionValue(strD, "name.requireValue()");
            String str = strD;
            EY0<String> ey1 = c6960uL.h;
            String strD2 = ey1.d();
            if (strD2 == null) {
                throw new IllegalStateException("Value is null for ".concat(ey1.getClass().getSimpleName()));
            }
            Intrinsics.checkNotNullExpressionValue(strD2, "phone.requireValue()");
            String str2 = strD2;
            EY0<String> ey2 = c6960uL.i;
            String strD3 = ey2.d();
            if (strD3 == null) {
                throw new IllegalStateException("Value is null for ".concat(ey2.getClass().getSimpleName()));
            }
            Intrinsics.checkNotNullExpressionValue(strD3, "email.requireValue()");
            c6960uL.e.t(new ContactForm(str, str2, strD3, 0L, 8, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0155  */
    /* JADX WARN: Code duplicated, block: B:109:0x0158  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0165  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b A[PHI: r2
      0x017b: PHI (r2v3 long) = (r2v2 long), (r2v6 long) binds: [B:106:0x0151, B:120:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:151:0x0207  */
    /* JADX WARN: Code duplicated, block: B:154:0x0212  */
    /* JADX WARN: Code duplicated, block: B:157:0x021d  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0108  */
    /* JADX WARN: Code duplicated, block: B:88:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean zW;
        boolean zW2;
        boolean zW3;
        boolean zW4;
        String strD;
        boolean z;
        boolean zW5;
        String strD2;
        String strD3;
        long j6;
        int i;
        long j7;
        EY0 ey0;
        Boolean bool;
        boolean zW6;
        long j8;
        long j9;
        EY0<String> ey1;
        EY0<String> ey2;
        EY0 ey3;
        Boolean bool2;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        C6960uL c6960uL = this.D;
        if ((3583 & j) != 0) {
            if ((j & 3073) != 0) {
                EY0 ey4 = c6960uL != null ? c6960uL.n : null;
                z(0, ey4);
                zW3 = ViewDataBinding.w(ey4 != null ? (Boolean) ey4.d() : null);
            } else {
                zW3 = false;
            }
            if ((j & 3074) != 0) {
                EY0 ey5 = c6960uL != null ? c6960uL.j : null;
                z(1, ey5);
                zW = ViewDataBinding.w(ey5 != null ? (Boolean) ey5.d() : null);
            } else {
                zW = false;
            }
            if ((j & 3076) != 0) {
                EY0 ey6 = c6960uL != null ? c6960uL.l : null;
                j3 = 3200;
                z(2, ey6);
                zW2 = ViewDataBinding.w(ey6 != null ? (Boolean) ey6.d() : null);
            } else {
                j3 = 3200;
                zW2 = false;
            }
            if ((j & 3080) != 0) {
                EY0 ey7 = c6960uL != null ? c6960uL.k : null;
                z(3, ey7);
                zW4 = ViewDataBinding.w(ey7 != null ? (Boolean) ey7.d() : null);
            } else {
                zW4 = false;
            }
            if ((j & 3088) != 0) {
                EY0<String> ey8 = c6960uL != null ? c6960uL.i : null;
                j4 = 3136;
                z(4, ey8);
                strD = ey8 != null ? ey8.d() : null;
                j9 = j & 3360;
                if (j9 != 0) {
                    if (c6960uL != null) {
                        ey3 = c6960uL.m;
                    } else {
                        ey3 = null;
                    }
                    j5 = 3104;
                    z(5, ey3);
                    if (ey3 != null) {
                        bool2 = (Boolean) ey3.d();
                    } else {
                        bool2 = null;
                    }
                    zW5 = ViewDataBinding.w(bool2);
                    if (j9 != 0) {
                        if (zW5) {
                            j |= 8192;
                        } else {
                            j |= 4096;
                        }
                    }
                    if ((j & 3104) != 0) {
                        z = !zW5;
                    } else {
                        z = false;
                    }
                } else {
                    j5 = 3104;
                    z = false;
                    zW5 = false;
                }
                if ((j & j4) == 0) {
                    strD2 = null;
                } else {
                    if (c6960uL != null) {
                        ey2 = c6960uL.h;
                    } else {
                        ey2 = null;
                    }
                    z(6, ey2);
                    if (ey2 != null) {
                        strD2 = ey2.d();
                    } else {
                        strD2 = null;
                    }
                }
                if ((j & j3) != 0) {
                    if (c6960uL != null) {
                        ey1 = c6960uL.g;
                    } else {
                        ey1 = null;
                    }
                    j2 = 8192;
                    z(7, ey1);
                    strD3 = ey1 != null ? ey1.d() : null;
                    j6 = j & j2;
                    if (j6 == 0) {
                        i = 0;
                    } else {
                        if (c6960uL != null) {
                            ey0 = c6960uL.o;
                        } else {
                            ey0 = null;
                        }
                        z(8, ey0);
                        if (ey0 != null) {
                            bool = (Boolean) ey0.d();
                        } else {
                            bool = null;
                        }
                        zW6 = ViewDataBinding.w(bool);
                        if (j6 != 0) {
                            if (zW6) {
                                j8 = 32768;
                            } else {
                                j8 = 16384;
                            }
                            j |= j8;
                        }
                        if (zW6) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                    }
                    j7 = 3360 & j;
                    if (j7 == 0) {
                        i = 0;
                    } else if (!zW5) {
                        i = 8;
                    }
                    if ((j & j5) != 0) {
                        this.F.setEnabled(z);
                        this.G.setEnabled(z);
                        this.H.setEnabled(z);
                    }
                    if ((j & 3074) != 0) {
                        TextInputLayout view = this.F;
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.setEndIconVisible(zW);
                    }
                    if ((j & 3080) != 0) {
                        TextInputLayout view2 = this.G;
                        Intrinsics.checkNotNullParameter(view2, "view");
                        view2.setEndIconVisible(zW4);
                    }
                    if ((j & 3076) != 0) {
                        TextInputLayout view3 = this.H;
                        Intrinsics.checkNotNullParameter(view3, "view");
                        view3.setEndIconVisible(zW2);
                    }
                    if (j7 != 0) {
                        this.I.setVisibility(i);
                    }
                    if ((j & 3073) != 0) {
                        this.z.setEnabled(zW3);
                    }
                    if ((2048 & j) != 0) {
                        this.z.setOnClickListener(this.J);
                        C4689jY1.b(this.A, this.K);
                        C4689jY1.b(this.B, this.L);
                        C4689jY1.b(this.C, this.M);
                    }
                    if ((j & 3088) != 0) {
                        C4689jY1.a(this.A, strD);
                    }
                    if ((j & j3) != 0) {
                        C4689jY1.a(this.B, strD3);
                    }
                    if ((j & j4) != 0) {
                        C4689jY1.a(this.C, strD2);
                    }
                }
                j2 = 8192;
            } else {
                j4 = 3136;
            }
            j9 = j & 3360;
            if (j9 != 0) {
                if (c6960uL != null) {
                    ey3 = c6960uL.m;
                } else {
                    ey3 = null;
                }
                j5 = 3104;
                z(5, ey3);
                if (ey3 != null) {
                    bool2 = (Boolean) ey3.d();
                } else {
                    bool2 = null;
                }
                zW5 = ViewDataBinding.w(bool2);
                if (j9 != 0) {
                    if (zW5) {
                        j |= 8192;
                    } else {
                        j |= 4096;
                    }
                }
                if ((j & 3104) != 0) {
                    z = !zW5;
                } else {
                    z = false;
                }
            } else {
                j5 = 3104;
                z = false;
                zW5 = false;
            }
            if ((j & j4) == 0) {
                strD2 = null;
            } else {
                if (c6960uL != null) {
                    ey2 = c6960uL.h;
                } else {
                    ey2 = null;
                }
                z(6, ey2);
                if (ey2 != null) {
                    strD2 = ey2.d();
                } else {
                    strD2 = null;
                }
            }
            if ((j & j3) != 0) {
                if (c6960uL != null) {
                    ey1 = c6960uL.g;
                } else {
                    ey1 = null;
                }
                j2 = 8192;
                z(7, ey1);
                if (ey1 != null) {
                }
                j6 = j & j2;
                if (j6 == 0) {
                    i = 0;
                } else {
                    if (c6960uL != null) {
                        ey0 = c6960uL.o;
                    } else {
                        ey0 = null;
                    }
                    z(8, ey0);
                    if (ey0 != null) {
                        bool = (Boolean) ey0.d();
                    } else {
                        bool = null;
                    }
                    zW6 = ViewDataBinding.w(bool);
                    if (j6 != 0) {
                        if (zW6) {
                            j8 = 32768;
                        } else {
                            j8 = 16384;
                        }
                        j |= j8;
                    }
                    if (zW6) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                }
                j7 = 3360 & j;
                if (j7 == 0) {
                    i = 0;
                } else if (!zW5) {
                    i = 8;
                }
                if ((j & j5) != 0) {
                    this.F.setEnabled(z);
                    this.G.setEnabled(z);
                    this.H.setEnabled(z);
                }
                if ((j & 3074) != 0) {
                    TextInputLayout view4 = this.F;
                    Intrinsics.checkNotNullParameter(view4, "view");
                    view4.setEndIconVisible(zW);
                }
                if ((j & 3080) != 0) {
                    TextInputLayout view5 = this.G;
                    Intrinsics.checkNotNullParameter(view5, "view");
                    view5.setEndIconVisible(zW4);
                }
                if ((j & 3076) != 0) {
                    TextInputLayout view6 = this.H;
                    Intrinsics.checkNotNullParameter(view6, "view");
                    view6.setEndIconVisible(zW2);
                }
                if (j7 != 0) {
                    this.I.setVisibility(i);
                }
                if ((j & 3073) != 0) {
                    this.z.setEnabled(zW3);
                }
                if ((2048 & j) != 0) {
                    this.z.setOnClickListener(this.J);
                    C4689jY1.b(this.A, this.K);
                    C4689jY1.b(this.B, this.L);
                    C4689jY1.b(this.C, this.M);
                }
                if ((j & 3088) != 0) {
                    C4689jY1.a(this.A, strD);
                }
                if ((j & j3) != 0) {
                    C4689jY1.a(this.B, strD3);
                }
                if ((j & j4) != 0) {
                    C4689jY1.a(this.C, strD2);
                }
            }
            j2 = 8192;
        } else {
            j2 = 8192;
            j3 = 3200;
            j4 = 3136;
            j5 = 3104;
            zW = false;
            zW2 = false;
            zW3 = false;
            zW4 = false;
            strD = null;
            z = false;
            zW5 = false;
            strD2 = null;
        }
        j6 = j & j2;
        if (j6 == 0) {
            i = 0;
        } else {
            if (c6960uL != null) {
                ey0 = c6960uL.o;
            } else {
                ey0 = null;
            }
            z(8, ey0);
            if (ey0 != null) {
                bool = (Boolean) ey0.d();
            } else {
                bool = null;
            }
            zW6 = ViewDataBinding.w(bool);
            if (j6 != 0) {
                if (zW6) {
                    j8 = 32768;
                } else {
                    j8 = 16384;
                }
                j |= j8;
            }
            if (zW6) {
                i = 8;
            } else {
                i = 0;
            }
        }
        j7 = 3360 & j;
        if (j7 == 0) {
            i = 0;
        } else if (!zW5) {
            i = 8;
        }
        if ((j & j5) != 0) {
            this.F.setEnabled(z);
            this.G.setEnabled(z);
            this.H.setEnabled(z);
        }
        if ((j & 3074) != 0) {
            TextInputLayout view7 = this.F;
            Intrinsics.checkNotNullParameter(view7, "view");
            view7.setEndIconVisible(zW);
        }
        if ((j & 3080) != 0) {
            TextInputLayout view8 = this.G;
            Intrinsics.checkNotNullParameter(view8, "view");
            view8.setEndIconVisible(zW4);
        }
        if ((j & 3076) != 0) {
            TextInputLayout view9 = this.H;
            Intrinsics.checkNotNullParameter(view9, "view");
            view9.setEndIconVisible(zW2);
        }
        if (j7 != 0) {
            this.I.setVisibility(i);
        }
        if ((j & 3073) != 0) {
            this.z.setEnabled(zW3);
        }
        if ((2048 & j) != 0) {
            this.z.setOnClickListener(this.J);
            C4689jY1.b(this.A, this.K);
            C4689jY1.b(this.B, this.L);
            C4689jY1.b(this.C, this.M);
        }
        if ((j & 3088) != 0) {
            C4689jY1.a(this.A, strD);
        }
        if ((j & j3) != 0) {
            C4689jY1.a(this.B, strD3);
        }
        if ((j & j4) != 0) {
            C4689jY1.a(this.C, strD2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.N != 0;
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
                    this.N |= 1;
                    break;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 2;
                    break;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 4;
                    break;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 8;
                    break;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 16;
                    break;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 32;
                    break;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 64;
                    break;
                }
                return true;
            case 7:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 128;
                    break;
                }
                return true;
            case 8:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.N |= 256;
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
