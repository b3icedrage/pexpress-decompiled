package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2325Wn extends AbstractC5713oP.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final C1255Iw0<AbstractC5713oP.a.AbstractC0456a> i;

    /* JADX INFO: renamed from: Wn$a */
    public static final class a extends AbstractC5713oP.a.b {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;
        public C1255Iw0<AbstractC5713oP.a.AbstractC0456a> i;

        public final C2325Wn a() {
            String strC = this.a == null ? " pid" : "";
            if (this.b == null) {
                strC = strC.concat(" processName");
            }
            if (this.c == null) {
                strC = Z0.c(strC, " reasonCode");
            }
            if (this.d == null) {
                strC = Z0.c(strC, " importance");
            }
            if (this.e == null) {
                strC = Z0.c(strC, " pss");
            }
            if (this.f == null) {
                strC = Z0.c(strC, " rss");
            }
            if (this.g == null) {
                strC = Z0.c(strC, " timestamp");
            }
            if (strC.isEmpty()) {
                return new C2325Wn(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C2325Wn() {
        throw null;
    }

    public C2325Wn(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, C1255Iw0 c1255Iw0) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = c1255Iw0;
    }

    @Override // defpackage.AbstractC5713oP.a
    public final C1255Iw0<AbstractC5713oP.a.AbstractC0456a> a() {
        return this.i;
    }

    @Override // defpackage.AbstractC5713oP.a
    @NonNull
    public final int b() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.a
    @NonNull
    public final int c() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.a
    @NonNull
    public final String d() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.a
    @NonNull
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.a)) {
            return false;
        }
        AbstractC5713oP.a aVar = (AbstractC5713oP.a) obj;
        if (this.a != aVar.c() || !this.b.equals(aVar.d()) || this.c != aVar.f() || this.d != aVar.b() || this.e != aVar.e() || this.f != aVar.g() || this.g != aVar.h()) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str.equals(aVar.i())) {
            return false;
        }
        C1255Iw0<AbstractC5713oP.a.AbstractC0456a> c1255Iw0 = this.i;
        if (c1255Iw0 == null) {
            return aVar.a() == null;
        }
        return c1255Iw0.d.equals(aVar.a());
    }

    @Override // defpackage.AbstractC5713oP.a
    @NonNull
    public final int f() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.a
    @NonNull
    public final long g() {
        return this.f;
    }

    @Override // defpackage.AbstractC5713oP.a
    @NonNull
    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C1255Iw0<AbstractC5713oP.a.AbstractC0456a> c1255Iw0 = this.i;
        return iHashCode2 ^ (c1255Iw0 != null ? c1255Iw0.d.hashCode() : 0);
    }

    @Override // defpackage.AbstractC5713oP.a
    public final String i() {
        return this.h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
