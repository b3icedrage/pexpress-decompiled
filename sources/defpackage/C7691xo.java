package defpackage;

/* JADX INFO: renamed from: xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7691xo extends QA0 {
    public final String a;
    public final String b;
    public final String c;
    public final C1700Oo d;
    public final QA0.a e;

    public C7691xo(String str, String str2, String str3, C1700Oo c1700Oo, QA0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c1700Oo;
        this.e = aVar;
    }

    @Override // defpackage.QA0
    public final AbstractC3690f02 a() {
        return this.d;
    }

    @Override // defpackage.QA0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.QA0
    public final String c() {
        return this.c;
    }

    @Override // defpackage.QA0
    public final QA0.a d() {
        return this.e;
    }

    @Override // defpackage.QA0
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QA0)) {
            return false;
        }
        QA0 qa0 = (QA0) obj;
        String str = this.a;
        if (str == null) {
            if (qa0.e() != null) {
                return false;
            }
        } else if (!str.equals(qa0.e())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (qa0.b() != null) {
                return false;
            }
        } else if (!str2.equals(qa0.b())) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (qa0.c() != null) {
                return false;
            }
        } else if (!str3.equals(qa0.c())) {
            return false;
        }
        C1700Oo c1700Oo = this.d;
        if (c1700Oo == null) {
            if (qa0.a() != null) {
                return false;
            }
        } else if (!c1700Oo.equals(qa0.a())) {
            return false;
        }
        QA0.a aVar = this.e;
        if (aVar == null) {
            return qa0.d() == null;
        }
        return aVar.equals(qa0.d());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C1700Oo c1700Oo = this.d;
        int iHashCode4 = (iHashCode3 ^ (c1700Oo == null ? 0 : c1700Oo.hashCode())) * 1000003;
        QA0.a aVar = this.e;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
