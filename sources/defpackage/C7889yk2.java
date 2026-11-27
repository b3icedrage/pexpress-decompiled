package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7889yk2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C7889yk2.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C7889yk2.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C7889yk2.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C7889yk2.class, "blockingTasksInBuffer$volatile");

    @NotNull
    public final AtomicReferenceArray<AbstractRunnableC6788tX1> a = new AtomicReferenceArray<>(UserVerificationMethods.USER_VERIFY_PATTERN);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final AbstractRunnableC6788tX1 a(AbstractRunnableC6788tX1 abstractRunnableC6788tX1) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return abstractRunnableC6788tX1;
        }
        if (abstractRunnableC6788tX1.e.a == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<AbstractRunnableC6788tX1> atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC6788tX1);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final AbstractRunnableC6788tX1 b() {
        AbstractRunnableC6788tX1 andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                if (andSet.e.a == 1) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final AbstractRunnableC6788tX1 c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray<AbstractRunnableC6788tX1> atomicReferenceArray = this.a;
        AbstractRunnableC6788tX1 abstractRunnableC6788tX1 = atomicReferenceArray.get(i2);
        if (abstractRunnableC6788tX1 != null) {
            if ((abstractRunnableC6788tX1.e.a == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC6788tX1, null)) {
                    if (atomicReferenceArray.get(i2) != abstractRunnableC6788tX1) {
                    }
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC6788tX1;
            }
        }
        return null;
    }
}
