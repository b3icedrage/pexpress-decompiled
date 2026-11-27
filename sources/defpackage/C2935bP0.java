package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2935bP0 extends C2936bP1 {

    @NotNull
    public final JM<Unit> h;

    public C2935bP0(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super KN, ? super JM<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, true, false);
        this.h = C5885pC0.a(this, this, function2);
    }

    @Override // defpackage.C3956gG0
    public final void l0() {
        C6880ty.a(this.h, this);
    }
}
