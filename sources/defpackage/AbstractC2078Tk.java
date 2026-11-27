package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2078Tk<T> extends L91 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2078Tk.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = C6621sj.a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.L91
    @Nullable
    public final Object a(@Nullable Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        GW1 gw1 = C6621sj.a;
        if (obj2 == gw1) {
            GW1 gw1C = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == gw1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, gw1, gw1C)) {
                    if (atomicReferenceFieldUpdater.get(this) != gw1) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = gw1C;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, @Nullable Object obj);

    @Nullable
    public abstract GW1 c(Object obj);
}
