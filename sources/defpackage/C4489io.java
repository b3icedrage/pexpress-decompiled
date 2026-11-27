package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4489io extends AbstractC5713oP.e.d.a.b {
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d> a;
    public final C4958ko b;
    public final C2325Wn c;
    public final C5168lo d;
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0459a> e;

    public C4489io() {
        throw null;
    }

    public C4489io(C1255Iw0 c1255Iw0, C4958ko c4958ko, C2325Wn c2325Wn, C5168lo c5168lo, C1255Iw0 c1255Iw1) {
        this.a = c1255Iw0;
        this.b = c4958ko;
        this.c = c2325Wn;
        this.d = c5168lo;
        this.e = c1255Iw1;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b
    public final AbstractC5713oP.a a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b
    @NonNull
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0459a> b() {
        return this.e;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b
    public final AbstractC5713oP.e.d.a.b.AbstractC0460b c() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b
    @NonNull
    public final AbstractC5713oP.e.d.a.b.c d() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d.a.b)) {
            return false;
        }
        AbstractC5713oP.e.d.a.b bVar = (AbstractC5713oP.e.d.a.b) obj;
        C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d> c1255Iw0 = this.a;
        if (c1255Iw0 != null) {
            if (!c1255Iw0.d.equals(bVar.e())) {
                return false;
            }
        } else if (bVar.e() != null) {
            return false;
        }
        C4958ko c4958ko = this.b;
        if (c4958ko == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!c4958ko.equals(bVar.c())) {
            return false;
        }
        C2325Wn c2325Wn = this.c;
        if (c2325Wn == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!c2325Wn.equals(bVar.a())) {
            return false;
        }
        if (this.d.equals(bVar.d())) {
            return this.e.d.equals(bVar.b());
        }
        return false;
    }

    public final int hashCode() {
        C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d> c1255Iw0 = this.a;
        int iHashCode = ((c1255Iw0 == null ? 0 : c1255Iw0.d.hashCode()) ^ 1000003) * 1000003;
        C4958ko c4958ko = this.b;
        int iHashCode2 = (iHashCode ^ (c4958ko == null ? 0 : c4958ko.hashCode())) * 1000003;
        C2325Wn c2325Wn = this.c;
        return (((((c2325Wn != null ? c2325Wn.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.d.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
