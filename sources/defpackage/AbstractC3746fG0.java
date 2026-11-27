package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3746fG0 extends C3782fS0 implements InterfaceC2672aC0, A20, InterfaceC7719xx0 {
    public C3956gG0 h;

    @Override // defpackage.C3782fS0, defpackage.A20
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3956gG0 c3956gG0L = l();
        while (true) {
            Object objS = c3956gG0L.S();
            if (!(objS instanceof AbstractC3746fG0)) {
                if (!(objS instanceof InterfaceC7719xx0) || ((InterfaceC7719xx0) objS).h() == null) {
                    return;
                }
                k();
                return;
            }
            if (objS != this) {
                return;
            }
            C3083c60 c3083c60 = C3787fU.k;
            do {
                atomicReferenceFieldUpdater = C3956gG0.d;
                if (atomicReferenceFieldUpdater.compareAndSet(c3956gG0L, objS, c3083c60)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c3956gG0L) == objS);
        }
    }

    @Override // defpackage.InterfaceC7719xx0
    public final boolean g() {
        return true;
    }

    @NotNull
    public XF0 getParent() {
        return l();
    }

    @Override // defpackage.InterfaceC7719xx0
    @Nullable
    public final C7119v51 h() {
        return null;
    }

    @NotNull
    public final C3956gG0 l() {
        C3956gG0 c3956gG0 = this.h;
        if (c3956gG0 != null) {
            return c3956gG0;
        }
        Intrinsics.l("job");
        throw null;
    }

    @Override // defpackage.C3782fS0
    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '@' + C3787fU.f(this) + "[job@" + C3787fU.f(l()) + ']';
    }
}
