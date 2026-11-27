package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: iK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4389iK1 implements YL {
    public final String a;
    public final C1973Sb b;
    public final ArrayList c;
    public final C1895Rb d;
    public final C2129Ub e;
    public final C1973Sb f;
    public final a g;
    public final b h;
    public final float i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: iK1$a */
    public static final class a {
        public static final /* synthetic */ a[] d = {new a("BUTT", 0), new a("ROUND", 1), new a("UNKNOWN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: iK1$b */
    public static final class b {
        public static final /* synthetic */ b[] d = {new b("MITER", 0), new b("ROUND", 1), new b("BEVEL", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public C4389iK1(String str, C1973Sb c1973Sb, ArrayList arrayList, C1895Rb c1895Rb, C2129Ub c2129Ub, C1973Sb c1973Sb2, a aVar, b bVar, float f, boolean z) {
        this.a = str;
        this.b = c1973Sb;
        this.c = arrayList;
        this.d = c1895Rb;
        this.e = c2129Ub;
        this.f = c1973Sb2;
        this.g = aVar;
        this.h = bVar;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        return new LS1(du0, abstractC1158Hq, this);
    }
}
