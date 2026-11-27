package defpackage;

/* JADX WARN: Method from annotation default annotation not found: intEncoding */
/* JADX INFO: renamed from: zk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public @interface InterfaceC8098zk1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: zk1$a */
    public static final class a {
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("DEFAULT", 0);
            d = aVar;
            e = new a[]{aVar, new a("SIGNED", 1), new a("FIXED", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }
}
