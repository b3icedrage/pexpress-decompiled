package defpackage;

/* JADX INFO: renamed from: d02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3271d02 {
    public static final C3271d02 c = new C3271d02(a.e, null);
    public static final C3271d02 d = new C3271d02(a.g, null);
    public static final C3271d02 e = new C3271d02(a.h, null);
    public static final C3271d02 f = new C3271d02(a.i, null);
    public final a a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: d02$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final /* synthetic */ a[] j;

        static {
            a aVar = new a("LITERAL", 0);
            d = aVar;
            a aVar2 = new a("START", 1);
            e = aVar2;
            a aVar3 = new a("CURLY_LEFT", 2);
            g = aVar3;
            a aVar4 = new a("CURLY_RIGHT", 3);
            h = aVar4;
            a aVar5 = new a("DEFAULT", 4);
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

    public C3271d02(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3271d02.class != obj.getClass()) {
            return false;
        }
        C3271d02 c3271d02 = (C3271d02) obj;
        if (this.a != c3271d02.a) {
            return false;
        }
        String str = c3271d02.b;
        String str2 = this.b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        a aVar = this.a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = "Token{type=" + this.a;
        String str2 = this.b;
        if (str2 != null) {
            str = str + ", payload='" + str2 + '\'';
        }
        return str + '}';
    }
}
