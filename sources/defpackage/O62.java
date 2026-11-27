package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O62 implements N62 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N62)) {
            return false;
        }
        N62 n62 = (N62) obj;
        return c() == n62.c() && b() == n62.b() && getType().equals(n62.getType());
    }

    public final int hashCode() {
        int iHashCode = b().hashCode();
        if (C3089c72.n(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (b() == EnumC3610ed2.INVARIANT) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}
