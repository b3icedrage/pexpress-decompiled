package defpackage;

/* JADX INFO: renamed from: Co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0762Co extends AbstractC6143qS0 {
    public final long a;

    public C0762Co(long j) {
        this.a = j;
    }

    @Override // defpackage.AbstractC6143qS0
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC6143qS0) && this.a == ((AbstractC6143qS0) obj).b();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return C0681Bn.c(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
