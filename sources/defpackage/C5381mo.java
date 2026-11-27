package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5381mo extends AbstractC5713oP.e.d.a.b.AbstractC0461d {
    public final String a;
    public final int b;
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a> c;

    public C5381mo() {
        throw null;
    }

    public C5381mo(String str, int i, C1255Iw0 c1255Iw0) {
        this.a = str;
        this.b = i;
        this.c = c1255Iw0;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d
    @NonNull
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a> a() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d
    public final int b() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0461d
    @NonNull
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d.a.b.AbstractC0461d)) {
            return false;
        }
        AbstractC5713oP.e.d.a.b.AbstractC0461d abstractC0461d = (AbstractC5713oP.e.d.a.b.AbstractC0461d) obj;
        if (this.a.equals(abstractC0461d.c()) && this.b == abstractC0461d.b()) {
            return this.c.d.equals(abstractC0461d.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.d.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
