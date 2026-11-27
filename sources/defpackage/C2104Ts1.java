package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.Unit;

/* JADX INFO: renamed from: Ts1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.helpers.RequestWrapperKt$catching$1", f = "RequestWrapper.kt", l = {48}, m = "invokeSuspend")
public final class C2104Ts1 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super CommonResult<Object>>, Throwable, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ Throwable g;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6606sf0 interfaceC6606sf0 = this.e;
            Throwable th = this.g;
            String strC = Z0.c(C2017Sp1.a.b(th.getClass()).f(), " encountered when executing request.");
            DS1.b("\n            " + strC + "\n            Stacktrace:\n            " + J90.b(th) + "\n        ");
            ResultError resultError = new ResultError(new CommonError.OtherError(strC, 0, 2, null));
            this.e = null;
            this.d = 1;
            if (interfaceC6606sf0.a(resultError, this) == mn) {
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

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<? super CommonResult<Object>> interfaceC6606sf0, Throwable th, JM<? super Unit> jm) {
        C2104Ts1 c2104Ts1 = new C2104Ts1(3, jm);
        c2104Ts1.e = interfaceC6606sf0;
        c2104Ts1.g = th;
        return c2104Ts1.invokeSuspend(Unit.a);
    }
}
