package defpackage;

/* JADX INFO: renamed from: Do, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0840Do extends AbstractC5432n31 {
    public final AbstractC5432n31.b a;
    public final AbstractC5432n31.a b;

    public C0840Do(AbstractC5432n31.b bVar, AbstractC5432n31.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // defpackage.AbstractC5432n31
    public final AbstractC5432n31.a a() {
        return this.b;
    }

    @Override // defpackage.AbstractC5432n31
    public final AbstractC5432n31.b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5432n31)) {
            return false;
        }
        AbstractC5432n31 abstractC5432n31 = (AbstractC5432n31) obj;
        AbstractC5432n31.b bVar = this.a;
        if (bVar == null) {
            if (abstractC5432n31.b() != null) {
                return false;
            }
        } else if (!bVar.equals(abstractC5432n31.b())) {
            return false;
        }
        AbstractC5432n31.a aVar = this.b;
        if (aVar == null) {
            return abstractC5432n31.a() == null;
        }
        return aVar.equals(abstractC5432n31.a());
    }

    public final int hashCode() {
        AbstractC5432n31.b bVar = this.a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC5432n31.a aVar = this.b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
