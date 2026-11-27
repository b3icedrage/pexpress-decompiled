package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: gn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4068gn0 extends T52<AtomicLong> {
    public final /* synthetic */ T52 a;

    public C4068gn0(T52 t52) {
        this.a = t52;
    }

    @Override // defpackage.T52
    public final AtomicLong a(C7790yH0 c7790yH0) {
        return new AtomicLong(((Number) this.a.a(c7790yH0)).longValue());
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, AtomicLong atomicLong) {
        this.a.b(zh0, Long.valueOf(atomicLong.get()));
    }
}
