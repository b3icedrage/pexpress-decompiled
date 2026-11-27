package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6221qo extends AbstractC5713oP.e.AbstractC0465e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    /* JADX INFO: renamed from: qo$a */
    public static final class a extends AbstractC5713oP.e.AbstractC0465e.a {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;

        public final C6221qo a() {
            String strC = this.a == null ? " platform" : "";
            if (this.b == null) {
                strC = strC.concat(" version");
            }
            if (this.c == null) {
                strC = Z0.c(strC, " buildVersion");
            }
            if (this.d == null) {
                strC = Z0.c(strC, " jailbroken");
            }
            if (strC.isEmpty()) {
                return new C6221qo(this.b, this.a.intValue(), this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C6221qo(String str, int i, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // defpackage.AbstractC5713oP.e.AbstractC0465e
    @NonNull
    public final String a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.AbstractC0465e
    public final int b() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.e.AbstractC0465e
    @NonNull
    public final String c() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e.AbstractC0465e
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.AbstractC0465e)) {
            return false;
        }
        AbstractC5713oP.e.AbstractC0465e abstractC0465e = (AbstractC5713oP.e.AbstractC0465e) obj;
        return this.a == abstractC0465e.b() && this.b.equals(abstractC0465e.c()) && this.c.equals(abstractC0465e.a()) && this.d == abstractC0465e.d();
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return C2983be.b(sb, this.d, "}");
    }
}
