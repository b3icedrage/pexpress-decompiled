package defpackage;

import androidx.lifecycle.g;
import androidx.lifecycle.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", l = {356}, m = "invokeSuspend")
public final class BP0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ CP0 e;
    public final /* synthetic */ AW1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BP0(CP0 cp0, Function2<? super KN, ? super JM<? super Unit>, ? extends Object> function2, JM<? super BP0> jm) {
        super(2, jm);
        this.e = cp0;
        this.g = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new BP0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((BP0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            g d = this.e.getD();
            this.d = 1;
            if (o.a(d, g.b.h, this.g, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
