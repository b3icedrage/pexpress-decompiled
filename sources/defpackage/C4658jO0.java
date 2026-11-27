package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4658jO0<T> extends C7624xW<T> {

    @NotNull
    public final JM<Unit> h;

    public C4658jO0(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super KN, ? super JM<? super T>, ? extends Object> function2) {
        super(coroutineContext, true, false);
        this.h = C5885pC0.a(this, this, function2);
    }

    @Override // defpackage.C3956gG0
    public final void l0() {
        C6880ty.a(this.h, this);
    }
}
