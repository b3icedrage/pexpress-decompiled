package androidx.lifecycle;

import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.ED;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class i extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ LifecycleCoroutineScopeImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, JM<? super i> jm) {
        super(2, jm);
        this.e = lifecycleCoroutineScopeImpl;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        i iVar = new i(this.e, jm);
        iVar.d = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((i) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        KN kn = (KN) this.d;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.e;
        g gVar = lifecycleCoroutineScopeImpl.d;
        if (gVar.b().compareTo(g.b.e) >= 0) {
            gVar.a(lifecycleCoroutineScopeImpl);
        } else {
            ED.d(kn.getE(), null);
        }
        return Unit.a;
    }
}
