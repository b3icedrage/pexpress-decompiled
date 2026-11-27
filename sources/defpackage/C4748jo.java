package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4748jo extends AbstractC5713oP.e.d.a.b.AbstractC0459a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public C4748jo(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0459a
    @NonNull
    public final long a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0459a
    @NonNull
    public final String b() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0459a
    public final long c() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0459a
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d.a.b.AbstractC0459a)) {
            return false;
        }
        AbstractC5713oP.e.d.a.b.AbstractC0459a abstractC0459a = (AbstractC5713oP.e.d.a.b.AbstractC0459a) obj;
        if (this.a != abstractC0459a.a() || this.b != abstractC0459a.c() || !this.c.equals(abstractC0459a.b())) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            return abstractC0459a.d() == null;
        }
        return str.equals(abstractC0459a.d());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return C5807oq.b(sb, this.d, "}");
    }
}
