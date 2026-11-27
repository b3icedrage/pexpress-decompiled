package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5168lo extends AbstractC5713oP.e.d.a.b.c {
    public final String a;
    public final String b;
    public final long c;

    public C5168lo(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.c
    @NonNull
    public final long a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.c
    @NonNull
    public final String b() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.c
    @NonNull
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d.a.b.c)) {
            return false;
        }
        AbstractC5713oP.e.d.a.b.c cVar = (AbstractC5713oP.e.d.a.b.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return C0681Bn.c(sb, this.c, "}");
    }
}
