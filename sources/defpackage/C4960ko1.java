package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ko1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "coil.RealImageLoader$executeChain$2", f = "RealImageLoader.kt", l = {236}, m = "invokeSuspend")
public final class C4960ko1 extends AW1 implements Function2<KN, JM<? super AbstractC7926yw0>, Object> {
    public int d;
    public final /* synthetic */ C3027bp1 e;
    public final /* synthetic */ C7716xw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4960ko1(C3027bp1 c3027bp1, C7716xw0 c7716xw0, JM jm) {
        super(2, jm);
        this.e = c3027bp1;
        this.g = c7716xw0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new C4960ko1(this.e, this.g, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super AbstractC7926yw0> jm) {
        return ((C4960ko1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        C5803oo1 c5803oo1 = (C5803oo1) this.e.d;
        this.d = 1;
        Object objB = c5803oo1.b(this.g, this);
        return objB == mn ? mn : objB;
    }
}
