package defpackage;

import defpackage.AbstractC7992zE1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7992zE1<S extends AbstractC7992zE1<S>> extends XH<S> implements F51 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(AbstractC7992zE1.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long g;

    public AbstractC7992zE1(long j, @Nullable S s, int i) {
        super(s);
        this.g = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.XH
    public final boolean d() {
        return h.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return h.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, @NotNull CoroutineContext coroutineContext);

    public final void i() {
        if (h.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = h;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
