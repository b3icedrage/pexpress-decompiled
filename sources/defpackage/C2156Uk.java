package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2156Uk extends AtomicReference<Throwable> {
    public final boolean a(Throwable th) {
        C90.a aVar = C90.a;
        while (true) {
            Throwable th2 = get();
            if (th2 == C90.a) {
                return false;
            }
            Throwable hh = th2 == null ? th : new HH(th2, th);
            while (!compareAndSet(th2, hh)) {
                if (get() != th2) {
                }
            }
            return true;
        }
    }

    public final Throwable b() {
        C90.a aVar = C90.a;
        Throwable th = get();
        C90.a aVar2 = C90.a;
        return th != aVar2 ? getAndSet(aVar2) : th;
    }
}
