package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: no, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5591no extends AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    /* JADX INFO: renamed from: no$a */
    public static final class a extends AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a.AbstractC0463a {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;

        public final C5591no a() {
            String strC = this.a == null ? " pc" : "";
            if (this.b == null) {
                strC = strC.concat(" symbol");
            }
            if (this.d == null) {
                strC = Z0.c(strC, " offset");
            }
            if (this.e == null) {
                strC = Z0.c(strC, " importance");
            }
            if (strC.isEmpty()) {
                return new C5591no(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C5591no(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a
    public final String a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a
    public final int b() {
        return this.e;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a
    public final long c() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a
    public final long d() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a
    @NonNull
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a)) {
            return false;
        }
        AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a abstractC0462a = (AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a) obj;
        if (this.a != abstractC0462a.d() || !this.b.equals(abstractC0462a.e())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (abstractC0462a.a() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0462a.a())) {
            return false;
        }
        return this.d == abstractC0462a.c() && this.e == abstractC0462a.b();
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return SK.b(sb, this.e, "}");
    }
}
