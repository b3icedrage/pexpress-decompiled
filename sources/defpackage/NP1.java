package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class NP1 {
    public EnumC5357mh2 a;
    public a b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("NONE", 0);
            d = aVar;
            a aVar2 = new a("SERVER", 1);
            e = aVar2;
            a aVar3 = new a("CLIENT", 2);
            g = aVar3;
            h = new a[]{aVar, aVar2, aVar3};
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
}
