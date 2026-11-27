package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: e20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3486e20 extends AbstractC1521Mh0 {
    public boolean e;
    public final /* synthetic */ C3277d20 g;
    public final /* synthetic */ C3277d20.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3486e20(UN1 un1, C3277d20 c3277d20, C3277d20.b bVar) {
        super(un1);
        this.g = c3277d20;
        this.h = bVar;
    }

    @Override // defpackage.AbstractC1521Mh0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.e) {
            return;
        }
        this.e = true;
        C3277d20 c3277d20 = this.g;
        C3277d20.b bVar = this.h;
        synchronized (c3277d20) {
            try {
                int i = bVar.h - 1;
                bVar.h = i;
                if (i == 0 && bVar.f) {
                    c3277d20.A(bVar);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
