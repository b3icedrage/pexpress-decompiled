package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.platform.EventPipeline$schedule$1", f = "EventPipeline.kt", l = {170}, m = "invokeSuspend")
public final class H80 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ K80 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H80(K80 k80, JM<? super H80> jm) {
        super(2, jm);
        this.g = k80;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        H80 h80 = new H80(this.g, jm);
        h80.e = obj;
        return h80;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((H80) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        K80 k80 = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            if (LN.e((KN) this.e) && k80.h && !k80.i && !k80.k) {
                k80.i = true;
                long j = k80.f;
                this.d = 1;
                if (IW.b(j, this) == mn) {
                    return mn;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1795Pt1.b(obj);
        k80.b.n(new C4272hl2(EnumC4481il2.e, null));
        k80.i = false;
        return Unit.a;
    }
}
