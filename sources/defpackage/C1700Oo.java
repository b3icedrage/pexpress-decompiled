package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1700Oo extends AbstractC3690f02 {
    public final String a;
    public final long b;
    public final AbstractC3690f02.b c;

    /* JADX INFO: renamed from: Oo$a */
    public static final class a extends AbstractC3690f02.a {
        public String a;
        public Long b;
        public AbstractC3690f02.b c;

        public final C1700Oo a() {
            if ("".isEmpty()) {
                return new C1700Oo(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
    }

    public C1700Oo(String str, long j, AbstractC3690f02.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }

    @Override // defpackage.AbstractC3690f02
    public final AbstractC3690f02.b b() {
        return this.c;
    }

    @Override // defpackage.AbstractC3690f02
    public final String c() {
        return this.a;
    }

    @Override // defpackage.AbstractC3690f02
    @NonNull
    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3690f02)) {
            return false;
        }
        AbstractC3690f02 abstractC3690f02 = (AbstractC3690f02) obj;
        String str = this.a;
        if (str == null) {
            if (abstractC3690f02.c() != null) {
                return false;
            }
        } else if (!str.equals(abstractC3690f02.c())) {
            return false;
        }
        if (this.b != abstractC3690f02.d()) {
            return false;
        }
        AbstractC3690f02.b bVar = this.c;
        if (bVar == null) {
            return abstractC3690f02.b() == null;
        }
        return bVar.equals(abstractC3690f02.b());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        AbstractC3690f02.b bVar = this.c;
        return (bVar != null ? bVar.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
