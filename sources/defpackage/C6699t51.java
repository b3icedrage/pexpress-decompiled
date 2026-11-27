package defpackage;

/* JADX INFO: renamed from: t51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6699t51 {
    public final a a;
    public final Object b;
    public C6699t51 c;
    public C6699t51 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: t51$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("LITERAL", 0);
            d = aVar;
            a aVar2 = new a("VARIABLE", 1);
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

    public C6699t51(a aVar, Object obj) {
        this.a = aVar;
        this.b = obj;
    }

    public static void a(C6699t51 c6699t51, StringBuilder sb) {
        while (c6699t51 != null) {
            sb.append(c6699t51.toString());
            sb.append(" --> ");
            c6699t51 = c6699t51.d;
        }
        sb.append("null ");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6699t51.class != obj.getClass()) {
            return false;
        }
        C6699t51 c6699t51 = (C6699t51) obj;
        if (this.a != c6699t51.a) {
            return false;
        }
        Object obj2 = c6699t51.b;
        Object obj3 = this.b;
        if (obj3 != null) {
            if (!obj3.equals(obj2)) {
                return false;
            }
        } else if (obj2 != null) {
            return false;
        }
        C6699t51 c6699t52 = this.c;
        if (c6699t52 != null) {
            if (!c6699t52.equals(c6699t51.c)) {
                return false;
            }
        } else if (c6699t51.c != null) {
            return false;
        }
        C6699t51 c6699t53 = this.d;
        C6699t51 c6699t54 = c6699t51.d;
        if (c6699t53 != null) {
            return c6699t53.equals(c6699t54);
        }
        return c6699t54 == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        C6699t51 c6699t51 = this.c;
        int iHashCode3 = (iHashCode2 + (c6699t51 != null ? c6699t51.hashCode() : 0)) * 31;
        C6699t51 c6699t52 = this.d;
        return iHashCode3 + (c6699t52 != null ? c6699t52.hashCode() : 0);
    }

    public final String toString() {
        a aVar = this.a;
        int iOrdinal = aVar.ordinal();
        Object obj = this.b;
        if (iOrdinal == 0) {
            return "Node{type=" + aVar + ", payload='" + obj + "'}";
        }
        if (iOrdinal != 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        C6699t51 c6699t51 = this.c;
        if (c6699t51 != null) {
            a(c6699t51, sb2);
        }
        a((C6699t51) obj, sb);
        String string = "Node{type=" + aVar + ", payload='" + sb.toString() + "'";
        if (this.c != null) {
            StringBuilder sbB = K1.b(string, ", defaultPart=");
            sbB.append(sb2.toString());
            string = sbB.toString();
        }
        return string + '}';
    }
}
