package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.Amplitude$onExitForeground$1", f = "Amplitude.kt", l = {104}, m = "invokeSuspend")
public final class C3805fa extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4693ja e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805fa(C4693ja c4693ja, JM<? super C3805fa> jm) {
        super(2, jm);
        this.e = c4693ja;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C3805fa(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3805fa) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C4693ja c4693ja = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C7624xW c7624xW = c4693ja.n;
            this.d = 1;
            if (c7624xW.z(this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        MI mi = c4693ja.a;
        Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        if (mi.k) {
            c4693ja.b();
        }
        return Unit.a;
    }
}
