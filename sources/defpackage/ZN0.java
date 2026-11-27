package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ZN0 {
    public final List<YL> a;
    public final C3788fU0 b;
    public final String c;
    public final long d;
    public final a e;
    public final long f;
    public final String g;
    public final List<C5738oX0> h;
    public final C3603ec i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final C2975bc q;
    public final C3184cc r;
    public final C1973Sb s;
    public final List<C7589xK0<Float>> t;
    public final b u;
    public final boolean v;
    public final C4973kt w;
    public final C2866b40 x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("PRE_COMP", 0);
            d = aVar;
            a aVar2 = new a("SOLID", 1);
            a aVar3 = new a("IMAGE", 2);
            e = aVar3;
            a aVar4 = new a("NULL", 3);
            a aVar5 = new a("SHAPE", 4);
            a aVar6 = new a("TEXT", 5);
            a aVar7 = new a("UNKNOWN", 6);
            g = aVar7;
            h = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] g;

        static {
            b bVar = new b("NONE", 0);
            d = bVar;
            b bVar2 = new b("ADD", 1);
            b bVar3 = new b("INVERT", 2);
            e = bVar3;
            g = new b[]{bVar, bVar2, bVar3, new b("LUMA", 3), new b("LUMA_INVERTED", 4), new b("UNKNOWN", 5)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }
    }

    public ZN0(List<YL> list, C3788fU0 c3788fU0, String str, long j, a aVar, long j2, String str2, List<C5738oX0> list2, C3603ec c3603ec, int i, int i2, int i3, float f, float f2, float f3, float f4, C2975bc c2975bc, C3184cc c3184cc, List<C7589xK0<Float>> list3, b bVar, C1973Sb c1973Sb, boolean z, C4973kt c4973kt, C2866b40 c2866b40) {
        this.a = list;
        this.b = c3788fU0;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = c3603ec;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = c2975bc;
        this.r = c3184cc;
        this.t = list3;
        this.u = bVar;
        this.s = c1973Sb;
        this.v = z;
        this.w = c4973kt;
        this.x = c2866b40;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbF = C1039Gc0.f(str);
        sbF.append(this.c);
        sbF.append("\n");
        C3788fU0 c3788fU0 = this.b;
        ZN0 zn0 = (ZN0) c3788fU0.h.d(this.f, null);
        if (zn0 != null) {
            sbF.append("\t\tParents: ");
            sbF.append(zn0.c);
            for (ZN0 zn1 = (ZN0) c3788fU0.h.d(zn0.f, null); zn1 != null; zn1 = (ZN0) c3788fU0.h.d(zn1.f, null)) {
                sbF.append("->");
                sbF.append(zn1.c);
            }
            sbF.append(str);
            sbF.append("\n");
        }
        List<C5738oX0> list = this.h;
        if (!list.isEmpty()) {
            sbF.append(str);
            sbF.append("\tMasks: ");
            sbF.append(list.size());
            sbF.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbF.append(str);
            sbF.append("\tBackground: ");
            sbF.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List<YL> list2 = this.a;
        if (!list2.isEmpty()) {
            sbF.append(str);
            sbF.append("\tShapes:\n");
            for (YL yl : list2) {
                sbF.append(str);
                sbF.append("\t\t");
                sbF.append(yl);
                sbF.append("\n");
            }
        }
        return sbF.toString();
    }

    public final String toString() {
        return a("");
    }
}
