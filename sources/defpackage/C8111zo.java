package defpackage;

import javax.annotation.Nonnull;

/* JADX INFO: renamed from: zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8111zo extends AbstractC6553sP0 {
    public final String a;
    public final String b;

    public C8111zo(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // defpackage.AbstractC6553sP0
    @Nonnull
    public final String a() {
        return this.a;
    }

    @Override // defpackage.AbstractC6553sP0
    @Nonnull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6553sP0)) {
            return false;
        }
        AbstractC6553sP0 abstractC6553sP0 = (AbstractC6553sP0) obj;
        return this.a.equals(abstractC6553sP0.a()) && this.b.equals(abstractC6553sP0.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return C5807oq.b(sb, this.b, "}");
    }
}
