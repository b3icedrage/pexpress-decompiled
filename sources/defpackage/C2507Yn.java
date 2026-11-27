package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2507Yn extends AbstractC5713oP.c {
    public final String a;
    public final String b;

    public C2507Yn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.AbstractC5713oP.c
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.c
    @NonNull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.c)) {
            return false;
        }
        AbstractC5713oP.c cVar = (AbstractC5713oP.c) obj;
        return this.a.equals(cVar.a()) && this.b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return C5807oq.b(sb, this.b, "}");
    }
}
