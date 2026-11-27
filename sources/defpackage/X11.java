package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class X11<T> {
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1037Gb1)) {
            return false;
        }
        C1037Gb1 c1037Gb1 = (C1037Gb1) obj;
        Object obj2 = c1037Gb1.a;
        Object obj3 = this.a;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = c1037Gb1.b;
        Object obj5 = this.b;
        if (obj4 != obj5) {
            return obj4 != null && obj4.equals(obj5);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.a) + " " + ((Object) this.b) + "}";
    }
}
