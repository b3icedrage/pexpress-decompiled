package defpackage;

/* JADX INFO: renamed from: Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1931Rn extends AbstractC1077Gp {
    public final AbstractC1077Gp.a a;
    public final long b;

    public C1931Rn(AbstractC1077Gp.a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    @Override // defpackage.AbstractC1077Gp
    public final long a() {
        return this.b;
    }

    @Override // defpackage.AbstractC1077Gp
    public final AbstractC1077Gp.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1077Gp)) {
            return false;
        }
        AbstractC1077Gp abstractC1077Gp = (AbstractC1077Gp) obj;
        return this.a.equals(abstractC1077Gp.b()) && this.b == abstractC1077Gp.a();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return C0681Bn.c(sb, this.b, "}");
    }
}
