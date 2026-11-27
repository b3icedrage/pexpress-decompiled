package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684Bo extends AbstractC5933pS0 {
    public final long a;
    public final long b;
    public final C2087Tn c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    public final EnumC7682xl1 g;

    public C0684Bo() {
        throw null;
    }

    public C0684Bo(long j, long j2, C2087Tn c2087Tn, Integer num, String str, ArrayList arrayList) {
        EnumC7682xl1 enumC7682xl1 = EnumC7682xl1.d;
        this.a = j;
        this.b = j2;
        this.c = c2087Tn;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = enumC7682xl1;
    }

    @Override // defpackage.AbstractC5933pS0
    public final SD a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5933pS0
    public final List<AbstractC4880kS0> b() {
        return this.f;
    }

    @Override // defpackage.AbstractC5933pS0
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.AbstractC5933pS0
    public final String d() {
        return this.e;
    }

    @Override // defpackage.AbstractC5933pS0
    public final EnumC7682xl1 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5933pS0)) {
            return false;
        }
        AbstractC5933pS0 abstractC5933pS0 = (AbstractC5933pS0) obj;
        if (this.a != abstractC5933pS0.f() || this.b != abstractC5933pS0.g()) {
            return false;
        }
        C2087Tn c2087Tn = this.c;
        if (c2087Tn == null) {
            if (abstractC5933pS0.a() != null) {
                return false;
            }
        } else if (!c2087Tn.equals(abstractC5933pS0.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (abstractC5933pS0.c() != null) {
                return false;
            }
        } else if (!num.equals(abstractC5933pS0.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (abstractC5933pS0.d() != null) {
                return false;
            }
        } else if (!str.equals(abstractC5933pS0.d())) {
            return false;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            if (abstractC5933pS0.b() != null) {
                return false;
            }
        } else if (!arrayList.equals(abstractC5933pS0.b())) {
            return false;
        }
        EnumC7682xl1 enumC7682xl1 = this.g;
        if (enumC7682xl1 == null) {
            return abstractC5933pS0.e() == null;
        }
        return enumC7682xl1.equals(abstractC5933pS0.e());
    }

    @Override // defpackage.AbstractC5933pS0
    public final long f() {
        return this.a;
    }

    @Override // defpackage.AbstractC5933pS0
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C2087Tn c2087Tn = this.c;
        int iHashCode = (i ^ (c2087Tn == null ? 0 : c2087Tn.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        EnumC7682xl1 enumC7682xl1 = this.g;
        return iHashCode4 ^ (enumC7682xl1 != null ? enumC7682xl1.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
