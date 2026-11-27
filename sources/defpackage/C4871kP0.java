package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: kP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4871kP0 extends AbstractC3748fH {
    public C5081lP0[] f;
    public c g;
    public e h;
    public d i;
    public a j;
    public b k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: kP0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("LEFT_TO_RIGHT", 0);
            d = aVar;
            a aVar2 = new a("RIGHT_TO_LEFT", 1);
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
    /* JADX INFO: renamed from: kP0$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final /* synthetic */ b[] h;

        static {
            b bVar = new b("NONE", 0);
            d = bVar;
            b bVar2 = new b("EMPTY", 1);
            b bVar3 = new b("DEFAULT", 2);
            e = bVar3;
            b bVar4 = new b("SQUARE", 3);
            g = bVar4;
            h = new b[]{bVar, bVar2, bVar3, bVar4, new b("CIRCLE", 4), new b("LINE", 5)};
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
    /* JADX INFO: renamed from: kP0$c */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final /* synthetic */ c[] g;

        static {
            c cVar = new c("LEFT", 0);
            d = cVar;
            c cVar2 = new c("CENTER", 1);
            e = cVar2;
            g = new c[]{cVar, cVar2, new c("RIGHT", 2)};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: kP0$d */
    public static final class d {
        public static final d d;
        public static final d e;
        public static final /* synthetic */ d[] g;

        static {
            d dVar = new d("HORIZONTAL", 0);
            d = dVar;
            d dVar2 = new d("VERTICAL", 1);
            e = dVar2;
            g = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: kP0$e */
    public static final class e {
        public static final e d;
        public static final /* synthetic */ e[] e;

        /* JADX INFO: Fake field, exist only in values array */
        e EF0;

        static {
            e eVar = new e("TOP", 0);
            e eVar2 = new e("CENTER", 1);
            e eVar3 = new e("BOTTOM", 2);
            d = eVar3;
            e = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) e.clone();
        }
    }
}
