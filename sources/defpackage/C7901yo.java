package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7901yo extends RA0 {
    public final String a;
    public final long b;
    public final long c;

    public C7901yo(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.RA0
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // defpackage.RA0
    @NonNull
    public final long b() {
        return this.c;
    }

    @Override // defpackage.RA0
    @NonNull
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RA0)) {
            return false;
        }
        RA0 ra0 = (RA0) obj;
        return this.a.equals(ra0.a()) && this.b == ra0.c() && this.c == ra0.b();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return C0681Bn.c(sb, this.c, "}");
    }
}
