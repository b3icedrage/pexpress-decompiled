package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: renamed from: fh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3835fh1 {
    public static final C3835fh1 c = new C3835fh1(a.d, null);
    public static final C3835fh1 d = new C3835fh1(a.j, b.d);
    public final a a;
    public final b b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: fh1$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final /* synthetic */ a[] o;

        static {
            a aVar = new a(DevicePublicKeyStringDef.NONE, 0);
            d = aVar;
            a aVar2 = new a("xMinYMin", 1);
            e = aVar2;
            a aVar3 = new a("xMidYMin", 2);
            g = aVar3;
            a aVar4 = new a("xMaxYMin", 3);
            h = aVar4;
            a aVar5 = new a("xMinYMid", 4);
            i = aVar5;
            a aVar6 = new a("xMidYMid", 5);
            j = aVar6;
            a aVar7 = new a("xMaxYMid", 6);
            k = aVar7;
            a aVar8 = new a("xMinYMax", 7);
            l = aVar8;
            a aVar9 = new a("xMidYMax", 8);
            m = aVar9;
            a aVar10 = new a("xMaxYMax", 9);
            n = aVar10;
            o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) o.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: fh1$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] g;

        static {
            b bVar = new b("meet", 0);
            d = bVar;
            b bVar2 = new b("slice", 1);
            e = bVar2;
            g = new b[]{bVar, bVar2};
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

    public C3835fh1(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3835fh1.class != obj.getClass()) {
            return false;
        }
        C3835fh1 c3835fh1 = (C3835fh1) obj;
        return this.a == c3835fh1.a && this.b == c3835fh1.b;
    }

    public final String toString() {
        return this.a + " " + this.b;
    }
}
