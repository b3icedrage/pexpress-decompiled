package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1152Ho extends AbstractC5259mD1.a {
    public final long a;
    public final long b;
    public final Set<AbstractC5259mD1.b> c;

    public C1152Ho(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // defpackage.AbstractC5259mD1.a
    public final long a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5259mD1.a
    public final Set<AbstractC5259mD1.b> b() {
        return this.c;
    }

    @Override // defpackage.AbstractC5259mD1.a
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5259mD1.a)) {
            return false;
        }
        AbstractC5259mD1.a aVar = (AbstractC5259mD1.a) obj;
        return this.a == aVar.a() && this.b == aVar.c() && this.c.equals(aVar.b());
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
