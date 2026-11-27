package defpackage;

/* JADX INFO: renamed from: er1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3661er1 extends AbstractC3946gD {
    public long h;
    public String i;

    public C3661er1() {
        super(0);
        this.h = -1L;
        this.i = null;
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        String str;
        long jB = qs0.b();
        synchronized (this) {
            try {
                if (jB != this.h) {
                    this.h = jB;
                    this.i = Long.toString(jB - qs0.f().g);
                }
                str = this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
