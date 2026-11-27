package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3860fo extends AbstractC5713oP.e.c {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    /* JADX INFO: renamed from: fo$a */
    public static final class a extends AbstractC5713oP.e.c.a {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;

        public final C3860fo a() {
            String strC = this.a == null ? " arch" : "";
            if (this.b == null) {
                strC = strC.concat(" model");
            }
            if (this.c == null) {
                strC = Z0.c(strC, " cores");
            }
            if (this.d == null) {
                strC = Z0.c(strC, " ram");
            }
            if (this.e == null) {
                strC = Z0.c(strC, " diskSpace");
            }
            if (this.f == null) {
                strC = Z0.c(strC, " simulator");
            }
            if (this.g == null) {
                strC = Z0.c(strC, " state");
            }
            if (this.h == null) {
                strC = Z0.c(strC, " manufacturer");
            }
            if (this.i == null) {
                strC = Z0.c(strC, " modelClass");
            }
            if (strC.isEmpty()) {
                return new C3860fo(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.intValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C3860fo(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }

    @Override // defpackage.AbstractC5713oP.e.c
    @NonNull
    public final int a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.e.c
    public final int b() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.c
    public final long c() {
        return this.e;
    }

    @Override // defpackage.AbstractC5713oP.e.c
    @NonNull
    public final String d() {
        return this.h;
    }

    @Override // defpackage.AbstractC5713oP.e.c
    @NonNull
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.c)) {
            return false;
        }
        AbstractC5713oP.e.c cVar = (AbstractC5713oP.e.c) obj;
        return this.a == cVar.a() && this.b.equals(cVar.e()) && this.c == cVar.b() && this.d == cVar.g() && this.e == cVar.c() && this.f == cVar.i() && this.g == cVar.h() && this.h.equals(cVar.d()) && this.i.equals(cVar.f());
    }

    @Override // defpackage.AbstractC5713oP.e.c
    @NonNull
    public final String f() {
        return this.i;
    }

    @Override // defpackage.AbstractC5713oP.e.c
    public final long g() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.e.c
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.AbstractC5713oP.e.c
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return C5807oq.b(sb, this.i, "}");
    }
}
