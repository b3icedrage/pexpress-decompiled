package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppSecondStepUseCaseBase$immediateUpdateExists$2$1", f = "LaunchAppSecondStepUseCaseBase.kt", l = {100}, m = "invokeSuspend")
public final class YM0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3348dN0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YM0(C3348dN0 c3348dN0, JM<? super YM0> jm) {
        super(2, jm);
        this.e = c3348dN0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new YM0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((YM0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C3348dN0 c3348dN0 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (c3348dN0.c() == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        c3348dN0.getClass();
        ReporterApi.a.b(c3348dN0.c, EnumC5028l80.k, null, null, 14);
        Context context = c3348dN0.a;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        AM.b(context, packageName);
        return Unit.a;
    }
}
