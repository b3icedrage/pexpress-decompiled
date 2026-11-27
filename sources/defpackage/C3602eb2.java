package defpackage;

import com.impl.core.backend.responseModels.GetBalanceResponseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.UserDataSourceImpl$getDemoBalance$2", f = "UserDataSourceImpl.kt", l = {146}, m = "invokeSuspend")
public final class C3602eb2 extends AW1 implements Function1<JM<? super GetBalanceResponseImpl>, Object> {
    public int d;
    public final /* synthetic */ C2750ab2 e;
    public final /* synthetic */ XF g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3602eb2(C2750ab2 c2750ab2, XF xf, JM<? super C3602eb2> jm) {
        super(1, jm);
        this.e = c2750ab2;
        this.g = xf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3602eb2(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super GetBalanceResponseImpl> jm) {
        return ((C3602eb2) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
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
        C2750ab2 c2750ab2 = this.e;
        String strI = c2750ab2.f.i();
        String str = this.g.a;
        this.d = 1;
        Object objC = c2750ab2.e.c(strI, str, this);
        return objC == mn ? mn : objC;
    }
}
