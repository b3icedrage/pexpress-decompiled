package defpackage;

/* JADX INFO: renamed from: vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7270vo extends U80 {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public C7270vo(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    @Override // defpackage.U80
    public final int a() {
        return this.d;
    }

    @Override // defpackage.U80
    public final long b() {
        return this.e;
    }

    @Override // defpackage.U80
    public final int c() {
        return this.c;
    }

    @Override // defpackage.U80
    public final int d() {
        return this.f;
    }

    @Override // defpackage.U80
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U80)) {
            return false;
        }
        U80 u80 = (U80) obj;
        return this.b == u80.e() && this.c == u80.c() && this.d == u80.a() && this.e == u80.b() && this.f == u80.d();
    }

    public final int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.b);
        sb.append(", loadBatchSize=");
        sb.append(this.c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.e);
        sb.append(", maxBlobByteSizePerRow=");
        return SK.b(sb, this.f, "}");
    }
}
