package defpackage;

/* JADX INFO: renamed from: uX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6996uX {
    public final C7892yl1<?> a;
    public final int b;
    public final int c;

    public C6996uX(int i, int i2, Class cls) {
        this((C7892yl1<?>) C7892yl1.a(cls), i, i2);
    }

    public static C6996uX a(Class<?> cls) {
        return new C6996uX(0, 1, cls);
    }

    public static C6996uX b(Class<?> cls) {
        return new C6996uX(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6996uX)) {
            return false;
        }
        C6996uX c6996uX = (C6996uX) obj;
        return this.a.equals(c6996uX.a) && this.b == c6996uX.b && this.c == c6996uX.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(EK.e(i2, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return C5807oq.b(sb, str2, "}");
    }

    public C6996uX(C7892yl1<?> c7892yl1, int i, int i2) {
        this.a = c7892yl1;
        this.b = i;
        this.c = i2;
    }
}
