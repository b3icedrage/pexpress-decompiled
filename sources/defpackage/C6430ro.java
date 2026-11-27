package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6430ro extends AbstractC5713oP.e.f {
    public final String a;

    public C6430ro(String str) {
        this.a = str;
    }

    @Override // defpackage.AbstractC5713oP.e.f
    @NonNull
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5713oP.e.f) {
            return this.a.equals(((AbstractC5713oP.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C5807oq.b(new StringBuilder("User{identifier="), this.a, "}");
    }
}
