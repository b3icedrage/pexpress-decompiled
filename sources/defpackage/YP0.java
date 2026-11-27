package defpackage;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import io.sentry.android.core.b0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class YP0 extends AbstractC3566eQ0<C3506e70> implements InterfaceC3876ft0 {
    public a C;
    public ArrayList D;
    public int E;
    public float F;
    public float G;
    public final float H;
    public DashPathEffect I;
    public final C0564Aa J;
    public boolean K;
    public final boolean L;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("LINEAR", 0);
            d = aVar;
            a aVar2 = new a("STEPPED", 1);
            e = aVar2;
            a aVar3 = new a("CUBIC_BEZIER", 2);
            a aVar4 = new a("HORIZONTAL_BEZIER", 3);
            g = aVar4;
            h = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    public YP0(String str) {
        this.a = null;
        this.b = null;
        this.c = "DataSet";
        this.d = Kl2.a.d;
        this.e = true;
        this.g = C4871kP0.b.e;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = true;
        this.k = true;
        this.l = new C3791fV0();
        this.m = 17.0f;
        this.n = true;
        this.a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList.add(-16777216);
        this.c = str;
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.o = null;
        this.o = new ArrayList();
        e0();
        this.t = Color.rgb(255, 187, 115);
        this.u = true;
        this.v = true;
        this.w = 0.5f;
        this.w = AbstractC8067zc2.c(0.5f);
        this.x = Color.rgb(140, 234, 255);
        this.z = 85;
        this.A = 2.5f;
        this.B = false;
        this.C = a.d;
        this.D = null;
        this.E = -1;
        this.F = 8.0f;
        this.G = 4.0f;
        this.H = 0.2f;
        this.I = null;
        this.J = new C0564Aa();
        this.K = true;
        this.L = true;
        ArrayList arrayList2 = new ArrayList();
        this.D = arrayList2;
        arrayList2.clear();
        this.D.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    @Override // defpackage.InterfaceC3876ft0
    public final a C() {
        return this.C;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final int R(int i) {
        return ((Integer) this.D.get(i)).intValue();
    }

    @Override // defpackage.InterfaceC3876ft0
    public final boolean W() {
        return this.K;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final float Z() {
        return this.G;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final int b() {
        return this.D.size();
    }

    @Override // defpackage.InterfaceC3876ft0
    public final boolean c0() {
        return this.L;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final C0564Aa f() {
        return this.J;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final boolean j() {
        return this.I != null;
    }

    public final void j0(int i) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.clear();
        this.D.add(Integer.valueOf(i));
    }

    public final void k0(float f) {
        if (f >= 0.5f) {
            this.G = AbstractC8067zc2.c(f);
        } else {
            b0.c("LineDataSet", "Circle radius cannot be < 0.5");
        }
    }

    public final void l0(float f) {
        if (f >= 1.0f) {
            this.F = AbstractC8067zc2.c(f);
        } else {
            b0.c("LineDataSet", "Circle radius cannot be < 1");
        }
    }

    @Override // defpackage.InterfaceC3876ft0
    public final int m() {
        return this.E;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final float q() {
        return this.H;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final DashPathEffect r() {
        return this.I;
    }

    @Override // defpackage.InterfaceC3876ft0
    public final float z() {
        return this.F;
    }
}
