package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606Ao extends AbstractC4880kS0 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final C0840Do g;

    /* JADX INFO: renamed from: Ao$a */
    public static final class a extends AbstractC4880kS0.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public C0840Do g;
    }

    public C0606Ao(long j, Integer num, long j2, byte[] bArr, String str, long j3, C0840Do c0840Do) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = c0840Do;
    }

    @Override // defpackage.AbstractC4880kS0
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.AbstractC4880kS0
    public final long b() {
        return this.a;
    }

    @Override // defpackage.AbstractC4880kS0
    public final long c() {
        return this.c;
    }

    @Override // defpackage.AbstractC4880kS0
    public final AbstractC5432n31 d() {
        return this.g;
    }

    @Override // defpackage.AbstractC4880kS0
    public final byte[] e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4880kS0)) {
            return false;
        }
        AbstractC4880kS0 abstractC4880kS0 = (AbstractC4880kS0) obj;
        if (this.a != abstractC4880kS0.b()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (abstractC4880kS0.a() != null) {
                return false;
            }
        } else if (!num.equals(abstractC4880kS0.a())) {
            return false;
        }
        if (this.c != abstractC4880kS0.c()) {
            return false;
        }
        if (!Arrays.equals(this.d, abstractC4880kS0 instanceof C0606Ao ? ((C0606Ao) abstractC4880kS0).d : abstractC4880kS0.e())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (abstractC4880kS0.f() != null) {
                return false;
            }
        } else if (!str.equals(abstractC4880kS0.f())) {
            return false;
        }
        if (this.f != abstractC4880kS0.g()) {
            return false;
        }
        C0840Do c0840Do = this.g;
        if (c0840Do == null) {
            return abstractC4880kS0.d() == null;
        }
        return c0840Do.equals(abstractC4880kS0.d());
    }

    @Override // defpackage.AbstractC4880kS0
    public final String f() {
        return this.e;
    }

    @Override // defpackage.AbstractC4880kS0
    public final long g() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        C0840Do c0840Do = this.g;
        return i2 ^ (c0840Do != null ? c0840Do.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
