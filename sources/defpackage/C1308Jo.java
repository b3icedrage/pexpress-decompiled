package defpackage;

/* JADX INFO: renamed from: Jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1308Jo extends AP1 {
    public final long a;
    public final long b;
    public final long c;

    public C1308Jo(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.AP1
    public final long a() {
        return this.b;
    }

    @Override // defpackage.AP1
    public final long b() {
        return this.a;
    }

    @Override // defpackage.AP1
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AP1)) {
            return false;
        }
        AP1 ap1 = (AP1) obj;
        return this.a == ap1.b() && this.b == ap1.a() && this.c == ap1.c();
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return C0681Bn.c(sb, this.c, "}");
    }
}
