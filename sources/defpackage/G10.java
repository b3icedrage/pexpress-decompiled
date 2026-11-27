package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.DirectionCalculatorKt", f = "DirectionCalculator.kt", l = {73}, m = "calculateDirectionResultOrRandom")
public final class G10 extends LM {
    public AbstractC4743jm1 d;
    public Function1 e;
    public /* synthetic */ Object g;
    public int h;

    public G10() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.h |= Integer.MIN_VALUE;
        return H10.a(null, null, null, null, this);
    }
}
