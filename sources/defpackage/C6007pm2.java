package defpackage;

/* JADX INFO: renamed from: pm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6007pm2 extends AbstractC6217qm2 {
    public final int a = 3;
    public final long b;

    public C6007pm2(long j) {
        this.b = j;
    }

    @Override // defpackage.AbstractC6217qm2
    public final int a() {
        return this.a;
    }

    @Override // defpackage.AbstractC6217qm2
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6217qm2)) {
            return false;
        }
        AbstractC6217qm2 abstractC6217qm2 = (AbstractC6217qm2) obj;
        return this.a == abstractC6217qm2.a() && this.b == abstractC6217qm2.b();
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.a);
        sb.append(", eventTimestamp=");
        return C0681Bn.c(sb, this.b, "}");
    }
}
