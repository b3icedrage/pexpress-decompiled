package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class HP1 extends AbstractC3691f1<GP1<?>> {

    @NotNull
    public final AtomicReference<Object> a = new AtomicReference<>(null);

    @Override // defpackage.AbstractC3691f1
    public final boolean a(AbstractC3272d1 abstractC3272d1) {
        AtomicReference<Object> atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(C1589Ne.h);
        return true;
    }

    @Override // defpackage.AbstractC3691f1
    public final JM[] b(AbstractC3272d1 abstractC3272d1) {
        this.a.set(null);
        return C3481e1.a;
    }

    @Nullable
    public final Object c(@NotNull GP1.a frame) {
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        AtomicReference<Object> atomicReference = this.a;
        GW1 gw1 = C1589Ne.h;
        while (!atomicReference.compareAndSet(gw1, c6251qy)) {
            if (atomicReference.get() != gw1) {
                C1717Ot1.a aVar = C1717Ot1.e;
                c6251qy.resumeWith(Unit.a);
                break;
            }
        }
        Object objQ = c6251qy.q();
        MN mn = MN.d;
        if (objQ == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ == mn ? objQ : Unit.a;
    }
}
