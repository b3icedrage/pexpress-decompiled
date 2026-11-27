package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", l = {147}, m = "invokeSuspend")
public final class RN extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2836aw g;
    public final /* synthetic */ AW1 h;
    public final /* synthetic */ DN i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RN(C2836aw c2836aw, Function2 function2, DN dn, JM jm) {
        super(2, jm);
        this.g = c2836aw;
        this.h = (AW1) function2;
        this.i = dn;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        RN rn = new RN(this.g, this.h, this.i, jm);
        rn.e = obj;
        return rn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((RN) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C2836aw c2836aw = this.g;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                KN kn = (KN) this.e;
                CoroutineContext.Element elementP = kn.getE().p(XF0.a.d);
                Intrinsics.checkNotNull(elementP);
                c2836aw.p((XF0) elementP);
                C3517eA c3517eA = new C3517eA(kn, c2836aw);
                ?? r6 = this.h;
                this.d = 1;
                if (r6.invoke(c3517eA, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
        } catch (Throwable th) {
            C7342w82 c7342w82 = C6266r20.b;
            DN dn = this.i;
            if (!Intrinsics.a(dn, c7342w82) && dn != null) {
                throw th;
            }
            c2836aw.a(th);
        }
        return Unit.a;
    }
}
