package defpackage;

/* JADX INFO: renamed from: Eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0918Eo extends AbstractC6809td1 {
    public final long a;
    public final V42 b;
    public final AbstractC6081q80 c;

    public C0918Eo(long j, V42 v42, AbstractC6081q80 abstractC6081q80) {
        this.a = j;
        if (v42 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = v42;
        if (abstractC6081q80 == null) {
            throw new NullPointerException("Null event");
        }
        this.c = abstractC6081q80;
    }

    @Override // defpackage.AbstractC6809td1
    public final AbstractC6081q80 a() {
        return this.c;
    }

    @Override // defpackage.AbstractC6809td1
    public final long b() {
        return this.a;
    }

    @Override // defpackage.AbstractC6809td1
    public final V42 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6809td1)) {
            return false;
        }
        AbstractC6809td1 abstractC6809td1 = (AbstractC6809td1) obj;
        return this.a == abstractC6809td1.b() && this.b.equals(abstractC6809td1.c()) && this.c.equals(abstractC6809td1.a());
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
