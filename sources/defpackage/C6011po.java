package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6011po extends AbstractC5713oP.e.d.AbstractC0464d {
    public final String a;

    public C6011po(String str) {
        this.a = str;
    }

    @Override // defpackage.AbstractC5713oP.e.d.AbstractC0464d
    @NonNull
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5713oP.e.d.AbstractC0464d) {
            return this.a.equals(((AbstractC5713oP.e.d.AbstractC0464d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C5807oq.b(new StringBuilder("Log{content="), this.a, "}");
    }
}
