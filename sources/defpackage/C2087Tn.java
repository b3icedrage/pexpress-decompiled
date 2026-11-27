package defpackage;

/* JADX INFO: renamed from: Tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2087Tn extends SD {
    public final SD.a a = SD.a.d;
    public final C1775Pn b;

    public C2087Tn(C1775Pn c1775Pn) {
        this.b = c1775Pn;
    }

    @Override // defpackage.SD
    public final AbstractC2546Za a() {
        return this.b;
    }

    @Override // defpackage.SD
    public final SD.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SD)) {
            return false;
        }
        SD sd = (SD) obj;
        SD.a aVar = this.a;
        if (aVar == null) {
            if (sd.b() != null) {
                return false;
            }
        } else if (!aVar.equals(sd.b())) {
            return false;
        }
        C1775Pn c1775Pn = this.b;
        if (c1775Pn == null) {
            return sd.a() == null;
        }
        return c1775Pn.equals(sd.a());
    }

    public final int hashCode() {
        SD.a aVar = this.a;
        int iHashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        C1775Pn c1775Pn = this.b;
        return (c1775Pn != null ? c1775Pn.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
