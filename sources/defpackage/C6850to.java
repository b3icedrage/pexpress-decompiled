package defpackage;

/* JADX INFO: renamed from: to, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6850to<T> extends X70<T> {
    public final T a;
    public final EnumC6825th1 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C6850to(Object obj, EnumC6825th1 enumC6825th1) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = enumC6825th1;
    }

    @Override // defpackage.X70
    public final Integer a() {
        return null;
    }

    @Override // defpackage.X70
    public final T b() {
        return this.a;
    }

    @Override // defpackage.X70
    public final EnumC6825th1 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X70)) {
            return false;
        }
        X70 x70 = (X70) obj;
        if (x70.a() == null) {
            return this.a.equals(x70.b()) && this.b.equals(x70.c());
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((1000003 * 1000003) ^ this.a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + "}";
    }
}
