package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import defpackage.C2425Xl1;
import defpackage.C3654ep0;
import defpackage.C4289hr;
import defpackage.C4874kQ0;
import defpackage.C5589nn0;
import defpackage.C5799on0;
import defpackage.C6017pq;
import defpackage.C6600sd2;
import defpackage.C6641so0;
import defpackage.C6883tz;
import defpackage.CX;
import defpackage.Di2;
import defpackage.FK1;
import defpackage.Fi2;
import defpackage.IK;
import defpackage.InterfaceC6222qo0;
import defpackage.KK;
import defpackage.TK;
import defpackage.UK;
import defpackage.V31;
import defpackage.Ve2;
import defpackage.WK;
import defpackage.We2;
import defpackage.Y91;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static FK1 v;
    public SparseArray<View> d;
    public ArrayList<androidx.constraintlayout.widget.b> e;
    public UK g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public c n;
    public KK o;
    public int p;
    public HashMap<String, Integer> q;
    public SparseArray<TK> r;
    public b s;
    public int t;
    public int u;

    public class b implements C4289hr.b {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public static boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(TK tk, C4289hr.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int i;
            boolean z;
            int measuredWidth;
            int baseline;
            int i2;
            if (tk == null) {
                return;
            }
            if (tk.i0 == 8 && !tk.F) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (tk.V == null) {
                return;
            }
            TK.a aVar2 = aVar.a;
            TK.a aVar3 = aVar.b;
            int i3 = aVar.c;
            int i4 = aVar.d;
            int i5 = this.b + this.c;
            int i6 = this.d;
            View view = tk.h0;
            int iOrdinal = aVar2.ordinal();
            IK ik = tk.L;
            IK ik2 = tk.J;
            if (iOrdinal == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (iOrdinal == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i6, -2);
            } else if (iOrdinal == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i6, -2);
                boolean z2 = tk.r == 1;
                int i7 = aVar.j;
                if (i7 == 1 || i7 == 2) {
                    boolean z3 = view.getMeasuredHeight() == tk.o();
                    if (aVar.j == 2 || !z2 || ((z2 && z3) || (view instanceof e) || tk.E())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tk.u(), 1073741824);
                    }
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i8 = this.f;
                int i9 = ik2 != null ? ik2.g : 0;
                if (ik != null) {
                    i9 += ik.g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i6 + i9, -1);
            }
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i5, -2);
            } else if (iOrdinal2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i5, -2);
                boolean z4 = tk.s == 1;
                int i10 = aVar.j;
                if (i10 == 1 || i10 == 2) {
                    boolean z5 = view.getMeasuredWidth() == tk.u();
                    if (aVar.j == 2 || !z4 || ((z4 && z5) || (view instanceof e) || tk.F())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(tk.o(), 1073741824);
                    }
                }
            } else if (iOrdinal2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i11 = this.g;
                int i12 = ik2 != null ? tk.K.g : 0;
                if (ik != null) {
                    i12 += tk.M.g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i5 + i12, -1);
            }
            UK uk = (UK) tk.V;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (uk != null && Y91.b(constraintLayout.m, UserVerificationMethods.USER_VERIFY_HANDPRINT) && view.getMeasuredWidth() == tk.u() && view.getMeasuredWidth() < uk.u() && view.getMeasuredHeight() == tk.o() && view.getMeasuredHeight() < uk.o() && view.getBaseline() == tk.c0 && !tk.D() && a(tk.H, iMakeMeasureSpec, tk.u()) && a(tk.I, iMakeMeasureSpec2, tk.o())) {
                aVar.e = tk.u();
                aVar.f = tk.o();
                aVar.g = tk.c0;
                return;
            }
            TK.a aVar4 = TK.a.g;
            boolean z6 = aVar2 == aVar4;
            boolean z7 = aVar3 == aVar4;
            TK.a aVar5 = TK.a.h;
            TK.a aVar6 = TK.a.d;
            boolean z8 = aVar3 == aVar5 || aVar3 == aVar6;
            boolean z9 = aVar2 == aVar5 || aVar2 == aVar6;
            boolean z10 = z6 && tk.Y > 0.0f;
            boolean z11 = z7 && tk.Y > 0.0f;
            if (view == null) {
                return;
            }
            a aVar7 = (a) view.getLayoutParams();
            int i13 = aVar.j;
            if (i13 != 1 && i13 != 2 && z6 && tk.r == 0 && z7 && tk.s == 0) {
                z = false;
                measuredWidth = 0;
                baseline = 0;
                i2 = -1;
                iMax = 0;
            } else {
                if ((view instanceof Ve2) && (tk instanceof We2)) {
                    ((Ve2) view).o((We2) tk, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                tk.H = iMakeMeasureSpec;
                tk.I = iMakeMeasureSpec2;
                tk.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i14 = tk.u;
                int iMax2 = i14 > 0 ? Math.max(i14, measuredWidth2) : measuredWidth2;
                int i15 = tk.v;
                if (i15 > 0) {
                    iMax2 = Math.min(i15, iMax2);
                }
                int i16 = tk.x;
                iMax = i16 > 0 ? Math.max(i16, measuredHeight) : measuredHeight;
                boolean z12 = z9;
                int i17 = tk.y;
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                if (!Y91.b(constraintLayout.m, 1)) {
                    if (z10 && z8) {
                        iMax2 = (int) ((iMax * tk.Y) + 0.5f);
                    } else if (z11 && z12) {
                        iMax = (int) ((iMax2 / tk.Y) + 0.5f);
                    }
                }
                if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                    baseline = baseline2;
                    measuredWidth = iMax2;
                    z = false;
                } else {
                    if (measuredWidth2 != iMax2) {
                        i = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    } else {
                        i = 1073741824;
                    }
                    if (measuredHeight != iMax) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    tk.H = iMakeMeasureSpec;
                    tk.I = iMakeMeasureSpec2;
                    z = false;
                    tk.g = false;
                    measuredWidth = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredHeight2;
                }
                i2 = -1;
            }
            boolean z13 = baseline != i2 ? true : z;
            if (measuredWidth != aVar.c || iMax != aVar.d) {
                z = true;
            }
            aVar.i = z;
            boolean z14 = aVar7.c0 ? true : z13;
            if (z14 && baseline != -1 && tk.c0 != baseline) {
                aVar.i = true;
            }
            aVar.e = measuredWidth;
            aVar.f = iMax;
            aVar.h = z14;
            aVar.g = baseline;
        }
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new SparseArray<>();
        this.e = new ArrayList<>(4);
        this.g = new UK();
        this.h = 0;
        this.i = 0;
        this.j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.l = true;
        this.m = 257;
        this.n = null;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = new SparseArray<>();
        this.s = new b(this);
        this.t = 0;
        this.u = 0;
        e(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static FK1 getSharedValues() {
        if (v == null) {
            FK1 fk1 = new FK1();
            new SparseIntArray();
            fk1.a = new HashMap<>();
            v = fk1;
        }
        return v;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0173  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:84:0x019e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x02de -> B:165:0x02df). Please report as a decompilation issue!!! */
    public final void b(boolean z, View view, TK tk, a aVar, SparseArray<TK> sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        IK.a aVar2;
        float f;
        TK tk2;
        IK.a aVar3;
        IK.a aVar4;
        IK.a aVar5;
        TK tk3;
        IK.a aVar6;
        int i2;
        IK.a aVar7;
        int i3;
        TK tk4;
        IK.a aVar8;
        IK.a aVar9;
        int i4;
        IK.a aVar10;
        int i5;
        TK tk5;
        IK.a aVar11;
        int i6;
        a aVar12;
        int i7;
        int i8;
        TK tk6;
        IK.a aVar13;
        float f2;
        TK tk7;
        TK tk8;
        TK tk9;
        int i9;
        float fAbs;
        int i10;
        float f3;
        TK tk10 = tk;
        aVar.a();
        tk10.i0 = view.getVisibility();
        if (aVar.f0) {
            tk10.F = true;
            tk10.i0 = 8;
        }
        tk10.h0 = view;
        if (view instanceof androidx.constraintlayout.widget.b) {
            constraintLayout = this;
            ((androidx.constraintlayout.widget.b) view).l(tk10, constraintLayout.g.z0);
        } else {
            constraintLayout = this;
        }
        int i11 = -1;
        if (aVar.d0) {
            C5589nn0 c5589nn0 = (C5589nn0) tk10;
            int i12 = aVar.n0;
            int i13 = aVar.o0;
            float f4 = aVar.p0;
            if (f4 != -1.0f) {
                if (f4 > -1.0f) {
                    c5589nn0.u0 = f4;
                    c5589nn0.v0 = -1;
                    c5589nn0.w0 = -1;
                    return;
                }
                return;
            }
            if (i12 != -1) {
                if (i12 > -1) {
                    c5589nn0.u0 = -1.0f;
                    c5589nn0.v0 = i12;
                    c5589nn0.w0 = -1;
                    return;
                }
                return;
            }
            if (i13 == -1 || i13 <= -1) {
                return;
            }
            c5589nn0.u0 = -1.0f;
            c5589nn0.v0 = -1;
            c5589nn0.w0 = i13;
            return;
        }
        int i14 = aVar.g0;
        int i15 = aVar.h0;
        int i16 = aVar.i0;
        int i17 = aVar.j0;
        int i18 = aVar.k0;
        int i19 = aVar.l0;
        float f5 = aVar.m0;
        int i20 = aVar.p;
        IK.a aVar14 = IK.a.g;
        IK.a aVar15 = IK.a.d;
        IK.a aVar16 = IK.a.h;
        IK.a aVar17 = IK.a.e;
        if (i20 != -1) {
            TK tk11 = sparseArray.get(i20);
            if (tk11 != null) {
                float f6 = aVar.r;
                int i21 = aVar.q;
                IK.a aVar18 = IK.a.j;
                f3 = 0.0f;
                tk.z(aVar18, tk11, aVar18, i21, 0);
                tk10 = tk;
                tk10.D = f6;
            } else {
                f3 = 0.0f;
            }
            tk6 = tk10;
            aVar12 = aVar;
            i = 1;
            f = f3;
            aVar6 = aVar14;
            aVar5 = aVar15;
            aVar13 = aVar16;
            aVar10 = aVar17;
        } else {
            if (i14 != -1) {
                TK tk12 = sparseArray.get(i14);
                if (tk12 != null) {
                    i = 1;
                    f = 0.0f;
                    aVar2 = aVar15;
                    tk10.z(aVar2, tk12, aVar15, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i18);
                } else {
                    i = 1;
                    aVar2 = aVar15;
                    f = 0.0f;
                }
            } else {
                i = 1;
                aVar2 = aVar15;
                f = 0.0f;
                if (i15 != -1 && (tk2 = sparseArray.get(i15)) != null) {
                    tk.z(aVar2, tk2, aVar14, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i18);
                    aVar3 = aVar2;
                    aVar4 = aVar14;
                }
                if (i16 != -1) {
                    tk9 = sparseArray.get(i16);
                    if (tk9 != null) {
                        tk.z(aVar4, tk9, aVar3, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i19);
                    }
                    aVar5 = aVar3;
                } else {
                    aVar5 = aVar3;
                    if (i17 != -1 && (tk3 = sparseArray.get(i17)) != null) {
                        tk.z(aVar4, tk3, aVar4, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i19);
                    }
                }
                aVar6 = aVar4;
                i2 = aVar.i;
                if (i2 != -1) {
                    tk8 = sparseArray.get(i2);
                    if (tk8 != null) {
                        aVar7 = aVar17;
                        tk.z(aVar7, tk8, aVar17, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.x);
                    } else {
                        aVar7 = aVar17;
                    }
                } else {
                    aVar7 = aVar17;
                    i3 = aVar.j;
                    if (i3 == -1 && (tk4 = sparseArray.get(i3)) != null) {
                        tk.z(aVar7, tk4, aVar16, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.x);
                        aVar8 = aVar7;
                        aVar9 = aVar16;
                    }
                    i4 = aVar.k;
                    if (i4 != -1) {
                        tk7 = sparseArray.get(i4);
                        if (tk7 != null) {
                            tk.z(aVar9, tk7, aVar8, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                        }
                        aVar10 = aVar8;
                    } else {
                        aVar10 = aVar8;
                        i5 = aVar.l;
                        if (i5 != -1 && (tk5 = sparseArray.get(i5)) != null) {
                            tk.z(aVar9, tk5, aVar9, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                        }
                    }
                    aVar11 = aVar9;
                    i6 = aVar.m;
                    if (i6 != -1) {
                        aVar12 = aVar;
                        constraintLayout.p(tk, aVar12, sparseArray, i6, IK.a.i);
                    } else {
                        aVar12 = aVar;
                        i7 = aVar12.n;
                        if (i7 != -1) {
                            p(tk, aVar12, sparseArray, i7, aVar10);
                        } else {
                            i8 = aVar12.o;
                            if (i8 != -1) {
                                p(tk, aVar12, sparseArray, i8, aVar11);
                                tk6 = tk;
                                aVar13 = aVar11;
                            }
                            if (f5 >= f) {
                                tk6.f0 = f5;
                            }
                            f2 = aVar12.F;
                            if (f2 >= f) {
                                tk6.g0 = f2;
                            }
                        }
                    }
                    tk6 = tk;
                    aVar13 = aVar11;
                    if (f5 >= f) {
                        tk6.f0 = f5;
                    }
                    f2 = aVar12.F;
                    if (f2 >= f) {
                        tk6.g0 = f2;
                    }
                }
                aVar8 = aVar7;
                aVar9 = aVar16;
                i4 = aVar.k;
                if (i4 != -1) {
                    tk7 = sparseArray.get(i4);
                    if (tk7 != null) {
                        tk.z(aVar9, tk7, aVar8, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                    }
                    aVar10 = aVar8;
                } else {
                    aVar10 = aVar8;
                    i5 = aVar.l;
                    if (i5 != -1) {
                        tk.z(aVar9, tk5, aVar9, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                    }
                }
                aVar11 = aVar9;
                i6 = aVar.m;
                if (i6 != -1) {
                    aVar12 = aVar;
                    constraintLayout.p(tk, aVar12, sparseArray, i6, IK.a.i);
                } else {
                    aVar12 = aVar;
                    i7 = aVar12.n;
                    if (i7 != -1) {
                        p(tk, aVar12, sparseArray, i7, aVar10);
                    } else {
                        i8 = aVar12.o;
                        if (i8 != -1) {
                            p(tk, aVar12, sparseArray, i8, aVar11);
                            tk6 = tk;
                            aVar13 = aVar11;
                        }
                        if (f5 >= f) {
                            tk6.f0 = f5;
                        }
                        f2 = aVar12.F;
                        if (f2 >= f) {
                            tk6.g0 = f2;
                        }
                    }
                }
                tk6 = tk;
                aVar13 = aVar11;
                if (f5 >= f) {
                    tk6.f0 = f5;
                }
                f2 = aVar12.F;
                if (f2 >= f) {
                    tk6.g0 = f2;
                }
            }
            aVar3 = aVar2;
            aVar4 = aVar14;
            if (i16 != -1) {
                tk9 = sparseArray.get(i16);
                if (tk9 != null) {
                    tk.z(aVar4, tk9, aVar3, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i19);
                }
                aVar5 = aVar3;
            } else {
                aVar5 = aVar3;
                if (i17 != -1) {
                    tk.z(aVar4, tk3, aVar4, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i19);
                }
            }
            aVar6 = aVar4;
            i2 = aVar.i;
            if (i2 != -1) {
                tk8 = sparseArray.get(i2);
                if (tk8 != null) {
                    aVar7 = aVar17;
                    tk.z(aVar7, tk8, aVar17, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.x);
                } else {
                    aVar7 = aVar17;
                }
            } else {
                aVar7 = aVar17;
                i3 = aVar.j;
                if (i3 == -1) {
                }
                i4 = aVar.k;
                if (i4 != -1) {
                    tk7 = sparseArray.get(i4);
                    if (tk7 != null) {
                        tk.z(aVar9, tk7, aVar8, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                    }
                    aVar10 = aVar8;
                } else {
                    aVar10 = aVar8;
                    i5 = aVar.l;
                    if (i5 != -1) {
                        tk.z(aVar9, tk5, aVar9, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                    }
                }
                aVar11 = aVar9;
                i6 = aVar.m;
                if (i6 != -1) {
                    aVar12 = aVar;
                    constraintLayout.p(tk, aVar12, sparseArray, i6, IK.a.i);
                } else {
                    aVar12 = aVar;
                    i7 = aVar12.n;
                    if (i7 != -1) {
                        p(tk, aVar12, sparseArray, i7, aVar10);
                    } else {
                        i8 = aVar12.o;
                        if (i8 != -1) {
                            p(tk, aVar12, sparseArray, i8, aVar11);
                            tk6 = tk;
                            aVar13 = aVar11;
                        }
                        if (f5 >= f) {
                            tk6.f0 = f5;
                        }
                        f2 = aVar12.F;
                        if (f2 >= f) {
                            tk6.g0 = f2;
                        }
                    }
                }
                tk6 = tk;
                aVar13 = aVar11;
                if (f5 >= f) {
                    tk6.f0 = f5;
                }
                f2 = aVar12.F;
                if (f2 >= f) {
                    tk6.g0 = f2;
                }
            }
            aVar8 = aVar7;
            aVar9 = aVar16;
            i4 = aVar.k;
            if (i4 != -1) {
                tk7 = sparseArray.get(i4);
                if (tk7 != null) {
                    tk.z(aVar9, tk7, aVar8, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                }
                aVar10 = aVar8;
            } else {
                aVar10 = aVar8;
                i5 = aVar.l;
                if (i5 != -1) {
                    tk.z(aVar9, tk5, aVar9, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                }
            }
            aVar11 = aVar9;
            i6 = aVar.m;
            if (i6 != -1) {
                aVar12 = aVar;
                constraintLayout.p(tk, aVar12, sparseArray, i6, IK.a.i);
            } else {
                aVar12 = aVar;
                i7 = aVar12.n;
                if (i7 != -1) {
                    p(tk, aVar12, sparseArray, i7, aVar10);
                } else {
                    i8 = aVar12.o;
                    if (i8 != -1) {
                        p(tk, aVar12, sparseArray, i8, aVar11);
                        tk6 = tk;
                        aVar13 = aVar11;
                    }
                    if (f5 >= f) {
                        tk6.f0 = f5;
                    }
                    f2 = aVar12.F;
                    if (f2 >= f) {
                        tk6.g0 = f2;
                    }
                }
            }
            tk6 = tk;
            aVar13 = aVar11;
            if (f5 >= f) {
                tk6.f0 = f5;
            }
            f2 = aVar12.F;
            if (f2 >= f) {
                tk6.g0 = f2;
            }
        }
        if (z && ((i10 = aVar12.T) != -1 || aVar12.U != -1)) {
            int i22 = aVar12.U;
            tk6.a0 = i10;
            tk6.b0 = i22;
        }
        boolean z2 = aVar12.a0;
        TK.a aVar19 = TK.a.e;
        TK.a aVar20 = TK.a.d;
        TK.a aVar21 = TK.a.h;
        TK.a aVar22 = TK.a.g;
        if (z2) {
            tk6.Q(aVar20);
            tk6.S(((ViewGroup.MarginLayoutParams) aVar12).width);
            if (((ViewGroup.MarginLayoutParams) aVar12).width == -2) {
                tk6.Q(aVar19);
            }
        } else if (((ViewGroup.MarginLayoutParams) aVar12).width == -1) {
            if (aVar12.W) {
                tk6.Q(aVar22);
            } else {
                tk6.Q(aVar21);
            }
            tk6.m(aVar5).g = ((ViewGroup.MarginLayoutParams) aVar12).leftMargin;
            tk6.m(aVar6).g = ((ViewGroup.MarginLayoutParams) aVar12).rightMargin;
        } else {
            tk6.Q(aVar22);
            tk6.S(0);
        }
        if (aVar12.b0) {
            tk6.R(aVar20);
            tk6.P(((ViewGroup.MarginLayoutParams) aVar12).height);
            if (((ViewGroup.MarginLayoutParams) aVar12).height == -2) {
                tk6.R(aVar19);
            }
        } else if (((ViewGroup.MarginLayoutParams) aVar12).height == -1) {
            if (aVar12.X) {
                tk6.R(aVar22);
            } else {
                tk6.R(aVar21);
            }
            tk6.m(aVar10).g = ((ViewGroup.MarginLayoutParams) aVar12).topMargin;
            tk6.m(aVar13).g = ((ViewGroup.MarginLayoutParams) aVar12).bottomMargin;
        } else {
            tk6.R(aVar22);
            tk6.P(0);
        }
        String str = aVar12.G;
        if (str == null || str.length() == 0) {
            tk6.Y = f;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i9 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i11 = i;
                }
                i9 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i9);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f;
                    }
                } else {
                    String strSubstring3 = str.substring(i9, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f;
                    } else {
                        float f7 = Float.parseFloat(strSubstring3);
                        float f8 = Float.parseFloat(strSubstring4);
                        if (f7 <= f || f8 <= f) {
                            fAbs = f;
                        } else {
                            fAbs = i11 == i ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f) {
                tk6.Y = fAbs;
                tk6.Z = i11;
            }
        }
        float f9 = aVar12.H;
        float[] fArr = tk6.n0;
        fArr[0] = f9;
        fArr[1] = aVar12.I;
        tk6.l0 = aVar12.J;
        tk6.m0 = aVar12.K;
        int i23 = aVar12.Z;
        if (i23 >= 0 && i23 <= 3) {
            tk6.q = i23;
        }
        int i24 = aVar12.L;
        int i25 = aVar12.N;
        int i26 = aVar12.P;
        float f10 = aVar12.R;
        tk6.r = i24;
        tk6.u = i25;
        if (i26 == Integer.MAX_VALUE) {
            i26 = 0;
        }
        tk6.v = i26;
        tk6.w = f10;
        if (f10 > f && f10 < 1.0f && i24 == 0) {
            tk6.r = 2;
        }
        int i27 = aVar12.M;
        int i28 = aVar12.O;
        int i29 = aVar12.Q;
        float f11 = aVar12.S;
        tk6.s = i27;
        tk6.x = i28;
        tk6.y = i29 != Integer.MAX_VALUE ? i29 : 0;
        tk6.z = f11;
        if (f11 <= f || f11 >= 1.0f || i27 != 0) {
            return;
        }
        tk6.s = 2;
    }

    public final View c(int i) {
        return this.d.get(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final TK d(View view) {
        if (view == this) {
            return this.g;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).q0;
        }
        view.setLayoutParams(new a(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).q0;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public final void e(AttributeSet attributeSet, int i) {
        UK uk = this.g;
        uk.h0 = this;
        b bVar = this.s;
        uk.y0 = bVar;
        uk.w0.f = bVar;
        this.d.put(getId(), this);
        this.n = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2425Xl1.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 17) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 14) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == 15) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                } else if (index == 113) {
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            g(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.o = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.n = cVar;
                        cVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.n = null;
                    }
                    this.p = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        uk.H0 = this.m;
        C4874kQ0.p = uk.a0(UserVerificationMethods.USER_VERIFY_NONE);
    }

    public final boolean f() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.l = true;
        super.forceLayout();
    }

    public void g(int i) {
        this.o = new KK(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.k;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinHeight() {
        return this.i;
    }

    public int getMinWidth() {
        return this.h;
    }

    public int getOptimizationLevel() {
        return this.g.H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        UK uk = this.g;
        if (uk.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                uk.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                uk.j = "parent";
            }
        }
        if (uk.k0 == null) {
            uk.k0 = uk.j;
        }
        for (TK tk : uk.u0) {
            View view = tk.h0;
            if (view != null) {
                if (tk.j == null && (id = view.getId()) != -1) {
                    tk.j = getContext().getResources().getResourceEntryName(id);
                }
                if (tk.k0 == null) {
                    tk.k0 = tk.j;
                }
            }
        }
        uk.r(sb);
        return sb.toString();
    }

    public final void h(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        b bVar = this.s;
        int i5 = bVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + bVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.j, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.k, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x020c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0210  */
    /* JADX WARN: Code duplicated, block: B:116:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:196:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d7 A[LOOP:11: B:197:0x03d1->B:199:0x03d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x041e  */
    /* JADX WARN: Code duplicated, block: B:204:0x043a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0441  */
    /* JADX WARN: Code duplicated, block: B:207:0x0445  */
    /* JADX WARN: Code duplicated, block: B:209:0x044f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x0451  */
    /* JADX WARN: Code duplicated, block: B:211:0x0453  */
    /* JADX WARN: Code duplicated, block: B:213:0x0456  */
    /* JADX WARN: Code duplicated, block: B:214:0x0458  */
    /* JADX WARN: Code duplicated, block: B:216:0x045d  */
    /* JADX WARN: Code duplicated, block: B:218:0x046b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0474  */
    /* JADX WARN: Code duplicated, block: B:226:0x0485  */
    /* JADX WARN: Code duplicated, block: B:228:0x0491  */
    /* JADX WARN: Code duplicated, block: B:229:0x0495  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:253:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:255:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:260:0x04df  */
    /* JADX WARN: Code duplicated, block: B:267:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x04fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:280:0x0509  */
    /* JADX WARN: Code duplicated, block: B:284:0x051e  */
    /* JADX WARN: Code duplicated, block: B:286:0x0526  */
    /* JADX WARN: Code duplicated, block: B:289:0x052d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0548  */
    /* JADX WARN: Code duplicated, block: B:294:0x0559  */
    /* JADX WARN: Code duplicated, block: B:299:0x0573  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:301:0x0576 A[LOOP:5: B:300:0x0574->B:301:0x0576, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:304:0x058e  */
    /* JADX WARN: Code duplicated, block: B:306:0x0593  */
    /* JADX WARN: Code duplicated, block: B:308:0x0599  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:310:0x059d  */
    /* JADX WARN: Code duplicated, block: B:313:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:314:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:318:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:321:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:323:0x0602  */
    /* JADX WARN: Code duplicated, block: B:325:0x0607  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:330:0x0628  */
    /* JADX WARN: Code duplicated, block: B:332:0x062d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:341:0x066e  */
    /* JADX WARN: Code duplicated, block: B:343:0x0671  */
    /* JADX WARN: Code duplicated, block: B:345:0x067b  */
    /* JADX WARN: Code duplicated, block: B:349:0x0683  */
    /* JADX WARN: Code duplicated, block: B:355:0x068f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:363:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:366:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:369:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:371:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:376:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:378:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:382:0x071e  */
    /* JADX WARN: Code duplicated, block: B:385:0x0724  */
    /* JADX WARN: Code duplicated, block: B:388:0x072b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:392:0x073c A[LOOP:7: B:339:0x066b->B:392:0x073c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:394:0x074c  */
    /* JADX WARN: Code duplicated, block: B:397:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:425:0x050d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0660 A[EDGE_INSN: B:431:0x0660->B:338:0x0660 BREAK  A[LOOP:6: B:316:0x05be->B:337:0x0652], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0749 A[EDGE_INSN: B:434:0x0749->B:393:0x0749 BREAK  A[LOOP:7: B:339:0x066b->B:392:0x073c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:49:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b  */
    /* JADX WARN: Code duplicated, block: B:68:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d4 A[PHI: r2
      0x01d4: PHI (r2v3 boolean) = (r2v2 boolean), (r2v61 boolean) binds: [B:62:0x0172, B:397:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01db A[ADDED_TO_REGION] */
    public final void i(UK uk, int i, int i2, int i3) {
        int iMax;
        int iMax2;
        TK.a aVar;
        int iU;
        CX cx;
        int i4;
        int i5;
        C4289hr c4289hr;
        C4289hr.b bVar;
        int size;
        int iU2;
        int iO;
        boolean zB;
        boolean z;
        TK.a aVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        TK.a aVar3;
        TK.a aVar4;
        int i7;
        boolean zY;
        int i8;
        ArrayList<TK> arrayList;
        int size2;
        int i9;
        TK.a[] aVarArr;
        boolean z5;
        boolean z6;
        int iMax3;
        int iMax4;
        int i10;
        boolean z7;
        IK.a aVar5;
        IK.a aVar6;
        boolean z8;
        boolean z9;
        boolean z10;
        C4289hr.b bVar2;
        int i11;
        int i12;
        ArrayList<TK> arrayList2;
        int i13;
        TK tk;
        int iU3;
        int iO2;
        int i14;
        ArrayList<TK> arrayList3;
        boolean zA;
        int iU4;
        int i15;
        int iO3;
        boolean z11;
        TK tk2;
        boolean z12;
        int iU5;
        boolean z13;
        int iO4;
        C4289hr.b bVar3;
        boolean zA2;
        int iU6;
        int iO5;
        boolean z14;
        int size3;
        C4289hr.b bVar4;
        int i16;
        ConstraintLayout constraintLayout;
        int childCount;
        int i17;
        ArrayList<androidx.constraintlayout.widget.b> arrayList4;
        int size4;
        int i18;
        View childAt;
        e eVar;
        a aVar7;
        TK tk3;
        TK tk4;
        TK tk5;
        TK tk6;
        TK.a aVarN;
        TK.a aVarN2;
        int i19;
        boolean z15;
        C3654ep0 c3654ep0;
        C6600sd2 c6600sd2;
        int iMin;
        boolean z16;
        boolean z17;
        UK uk2;
        int i20;
        int i21;
        Iterator<TK> it;
        boolean z18;
        boolean z19;
        int i22;
        boolean z20;
        int i23;
        TK tk7;
        boolean z21;
        TK.a[] aVarArr2;
        boolean z22;
        boolean z23;
        boolean z24;
        int mode = View.MeasureSpec.getMode(i2);
        int size5 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size6 = View.MeasureSpec.getSize(i3);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i24 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        b bVar5 = this.s;
        bVar5.b = iMax5;
        bVar5.c = iMax6;
        bVar5.d = paddingWidth;
        bVar5.e = i24;
        bVar5.f = i2;
        bVar5.g = i3;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (f()) {
            iMax7 = iMax8;
        }
        int i25 = size5 - paddingWidth;
        int i26 = size6 - i24;
        int i27 = bVar5.e;
        int i28 = bVar5.d;
        TK.a aVar8 = TK.a.d;
        int childCount2 = getChildCount();
        TK.a aVar9 = TK.a.e;
        int i29 = Integer.MIN_VALUE;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount2 == 0) {
                    iMax = Math.max(0, this.h);
                } else {
                    iMax = 0;
                }
                i29 = Integer.MIN_VALUE;
            } else if (mode != 1073741824) {
                i27 = i27;
                aVar9 = aVar8;
                iMax = 0;
            } else {
                iMax = Math.min(this.j - i28, i25);
                i27 = i27;
                aVar9 = aVar8;
            }
            if (mode2 != i29) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        aVar = aVar8;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.k - i27, i26);
                        aVar = aVar8;
                    }
                } else if (childCount2 == 0) {
                    aVar = aVar9;
                    iMax2 = Math.max(0, this.i);
                } else {
                    iMax2 = 0;
                }
                iU = uk.u();
                cx = uk.w0;
                if (iMax == iU || iMax2 != uk.o()) {
                    cx.c = true;
                }
                uk.a0 = 0;
                uk.b0 = 0;
                int i30 = this.j - i28;
                int[] iArr = uk.C;
                iArr[0] = i30;
                iArr[1] = this.k - i27;
                uk.d0 = 0;
                uk.e0 = 0;
                uk.Q(aVar9);
                uk.S(iMax);
                uk.R(aVar);
                uk.P(iMax2);
                i4 = this.h - i28;
                if (i4 < 0) {
                    uk.d0 = 0;
                } else {
                    uk.d0 = i4;
                }
                i5 = this.i - i27;
                if (i5 < 0) {
                    uk.e0 = 0;
                } else {
                    uk.e0 = i5;
                }
                uk.B0 = iMax7;
                uk.C0 = iMax5;
                c4289hr = uk.v0;
                c4289hr.getClass();
                bVar = uk.y0;
                size = uk.u0.size();
                iU2 = uk.u();
                iO = uk.o();
                zB = Y91.b(i, UserVerificationMethods.USER_VERIFY_PATTERN);
                if (!zB || Y91.b(i, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                aVar2 = TK.a.g;
                if (z) {
                    i23 = 0;
                    while (true) {
                        if (i23 < size) {
                            tk7 = uk.u0.get(i23);
                            z21 = z;
                            aVarArr2 = tk7.U;
                            if (aVarArr2[0] == aVar2) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if (aVarArr2[1] == aVar2) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if (z22 || !z23 || tk7.Y <= 0.0f) {
                                z24 = false;
                            } else {
                                z24 = true;
                            }
                            if ((tk7.B() || !z24) && !((tk7.C() && z24) || (tk7 instanceof We2) || tk7.B() || tk7.C())) {
                                i23++;
                                z = z21;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = z;
                        }
                    }
                } else {
                    z2 = z;
                }
                z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
                if (z3) {
                    int iMin2 = Math.min(uk.C[0], i25);
                    iMin = Math.min(uk.C[1], i26);
                    if (mode == 1073741824 || uk.u() == iMin2) {
                        z16 = true;
                    } else {
                        uk.S(iMin2);
                        z16 = true;
                        uk.w0.b = true;
                    }
                    if (mode2 == 1073741824 && uk.o() != iMin) {
                        uk.P(iMin);
                        uk.w0.b = z16;
                    }
                    if (mode == 1073741824 || mode2 != 1073741824) {
                        z4 = z3;
                        bVar = bVar;
                        i6 = size;
                        aVar3 = aVar8;
                        aVar4 = aVar9;
                        z17 = cx.b;
                        uk2 = cx.a;
                        if (z17) {
                            it = uk2.u0.iterator();
                            while (it.hasNext()) {
                                TK next = it.next();
                                next.l();
                                next.a = false;
                                C3654ep0 c3654ep1 = next.d;
                                Iterator<TK> it2 = it;
                                c3654ep1.e.j = false;
                                c3654ep1.g = false;
                                c3654ep1.n();
                                C6600sd2 c6600sd3 = next.e;
                                c6600sd3.e.j = false;
                                c6600sd3.g = false;
                                c6600sd3.m();
                                it = it2;
                            }
                            i20 = 0;
                            uk2.l();
                            uk2.a = false;
                            C3654ep0 c3654ep2 = uk2.d;
                            c3654ep2.e.j = false;
                            c3654ep2.g = false;
                            c3654ep2.n();
                            C6600sd2 c6600sd4 = uk2.e;
                            c6600sd4.e.j = false;
                            c6600sd4.g = false;
                            c6600sd4.m();
                            cx.c();
                        } else {
                            i20 = 0;
                        }
                        cx.b(cx.d);
                        uk2.a0 = i20;
                        uk2.b0 = i20;
                        uk2.d.h.d(i20);
                        uk2.e.h.d(i20);
                        i21 = 1073741824;
                        if (mode == 1073741824) {
                            zY = uk.Y(i20, zB);
                            i7 = 1;
                        } else {
                            i7 = 0;
                            zY = true;
                        }
                        if (mode2 == 1073741824) {
                            zY &= uk.Y(1, zB);
                            i7++;
                        }
                    } else {
                        boolean z25 = cx.b;
                        UK uk3 = cx.a;
                        if (z25 || cx.c) {
                            for (TK tk8 : uk3.u0) {
                                tk8.l();
                                tk8.a = false;
                                tk8.d.n();
                                tk8.e.m();
                            }
                            uk3.l();
                            i22 = 0;
                            uk3.a = false;
                            uk3.d.n();
                            uk3.e.m();
                            cx.c = false;
                        } else {
                            i22 = 0;
                        }
                        cx.b(cx.d);
                        uk3.a0 = i22;
                        uk3.b0 = i22;
                        TK.a aVarN3 = uk3.n(i22);
                        TK.a aVarN4 = uk3.n(1);
                        if (cx.b) {
                            cx.c();
                        }
                        int iV = uk3.v();
                        z4 = z3;
                        int iW = uk3.w();
                        i6 = size;
                        uk3.d.h.d(iV);
                        uk3.e.h.d(iW);
                        cx.g();
                        ArrayList<Fi2> arrayList5 = cx.e;
                        aVar4 = aVar9;
                        if (aVarN3 == aVar4 || aVarN4 == aVar4) {
                            if (zB) {
                                Iterator<Fi2> it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    if (!it3.next().k()) {
                                        zB = false;
                                        break;
                                    }
                                }
                            }
                            if (zB && aVarN3 == aVar4) {
                                aVar3 = aVar8;
                                uk3.Q(aVar3);
                                uk3.S(cx.d(uk3, 0));
                                uk3.d.e.d(uk3.u());
                            } else {
                                aVar3 = aVar8;
                            }
                            if (zB && aVarN4 == aVar4) {
                                uk3.R(aVar3);
                                uk3.P(cx.d(uk3, 1));
                                uk3.e.e.d(uk3.o());
                            }
                        } else {
                            iV = iV;
                            aVar3 = aVar8;
                            arrayList5 = arrayList5;
                        }
                        TK.a aVar10 = uk3.U[0];
                        TK.a aVar11 = TK.a.h;
                        if (aVar10 == aVar3 || aVar10 == aVar11) {
                            int iU7 = uk3.u() + iV;
                            uk3.d.i.d(iU7);
                            uk3.d.e.d(iU7 - iV);
                            cx.g();
                            TK.a aVar12 = uk3.U[1];
                            if (aVar12 == aVar3 || aVar12 == aVar11) {
                                int iO6 = uk3.o() + iW;
                                uk3.e.i.d(iO6);
                                uk3.e.e.d(iO6 - iW);
                            }
                            cx.g();
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        for (Fi2 fi2 : arrayList5) {
                            if (fi2.b != uk3 || fi2.g) {
                                fi2.e();
                            }
                        }
                        Iterator<Fi2> it4 = arrayList5.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                zY = true;
                                break;
                            }
                            Fi2 next2 = it4.next();
                            if (z20 || next2.b != uk3) {
                                if (!next2.h.j || ((!next2.i.j && !(next2 instanceof C5799on0)) || (!next2.e.j && !(next2 instanceof C6883tz) && !(next2 instanceof C5799on0)))) {
                                    zY = false;
                                    break;
                                }
                            }
                        }
                        uk3.Q(aVarN3);
                        uk3.R(aVarN4);
                        i21 = 1073741824;
                        i7 = 2;
                    }
                    if (zY) {
                        if (mode == i21) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (mode2 == i21) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        uk.T(z18, z19);
                    }
                } else {
                    z4 = z3;
                    bVar = bVar;
                    i6 = size;
                    aVar3 = aVar8;
                    aVar4 = aVar9;
                    i7 = 0;
                    zY = false;
                }
                if (zY || i7 != 2) {
                    i8 = uk.H0;
                    if (i6 > 0) {
                        size3 = uk.u0.size();
                        boolean zA0 = uk.a0(64);
                        bVar4 = uk.y0;
                        i16 = 0;
                        while (i16 < size3) {
                            tk6 = uk.u0.get(i16);
                            if (!(tk6 instanceof C5589nn0) || (tk6 instanceof C6017pq) || tk6.G || (zA0 && (c3654ep0 = tk6.d) != null && (c6600sd2 = tk6.e) != null && c3654ep0.e.j && c6600sd2.e.j)) {
                                i19 = size3;
                            } else {
                                aVarN = tk6.n(0);
                                aVarN2 = tk6.n(1);
                                i19 = size3;
                                if (aVarN == aVar2 || tk6.r == 1 || aVarN2 != aVar2 || tk6.s == 1) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                if (!z15 && uk.a0(1) && !(tk6 instanceof We2)) {
                                    if (aVarN == aVar2 && tk6.r == 0 && aVarN2 != aVar2 && !tk6.B()) {
                                        z15 = true;
                                    }
                                    if (aVarN2 == aVar2 && tk6.s == 0 && aVarN != aVar2 && !tk6.B()) {
                                        z15 = true;
                                    }
                                    if ((aVarN != aVar2 || aVarN2 == aVar2) && tk6.Y > 0.0f) {
                                    }
                                }
                                if (z15) {
                                    c4289hr.a(0, bVar4, tk6);
                                }
                            }
                            i16++;
                            size3 = i19;
                        }
                        constraintLayout = ((b) bVar4).a;
                        childCount = constraintLayout.getChildCount();
                        for (i17 = 0; i17 < childCount; i17++) {
                            childAt = constraintLayout.getChildAt(i17);
                            if (childAt instanceof e) {
                                eVar = (e) childAt;
                                if (eVar.e == null) {
                                    a aVar13 = (a) eVar.getLayoutParams();
                                    aVar7 = (a) eVar.e.getLayoutParams();
                                    tk3 = aVar7.q0;
                                    tk3.i0 = 0;
                                    tk4 = aVar13.q0;
                                    if (tk4.U[0] != aVar3) {
                                        tk4.S(tk3.u());
                                    }
                                    tk5 = aVar13.q0;
                                    if (tk5.U[1] != aVar3) {
                                        tk5.P(aVar7.q0.o());
                                    }
                                    aVar7.q0.i0 = 8;
                                }
                            }
                        }
                        arrayList4 = constraintLayout.e;
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            for (i18 = 0; i18 < size4; i18++) {
                                arrayList4.get(i18).getClass();
                            }
                        }
                    }
                    c4289hr.c(uk);
                    arrayList = c4289hr.a;
                    size2 = arrayList.size();
                    if (i6 > 0) {
                        c4289hr.b(uk, 0, iU2, iO);
                    }
                    if (size2 > 0) {
                        aVarArr = uk.U;
                        if (aVarArr[0] == aVar4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (aVarArr[1] == aVar4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        int iU8 = uk.u();
                        UK uk4 = c4289hr.c;
                        iMax3 = Math.max(iU8, uk4.d0);
                        iMax4 = Math.max(uk.o(), uk4.e0);
                        i10 = 0;
                        z7 = false;
                        while (true) {
                            aVar5 = IK.a.h;
                            aVar6 = IK.a.g;
                            if (i10 < size2) {
                                break;
                            }
                            tk2 = arrayList.get(i10);
                            z12 = z6;
                            if (tk2 instanceof We2) {
                                iU5 = tk2.u();
                                z13 = z5;
                                iO4 = tk2.o();
                                boolean z26 = z7;
                                bVar3 = bVar;
                                zA2 = z26 | c4289hr.a(1, bVar3, tk2);
                                iU6 = tk2.u();
                                iO5 = tk2.o();
                                if (iU6 != iU5) {
                                    tk2.S(iU6);
                                    if (z13 && tk2.v() + tk2.W > iMax3) {
                                        iMax3 = Math.max(iMax3, tk2.m(aVar6).e() + tk2.v() + tk2.W);
                                    }
                                    zA2 = true;
                                }
                                if (iO5 != iO4) {
                                    tk2.P(iO5);
                                    if (z12 && tk2.w() + tk2.X > iMax4) {
                                        iMax4 = Math.max(iMax4, tk2.m(aVar5).e() + tk2.w() + tk2.X);
                                    }
                                    zA2 = true;
                                }
                                z14 = zA2 | ((We2) tk2).C0;
                            } else {
                                z13 = z5;
                                z14 = z7;
                                bVar3 = bVar;
                            }
                            i10++;
                            bVar = bVar3;
                            z5 = z13;
                            i8 = i8;
                            z7 = z14;
                            z6 = z12;
                        }
                        z8 = z6;
                        int i31 = i8;
                        z9 = z5;
                        z10 = z7;
                        bVar2 = bVar;
                        i11 = 0;
                        while (i11 < 2) {
                            i12 = 0;
                            while (i12 < size2) {
                                tk = arrayList.get(i12);
                                if (((tk instanceof InterfaceC6222qo0) || (tk instanceof We2)) && !(tk instanceof C5589nn0)) {
                                    if (tk.i0 == 8 && ((!z4 || !tk.d.e.j || !tk.e.e.j) && !(tk instanceof We2))) {
                                        iU3 = tk.u();
                                        iO2 = tk.o();
                                        i14 = i12;
                                        int i32 = tk.c0;
                                        arrayList3 = arrayList;
                                        zA = z10 | c4289hr.a(i11 == 1 ? 2 : 1, bVar2, tk);
                                        iU4 = tk.u();
                                        i15 = size2;
                                        iO3 = tk.o();
                                        if (iU4 != iU3) {
                                            tk.S(iU4);
                                            if (z9 && tk.v() + tk.W > iMax3) {
                                                iMax3 = Math.max(iMax3, tk.m(aVar6).e() + tk.v() + tk.W);
                                            }
                                            zA = true;
                                        }
                                        if (iO3 != iO2) {
                                            tk.P(iO3);
                                            if (z8 && tk.w() + tk.X > iMax4) {
                                                iMax4 = Math.max(iMax4, tk.m(aVar5).e() + tk.w() + tk.X);
                                            }
                                            z11 = true;
                                        } else {
                                            z11 = zA;
                                        }
                                        if (tk.E || i32 == tk.c0) {
                                            z10 = z11;
                                        } else {
                                            z10 = true;
                                        }
                                    }
                                    i12 = i14 + 1;
                                    arrayList = arrayList3;
                                    size2 = i15;
                                }
                                i14 = i12;
                                arrayList3 = arrayList;
                                i15 = size2;
                                i12 = i14 + 1;
                                arrayList = arrayList3;
                                size2 = i15;
                            }
                            arrayList2 = arrayList;
                            i13 = size2;
                            if (z10) {
                                break;
                            }
                            i11++;
                            c4289hr.b(uk, i11, iU2, iO);
                            arrayList = arrayList2;
                            size2 = i13;
                            z10 = false;
                        }
                        i9 = i31;
                    } else {
                        i9 = i8;
                    }
                    uk.H0 = i9;
                    C4874kQ0.p = uk.a0(UserVerificationMethods.USER_VERIFY_NONE);
                }
                return;
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.i);
            } else {
                iMax2 = i26;
            }
            aVar = aVar9;
            iU = uk.u();
            cx = uk.w0;
            if (iMax == iU) {
                cx.c = true;
            } else {
                cx.c = true;
            }
            uk.a0 = 0;
            uk.b0 = 0;
            int i33 = this.j - i28;
            int[] iArr2 = uk.C;
            iArr2[0] = i33;
            iArr2[1] = this.k - i27;
            uk.d0 = 0;
            uk.e0 = 0;
            uk.Q(aVar9);
            uk.S(iMax);
            uk.R(aVar);
            uk.P(iMax2);
            i4 = this.h - i28;
            if (i4 < 0) {
                uk.d0 = 0;
            } else {
                uk.d0 = i4;
            }
            i5 = this.i - i27;
            if (i5 < 0) {
                uk.e0 = 0;
            } else {
                uk.e0 = i5;
            }
            uk.B0 = iMax7;
            uk.C0 = iMax5;
            c4289hr = uk.v0;
            c4289hr.getClass();
            bVar = uk.y0;
            size = uk.u0.size();
            iU2 = uk.u();
            iO = uk.o();
            zB = Y91.b(i, UserVerificationMethods.USER_VERIFY_PATTERN);
            if (zB) {
                z = true;
            } else {
                z = true;
            }
            aVar2 = TK.a.g;
            if (z) {
                i23 = 0;
                while (true) {
                    if (i23 < size) {
                        tk7 = uk.u0.get(i23);
                        z21 = z;
                        aVarArr2 = tk7.U;
                        if (aVarArr2[0] == aVar2) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (aVarArr2[1] == aVar2) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (z22) {
                            z24 = false;
                        } else {
                            z24 = false;
                        }
                        if (tk7.B()) {
                            i23++;
                            z = z21;
                        } else {
                            i23++;
                            z = z21;
                        }
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                }
            } else {
                z2 = z;
            }
            z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
            if (z3) {
                int iMin3 = Math.min(uk.C[0], i25);
                iMin = Math.min(uk.C[1], i26);
                if (mode == 1073741824) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (mode2 == 1073741824) {
                    uk.P(iMin);
                    uk.w0.b = z16;
                }
                if (mode == 1073741824) {
                    z4 = z3;
                    bVar = bVar;
                    i6 = size;
                    aVar3 = aVar8;
                    aVar4 = aVar9;
                    z17 = cx.b;
                    uk2 = cx.a;
                    if (z17) {
                        it = uk2.u0.iterator();
                        while (it.hasNext()) {
                            TK next3 = it.next();
                            next3.l();
                            next3.a = false;
                            C3654ep0 c3654ep3 = next3.d;
                            Iterator<TK> it5 = it;
                            c3654ep3.e.j = false;
                            c3654ep3.g = false;
                            c3654ep3.n();
                            C6600sd2 c6600sd5 = next3.e;
                            c6600sd5.e.j = false;
                            c6600sd5.g = false;
                            c6600sd5.m();
                            it = it5;
                        }
                        i20 = 0;
                        uk2.l();
                        uk2.a = false;
                        C3654ep0 c3654ep4 = uk2.d;
                        c3654ep4.e.j = false;
                        c3654ep4.g = false;
                        c3654ep4.n();
                        C6600sd2 c6600sd6 = uk2.e;
                        c6600sd6.e.j = false;
                        c6600sd6.g = false;
                        c6600sd6.m();
                        cx.c();
                    } else {
                        i20 = 0;
                    }
                    cx.b(cx.d);
                    uk2.a0 = i20;
                    uk2.b0 = i20;
                    uk2.d.h.d(i20);
                    uk2.e.h.d(i20);
                    i21 = 1073741824;
                    if (mode == 1073741824) {
                        zY = uk.Y(i20, zB);
                        i7 = 1;
                    } else {
                        i7 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= uk.Y(1, zB);
                        i7++;
                    }
                } else {
                    z4 = z3;
                    bVar = bVar;
                    i6 = size;
                    aVar3 = aVar8;
                    aVar4 = aVar9;
                    z17 = cx.b;
                    uk2 = cx.a;
                    if (z17) {
                        it = uk2.u0.iterator();
                        while (it.hasNext()) {
                            TK next4 = it.next();
                            next4.l();
                            next4.a = false;
                            C3654ep0 c3654ep5 = next4.d;
                            Iterator<TK> it6 = it;
                            c3654ep5.e.j = false;
                            c3654ep5.g = false;
                            c3654ep5.n();
                            C6600sd2 c6600sd7 = next4.e;
                            c6600sd7.e.j = false;
                            c6600sd7.g = false;
                            c6600sd7.m();
                            it = it6;
                        }
                        i20 = 0;
                        uk2.l();
                        uk2.a = false;
                        C3654ep0 c3654ep6 = uk2.d;
                        c3654ep6.e.j = false;
                        c3654ep6.g = false;
                        c3654ep6.n();
                        C6600sd2 c6600sd8 = uk2.e;
                        c6600sd8.e.j = false;
                        c6600sd8.g = false;
                        c6600sd8.m();
                        cx.c();
                    } else {
                        i20 = 0;
                    }
                    cx.b(cx.d);
                    uk2.a0 = i20;
                    uk2.b0 = i20;
                    uk2.d.h.d(i20);
                    uk2.e.h.d(i20);
                    i21 = 1073741824;
                    if (mode == 1073741824) {
                        zY = uk.Y(i20, zB);
                        i7 = 1;
                    } else {
                        i7 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= uk.Y(1, zB);
                        i7++;
                    }
                }
                if (zY) {
                    if (mode == i21) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (mode2 == i21) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    uk.T(z18, z19);
                }
            } else {
                z4 = z3;
                bVar = bVar;
                i6 = size;
                aVar3 = aVar8;
                aVar4 = aVar9;
                i7 = 0;
                zY = false;
            }
            if (zY) {
            }
            i8 = uk.H0;
            if (i6 > 0) {
                size3 = uk.u0.size();
                boolean zA1 = uk.a0(64);
                bVar4 = uk.y0;
                i16 = 0;
                while (i16 < size3) {
                    tk6 = uk.u0.get(i16);
                    if (!(tk6 instanceof C5589nn0)) {
                        i19 = size3;
                    } else {
                        aVarN = tk6.n(0);
                        aVarN2 = tk6.n(1);
                        i19 = size3;
                        if (aVarN == aVar2) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            if (aVarN == aVar2) {
                                z15 = true;
                            }
                            if (aVarN2 == aVar2) {
                                z15 = true;
                            }
                            z15 = aVarN != aVar2 ? true : true;
                        }
                        if (z15) {
                            c4289hr.a(0, bVar4, tk6);
                        }
                    }
                    i16++;
                    size3 = i19;
                }
                constraintLayout = ((b) bVar4).a;
                childCount = constraintLayout.getChildCount();
                while (i17 < childCount) {
                    childAt = constraintLayout.getChildAt(i17);
                    if (childAt instanceof e) {
                        eVar = (e) childAt;
                        if (eVar.e == null) {
                            a aVar14 = (a) eVar.getLayoutParams();
                            aVar7 = (a) eVar.e.getLayoutParams();
                            tk3 = aVar7.q0;
                            tk3.i0 = 0;
                            tk4 = aVar14.q0;
                            if (tk4.U[0] != aVar3) {
                                tk4.S(tk3.u());
                            }
                            tk5 = aVar14.q0;
                            if (tk5.U[1] != aVar3) {
                                tk5.P(aVar7.q0.o());
                            }
                            aVar7.q0.i0 = 8;
                        }
                    }
                }
                arrayList4 = constraintLayout.e;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i18 < size4) {
                        arrayList4.get(i18).getClass();
                    }
                }
            }
            c4289hr.c(uk);
            arrayList = c4289hr.a;
            size2 = arrayList.size();
            if (i6 > 0) {
                c4289hr.b(uk, 0, iU2, iO);
            }
            if (size2 > 0) {
                aVarArr = uk.U;
                if (aVarArr[0] == aVar4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (aVarArr[1] == aVar4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int iU9 = uk.u();
                UK uk5 = c4289hr.c;
                iMax3 = Math.max(iU9, uk5.d0);
                iMax4 = Math.max(uk.o(), uk5.e0);
                i10 = 0;
                z7 = false;
                while (true) {
                    aVar5 = IK.a.h;
                    aVar6 = IK.a.g;
                    if (i10 < size2) {
                        break;
                        break;
                    }
                    tk2 = arrayList.get(i10);
                    z12 = z6;
                    if (tk2 instanceof We2) {
                        z13 = z5;
                        z14 = z7;
                        bVar3 = bVar;
                    } else {
                        iU5 = tk2.u();
                        z13 = z5;
                        iO4 = tk2.o();
                        boolean z27 = z7;
                        bVar3 = bVar;
                        zA2 = z27 | c4289hr.a(1, bVar3, tk2);
                        iU6 = tk2.u();
                        iO5 = tk2.o();
                        if (iU6 != iU5) {
                            tk2.S(iU6);
                            if (z13) {
                                iMax3 = Math.max(iMax3, tk2.m(aVar6).e() + tk2.v() + tk2.W);
                            }
                            zA2 = true;
                        }
                        if (iO5 != iO4) {
                            tk2.P(iO5);
                            if (z12) {
                                iMax4 = Math.max(iMax4, tk2.m(aVar5).e() + tk2.w() + tk2.X);
                            }
                            zA2 = true;
                        }
                        z14 = zA2 | ((We2) tk2).C0;
                    }
                    i10++;
                    bVar = bVar3;
                    z5 = z13;
                    i8 = i8;
                    z7 = z14;
                    z6 = z12;
                }
                z8 = z6;
                int i34 = i8;
                z9 = z5;
                z10 = z7;
                bVar2 = bVar;
                i11 = 0;
                while (i11 < 2) {
                    i12 = 0;
                    while (i12 < size2) {
                        tk = arrayList.get(i12);
                        if (tk instanceof InterfaceC6222qo0) {
                            if (tk.i0 == 8) {
                                i14 = i12;
                                arrayList3 = arrayList;
                                i15 = size2;
                            } else {
                                iU3 = tk.u();
                                iO2 = tk.o();
                                i14 = i12;
                                int i35 = tk.c0;
                                arrayList3 = arrayList;
                                zA = z10 | c4289hr.a(i11 == 1 ? 2 : 1, bVar2, tk);
                                iU4 = tk.u();
                                i15 = size2;
                                iO3 = tk.o();
                                if (iU4 != iU3) {
                                    tk.S(iU4);
                                    if (z9) {
                                        iMax3 = Math.max(iMax3, tk.m(aVar6).e() + tk.v() + tk.W);
                                    }
                                    zA = true;
                                }
                                if (iO3 != iO2) {
                                    tk.P(iO3);
                                    if (z8) {
                                        iMax4 = Math.max(iMax4, tk.m(aVar5).e() + tk.w() + tk.X);
                                    }
                                    z11 = true;
                                } else {
                                    z11 = zA;
                                }
                                if (tk.E) {
                                    z10 = z11;
                                } else {
                                    z10 = z11;
                                }
                            }
                        } else if (tk.i0 == 8) {
                            i14 = i12;
                            arrayList3 = arrayList;
                            i15 = size2;
                        } else {
                            iU3 = tk.u();
                            iO2 = tk.o();
                            i14 = i12;
                            int i36 = tk.c0;
                            arrayList3 = arrayList;
                            zA = z10 | c4289hr.a(i11 == 1 ? 2 : 1, bVar2, tk);
                            iU4 = tk.u();
                            i15 = size2;
                            iO3 = tk.o();
                            if (iU4 != iU3) {
                                tk.S(iU4);
                                if (z9) {
                                    iMax3 = Math.max(iMax3, tk.m(aVar6).e() + tk.v() + tk.W);
                                }
                                zA = true;
                            }
                            if (iO3 != iO2) {
                                tk.P(iO3);
                                if (z8) {
                                    iMax4 = Math.max(iMax4, tk.m(aVar5).e() + tk.w() + tk.X);
                                }
                                z11 = true;
                            } else {
                                z11 = zA;
                            }
                            if (tk.E) {
                                z10 = z11;
                            } else {
                                z10 = z11;
                            }
                        }
                        i12 = i14 + 1;
                        arrayList = arrayList3;
                        size2 = i15;
                    }
                    arrayList2 = arrayList;
                    i13 = size2;
                    if (z10) {
                        break;
                        break;
                    }
                    i11++;
                    c4289hr.b(uk, i11, iU2, iO);
                    arrayList = arrayList2;
                    size2 = i13;
                    z10 = false;
                }
                i9 = i34;
            } else {
                i9 = i8;
            }
            uk.H0 = i9;
            C4874kQ0.p = uk.a0(UserVerificationMethods.USER_VERIFY_NONE);
        }
        iMax = childCount2 == 0 ? Math.max(0, this.h) : i25;
        i29 = Integer.MIN_VALUE;
        if (mode2 != i29) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    aVar = aVar8;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.k - i27, i26);
                    aVar = aVar8;
                }
            } else if (childCount2 == 0) {
                aVar = aVar9;
                iMax2 = Math.max(0, this.i);
            } else {
                iMax2 = 0;
            }
            iU = uk.u();
            cx = uk.w0;
            if (iMax == iU) {
                cx.c = true;
            } else {
                cx.c = true;
            }
            uk.a0 = 0;
            uk.b0 = 0;
            int i37 = this.j - i28;
            int[] iArr3 = uk.C;
            iArr3[0] = i37;
            iArr3[1] = this.k - i27;
            uk.d0 = 0;
            uk.e0 = 0;
            uk.Q(aVar9);
            uk.S(iMax);
            uk.R(aVar);
            uk.P(iMax2);
            i4 = this.h - i28;
            if (i4 < 0) {
                uk.d0 = 0;
            } else {
                uk.d0 = i4;
            }
            i5 = this.i - i27;
            if (i5 < 0) {
                uk.e0 = 0;
            } else {
                uk.e0 = i5;
            }
            uk.B0 = iMax7;
            uk.C0 = iMax5;
            c4289hr = uk.v0;
            c4289hr.getClass();
            bVar = uk.y0;
            size = uk.u0.size();
            iU2 = uk.u();
            iO = uk.o();
            zB = Y91.b(i, UserVerificationMethods.USER_VERIFY_PATTERN);
            if (zB) {
                z = true;
            } else {
                z = true;
            }
            aVar2 = TK.a.g;
            if (z) {
                i23 = 0;
                while (true) {
                    if (i23 < size) {
                        tk7 = uk.u0.get(i23);
                        z21 = z;
                        aVarArr2 = tk7.U;
                        if (aVarArr2[0] == aVar2) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (aVarArr2[1] == aVar2) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (z22) {
                            z24 = false;
                        } else {
                            z24 = false;
                        }
                        if (tk7.B()) {
                            i23++;
                            z = z21;
                        } else {
                            i23++;
                            z = z21;
                        }
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                }
            } else {
                z2 = z;
            }
            z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
            if (z3) {
                int iMin4 = Math.min(uk.C[0], i25);
                iMin = Math.min(uk.C[1], i26);
                if (mode == 1073741824) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (mode2 == 1073741824) {
                    uk.P(iMin);
                    uk.w0.b = z16;
                }
                if (mode == 1073741824) {
                    z4 = z3;
                    bVar = bVar;
                    i6 = size;
                    aVar3 = aVar8;
                    aVar4 = aVar9;
                    z17 = cx.b;
                    uk2 = cx.a;
                    if (z17) {
                        it = uk2.u0.iterator();
                        while (it.hasNext()) {
                            TK next5 = it.next();
                            next5.l();
                            next5.a = false;
                            C3654ep0 c3654ep7 = next5.d;
                            Iterator<TK> it7 = it;
                            c3654ep7.e.j = false;
                            c3654ep7.g = false;
                            c3654ep7.n();
                            C6600sd2 c6600sd9 = next5.e;
                            c6600sd9.e.j = false;
                            c6600sd9.g = false;
                            c6600sd9.m();
                            it = it7;
                        }
                        i20 = 0;
                        uk2.l();
                        uk2.a = false;
                        C3654ep0 c3654ep8 = uk2.d;
                        c3654ep8.e.j = false;
                        c3654ep8.g = false;
                        c3654ep8.n();
                        C6600sd2 c6600sd10 = uk2.e;
                        c6600sd10.e.j = false;
                        c6600sd10.g = false;
                        c6600sd10.m();
                        cx.c();
                    } else {
                        i20 = 0;
                    }
                    cx.b(cx.d);
                    uk2.a0 = i20;
                    uk2.b0 = i20;
                    uk2.d.h.d(i20);
                    uk2.e.h.d(i20);
                    i21 = 1073741824;
                    if (mode == 1073741824) {
                        zY = uk.Y(i20, zB);
                        i7 = 1;
                    } else {
                        i7 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= uk.Y(1, zB);
                        i7++;
                    }
                } else {
                    z4 = z3;
                    bVar = bVar;
                    i6 = size;
                    aVar3 = aVar8;
                    aVar4 = aVar9;
                    z17 = cx.b;
                    uk2 = cx.a;
                    if (z17) {
                        it = uk2.u0.iterator();
                        while (it.hasNext()) {
                            TK next6 = it.next();
                            next6.l();
                            next6.a = false;
                            C3654ep0 c3654ep9 = next6.d;
                            Iterator<TK> it8 = it;
                            c3654ep9.e.j = false;
                            c3654ep9.g = false;
                            c3654ep9.n();
                            C6600sd2 c6600sd11 = next6.e;
                            c6600sd11.e.j = false;
                            c6600sd11.g = false;
                            c6600sd11.m();
                            it = it8;
                        }
                        i20 = 0;
                        uk2.l();
                        uk2.a = false;
                        C3654ep0 c3654ep10 = uk2.d;
                        c3654ep10.e.j = false;
                        c3654ep10.g = false;
                        c3654ep10.n();
                        C6600sd2 c6600sd12 = uk2.e;
                        c6600sd12.e.j = false;
                        c6600sd12.g = false;
                        c6600sd12.m();
                        cx.c();
                    } else {
                        i20 = 0;
                    }
                    cx.b(cx.d);
                    uk2.a0 = i20;
                    uk2.b0 = i20;
                    uk2.d.h.d(i20);
                    uk2.e.h.d(i20);
                    i21 = 1073741824;
                    if (mode == 1073741824) {
                        zY = uk.Y(i20, zB);
                        i7 = 1;
                    } else {
                        i7 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= uk.Y(1, zB);
                        i7++;
                    }
                }
                if (zY) {
                    if (mode == i21) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (mode2 == i21) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    uk.T(z18, z19);
                }
            } else {
                z4 = z3;
                bVar = bVar;
                i6 = size;
                aVar3 = aVar8;
                aVar4 = aVar9;
                i7 = 0;
                zY = false;
            }
            if (zY) {
            }
            i8 = uk.H0;
            if (i6 > 0) {
                size3 = uk.u0.size();
                boolean zA3 = uk.a0(64);
                bVar4 = uk.y0;
                i16 = 0;
                while (i16 < size3) {
                    tk6 = uk.u0.get(i16);
                    if (!(tk6 instanceof C5589nn0)) {
                        i19 = size3;
                    } else {
                        aVarN = tk6.n(0);
                        aVarN2 = tk6.n(1);
                        i19 = size3;
                        if (aVarN == aVar2) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                            if (aVarN == aVar2) {
                                z15 = true;
                            }
                            if (aVarN2 == aVar2) {
                                z15 = true;
                            }
                            if (aVarN != aVar2) {
                            }
                        }
                        if (z15) {
                            c4289hr.a(0, bVar4, tk6);
                        }
                    }
                    i16++;
                    size3 = i19;
                }
                constraintLayout = ((b) bVar4).a;
                childCount = constraintLayout.getChildCount();
                while (i17 < childCount) {
                    childAt = constraintLayout.getChildAt(i17);
                    if (childAt instanceof e) {
                        eVar = (e) childAt;
                        if (eVar.e == null) {
                            a aVar15 = (a) eVar.getLayoutParams();
                            aVar7 = (a) eVar.e.getLayoutParams();
                            tk3 = aVar7.q0;
                            tk3.i0 = 0;
                            tk4 = aVar15.q0;
                            if (tk4.U[0] != aVar3) {
                                tk4.S(tk3.u());
                            }
                            tk5 = aVar15.q0;
                            if (tk5.U[1] != aVar3) {
                                tk5.P(aVar7.q0.o());
                            }
                            aVar7.q0.i0 = 8;
                        }
                    }
                }
                arrayList4 = constraintLayout.e;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i18 < size4) {
                        arrayList4.get(i18).getClass();
                    }
                }
            }
            c4289hr.c(uk);
            arrayList = c4289hr.a;
            size2 = arrayList.size();
            if (i6 > 0) {
                c4289hr.b(uk, 0, iU2, iO);
            }
            if (size2 > 0) {
                aVarArr = uk.U;
                if (aVarArr[0] == aVar4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (aVarArr[1] == aVar4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int iU10 = uk.u();
                UK uk6 = c4289hr.c;
                iMax3 = Math.max(iU10, uk6.d0);
                iMax4 = Math.max(uk.o(), uk6.e0);
                i10 = 0;
                z7 = false;
                while (true) {
                    aVar5 = IK.a.h;
                    aVar6 = IK.a.g;
                    if (i10 < size2) {
                        break;
                        break;
                    }
                    tk2 = arrayList.get(i10);
                    z12 = z6;
                    if (tk2 instanceof We2) {
                        z13 = z5;
                        z14 = z7;
                        bVar3 = bVar;
                    } else {
                        iU5 = tk2.u();
                        z13 = z5;
                        iO4 = tk2.o();
                        boolean z28 = z7;
                        bVar3 = bVar;
                        zA2 = z28 | c4289hr.a(1, bVar3, tk2);
                        iU6 = tk2.u();
                        iO5 = tk2.o();
                        if (iU6 != iU5) {
                            tk2.S(iU6);
                            if (z13) {
                                iMax3 = Math.max(iMax3, tk2.m(aVar6).e() + tk2.v() + tk2.W);
                            }
                            zA2 = true;
                        }
                        if (iO5 != iO4) {
                            tk2.P(iO5);
                            if (z12) {
                                iMax4 = Math.max(iMax4, tk2.m(aVar5).e() + tk2.w() + tk2.X);
                            }
                            zA2 = true;
                        }
                        z14 = zA2 | ((We2) tk2).C0;
                    }
                    i10++;
                    bVar = bVar3;
                    z5 = z13;
                    i8 = i8;
                    z7 = z14;
                    z6 = z12;
                }
                z8 = z6;
                int i38 = i8;
                z9 = z5;
                z10 = z7;
                bVar2 = bVar;
                i11 = 0;
                while (i11 < 2) {
                    i12 = 0;
                    while (i12 < size2) {
                        tk = arrayList.get(i12);
                        if (tk instanceof InterfaceC6222qo0) {
                            if (tk.i0 == 8) {
                                i14 = i12;
                                arrayList3 = arrayList;
                                i15 = size2;
                            } else {
                                iU3 = tk.u();
                                iO2 = tk.o();
                                i14 = i12;
                                int i39 = tk.c0;
                                arrayList3 = arrayList;
                                zA = z10 | c4289hr.a(i11 == 1 ? 2 : 1, bVar2, tk);
                                iU4 = tk.u();
                                i15 = size2;
                                iO3 = tk.o();
                                if (iU4 != iU3) {
                                    tk.S(iU4);
                                    if (z9) {
                                        iMax3 = Math.max(iMax3, tk.m(aVar6).e() + tk.v() + tk.W);
                                    }
                                    zA = true;
                                }
                                if (iO3 != iO2) {
                                    tk.P(iO3);
                                    if (z8) {
                                        iMax4 = Math.max(iMax4, tk.m(aVar5).e() + tk.w() + tk.X);
                                    }
                                    z11 = true;
                                } else {
                                    z11 = zA;
                                }
                                if (tk.E) {
                                    z10 = z11;
                                } else {
                                    z10 = z11;
                                }
                            }
                        } else if (tk.i0 == 8) {
                            i14 = i12;
                            arrayList3 = arrayList;
                            i15 = size2;
                        } else {
                            iU3 = tk.u();
                            iO2 = tk.o();
                            i14 = i12;
                            int i310 = tk.c0;
                            arrayList3 = arrayList;
                            zA = z10 | c4289hr.a(i11 == 1 ? 2 : 1, bVar2, tk);
                            iU4 = tk.u();
                            i15 = size2;
                            iO3 = tk.o();
                            if (iU4 != iU3) {
                                tk.S(iU4);
                                if (z9) {
                                    iMax3 = Math.max(iMax3, tk.m(aVar6).e() + tk.v() + tk.W);
                                }
                                zA = true;
                            }
                            if (iO3 != iO2) {
                                tk.P(iO3);
                                if (z8) {
                                    iMax4 = Math.max(iMax4, tk.m(aVar5).e() + tk.w() + tk.X);
                                }
                                z11 = true;
                            } else {
                                z11 = zA;
                            }
                            if (tk.E) {
                                z10 = z11;
                            } else {
                                z10 = z11;
                            }
                        }
                        i12 = i14 + 1;
                        arrayList = arrayList3;
                        size2 = i15;
                    }
                    arrayList2 = arrayList;
                    i13 = size2;
                    if (z10) {
                        break;
                        break;
                    }
                    i11++;
                    c4289hr.b(uk, i11, iU2, iO);
                    arrayList = arrayList2;
                    size2 = i13;
                    z10 = false;
                }
                i9 = i38;
            } else {
                i9 = i8;
            }
            uk.H0 = i9;
            C4874kQ0.p = uk.a0(UserVerificationMethods.USER_VERIFY_NONE);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.i);
        } else {
            iMax2 = i26;
        }
        aVar = aVar9;
        iU = uk.u();
        cx = uk.w0;
        if (iMax == iU) {
            cx.c = true;
        } else {
            cx.c = true;
        }
        uk.a0 = 0;
        uk.b0 = 0;
        int i311 = this.j - i28;
        int[] iArr4 = uk.C;
        iArr4[0] = i311;
        iArr4[1] = this.k - i27;
        uk.d0 = 0;
        uk.e0 = 0;
        uk.Q(aVar9);
        uk.S(iMax);
        uk.R(aVar);
        uk.P(iMax2);
        i4 = this.h - i28;
        if (i4 < 0) {
            uk.d0 = 0;
        } else {
            uk.d0 = i4;
        }
        i5 = this.i - i27;
        if (i5 < 0) {
            uk.e0 = 0;
        } else {
            uk.e0 = i5;
        }
        uk.B0 = iMax7;
        uk.C0 = iMax5;
        c4289hr = uk.v0;
        c4289hr.getClass();
        bVar = uk.y0;
        size = uk.u0.size();
        iU2 = uk.u();
        iO = uk.o();
        zB = Y91.b(i, UserVerificationMethods.USER_VERIFY_PATTERN);
        if (zB) {
            z = true;
        } else {
            z = true;
        }
        aVar2 = TK.a.g;
        if (z) {
            i23 = 0;
            while (true) {
                if (i23 < size) {
                    tk7 = uk.u0.get(i23);
                    z21 = z;
                    aVarArr2 = tk7.U;
                    if (aVarArr2[0] == aVar2) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (aVarArr2[1] == aVar2) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    if (z22) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    if (tk7.B()) {
                        i23++;
                        z = z21;
                    } else {
                        i23++;
                        z = z21;
                    }
                    z2 = false;
                } else {
                    z2 = z;
                }
            }
        } else {
            z2 = z;
        }
        z3 = z2 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
        if (z3) {
            int iMin5 = Math.min(uk.C[0], i25);
            iMin = Math.min(uk.C[1], i26);
            if (mode == 1073741824) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (mode2 == 1073741824) {
                uk.P(iMin);
                uk.w0.b = z16;
            }
            if (mode == 1073741824) {
                z4 = z3;
                bVar = bVar;
                i6 = size;
                aVar3 = aVar8;
                aVar4 = aVar9;
                z17 = cx.b;
                uk2 = cx.a;
                if (z17) {
                    it = uk2.u0.iterator();
                    while (it.hasNext()) {
                        TK next7 = it.next();
                        next7.l();
                        next7.a = false;
                        C3654ep0 c3654ep11 = next7.d;
                        Iterator<TK> it9 = it;
                        c3654ep11.e.j = false;
                        c3654ep11.g = false;
                        c3654ep11.n();
                        C6600sd2 c6600sd13 = next7.e;
                        c6600sd13.e.j = false;
                        c6600sd13.g = false;
                        c6600sd13.m();
                        it = it9;
                    }
                    i20 = 0;
                    uk2.l();
                    uk2.a = false;
                    C3654ep0 c3654ep12 = uk2.d;
                    c3654ep12.e.j = false;
                    c3654ep12.g = false;
                    c3654ep12.n();
                    C6600sd2 c6600sd14 = uk2.e;
                    c6600sd14.e.j = false;
                    c6600sd14.g = false;
                    c6600sd14.m();
                    cx.c();
                } else {
                    i20 = 0;
                }
                cx.b(cx.d);
                uk2.a0 = i20;
                uk2.b0 = i20;
                uk2.d.h.d(i20);
                uk2.e.h.d(i20);
                i21 = 1073741824;
                if (mode == 1073741824) {
                    zY = uk.Y(i20, zB);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zY = true;
                }
                if (mode2 == 1073741824) {
                    zY &= uk.Y(1, zB);
                    i7++;
                }
            } else {
                z4 = z3;
                bVar = bVar;
                i6 = size;
                aVar3 = aVar8;
                aVar4 = aVar9;
                z17 = cx.b;
                uk2 = cx.a;
                if (z17) {
                    it = uk2.u0.iterator();
                    while (it.hasNext()) {
                        TK next8 = it.next();
                        next8.l();
                        next8.a = false;
                        C3654ep0 c3654ep13 = next8.d;
                        Iterator<TK> it10 = it;
                        c3654ep13.e.j = false;
                        c3654ep13.g = false;
                        c3654ep13.n();
                        C6600sd2 c6600sd15 = next8.e;
                        c6600sd15.e.j = false;
                        c6600sd15.g = false;
                        c6600sd15.m();
                        it = it10;
                    }
                    i20 = 0;
                    uk2.l();
                    uk2.a = false;
                    C3654ep0 c3654ep14 = uk2.d;
                    c3654ep14.e.j = false;
                    c3654ep14.g = false;
                    c3654ep14.n();
                    C6600sd2 c6600sd16 = uk2.e;
                    c6600sd16.e.j = false;
                    c6600sd16.g = false;
                    c6600sd16.m();
                    cx.c();
                } else {
                    i20 = 0;
                }
                cx.b(cx.d);
                uk2.a0 = i20;
                uk2.b0 = i20;
                uk2.d.h.d(i20);
                uk2.e.h.d(i20);
                i21 = 1073741824;
                if (mode == 1073741824) {
                    zY = uk.Y(i20, zB);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zY = true;
                }
                if (mode2 == 1073741824) {
                    zY &= uk.Y(1, zB);
                    i7++;
                }
            }
            if (zY) {
                if (mode == i21) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (mode2 == i21) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                uk.T(z18, z19);
            }
        } else {
            z4 = z3;
            bVar = bVar;
            i6 = size;
            aVar3 = aVar8;
            aVar4 = aVar9;
            i7 = 0;
            zY = false;
        }
        if (zY) {
        }
        i8 = uk.H0;
        if (i6 > 0) {
            size3 = uk.u0.size();
            boolean zA4 = uk.a0(64);
            bVar4 = uk.y0;
            i16 = 0;
            while (i16 < size3) {
                tk6 = uk.u0.get(i16);
                if (!(tk6 instanceof C5589nn0)) {
                    i19 = size3;
                } else {
                    aVarN = tk6.n(0);
                    aVarN2 = tk6.n(1);
                    i19 = size3;
                    if (aVarN == aVar2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        if (aVarN == aVar2) {
                            z15 = true;
                        }
                        if (aVarN2 == aVar2) {
                            z15 = true;
                        }
                        if (aVarN != aVar2) {
                        }
                    }
                    if (z15) {
                        c4289hr.a(0, bVar4, tk6);
                    }
                }
                i16++;
                size3 = i19;
            }
            constraintLayout = ((b) bVar4).a;
            childCount = constraintLayout.getChildCount();
            while (i17 < childCount) {
                childAt = constraintLayout.getChildAt(i17);
                if (childAt instanceof e) {
                    eVar = (e) childAt;
                    if (eVar.e == null) {
                        a aVar16 = (a) eVar.getLayoutParams();
                        aVar7 = (a) eVar.e.getLayoutParams();
                        tk3 = aVar7.q0;
                        tk3.i0 = 0;
                        tk4 = aVar16.q0;
                        if (tk4.U[0] != aVar3) {
                            tk4.S(tk3.u());
                        }
                        tk5 = aVar16.q0;
                        if (tk5.U[1] != aVar3) {
                            tk5.P(aVar7.q0.o());
                        }
                        aVar7.q0.i0 = 8;
                    }
                }
            }
            arrayList4 = constraintLayout.e;
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i18 < size4) {
                    arrayList4.get(i18).getClass();
                }
            }
        }
        c4289hr.c(uk);
        arrayList = c4289hr.a;
        size2 = arrayList.size();
        if (i6 > 0) {
            c4289hr.b(uk, 0, iU2, iO);
        }
        if (size2 > 0) {
            aVarArr = uk.U;
            if (aVarArr[0] == aVar4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (aVarArr[1] == aVar4) {
                z6 = true;
            } else {
                z6 = false;
            }
            int iU11 = uk.u();
            UK uk7 = c4289hr.c;
            iMax3 = Math.max(iU11, uk7.d0);
            iMax4 = Math.max(uk.o(), uk7.e0);
            i10 = 0;
            z7 = false;
            while (true) {
                aVar5 = IK.a.h;
                aVar6 = IK.a.g;
                if (i10 < size2) {
                    break;
                    break;
                }
                tk2 = arrayList.get(i10);
                z12 = z6;
                if (tk2 instanceof We2) {
                    z13 = z5;
                    z14 = z7;
                    bVar3 = bVar;
                } else {
                    iU5 = tk2.u();
                    z13 = z5;
                    iO4 = tk2.o();
                    boolean z29 = z7;
                    bVar3 = bVar;
                    zA2 = z29 | c4289hr.a(1, bVar3, tk2);
                    iU6 = tk2.u();
                    iO5 = tk2.o();
                    if (iU6 != iU5) {
                        tk2.S(iU6);
                        if (z13) {
                            iMax3 = Math.max(iMax3, tk2.m(aVar6).e() + tk2.v() + tk2.W);
                        }
                        zA2 = true;
                    }
                    if (iO5 != iO4) {
                        tk2.P(iO5);
                        if (z12) {
                            iMax4 = Math.max(iMax4, tk2.m(aVar5).e() + tk2.w() + tk2.X);
                        }
                        zA2 = true;
                    }
                    z14 = zA2 | ((We2) tk2).C0;
                }
                i10++;
                bVar = bVar3;
                z5 = z13;
                i8 = i8;
                z7 = z14;
                z6 = z12;
            }
            z8 = z6;
            int i312 = i8;
            z9 = z5;
            z10 = z7;
            bVar2 = bVar;
            i11 = 0;
            while (i11 < 2) {
                i12 = 0;
                while (i12 < size2) {
                    tk = arrayList.get(i12);
                    if (tk instanceof InterfaceC6222qo0) {
                        if (tk.i0 == 8) {
                            i14 = i12;
                            arrayList3 = arrayList;
                            i15 = size2;
                        } else {
                            iU3 = tk.u();
                            iO2 = tk.o();
                            i14 = i12;
                            int i313 = tk.c0;
                            arrayList3 = arrayList;
                            zA = z10 | c4289hr.a(i11 == 1 ? 2 : 1, bVar2, tk);
                            iU4 = tk.u();
                            i15 = size2;
                            iO3 = tk.o();
                            if (iU4 != iU3) {
                                tk.S(iU4);
                                if (z9) {
                                    iMax3 = Math.max(iMax3, tk.m(aVar6).e() + tk.v() + tk.W);
                                }
                                zA = true;
                            }
                            if (iO3 != iO2) {
                                tk.P(iO3);
                                if (z8) {
                                    iMax4 = Math.max(iMax4, tk.m(aVar5).e() + tk.w() + tk.X);
                                }
                                z11 = true;
                            } else {
                                z11 = zA;
                            }
                            if (tk.E) {
                                z10 = z11;
                            } else {
                                z10 = z11;
                            }
                        }
                    } else if (tk.i0 == 8) {
                        i14 = i12;
                        arrayList3 = arrayList;
                        i15 = size2;
                    } else {
                        iU3 = tk.u();
                        iO2 = tk.o();
                        i14 = i12;
                        int i314 = tk.c0;
                        arrayList3 = arrayList;
                        zA = z10 | c4289hr.a(i11 == 1 ? 2 : 1, bVar2, tk);
                        iU4 = tk.u();
                        i15 = size2;
                        iO3 = tk.o();
                        if (iU4 != iU3) {
                            tk.S(iU4);
                            if (z9) {
                                iMax3 = Math.max(iMax3, tk.m(aVar6).e() + tk.v() + tk.W);
                            }
                            zA = true;
                        }
                        if (iO3 != iO2) {
                            tk.P(iO3);
                            if (z8) {
                                iMax4 = Math.max(iMax4, tk.m(aVar5).e() + tk.w() + tk.X);
                            }
                            z11 = true;
                        } else {
                            z11 = zA;
                        }
                        if (tk.E) {
                            z10 = z11;
                        } else {
                            z10 = z11;
                        }
                    }
                    i12 = i14 + 1;
                    arrayList = arrayList3;
                    size2 = i15;
                }
                arrayList2 = arrayList;
                i13 = size2;
                if (z10) {
                    break;
                    break;
                }
                i11++;
                c4289hr.b(uk, i11, iU2, iO);
                arrayList = arrayList2;
                size2 = i13;
                z10 = false;
            }
            i9 = i312;
        } else {
            i9 = i8;
        }
        uk.H0 = i9;
        C4874kQ0.p = uk.a0(UserVerificationMethods.USER_VERIFY_NONE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            TK tk = aVar.q0;
            if ((childAt.getVisibility() != 8 || aVar.d0 || aVar.e0 || zIsInEditMode) && !aVar.f0) {
                int iV = tk.v();
                int iW = tk.w();
                int iU = tk.u() + iV;
                int iO = tk.o() + iW;
                childAt.layout(iV, iW, iU, iO);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iV, iW, iU, iO);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).m();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        TK tk;
        if (this.t == i) {
            int i3 = this.u;
        }
        int i4 = 0;
        if (!this.l) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).isLayoutRequested()) {
                    this.l = true;
                    break;
                }
            }
        }
        this.t = i;
        this.u = i2;
        boolean zF = f();
        UK uk = this.g;
        uk.z0 = zF;
        if (this.l) {
            this.l = false;
            int childCount2 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i6).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i6++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i7 = 0; i7 < childCount3; i7++) {
                    TK tkD = d(getChildAt(i7));
                    if (tkD != null) {
                        tkD.G();
                    }
                }
                if (zIsInEditMode) {
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt = getChildAt(i8);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.q == null) {
                                    this.q = new HashMap<>();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                this.q.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = this.d.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                tk = viewFindViewById == this ? uk : viewFindViewById == null ? null : ((a) viewFindViewById.getLayoutParams()).q0;
                            }
                            tk.k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.p != -1) {
                    for (int i9 = 0; i9 < childCount3; i9++) {
                        View childAt2 = getChildAt(i9);
                        if (childAt2.getId() == this.p && (childAt2 instanceof d)) {
                            this.n = ((d) childAt2).getConstraintSet();
                        }
                    }
                }
                c cVar = this.n;
                if (cVar != null) {
                    cVar.c(this);
                }
                uk.u0.clear();
                ArrayList<androidx.constraintlayout.widget.b> arrayList = this.e;
                int size = arrayList.size();
                if (size > 0) {
                    int i10 = 0;
                    while (i10 < size) {
                        androidx.constraintlayout.widget.b bVar = arrayList.get(i10);
                        if (bVar.isInEditMode()) {
                            bVar.setIds(bVar.i);
                        }
                        C6641so0 c6641so0 = bVar.h;
                        if (c6641so0 != null) {
                            c6641so0.b();
                            for (int i11 = i4; i11 < bVar.e; i11++) {
                                int i12 = bVar.d[i11];
                                View viewC = c(i12);
                                if (viewC == null) {
                                    Integer numValueOf2 = Integer.valueOf(i12);
                                    HashMap<Integer, String> map = bVar.l;
                                    String str = map.get(numValueOf2);
                                    int iH = bVar.h(this, str);
                                    if (iH != 0) {
                                        bVar.d[i11] = iH;
                                        map.put(Integer.valueOf(iH), str);
                                        viewC = c(iH);
                                    }
                                }
                                View view = viewC;
                                if (view != null) {
                                    bVar.h.a(d(view));
                                }
                            }
                            bVar.h.c();
                        }
                        i10++;
                        i4 = 0;
                    }
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    if (childAt3 instanceof e) {
                        e eVar = (e) childAt3;
                        if (eVar.d == -1 && !eVar.isInEditMode()) {
                            eVar.setVisibility(eVar.g);
                        }
                        View viewFindViewById2 = findViewById(eVar.d);
                        eVar.e = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((a) viewFindViewById2.getLayoutParams()).f0 = true;
                            eVar.e.setVisibility(0);
                            eVar.setVisibility(0);
                        }
                    }
                }
                SparseArray<TK> sparseArray = this.r;
                sparseArray.clear();
                sparseArray.put(0, uk);
                sparseArray.put(getId(), uk);
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt4 = getChildAt(i14);
                    sparseArray.put(childAt4.getId(), d(childAt4));
                }
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt5 = getChildAt(i15);
                    TK tkD2 = d(childAt5);
                    if (tkD2 != null) {
                        a aVar = (a) childAt5.getLayoutParams();
                        uk.u0.add(tkD2);
                        TK tk2 = tkD2.V;
                        if (tk2 != null) {
                            ((Di2) tk2).u0.remove(tkD2);
                            tkD2.G();
                        }
                        tkD2.V = uk;
                        b(zIsInEditMode, childAt5, tkD2, aVar, this.r);
                    }
                }
            }
            if (z) {
                uk.v0.c(uk);
            }
        }
        i(uk, this.m, i, i2);
        h(i, i2, uk.u(), uk.o(), uk.I0, uk.J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        TK tkD = d(view);
        if ((view instanceof Guideline) && !(tkD instanceof C5589nn0)) {
            a aVar = (a) view.getLayoutParams();
            C5589nn0 c5589nn0 = new C5589nn0();
            aVar.q0 = c5589nn0;
            aVar.d0 = true;
            c5589nn0.W(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view;
            bVar.n();
            ((a) view.getLayoutParams()).e0 = true;
            ArrayList<androidx.constraintlayout.widget.b> arrayList = this.e;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.d.put(view.getId(), view);
        this.l = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.d.remove(view.getId());
        TK tkD = d(view);
        this.g.u0.remove(tkD);
        tkD.G();
        this.e.remove(view);
        this.l = true;
    }

    public final void p(TK tk, a aVar, SparseArray<TK> sparseArray, int i, IK.a aVar2) {
        View view = this.d.get(i);
        TK tk2 = sparseArray.get(i);
        if (tk2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.c0 = true;
        IK.a aVar3 = IK.a.i;
        if (aVar2 == aVar3) {
            a aVar4 = (a) view.getLayoutParams();
            aVar4.c0 = true;
            aVar4.q0.E = true;
        }
        tk.m(aVar3).b(tk2.m(aVar2), aVar.D, aVar.C, true);
        tk.E = true;
        tk.m(IK.a.e).j();
        tk.m(IK.a.h).j();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.l = true;
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.n = cVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.d;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(WK wk) {
        KK kk = this.o;
        if (kk != null) {
            kk.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.m = i;
        UK uk = this.g;
        uk.H0 = i;
        C4874kQ0.p = uk.a0(UserVerificationMethods.USER_VERIFY_NONE);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new SparseArray<>();
        this.e = new ArrayList<>(4);
        this.g = new UK();
        this.h = 0;
        this.i = 0;
        this.j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.l = true;
        this.m = 257;
        this.n = null;
        this.o = null;
        this.p = -1;
        this.q = new HashMap<>();
        this.r = new SparseArray<>();
        this.s = new b(this);
        this.t = 0;
        this.u = 0;
        e(attributeSet, i);
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public final boolean d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public TK q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public final int w;
        public int x;
        public final int y;
        public int z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        public static class C0225a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new TK();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = C0225a.a.get(index);
                switch (i2) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i3;
                        if (i3 == 1) {
                            b0.c("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.M = i4;
                        if (i4 == 1) {
                            b0.c("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                c.n(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                        c.m(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                        c.m(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.a0 = false;
                if (i == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.b0 = false;
                if (i2 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.q0 instanceof C5589nn0)) {
                this.q0 = new C5589nn0();
            }
            ((C5589nn0) this.q0).W(this.V);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.i0 = -1;
            this.j0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.k0 = this.w;
            this.l0 = this.y;
            float f = this.E;
            this.m0 = f;
            int i8 = this.a;
            this.n0 = i8;
            int i9 = this.b;
            this.o0 = i9;
            float f2 = this.c;
            this.p0 = f2;
            if (z2) {
                int i10 = this.s;
                if (i10 != -1) {
                    this.i0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.j0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.h0 = i2;
                            z = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.g0 = i3;
                            z = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.l0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.k0 = i5;
                        }
                        if (z) {
                            this.m0 = 1.0f - f;
                        }
                        if (this.d0 && this.V == 1 && this.d) {
                            if (f2 != -1.0f) {
                                this.p0 = 1.0f - f2;
                                this.n0 = -1;
                                this.o0 = -1;
                            } else if (i8 != -1) {
                                this.o0 = i8;
                                this.n0 = -1;
                                this.p0 = -1.0f;
                            } else if (i9 != -1) {
                                this.n0 = i9;
                                this.o0 = -1;
                                this.p0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.h0 = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.g0 = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.l0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.k0 = i5;
                }
                if (z) {
                    this.m0 = 1.0f - f;
                }
                if (this.d0) {
                    if (f2 != -1.0f) {
                        this.p0 = 1.0f - f2;
                        this.n0 = -1;
                        this.o0 = -1;
                    } else if (i8 != -1) {
                        this.o0 = i8;
                        this.n0 = -1;
                        this.p0 = -1.0f;
                    } else if (i9 != -1) {
                        this.n0 = i9;
                        this.o0 = -1;
                        this.p0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.s;
                if (i12 != -1) {
                    this.h0 = i12;
                }
                int i13 = this.t;
                if (i13 != -1) {
                    this.g0 = i13;
                }
                int i14 = this.u;
                if (i14 != -1) {
                    this.i0 = i14;
                }
                int i15 = this.v;
                if (i15 != -1) {
                    this.j0 = i15;
                }
                int i16 = this.A;
                if (i16 != Integer.MIN_VALUE) {
                    this.k0 = i16;
                }
                int i17 = this.B;
                if (i17 != Integer.MIN_VALUE) {
                    this.l0 = i17;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                int i18 = this.g;
                if (i18 != -1) {
                    this.i0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.h;
                    if (i19 != -1) {
                        this.j0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.e;
                if (i20 != -1) {
                    this.g0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f;
                if (i21 != -1) {
                    this.h0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public a(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new TK();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = Integer.MIN_VALUE;
            this.m0 = 0.5f;
            this.q0 = new TK();
        }
    }
}
