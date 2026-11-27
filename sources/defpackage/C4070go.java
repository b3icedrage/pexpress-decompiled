package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4070go extends AbstractC5713oP.e.d {
    public final long a;
    public final String b;
    public final AbstractC5713oP.e.d.a c;
    public final AbstractC5713oP.e.d.c d;
    public final AbstractC5713oP.e.d.AbstractC0464d e;

    /* JADX INFO: renamed from: go$a */
    public static final class a extends AbstractC5713oP.e.d.b {
        public Long a;
        public String b;
        public AbstractC5713oP.e.d.a c;
        public AbstractC5713oP.e.d.c d;
        public AbstractC5713oP.e.d.AbstractC0464d e;

        public final C4070go a() {
            String strC = this.a == null ? " timestamp" : "";
            if (this.b == null) {
                strC = strC.concat(" type");
            }
            if (this.c == null) {
                strC = Z0.c(strC, " app");
            }
            if (this.d == null) {
                strC = Z0.c(strC, " device");
            }
            if (strC.isEmpty()) {
                return new C4070go(this.a.longValue(), this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C4070go(long j, String str, AbstractC5713oP.e.d.a aVar, AbstractC5713oP.e.d.c cVar, AbstractC5713oP.e.d.AbstractC0464d abstractC0464d) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0464d;
    }

    @Override // defpackage.AbstractC5713oP.e.d
    @NonNull
    public final AbstractC5713oP.e.d.a a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d
    @NonNull
    public final AbstractC5713oP.e.d.c b() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.e.d
    public final AbstractC5713oP.e.d.AbstractC0464d c() {
        return this.e;
    }

    @Override // defpackage.AbstractC5713oP.e.d
    public final long d() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.e.d
    @NonNull
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d)) {
            return false;
        }
        AbstractC5713oP.e.d dVar = (AbstractC5713oP.e.d) obj;
        if (this.a != dVar.d() || !this.b.equals(dVar.e()) || !this.c.equals(dVar.a()) || !this.d.equals(dVar.b())) {
            return false;
        }
        AbstractC5713oP.e.d.AbstractC0464d abstractC0464d = this.e;
        if (abstractC0464d == null) {
            return dVar.c() == null;
        }
        return abstractC0464d.equals(dVar.c());
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        AbstractC5713oP.e.d.AbstractC0464d abstractC0464d = this.e;
        return iHashCode ^ (abstractC0464d == null ? 0 : abstractC0464d.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}
