package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class XB1 {
    public E a = null;
    public final C3467dx.p b = new C3467dx.p();
    public final HashMap c = new HashMap();

    public static class A extends AbstractC2374k {
        public C2378o o;
        public C2378o p;
        public C2378o q;
        public C2378o r;
        public C2378o s;
        public C2378o t;

        @Override // XB1.K
        public final String n() {
            return "rect";
        }
    }

    public static class D implements Cloneable {
        public C2365b A;
        public String B;
        public String C;
        public String D;
        public Boolean E;
        public Boolean F;
        public N G;
        public Float H;
        public String I;
        public a J;
        public String K;
        public N L;
        public Float M;
        public N N;
        public Float O;
        public i P;
        public e Q;
        public long d = 0;
        public N e;
        public a g;
        public Float h;
        public N i;
        public Float j;
        public C2378o k;
        public c l;
        public d m;
        public Float n;
        public C2378o[] o;
        public C2378o p;
        public Float q;
        public C2368e r;
        public ArrayList s;
        public C2378o t;
        public Integer u;
        public b v;
        public g w;
        public h x;
        public f y;
        public Boolean z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a d;
            public static final a e;
            public static final /* synthetic */ a[] g;

            static {
                a aVar = new a("NonZero", 0);
                d = aVar;
                a aVar2 = new a("EvenOdd", 1);
                e = aVar2;
                g = new a[]{aVar, aVar2};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            public static final b d;
            public static final b e;
            public static final b g;
            public static final /* synthetic */ b[] h;

            static {
                b bVar = new b("Normal", 0);
                d = bVar;
                b bVar2 = new b("Italic", 1);
                e = bVar2;
                b bVar3 = new b("Oblique", 2);
                g = bVar3;
                h = new b[]{bVar, bVar2, bVar3};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) h.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class c {
            public static final c d;
            public static final c e;
            public static final c g;
            public static final /* synthetic */ c[] h;

            static {
                c cVar = new c("Butt", 0);
                d = cVar;
                c cVar2 = new c("Round", 1);
                e = cVar2;
                c cVar3 = new c("Square", 2);
                g = cVar3;
                h = new c[]{cVar, cVar2, cVar3};
            }

            public c() {
                throw null;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) h.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class d {
            public static final d d;
            public static final d e;
            public static final d g;
            public static final /* synthetic */ d[] h;

            static {
                d dVar = new d("Miter", 0);
                d = dVar;
                d dVar2 = new d("Round", 1);
                e = dVar2;
                d dVar3 = new d("Bevel", 2);
                g = dVar3;
                h = new d[]{dVar, dVar2, dVar3};
            }

            public d() {
                throw null;
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) h.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class e {
            public static final e d;
            public static final e e;
            public static final e g;
            public static final /* synthetic */ e[] h;

            static {
                e eVar = new e("auto", 0);
                d = eVar;
                e eVar2 = new e("optimizeQuality", 1);
                e = eVar2;
                e eVar3 = new e("optimizeSpeed", 2);
                g = eVar3;
                h = new e[]{eVar, eVar2, eVar3};
            }

            public e() {
                throw null;
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) h.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class f {
            public static final f d;
            public static final f e;
            public static final f g;
            public static final /* synthetic */ f[] h;

            static {
                f fVar = new f("Start", 0);
                d = fVar;
                f fVar2 = new f("Middle", 1);
                e = fVar2;
                f fVar3 = new f("End", 2);
                g = fVar3;
                h = new f[]{fVar, fVar2, fVar3};
            }

            public f() {
                throw null;
            }

            public static f valueOf(String str) {
                return (f) Enum.valueOf(f.class, str);
            }

            public static f[] values() {
                return (f[]) h.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class g {
            public static final g d;
            public static final g e;
            public static final g g;
            public static final g h;
            public static final g i;
            public static final /* synthetic */ g[] j;

            static {
                g gVar = new g("None", 0);
                d = gVar;
                g gVar2 = new g("Underline", 1);
                e = gVar2;
                g gVar3 = new g("Overline", 2);
                g = gVar3;
                g gVar4 = new g("LineThrough", 3);
                h = gVar4;
                g gVar5 = new g("Blink", 4);
                i = gVar5;
                j = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
            }

            public g() {
                throw null;
            }

            public static g valueOf(String str) {
                return (g) Enum.valueOf(g.class, str);
            }

            public static g[] values() {
                return (g[]) j.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class h {
            public static final h d;
            public static final h e;
            public static final /* synthetic */ h[] g;

            static {
                h hVar = new h("LTR", 0);
                d = hVar;
                h hVar2 = new h("RTL", 1);
                e = hVar2;
                g = new h[]{hVar, hVar2};
            }

            public h() {
                throw null;
            }

            public static h valueOf(String str) {
                return (h) Enum.valueOf(h.class, str);
            }

            public static h[] values() {
                return (h[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class i {
            public static final i d;
            public static final i e;
            public static final /* synthetic */ i[] g;

            static {
                i iVar = new i("None", 0);
                d = iVar;
                i iVar2 = new i("NonScalingStroke", 1);
                e = iVar2;
                g = new i[]{iVar, iVar2};
            }

            public i() {
                throw null;
            }

            public static i valueOf(String str) {
                return (i) Enum.valueOf(i.class, str);
            }

            public static i[] values() {
                return (i[]) g.clone();
            }
        }

        public static D a() {
            D d2 = new D();
            d2.d = -1L;
            C2368e c2368e = C2368e.e;
            d2.e = c2368e;
            a aVar = a.d;
            d2.g = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            d2.h = fValueOf;
            d2.i = null;
            d2.j = fValueOf;
            d2.k = new C2378o(1.0f);
            d2.l = c.d;
            d2.m = d.d;
            d2.n = Float.valueOf(4.0f);
            d2.o = null;
            d2.p = new C2378o(0.0f);
            d2.q = fValueOf;
            d2.r = c2368e;
            d2.s = null;
            d2.t = new C2378o(12.0f, c0.e);
            d2.u = 400;
            d2.v = b.d;
            d2.w = g.d;
            d2.x = h.d;
            d2.y = f.d;
            Boolean bool = Boolean.TRUE;
            d2.z = bool;
            d2.A = null;
            d2.B = null;
            d2.C = null;
            d2.D = null;
            d2.E = bool;
            d2.F = bool;
            d2.G = c2368e;
            d2.H = fValueOf;
            d2.I = null;
            d2.J = aVar;
            d2.K = null;
            d2.L = null;
            d2.M = fValueOf;
            d2.N = null;
            d2.O = fValueOf;
            d2.P = i.d;
            d2.Q = e.d;
            return d2;
        }

        public final Object clone() {
            D d2 = (D) super.clone();
            C2378o[] c2378oArr = this.o;
            if (c2378oArr != null) {
                d2.o = (C2378o[]) c2378oArr.clone();
            }
            return d2;
        }
    }

    public static class E extends Q {
        public C2378o p;
        public C2378o q;
        public C2378o r;
        public C2378o s;

        @Override // XB1.K
        public final String n() {
            return "svg";
        }
    }

    public interface F {
        Set<String> a();

        String b();

        void e(HashSet hashSet);

        void g(HashSet hashSet);

        Set<String> getRequiredFeatures();

        void h(String str);

        void i(HashSet hashSet);

        void j(HashSet hashSet);

        Set<String> l();

        Set<String> m();
    }

    public static abstract class H extends J implements F {
        public HashSet i;
        public String j;
        public HashSet k;
        public HashSet l;
        public HashSet m;

        @Override // XB1.F
        public final Set<String> a() {
            return this.k;
        }

        @Override // XB1.F
        public final String b() {
            return this.j;
        }

        @Override // XB1.F
        public final void e(HashSet hashSet) {
            this.i = hashSet;
        }

        @Override // XB1.F
        public final void g(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // XB1.F
        public final Set<String> getRequiredFeatures() {
            return this.i;
        }

        @Override // XB1.F
        public final void h(String str) {
            this.j = str;
        }

        @Override // XB1.F
        public final void i(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // XB1.F
        public final void j(HashSet hashSet) {
            this.k = hashSet;
        }

        @Override // XB1.F
        public final Set<String> l() {
            return this.l;
        }

        @Override // XB1.F
        public final Set<String> m() {
            return this.m;
        }
    }

    public interface I {
        List<M> c();

        void f(M m);
    }

    public static abstract class J extends K {
        public C2364a h = null;
    }

    public static abstract class K extends M {
        public String c = null;
        public Boolean d = null;
        public D e = null;
        public D f = null;
        public ArrayList g = null;

        public abstract String n();
    }

    public static class L extends AbstractC2372i {
        public C2378o m;
        public C2378o n;
        public C2378o o;
        public C2378o p;

        @Override // XB1.K
        public final String n() {
            return "linearGradient";
        }
    }

    public static class M {
        public XB1 a;
        public I b;

        public String toString() {
            return getClass().getSimpleName();
        }
    }

    public static abstract class N implements Cloneable {
    }

    public static abstract class O extends G {
        public C3835fh1 n = null;
    }

    public static class P extends AbstractC2372i {
        public C2378o m;
        public C2378o n;
        public C2378o o;
        public C2378o p;
        public C2378o q;

        @Override // XB1.K
        public final String n() {
            return "radialGradient";
        }
    }

    public static abstract class Q extends O {
        public C2364a o;
    }

    public static class R extends C2375l {
        @Override // defpackage.XB1.C2375l, XB1.K
        public final String n() {
            return "switch";
        }
    }

    public static class S extends Q implements InterfaceC2382s {
        @Override // XB1.K
        public final String n() {
            return "symbol";
        }
    }

    public static class T extends X implements W {
        public String n;
        public a0 o;

        @Override // XB1.W
        public final a0 d() {
            return this.o;
        }

        @Override // XB1.K
        public final String n() {
            return "tref";
        }
    }

    public static class U extends Z implements W {
        public a0 r;

        @Override // XB1.W
        public final a0 d() {
            return this.r;
        }

        @Override // XB1.K
        public final String n() {
            return "tspan";
        }
    }

    public static class V extends Z implements a0, InterfaceC2376m {
        public Matrix r;

        @Override // defpackage.XB1.InterfaceC2376m
        public final void k(Matrix matrix) {
            this.r = matrix;
        }

        @Override // XB1.K
        public final String n() {
            return "text";
        }
    }

    public interface W {
        a0 d();
    }

    public static abstract class X extends G {
        @Override // XB1.G, XB1.I
        public final void f(M m) throws ZB1 {
            if (m instanceof W) {
                this.i.add(m);
                return;
            }
            throw new ZB1("Text content elements cannot contain " + m + " elements.");
        }
    }

    public static class Y extends X implements W {
        public String n;
        public C2378o o;
        public a0 p;

        @Override // XB1.W
        public final a0 d() {
            return this.p;
        }

        @Override // XB1.K
        public final String n() {
            return "textPath";
        }
    }

    public static abstract class Z extends X {
        public ArrayList n;
        public ArrayList o;
        public ArrayList p;
        public ArrayList q;
    }

    public interface a0 {
    }

    /* JADX INFO: renamed from: XB1$b, reason: case insensitive filesystem */
    public static class C2365b {
        public C2378o a;
        public C2378o b;
        public C2378o c;
        public C2378o d;
    }

    public static class b0 extends M implements W {
        public String c;

        @Override // XB1.W
        public final a0 d() {
            return null;
        }

        @Override // XB1.M
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b0.class.getSimpleName());
            sb.append(" '");
            return C5807oq.b(sb, this.c, "'");
        }
    }

    /* JADX INFO: renamed from: XB1$c, reason: case insensitive filesystem */
    public static class C2366c extends AbstractC2374k {
        public C2378o o;
        public C2378o p;
        public C2378o q;

        @Override // XB1.K
        public final String n() {
            return "circle";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c0 {
        public static final c0 d;
        public static final c0 e;
        public static final c0 g;
        public static final /* synthetic */ c0[] h;

        static {
            c0 c0Var = new c0("px", 0);
            d = c0Var;
            c0 c0Var2 = new c0("em", 1);
            c0 c0Var3 = new c0("ex", 2);
            c0 c0Var4 = new c0("in", 3);
            c0 c0Var5 = new c0("cm", 4);
            c0 c0Var6 = new c0("mm", 5);
            c0 c0Var7 = new c0("pt", 6);
            e = c0Var7;
            c0 c0Var8 = new c0("pc", 7);
            c0 c0Var9 = new c0("percent", 8);
            g = c0Var9;
            h = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9};
        }

        public c0() {
            throw null;
        }

        public static c0 valueOf(String str) {
            return (c0) Enum.valueOf(c0.class, str);
        }

        public static c0[] values() {
            return (c0[]) h.clone();
        }
    }

    /* JADX INFO: renamed from: XB1$d, reason: case insensitive filesystem */
    public static class C2367d extends C2375l implements InterfaceC2382s {
        public Boolean o;

        @Override // defpackage.XB1.C2375l, XB1.K
        public final String n() {
            return "clipPath";
        }
    }

    public static class d0 extends C2375l {
        public String o;
        public C2378o p;
        public C2378o q;
        public C2378o r;
        public C2378o s;

        @Override // defpackage.XB1.C2375l, XB1.K
        public final String n() {
            return "use";
        }
    }

    /* JADX INFO: renamed from: XB1$e, reason: case insensitive filesystem */
    public static class C2368e extends N {
        public static final C2368e e = new C2368e(-16777216);
        public static final C2368e g = new C2368e(0);
        public final int d;

        public C2368e(int i) {
            this.d = i;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.d));
        }
    }

    public static class e0 extends Q implements InterfaceC2382s {
        @Override // XB1.K
        public final String n() {
            return Promotion.ACTION_VIEW;
        }
    }

    /* JADX INFO: renamed from: XB1$f, reason: case insensitive filesystem */
    public static class C2369f extends N {
        public static final C2369f d = new C2369f();
    }

    /* JADX INFO: renamed from: XB1$g, reason: case insensitive filesystem */
    public static class C2370g extends C2375l implements InterfaceC2382s {
        @Override // defpackage.XB1.C2375l, XB1.K
        public final String n() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: XB1$h, reason: case insensitive filesystem */
    public static class C2371h extends AbstractC2374k {
        public C2378o o;
        public C2378o p;
        public C2378o q;
        public C2378o r;

        @Override // XB1.K
        public final String n() {
            return "ellipse";
        }
    }

    /* JADX INFO: renamed from: XB1$i, reason: case insensitive filesystem */
    public static abstract class AbstractC2372i extends K implements I {
        public ArrayList h = new ArrayList();
        public Boolean i;
        public Matrix j;
        public EnumC2373j k;
        public String l;

        @Override // XB1.I
        public final List<M> c() {
            return this.h;
        }

        @Override // XB1.I
        public final void f(M m) throws ZB1 {
            if (m instanceof C) {
                this.h.add(m);
                return;
            }
            throw new ZB1("Gradient elements cannot contain " + m + " elements.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: XB1$j, reason: case insensitive filesystem */
    public static final class EnumC2373j {
        public static final EnumC2373j d;
        public static final EnumC2373j e;
        public static final /* synthetic */ EnumC2373j[] g;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC2373j EF0;

        static {
            EnumC2373j enumC2373j = new EnumC2373j("pad", 0);
            EnumC2373j enumC2373j2 = new EnumC2373j("reflect", 1);
            d = enumC2373j2;
            EnumC2373j enumC2373j3 = new EnumC2373j("repeat", 2);
            e = enumC2373j3;
            g = new EnumC2373j[]{enumC2373j, enumC2373j2, enumC2373j3};
        }

        public EnumC2373j() {
            throw null;
        }

        public static EnumC2373j valueOf(String str) {
            return (EnumC2373j) Enum.valueOf(EnumC2373j.class, str);
        }

        public static EnumC2373j[] values() {
            return (EnumC2373j[]) g.clone();
        }
    }

    /* JADX INFO: renamed from: XB1$k, reason: case insensitive filesystem */
    public static abstract class AbstractC2374k extends H implements InterfaceC2376m {
        public Matrix n;

        public AbstractC2374k() {
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
        }

        @Override // defpackage.XB1.InterfaceC2376m
        public final void k(Matrix matrix) {
            this.n = matrix;
        }
    }

    /* JADX INFO: renamed from: XB1$l, reason: case insensitive filesystem */
    public static class C2375l extends G implements InterfaceC2376m {
        public Matrix n;

        @Override // defpackage.XB1.InterfaceC2376m
        public final void k(Matrix matrix) {
            this.n = matrix;
        }

        @Override // XB1.K
        public String n() {
            return "group";
        }
    }

    /* JADX INFO: renamed from: XB1$m, reason: case insensitive filesystem */
    public interface InterfaceC2376m {
        void k(Matrix matrix);
    }

    /* JADX INFO: renamed from: XB1$n, reason: case insensitive filesystem */
    public static class C2377n extends O implements InterfaceC2376m {
        public String o;
        public C2378o p;
        public C2378o q;
        public C2378o r;
        public C2378o s;
        public Matrix t;

        @Override // defpackage.XB1.InterfaceC2376m
        public final void k(Matrix matrix) {
            this.t = matrix;
        }

        @Override // XB1.K
        public final String n() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: XB1$p, reason: case insensitive filesystem */
    public static class C2379p extends AbstractC2374k {
        public C2378o o;
        public C2378o p;
        public C2378o q;
        public C2378o r;

        @Override // XB1.K
        public final String n() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: XB1$q, reason: case insensitive filesystem */
    public static class C2380q extends Q implements InterfaceC2382s {
        public boolean p;
        public C2378o q;
        public C2378o r;
        public C2378o s;
        public C2378o t;
        public Float u;

        @Override // XB1.K
        public final String n() {
            return "marker";
        }
    }

    /* JADX INFO: renamed from: XB1$r, reason: case insensitive filesystem */
    public static class C2381r extends G implements InterfaceC2382s {
        public Boolean n;
        public Boolean o;
        public C2378o p;
        public C2378o q;

        @Override // XB1.K
        public final String n() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: XB1$s, reason: case insensitive filesystem */
    public interface InterfaceC2382s {
    }

    /* JADX INFO: renamed from: XB1$t, reason: case insensitive filesystem */
    public static class C2383t extends N {
        public final String d;
        public final N e;

        public C2383t(String str, N n) {
            this.d = str;
            this.e = n;
        }

        public final String toString() {
            return this.d + " " + this.e;
        }
    }

    /* JADX INFO: renamed from: XB1$u, reason: case insensitive filesystem */
    public static class C2384u extends AbstractC2374k {
        public C2385v o;

        @Override // XB1.K
        public final String n() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: XB1$v, reason: case insensitive filesystem */
    public static class C2385v implements InterfaceC2386w {
        public byte[] a;
        public int b;
        public float[] c;
        public int d;

        @Override // defpackage.XB1.InterfaceC2386w
        public final void a(float f, float f2, float f3, float f4) {
            f((byte) 3);
            g(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void b(float f, float f2) {
            f((byte) 0);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
            f((byte) 2);
            g(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void close() {
            f((byte) 8);
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            f((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            g(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        @Override // defpackage.XB1.InterfaceC2386w
        public final void e(float f, float f2) {
            f((byte) 1);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        public final void f(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        public final void g(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        public final void h(InterfaceC2386w interfaceC2386w) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i2];
                if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    interfaceC2386w.b(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    interfaceC2386w.e(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    interfaceC2386w.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.c;
                    float f3 = fArr4[i];
                    float f4 = fArr4[i + 1];
                    int i5 = i + 3;
                    float f5 = fArr4[i + 2];
                    i += 4;
                    interfaceC2386w.a(f3, f4, f5, fArr4[i5]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.c;
                    interfaceC2386w.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    interfaceC2386w.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: XB1$w, reason: case insensitive filesystem */
    public interface InterfaceC2386w {
        void a(float f, float f2, float f3, float f4);

        void b(float f, float f2);

        void c(float f, float f2, float f3, float f4, float f5, float f6);

        void close();

        void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void e(float f, float f2);
    }

    /* JADX INFO: renamed from: XB1$x, reason: case insensitive filesystem */
    public static class C2387x extends Q implements InterfaceC2382s {
        public Boolean p;
        public Boolean q;
        public Matrix r;
        public C2378o s;
        public C2378o t;
        public C2378o u;
        public C2378o v;
        public String w;

        @Override // XB1.K
        public final String n() {
            return "pattern";
        }
    }

    /* JADX INFO: renamed from: XB1$y, reason: case insensitive filesystem */
    public static class C2388y extends AbstractC2374k {
        public float[] o;

        @Override // XB1.K
        public String n() {
            return "polyline";
        }
    }

    /* JADX INFO: renamed from: XB1$z, reason: case insensitive filesystem */
    public static class C2389z extends C2388y {
        @Override // defpackage.XB1.C2388y, XB1.K
        public final String n() {
            return "polygon";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static K a(I i, String str) {
        K kA;
        K k = (K) i;
        if (str.equals(k.c)) {
            return k;
        }
        for (Object obj : i.c()) {
            if (obj instanceof K) {
                K k2 = (K) obj;
                if (str.equals(k2.c)) {
                    return k2;
                }
                if ((obj instanceof I) && (kA = a((I) obj, str)) != null) {
                    return kA;
                }
            }
        }
        return null;
    }

    public static XB1 b(InputStream inputStream) {
        C2673aC1 c2673aC1 = new C2673aC1();
        c2673aC1.a = null;
        c2673aC1.b = null;
        c2673aC1.c = false;
        c2673aC1.e = false;
        c2673aC1.f = null;
        c2673aC1.g = null;
        c2673aC1.h = false;
        c2673aC1.i = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            c2673aC1.B(inputStream);
            return c2673aC1.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                io.sentry.android.core.b0.c("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public final Picture c(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        C2364a c2364a = new C2364a(0.0f, 0.0f, i, i2);
        YB1 yb1 = new YB1();
        yb1.a = canvasBeginRecording;
        yb1.b = 96.0f;
        yb1.c = this;
        E e = this.a;
        if (e == null) {
            io.sentry.android.core.b0.e("SVGAndroidRenderer", "Nothing to render. Document is empty.");
        } else {
            C2364a c2364a2 = e.o;
            C3835fh1 c3835fh1 = e.n;
            yb1.d = new YB1.g();
            yb1.e = new Stack<>();
            yb1.S(yb1.d, D.a());
            YB1.g gVar = yb1.d;
            gVar.f = null;
            gVar.h = false;
            yb1.e.push(new YB1.g(gVar));
            yb1.g = new Stack<>();
            yb1.f = new Stack<>();
            Boolean bool = e.d;
            if (bool != null) {
                yb1.d.h = bool.booleanValue();
            }
            yb1.P();
            C2364a c2364a3 = new C2364a(c2364a);
            C2378o c2378o = e.r;
            if (c2378o != null) {
                c2364a3.c = c2378o.d(yb1, c2364a3.c);
            }
            C2378o c2378o2 = e.s;
            if (c2378o2 != null) {
                c2364a3.d = c2378o2.d(yb1, c2364a3.d);
            }
            yb1.G(e, c2364a3, c2364a2, c3835fh1);
            yb1.O();
        }
        picture.endRecording();
        return picture;
    }

    public final K d(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#") || (strSubstring = strReplace.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.a.c)) {
            return this.a;
        }
        HashMap map = this.c;
        if (map.containsKey(strSubstring)) {
            return (K) map.get(strSubstring);
        }
        K kA = a(this.a, strSubstring);
        map.put(strSubstring, kA);
        return kA;
    }

    /* JADX INFO: renamed from: XB1$o, reason: case insensitive filesystem */
    public static class C2378o implements Cloneable {
        public final float d;
        public final c0 e;

        public C2378o(float f, c0 c0Var) {
            this.d = f;
            this.e = c0Var;
        }

        public final float a(float f) {
            float f2;
            float f3;
            int iOrdinal = this.e.ordinal();
            float f4 = this.d;
            if (iOrdinal == 0) {
                return f4;
            }
            if (iOrdinal == 3) {
                return f4 * f;
            }
            if (iOrdinal == 4) {
                f2 = f4 * f;
                f3 = 2.54f;
            } else if (iOrdinal == 5) {
                f2 = f4 * f;
                f3 = 25.4f;
            } else if (iOrdinal == 6) {
                f2 = f4 * f;
                f3 = 72.0f;
            } else {
                if (iOrdinal != 7) {
                    return f4;
                }
                f2 = f4 * f;
                f3 = 6.0f;
            }
            return f2 / f3;
        }

        public final float b(YB1 yb1) {
            float fSqrt;
            if (this.e != c0.g) {
                return e(yb1);
            }
            YB1.g gVar = yb1.d;
            C2364a c2364a = gVar.g;
            if (c2364a == null) {
                c2364a = gVar.f;
            }
            float f = this.d;
            if (c2364a == null) {
                return f;
            }
            float f2 = c2364a.c;
            float f3 = c2364a.d;
            if (f2 == f3) {
                fSqrt = f * f2;
            } else {
                fSqrt = f * ((float) (Math.sqrt((f3 * f3) + (f2 * f2)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }

        public final float d(YB1 yb1, float f) {
            return this.e == c0.g ? (this.d * f) / 100.0f : e(yb1);
        }

        public final float e(YB1 yb1) {
            float f;
            float f2;
            int iOrdinal = this.e.ordinal();
            float f3 = this.d;
            switch (iOrdinal) {
                case 1:
                    return yb1.d.d.getTextSize() * f3;
                case 2:
                    return (yb1.d.d.getTextSize() / 2.0f) * f3;
                case 3:
                    return f3 * yb1.b;
                case 4:
                    f = f3 * yb1.b;
                    f2 = 2.54f;
                    break;
                case 5:
                    f = f3 * yb1.b;
                    f2 = 25.4f;
                    break;
                case 6:
                    f = f3 * yb1.b;
                    f2 = 72.0f;
                    break;
                case 7:
                    f = f3 * yb1.b;
                    f2 = 6.0f;
                    break;
                case 8:
                    YB1.g gVar = yb1.d;
                    C2364a c2364a = gVar.g;
                    if (c2364a == null) {
                        c2364a = gVar.f;
                    }
                    if (c2364a != null) {
                        f = f3 * c2364a.c;
                        f2 = 100.0f;
                        break;
                    }
                default:
                    return f3;
            }
            return f / f2;
        }

        public final float g(YB1 yb1) {
            if (this.e != c0.g) {
                return e(yb1);
            }
            YB1.g gVar = yb1.d;
            C2364a c2364a = gVar.g;
            if (c2364a == null) {
                c2364a = gVar.f;
            }
            float f = this.d;
            return c2364a == null ? f : (f * c2364a.d) / 100.0f;
        }

        public final boolean h() {
            return this.d < 0.0f;
        }

        public final boolean i() {
            return this.d == 0.0f;
        }

        public final String toString() {
            return String.valueOf(this.d) + this.e;
        }

        public C2378o(float f) {
            this.d = f;
            this.e = c0.d;
        }
    }

    /* JADX INFO: renamed from: XB1$a, reason: case insensitive filesystem */
    public static class C2364a {
        public float a;
        public float b;
        public float c;
        public float d;

        public C2364a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final float a() {
            return this.a + this.c;
        }

        public final float b() {
            return this.b + this.d;
        }

        public final String toString() {
            return "[" + this.a + " " + this.b + " " + this.c + " " + this.d + "]";
        }

        public C2364a(C2364a c2364a) {
            this.a = c2364a.a;
            this.b = c2364a.b;
            this.c = c2364a.c;
            this.d = c2364a.d;
        }
    }

    public static class B extends K implements I {
        @Override // XB1.I
        public final List<M> c() {
            return Collections.EMPTY_LIST;
        }

        @Override // XB1.K
        public final String n() {
            return "solidColor";
        }

        @Override // XB1.I
        public final void f(M m) {
        }
    }

    public static class C extends K implements I {
        public Float h;

        @Override // XB1.I
        public final List<M> c() {
            return Collections.EMPTY_LIST;
        }

        @Override // XB1.K
        public final String n() {
            return "stop";
        }

        @Override // XB1.I
        public final void f(M m) {
        }
    }

    public static abstract class G extends J implements I, F {
        public ArrayList i = new ArrayList();
        public HashSet j = null;
        public String k = null;
        public HashSet l = null;
        public HashSet m = null;

        @Override // XB1.F
        public final Set<String> a() {
            return null;
        }

        @Override // XB1.F
        public final String b() {
            return this.k;
        }

        @Override // XB1.I
        public final List<M> c() {
            return this.i;
        }

        @Override // XB1.F
        public final void e(HashSet hashSet) {
            this.j = hashSet;
        }

        @Override // XB1.I
        public void f(M m) {
            this.i.add(m);
        }

        @Override // XB1.F
        public final void g(HashSet hashSet) {
            this.m = hashSet;
        }

        @Override // XB1.F
        public final Set<String> getRequiredFeatures() {
            return this.j;
        }

        @Override // XB1.F
        public final void h(String str) {
            this.k = str;
        }

        @Override // XB1.F
        public final void i(HashSet hashSet) {
            this.l = hashSet;
        }

        @Override // XB1.F
        public final Set<String> l() {
            return this.l;
        }

        @Override // XB1.F
        public final Set<String> m() {
            return this.m;
        }

        @Override // XB1.F
        public final void j(HashSet hashSet) {
        }
    }
}
