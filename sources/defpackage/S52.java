package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class S52 extends T52<Object> {
    public final /* synthetic */ T52 a;

    public S52(T52 t52) {
        this.a = t52;
    }

    @Override // defpackage.T52
    public final Object a(C7790yH0 c7790yH0) throws IOException {
        if (c7790yH0.G() != JH0.m) {
            return this.a.a(c7790yH0);
        }
        c7790yH0.A();
        return null;
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Object obj) throws IOException {
        if (obj == null) {
            zh0.l();
        } else {
            this.a.b(zh0, obj);
        }
    }
}
