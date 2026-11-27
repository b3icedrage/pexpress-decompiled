package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Hl2 extends AbstractC2510Yo {
    public int A;
    public a B;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final /* synthetic */ a[] j;

        static {
            a aVar = new a("TOP", 0);
            d = aVar;
            a aVar2 = new a("BOTTOM", 1);
            e = aVar2;
            a aVar3 = new a("BOTH_SIDED", 2);
            g = aVar3;
            a aVar4 = new a("TOP_INSIDE", 3);
            h = aVar4;
            a aVar5 = new a("BOTTOM_INSIDE", 4);
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
}
