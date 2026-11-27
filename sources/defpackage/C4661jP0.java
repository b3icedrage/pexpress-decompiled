package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4661jP0 extends AbstractC3223cl2 {

    @NotNull
    public final C2720aS0 e;

    @NotNull
    public final Function0<AbstractC4649jL0> g;

    @NotNull
    public final I51<AbstractC4649jL0> h;

    public C4661jP0(@NotNull C2720aS0 storageManager, @NotNull Function0 computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.e = storageManager;
        this.g = computation;
        storageManager.getClass();
        this.h = new C2720aS0.h(storageManager, computation);
    }

    @Override // defpackage.AbstractC4649jL0
    public final AbstractC4649jL0 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C4661jP0(this.e, new C3752fI0(2, kotlinTypeRefiner, this));
    }

    @Override // defpackage.AbstractC3223cl2
    @NotNull
    public final AbstractC4649jL0 Z0() {
        return this.h.invoke();
    }

    @Override // defpackage.AbstractC3223cl2
    public final boolean a1() {
        C2720aS0.f fVar = (C2720aS0.f) this.h;
        return (fVar.g == C2720aS0.l.d || fVar.g == C2720aS0.l.e) ? false : true;
    }
}
