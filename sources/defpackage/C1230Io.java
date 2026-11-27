package defpackage;

/* JADX INFO: renamed from: Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230Io extends IF1 {
    public final C1778Po a;
    public final String b;
    public final C6850to c;
    public final A42<?, byte[]> d;
    public final H60 e;

    public C1230Io(C1778Po c1778Po, String str, C6850to c6850to, A42 a42, H60 h60) {
        this.a = c1778Po;
        this.b = str;
        this.c = c6850to;
        this.d = a42;
        this.e = h60;
    }

    @Override // defpackage.IF1
    public final H60 a() {
        return this.e;
    }

    @Override // defpackage.IF1
    public final X70<?> b() {
        return this.c;
    }

    @Override // defpackage.IF1
    public final A42<?, byte[]> c() {
        return this.d;
    }

    @Override // defpackage.IF1
    public final V42 d() {
        return this.a;
    }

    @Override // defpackage.IF1
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IF1)) {
            return false;
        }
        IF1 if1 = (IF1) obj;
        return this.a.equals(if1.d()) && this.b.equals(if1.e()) && this.c.equals(if1.b()) && this.d.equals(if1.c()) && this.e.equals(if1.a());
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
