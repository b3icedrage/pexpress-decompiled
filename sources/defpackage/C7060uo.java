package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7060uo extends AbstractC6081q80 {
    public final String a;
    public final Integer b;
    public final B60 c;
    public final long d;
    public final long e;
    public final HashMap f;

    /* JADX INFO: renamed from: uo$a */
    public static final class a extends AbstractC6081q80.a {
        public String a;
        public Integer b;
        public B60 c;
        public Long d;
        public Long e;
        public HashMap f;

        public final C7060uo b() {
            String strC = this.a == null ? " transportName" : "";
            if (this.c == null) {
                strC = strC.concat(" encodedPayload");
            }
            if (this.d == null) {
                strC = Z0.c(strC, " eventMillis");
            }
            if (this.e == null) {
                strC = Z0.c(strC, " uptimeMillis");
            }
            if (this.f == null) {
                strC = Z0.c(strC, " autoMetadata");
            }
            if (strC.isEmpty()) {
                return new C7060uo(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strC));
        }
    }

    public C7060uo(String str, Integer num, B60 b60, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = b60;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    @Override // defpackage.AbstractC6081q80
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // defpackage.AbstractC6081q80
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.AbstractC6081q80
    public final B60 d() {
        return this.c;
    }

    @Override // defpackage.AbstractC6081q80
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6081q80)) {
            return false;
        }
        AbstractC6081q80 abstractC6081q80 = (AbstractC6081q80) obj;
        if (!this.a.equals(abstractC6081q80.g())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (abstractC6081q80.c() != null) {
                return false;
            }
        } else if (!num.equals(abstractC6081q80.c())) {
            return false;
        }
        return this.c.equals(abstractC6081q80.d()) && this.d == abstractC6081q80.e() && this.e == abstractC6081q80.h() && this.f.equals(abstractC6081q80.b());
    }

    @Override // defpackage.AbstractC6081q80
    public final String g() {
        return this.a;
    }

    @Override // defpackage.AbstractC6081q80
    public final long h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
