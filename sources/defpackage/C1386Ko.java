package defpackage;

/* JADX INFO: renamed from: Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1386Ko extends WP1 {
    public final C1464Lo a;
    public final C1622No b;
    public final C1541Mo c;

    public C1386Ko(C1464Lo c1464Lo, C1622No c1622No, C1541Mo c1541Mo) {
        this.a = c1464Lo;
        this.b = c1622No;
        this.c = c1541Mo;
    }

    @Override // defpackage.WP1
    public final WP1.a a() {
        return this.a;
    }

    @Override // defpackage.WP1
    public final WP1.b b() {
        return this.c;
    }

    @Override // defpackage.WP1
    public final WP1.c c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WP1)) {
            return false;
        }
        WP1 wp1 = (WP1) obj;
        return this.a.equals(wp1.a()) && this.b.equals(wp1.c()) && this.c.equals(wp1.b());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
