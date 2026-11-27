package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Tk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.GetConfigUseCaseBase$fetch$2", f = "GetConfigUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C2079Tk0 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public final /* synthetic */ ResultOk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2079Tk0(ResultOk resultOk, JM jm) {
        super(1, jm);
        this.d = resultOk;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2079Tk0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        return ((C2079Tk0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(((FF) this.d.a()).a);
    }
}
