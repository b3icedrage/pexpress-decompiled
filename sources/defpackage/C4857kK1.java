package defpackage;

/* JADX INFO: renamed from: kK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4857kK1 implements YL {
    public final a a;
    public final C1973Sb b;
    public final C1973Sb c;
    public final C1973Sb d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: kK1$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("SIMULTANEOUSLY", 0);
            d = aVar;
            a aVar2 = new a("INDIVIDUALLY", 1);
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

    public C4857kK1(String str, a aVar, C1973Sb c1973Sb, C1973Sb c1973Sb2, C1973Sb c1973Sb3, boolean z) {
        this.a = aVar;
        this.b = c1973Sb;
        this.c = c1973Sb2;
        this.d = c1973Sb3;
        this.e = z;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        return new C5231m52(abstractC1158Hq, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
