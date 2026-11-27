package defpackage;

/* JADX INFO: renamed from: pO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5921pO0 {
    public volatile IZ0 a;
    public volatile AbstractC1565Mw b;

    public final IZ0 a(IZ0 iz0) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = iz0;
                        this.b = AbstractC1565Mw.e;
                    } catch (C6724tC0 unused) {
                        this.a = iz0;
                        this.b = AbstractC1565Mw.e;
                    }
                }
            }
        }
        return this.a;
    }

    public final AbstractC1565Mw b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = AbstractC1565Mw.e;
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
        if (!(obj instanceof C5921pO0)) {
            return false;
        }
        C5921pO0 c5921pO0 = (C5921pO0) obj;
        IZ0 iz0 = this.a;
        IZ0 iz1 = c5921pO0.a;
        if (iz0 == null && iz1 == null) {
            return b().equals(c5921pO0.b());
        }
        if (iz0 == null || iz1 == null) {
            return iz0 != null ? iz0.equals(c5921pO0.a(iz0.d())) : a(iz1.d()).equals(iz1);
        }
        return iz0.equals(iz1);
    }

    public int hashCode() {
        return 1;
    }
}
