package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2429Xn extends AbstractC5713oP.a.AbstractC0456a {
    public final String a;
    public final String b;
    public final String c;

    public C2429Xn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.AbstractC5713oP.a.AbstractC0456a
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.a.AbstractC0456a
    @NonNull
    public final String b() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.a.AbstractC0456a
    @NonNull
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.a.AbstractC0456a)) {
            return false;
        }
        AbstractC5713oP.a.AbstractC0456a abstractC0456a = (AbstractC5713oP.a.AbstractC0456a) obj;
        return this.a.equals(abstractC0456a.a()) && this.b.equals(abstractC0456a.c()) && this.c.equals(abstractC0456a.b());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return C5807oq.b(sb, this.c, "}");
    }
}
