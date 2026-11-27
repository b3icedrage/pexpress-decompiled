package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4280ho extends AbstractC5713oP.e.d.a {
    public final AbstractC5713oP.e.d.a.b a;
    public final C1255Iw0<AbstractC5713oP.c> b;
    public final C1255Iw0<AbstractC5713oP.c> c;
    public final Boolean d;
    public final int e;

    /* JADX INFO: renamed from: ho$a */
    public static final class a extends AbstractC5713oP.e.d.a.AbstractC0458a {
        public AbstractC5713oP.e.d.a.b a;
        public C1255Iw0<AbstractC5713oP.c> b;
        public C1255Iw0<AbstractC5713oP.c> c;
        public Boolean d;
        public Integer e;
    }

    public C4280ho() {
        throw null;
    }

    public C4280ho(AbstractC5713oP.e.d.a.b bVar, C1255Iw0 c1255Iw0, C1255Iw0 c1255Iw1, Boolean bool, int i) {
        this.a = bVar;
        this.b = c1255Iw0;
        this.c = c1255Iw1;
        this.d = bool;
        this.e = i;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a
    public final Boolean a() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a
    public final C1255Iw0<AbstractC5713oP.c> b() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a
    @NonNull
    public final AbstractC5713oP.e.d.a.b c() {
        return this.a;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a
    public final C1255Iw0<AbstractC5713oP.c> d() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e.d.a
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e.d.a)) {
            return false;
        }
        AbstractC5713oP.e.d.a aVar = (AbstractC5713oP.e.d.a) obj;
        if (!this.a.equals(aVar.c())) {
            return false;
        }
        C1255Iw0<AbstractC5713oP.c> c1255Iw0 = this.b;
        if (c1255Iw0 != null) {
            if (!c1255Iw0.d.equals(aVar.b())) {
                return false;
            }
        } else if (aVar.b() != null) {
            return false;
        }
        C1255Iw0<AbstractC5713oP.c> c1255Iw1 = this.c;
        if (c1255Iw1 != null) {
            if (!c1255Iw1.d.equals(aVar.d())) {
                return false;
            }
        } else if (aVar.d() != null) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!bool.equals(aVar.a())) {
            return false;
        }
        return this.e == aVar.e();
    }

    @Override // defpackage.AbstractC5713oP.e.d.a
    public final a f() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = Integer.valueOf(this.e);
        return aVar;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        C1255Iw0<AbstractC5713oP.c> c1255Iw0 = this.b;
        int iHashCode2 = (iHashCode ^ (c1255Iw0 == null ? 0 : c1255Iw0.d.hashCode())) * 1000003;
        C1255Iw0<AbstractC5713oP.c> c1255Iw1 = this.c;
        int iHashCode3 = (iHashCode2 ^ (c1255Iw1 == null ? 0 : c1255Iw1.d.hashCode())) * 1000003;
        Boolean bool = this.d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", uiOrientation=");
        return SK.b(sb, this.e, "}");
    }
}
