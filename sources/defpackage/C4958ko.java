package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4958ko extends AbstractC5713oP.e.d.a.b.AbstractC0460b {
    public final String a;
    public final String b;
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a> c;
    public final AbstractC5713oP.e.d.a.b.AbstractC0460b d;
    public final int e;

    public C4958ko() {
        throw null;
    }

    public C4958ko(String str, String str2, C1255Iw0 c1255Iw0, AbstractC5713oP.e.d.a.b.AbstractC0460b abstractC0460b, int i) {
        this.a = str;
        this.b = str2;
        this.c = c1255Iw0;
        this.d = abstractC0460b;
        this.e = i;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0460b
    public final AbstractC5713oP.e.d.a.b.AbstractC0460b a() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0460b
    @NonNull
    public final C1255Iw0<AbstractC5713oP.e.d.a.b.AbstractC0461d.AbstractC0462a> b() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0460b
    public final int c() {
        return this.e;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0460b
    public final String d() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a.b.AbstractC0460b
    @NonNull
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d.a.b.AbstractC0460b)) {
            return false;
        }
        AbstractC5713oP.e.d.a.b.AbstractC0460b abstractC0460b = (AbstractC5713oP.e.d.a.b.AbstractC0460b) obj;
        if (!this.a.equals(abstractC0460b.e())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (abstractC0460b.d() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0460b.d())) {
            return false;
        }
        if (!this.c.d.equals(abstractC0460b.b())) {
            return false;
        }
        AbstractC5713oP.e.d.a.b.AbstractC0460b abstractC0460b2 = this.d;
        if (abstractC0460b2 == null) {
            if (abstractC0460b.a() != null) {
                return false;
            }
        } else if (!abstractC0460b2.equals(abstractC0460b.a())) {
            return false;
        }
        return this.e == abstractC0460b.c();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.d.hashCode()) * 1000003;
        AbstractC5713oP.e.d.a.b.AbstractC0460b abstractC0460b = this.d;
        return ((iHashCode2 ^ (abstractC0460b != null ? abstractC0460b.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return SK.b(sb, this.e, "}");
    }
}
