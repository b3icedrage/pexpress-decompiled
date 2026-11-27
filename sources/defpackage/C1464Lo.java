package defpackage;

/* JADX INFO: renamed from: Lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1464Lo extends WP1.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final C4576j00 f;

    public C1464Lo(String str, String str2, String str3, String str4, int i, C4576j00 c4576j00) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        this.f = c4576j00;
    }

    @Override // WP1.a
    public final String a() {
        return this.a;
    }

    @Override // WP1.a
    public final int b() {
        return this.e;
    }

    @Override // WP1.a
    public final C4576j00 c() {
        return this.f;
    }

    @Override // WP1.a
    public final String d() {
        return this.d;
    }

    @Override // WP1.a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WP1.a)) {
            return false;
        }
        WP1.a aVar = (WP1.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.e()) && this.c.equals(aVar.f()) && this.d.equals(aVar.d()) && this.e == aVar.b() && this.f.equals(aVar.c());
    }

    @Override // WP1.a
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
