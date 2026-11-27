package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2585Zn extends AbstractC5713oP.d {
    public final C1255Iw0<AbstractC5713oP.d.a> a;
    public final String b;

    public C2585Zn() {
        throw null;
    }

    public C2585Zn(C1255Iw0 c1255Iw0, String str) {
        this.a = c1255Iw0;
        this.b = str;
    }

    @Override // defpackage.AbstractC5713oP.d
    @NonNull
    public final C1255Iw0<AbstractC5713oP.d.a> a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.d
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.d)) {
            return false;
        }
        AbstractC5713oP.d dVar = (AbstractC5713oP.d) obj;
        if (!this.a.d.equals(dVar.a())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            return dVar.b() == null;
        }
        return str.equals(dVar.b());
    }

    public final int hashCode() {
        int iHashCode = (this.a.d.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return C5807oq.b(sb, this.b, "}");
    }
}
