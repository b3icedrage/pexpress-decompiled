package defpackage;

/* JADX INFO: renamed from: Tp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2095Tp1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Tp1$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("ALLOW", 0);
            d = aVar;
            a aVar2 = new a("INDECISIVE", 1);
            e = aVar2;
            a aVar3 = new a("BLOCK_INACCESSIBLE", 2);
            g = aVar3;
            a aVar4 = new a("BLOCK_ALL", 3);
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

    a a();
}
