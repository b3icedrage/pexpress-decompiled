package defpackage;

import javax.annotation.Nullable;

/* JADX INFO: renamed from: h71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4137h71<T> extends AbstractC5897pG0<T> {
    public final AbstractC5897pG0<T> a;

    public C4137h71(AbstractC5897pG0<T> abstractC5897pG0) {
        this.a = abstractC5897pG0;
    }

    @Override // defpackage.AbstractC5897pG0
    @Nullable
    public final T a(AbstractC8000zH0 abstractC8000zH0) {
        if (abstractC8000zH0.k() != AbstractC8000zH0.b.m) {
            return this.a.a(abstractC8000zH0);
        }
        abstractC8000zH0.g();
        return null;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 yh0, @Nullable T t) {
        if (t == null) {
            yh0.t();
        } else {
            this.a.e(yh0, t);
        }
    }

    public final String toString() {
        return this.a + ".nullSafe()";
    }
}
