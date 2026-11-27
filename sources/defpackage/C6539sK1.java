package defpackage;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6539sK1 extends AbstractC3691f1<C6120qK1<?>> {
    public long a = -1;

    @Nullable
    public C6251qy b;

    @Override // defpackage.AbstractC3691f1
    public final boolean a(AbstractC3272d1 abstractC3272d1) {
        C6120qK1 c6120qK1 = (C6120qK1) abstractC3272d1;
        if (this.a >= 0) {
            return false;
        }
        long j = c6120qK1.m;
        if (j < c6120qK1.n) {
            c6120qK1.n = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.AbstractC3691f1
    public final JM[] b(AbstractC3272d1 abstractC3272d1) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((C6120qK1) abstractC3272d1).y(j);
    }
}
