package defpackage;

/* JADX INFO: renamed from: oZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5744oZ0 implements YL {
    public final a a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oZ0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final /* synthetic */ a[] j;

        static {
            a aVar = new a("MERGE", 0);
            d = aVar;
            a aVar2 = new a("ADD", 1);
            e = aVar2;
            a aVar3 = new a("SUBTRACT", 2);
            g = aVar3;
            a aVar4 = new a("INTERSECT", 3);
            h = aVar4;
            a aVar5 = new a("EXCLUDE_INTERSECTIONS", 4);
            i = aVar5;
            j = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) j.clone();
        }
    }

    public C5744oZ0(String str, a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        if (du0.q) {
            return new C5954pZ0(this);
        }
        CS0.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.a + '}';
    }
}
