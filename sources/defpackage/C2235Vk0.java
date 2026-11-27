package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Vk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.GetConfigUseCaseBase$fetch$4", f = "GetConfigUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C2235Vk0 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public final /* synthetic */ CommonResult<FF> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235Vk0(CommonResult<FF> commonResult, JM<? super C2235Vk0> jm) {
        super(1, jm);
        this.d = commonResult;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2235Vk0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        return ((C2235Vk0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(((FF) ((ResultOk) this.d).a()).I);
    }
}
