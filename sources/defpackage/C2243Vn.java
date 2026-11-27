package defpackage;

import java.io.File;

/* JADX INFO: renamed from: Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2243Vn extends AbstractC7603xP {
    public final C2165Un a;
    public final String b;
    public final File c;

    public C2243Vn(C2165Un c2165Un, String str, File file) {
        this.a = c2165Un;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        this.c = file;
    }

    @Override // defpackage.AbstractC7603xP
    public final AbstractC5713oP a() {
        return this.a;
    }

    @Override // defpackage.AbstractC7603xP
    public final File b() {
        return this.c;
    }

    @Override // defpackage.AbstractC7603xP
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7603xP)) {
            return false;
        }
        AbstractC7603xP abstractC7603xP = (AbstractC7603xP) obj;
        return this.a.equals(abstractC7603xP.a()) && this.b.equals(abstractC7603xP.c()) && this.c.equals(abstractC7603xP.b());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
