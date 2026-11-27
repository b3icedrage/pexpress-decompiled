package defpackage;

/* JADX INFO: renamed from: nO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5501nO0 {
    public volatile GZ0 a;
    public volatile AbstractC1646Nw b;

    static {
        C1500Ma0.a();
    }

    public final GZ0 a(GZ0 gz0) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = gz0;
                        this.b = AbstractC1646Nw.e;
                    } catch (C6934uC0 unused) {
                        this.a = gz0;
                        this.b = AbstractC1646Nw.e;
                    }
                }
            }
        }
        return this.a;
    }

    public final AbstractC1646Nw b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = AbstractC1646Nw.e;
                } else {
                    this.b = this.a.e();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5501nO0)) {
            return false;
        }
        C5501nO0 c5501nO0 = (C5501nO0) obj;
        GZ0 gz0 = this.a;
        GZ0 gz1 = c5501nO0.a;
        if (gz0 == null && gz1 == null) {
            return b().equals(c5501nO0.b());
        }
        if (gz0 == null || gz1 == null) {
            return gz0 != null ? gz0.equals(c5501nO0.a(gz0.d())) : a(gz1.d()).equals(gz1);
        }
        return gz0.equals(gz1);
    }

    public int hashCode() {
        return 1;
    }
}
