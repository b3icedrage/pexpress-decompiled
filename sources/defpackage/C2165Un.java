package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2165Un extends AbstractC5713oP {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final AbstractC5713oP.e h;
    public final AbstractC5713oP.d i;

    /* JADX INFO: renamed from: Un$a */
    public static final class a extends AbstractC5713oP.b {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public AbstractC5713oP.e g;
        public AbstractC5713oP.d h;

        public final C2165Un a() {
            String strC = this.a == null ? " sdkVersion" : "";
            if (this.b == null) {
                strC = strC.concat(" gmpAppId");
            }
            if (this.c == null) {
                strC = Z0.c(strC, " platform");
            }
            if (this.d == null) {
                strC = Z0.c(strC, " installationUuid");
            }
            if (this.e == null) {
                strC = Z0.c(strC, " buildVersion");
            }
            if (this.f == null) {
                strC = Z0.c(strC, " displayVersion");
            }
            if (strC.isEmpty()) {
                return new C2165Un(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C2165Un(String str, String str2, int i, String str3, String str4, String str5, AbstractC5713oP.e eVar, AbstractC5713oP.d dVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = eVar;
        this.i = dVar;
    }

    @Override // defpackage.AbstractC5713oP
    @NonNull
    public final String a() {
        return this.f;
    }

    @Override // defpackage.AbstractC5713oP
    @NonNull
    public final String b() {
        return this.g;
    }

    @Override // defpackage.AbstractC5713oP
    @NonNull
    public final String c() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP
    @NonNull
    public final String d() {
        return this.e;
    }

    @Override // defpackage.AbstractC5713oP
    public final AbstractC5713oP.d e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP)) {
            return false;
        }
        AbstractC5713oP abstractC5713oP = (AbstractC5713oP) obj;
        if (!this.b.equals(abstractC5713oP.g()) || !this.c.equals(abstractC5713oP.c()) || this.d != abstractC5713oP.f() || !this.e.equals(abstractC5713oP.d()) || !this.f.equals(abstractC5713oP.a()) || !this.g.equals(abstractC5713oP.b())) {
            return false;
        }
        AbstractC5713oP.e eVar = this.h;
        if (eVar == null) {
            if (abstractC5713oP.h() != null) {
                return false;
            }
        } else if (!eVar.equals(abstractC5713oP.h())) {
            return false;
        }
        AbstractC5713oP.d dVar = this.i;
        if (dVar == null) {
            return abstractC5713oP.e() == null;
        }
        return dVar.equals(abstractC5713oP.e());
    }

    @Override // defpackage.AbstractC5713oP
    public final int f() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP
    @NonNull
    public final String g() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP
    public final AbstractC5713oP.e h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        AbstractC5713oP.e eVar = this.h;
        int iHashCode2 = (iHashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC5713oP.d dVar = this.i;
        return iHashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    public final a i() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = Integer.valueOf(this.d);
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        return aVar;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + "}";
    }
}
