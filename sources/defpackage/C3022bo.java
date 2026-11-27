package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3022bo extends AbstractC5713oP.e {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final AbstractC5713oP.e.a f;
    public final AbstractC5713oP.e.f g;
    public final AbstractC5713oP.e.AbstractC0465e h;
    public final AbstractC5713oP.e.c i;
    public final C1255Iw0<AbstractC5713oP.e.d> j;
    public final int k;

    /* JADX INFO: renamed from: bo$a */
    public static final class a extends AbstractC5713oP.e.b {
        public String a;
        public String b;
        public Long c;
        public Long d;
        public Boolean e;
        public AbstractC5713oP.e.a f;
        public AbstractC5713oP.e.f g;
        public AbstractC5713oP.e.AbstractC0465e h;
        public AbstractC5713oP.e.c i;
        public C1255Iw0<AbstractC5713oP.e.d> j;
        public Integer k;

        public final C3022bo a() {
            String strC = this.a == null ? " generator" : "";
            if (this.b == null) {
                strC = strC.concat(" identifier");
            }
            if (this.c == null) {
                strC = Z0.c(strC, " startedAt");
            }
            if (this.e == null) {
                strC = Z0.c(strC, " crashed");
            }
            if (this.f == null) {
                strC = Z0.c(strC, " app");
            }
            if (this.k == null) {
                strC = Z0.c(strC, " generatorType");
            }
            if (strC.isEmpty()) {
                return new C3022bo(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C3022bo() {
        throw null;
    }

    public C3022bo(String str, String str2, long j, Long l, boolean z, AbstractC5713oP.e.a aVar, AbstractC5713oP.e.f fVar, AbstractC5713oP.e.AbstractC0465e abstractC0465e, AbstractC5713oP.e.c cVar, C1255Iw0 c1255Iw0, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = z;
        this.f = aVar;
        this.g = fVar;
        this.h = abstractC0465e;
        this.i = cVar;
        this.j = c1255Iw0;
        this.k = i;
    }

    @Override // defpackage.AbstractC5713oP.e
    @NonNull
    public final AbstractC5713oP.e.a a() {
        return this.f;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final AbstractC5713oP.e.c b() {
        return this.i;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final Long c() {
        return this.d;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final C1255Iw0<AbstractC5713oP.e.d> d() {
        return this.j;
    }

    @Override // defpackage.AbstractC5713oP.e
    @NonNull
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5713oP.e)) {
            return false;
        }
        AbstractC5713oP.e eVar = (AbstractC5713oP.e) obj;
        if (!this.a.equals(eVar.e()) || !this.b.equals(eVar.g()) || this.c != eVar.i()) {
            return false;
        }
        Long l = this.d;
        if (l == null) {
            if (eVar.c() != null) {
                return false;
            }
        } else if (!l.equals(eVar.c())) {
            return false;
        }
        if (this.e != eVar.k() || !this.f.equals(eVar.a())) {
            return false;
        }
        AbstractC5713oP.e.f fVar = this.g;
        if (fVar == null) {
            if (eVar.j() != null) {
                return false;
            }
        } else if (!fVar.equals(eVar.j())) {
            return false;
        }
        AbstractC5713oP.e.AbstractC0465e abstractC0465e = this.h;
        if (abstractC0465e == null) {
            if (eVar.h() != null) {
                return false;
            }
        } else if (!abstractC0465e.equals(eVar.h())) {
            return false;
        }
        AbstractC5713oP.e.c cVar = this.i;
        if (cVar == null) {
            if (eVar.b() != null) {
                return false;
            }
        } else if (!cVar.equals(eVar.b())) {
            return false;
        }
        C1255Iw0<AbstractC5713oP.e.d> c1255Iw0 = this.j;
        if (c1255Iw0 != null) {
            if (!c1255Iw0.d.equals(eVar.d())) {
                return false;
            }
        } else if (eVar.d() != null) {
            return false;
        }
        return this.k == eVar.f();
    }

    @Override // defpackage.AbstractC5713oP.e
    public final int f() {
        return this.k;
    }

    @Override // defpackage.AbstractC5713oP.e
    @NonNull
    public final String g() {
        return this.b;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final AbstractC5713oP.e.AbstractC0465e h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        int i = (iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.d;
        int iHashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        AbstractC5713oP.e.f fVar = this.g;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC5713oP.e.AbstractC0465e abstractC0465e = this.h;
        int iHashCode4 = (iHashCode3 ^ (abstractC0465e == null ? 0 : abstractC0465e.hashCode())) * 1000003;
        AbstractC5713oP.e.c cVar = this.i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C1255Iw0<AbstractC5713oP.e.d> c1255Iw0 = this.j;
        return ((iHashCode5 ^ (c1255Iw0 != null ? c1255Iw0.d.hashCode() : 0)) * 1000003) ^ this.k;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final long i() {
        return this.c;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final AbstractC5713oP.e.f j() {
        return this.g;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final boolean k() {
        return this.e;
    }

    @Override // defpackage.AbstractC5713oP.e
    public final a l() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = Long.valueOf(this.c);
        aVar.d = this.d;
        aVar.e = Boolean.valueOf(this.e);
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = Integer.valueOf(this.k);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", startedAt=");
        sb.append(this.c);
        sb.append(", endedAt=");
        sb.append(this.d);
        sb.append(", crashed=");
        sb.append(this.e);
        sb.append(", app=");
        sb.append(this.f);
        sb.append(", user=");
        sb.append(this.g);
        sb.append(", os=");
        sb.append(this.h);
        sb.append(", device=");
        sb.append(this.i);
        sb.append(", events=");
        sb.append(this.j);
        sb.append(", generatorType=");
        return SK.b(sb, this.k, "}");
    }
}
