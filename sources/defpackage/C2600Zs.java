package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
public final class C2600Zs extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2827at<Object> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2600Zs(C2827at<Object> c2827at, JM<? super C2600Zs> jm) {
        super(2, jm);
        this.g = c2827at;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C2600Zs c2600Zs = new C2600Zs(this.g, jm);
        c2600Zs.e = obj;
        return c2600Zs;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2600Zs) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C2827at<Object> c2827at = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            C3150cR0 c3150cR0 = new C3150cR0(c2827at.a, ((KN) this.e).getE());
            C7661xg0 c7661xg0 = c2827at.b;
            this.d = 1;
            if (c7661xg0.invoke(c3150cR0, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        c2827at.d.invoke();
        return Unit.a;
    }
}
