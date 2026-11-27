package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7563xB1 extends AtomicReference<Runnable> implements InterfaceC7316w20 {
    @Override // defpackage.InterfaceC7316w20
    public final void b() {
        Runnable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        andSet.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(get() == null);
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
