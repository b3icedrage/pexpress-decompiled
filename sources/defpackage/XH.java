package defpackage;

import defpackage.XH;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class XH<N extends XH<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(XH.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(XH.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public XH(@Nullable AbstractC7992zE1 abstractC7992zE1) {
        this._prev$volatile = abstractC7992zE1;
    }

    public final void b() {
        e.set(this, null);
    }

    @Nullable
    public final N c() {
        Object obj = d.get(this);
        if (obj == C4994l.b) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    public final void e() {
        XH xhC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            XH xh = (XH) atomicReferenceFieldUpdater.get(this);
            while (xh != null && xh.d()) {
                xh = (XH) atomicReferenceFieldUpdater.get(xh);
            }
            XH xhC2 = c();
            Intrinsics.checkNotNull(xhC2);
            while (xhC2.d() && (xhC = xhC2.c()) != null) {
                xhC2 = xhC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(xhC2);
                XH xh2 = ((XH) obj) == null ? null : xh;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(xhC2, obj, xh2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(xhC2) != obj) {
                    }
                }
            }
            if (xh != null) {
                d.set(xh, xhC2);
            }
            if (!xhC2.d() || xhC2.c() == null) {
                if (xh == null || !xh.d()) {
                    return;
                }
            }
        }
    }
}
