package defpackage;

/* JADX INFO: renamed from: u51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6909u51 {
    public AbstractC6909u51 a = null;
    public AbstractC6909u51 b = null;
    public AbstractC6909u51 c = null;
    public AbstractC6909u51 d = null;
    public AbstractC6909u51 e = null;

    public abstract void a(C5318mX0 c5318mX0);

    public final void b(AbstractC6909u51 abstractC6909u51) {
        abstractC6909u51.f();
        abstractC6909u51.d(this);
        AbstractC6909u51 abstractC6909u52 = this.c;
        if (abstractC6909u52 == null) {
            this.b = abstractC6909u51;
            this.c = abstractC6909u51;
        } else {
            abstractC6909u52.e = abstractC6909u51;
            abstractC6909u51.d = abstractC6909u52;
            this.c = abstractC6909u51;
        }
    }

    public AbstractC6909u51 c() {
        return this.a;
    }

    public void d(AbstractC6909u51 abstractC6909u51) {
        this.a = abstractC6909u51;
    }

    public String e() {
        return "";
    }

    public final void f() {
        AbstractC6909u51 abstractC6909u51 = this.d;
        if (abstractC6909u51 != null) {
            abstractC6909u51.e = this.e;
        } else {
            AbstractC6909u51 abstractC6909u52 = this.a;
            if (abstractC6909u52 != null) {
                abstractC6909u52.b = this.e;
            }
        }
        AbstractC6909u51 abstractC6909u53 = this.e;
        if (abstractC6909u53 != null) {
            abstractC6909u53.d = abstractC6909u51;
        } else {
            AbstractC6909u51 abstractC6909u54 = this.a;
            if (abstractC6909u54 != null) {
                abstractC6909u54.c = abstractC6909u51;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + "}";
    }
}
