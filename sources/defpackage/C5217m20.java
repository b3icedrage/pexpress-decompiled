package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5217m20<T> extends ND1<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(C5217m20.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C5217m20() {
        throw null;
    }

    @Override // defpackage.ND1, defpackage.C3956gG0
    public final void x(@Nullable Object obj) {
        y(obj);
    }

    @Override // defpackage.ND1, defpackage.C3956gG0
    public final void y(@Nullable Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                UE.s(C5885pC0.b(this.h), RG.a(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
