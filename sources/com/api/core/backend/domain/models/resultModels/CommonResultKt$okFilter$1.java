package com.api.core.backend.domain.models.resultModels;

import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C3414dh;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.MN;
import defpackage.U0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$1", f = "CommonResult.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "", "it", "Lcom/api/core/backend/domain/models/resultModels/CommonResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
final class CommonResultKt$okFilter$1 extends AW1 implements Function2<CommonResult<Object>, JM<? super Unit>, Object> {
    final /* synthetic */ String $label;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonResultKt$okFilter$1(String str, JM<? super CommonResultKt$okFilter$1> jm) {
        super(2, jm);
        this.$label = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        CommonResultKt$okFilter$1 commonResultKt$okFilter$1 = new CommonResultKt$okFilter$1(this.$label, jm);
        commonResultKt$okFilter$1.L$0 = obj;
        return commonResultKt$okFilter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CommonResult<Object> commonResult, JM<? super Unit> jm) {
        return ((CommonResultKt$okFilter$1) create(commonResult, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        C3414dh c3414dh;
        MN mn = MN.d;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1795Pt1.b(obj);
        CommonResult commonResult = (CommonResult) this.L$0;
        if ((commonResult instanceof ResultError) && (c3414dh = U0.o) != null) {
            c3414dh.invoke(this.$label, ((ResultError) commonResult).getError());
        }
        return Unit.a;
    }
}
