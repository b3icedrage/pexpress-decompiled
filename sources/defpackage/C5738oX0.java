package defpackage;

/* JADX INFO: renamed from: oX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5738oX0 {
    public final a a;
    public final C2549Zb b;
    public final C2129Ub c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oX0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("MASK_MODE_ADD", 0);
            d = aVar;
            a aVar2 = new a("MASK_MODE_SUBTRACT", 1);
            e = aVar2;
            a aVar3 = new a("MASK_MODE_INTERSECT", 2);
            g = aVar3;
            a aVar4 = new a("MASK_MODE_NONE", 3);
            h = aVar4;
            i = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public C5738oX0(a aVar, C2549Zb c2549Zb, C2129Ub c2129Ub, boolean z) {
        this.a = aVar;
        this.b = c2549Zb;
        this.c = c2129Ub;
        this.d = z;
    }
}
