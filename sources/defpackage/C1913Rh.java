package defpackage;

import com.api.core.backend.domain.models.responseModels.GetVPNResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.AppRepositoryBase$getVPNImages$2", f = "AppRepositoryBase.kt", l = {37}, m = "invokeSuspend")
public final class C1913Rh extends AW1 implements Function1<JM<? super GetVPNResponse>, Object> {
    public int d;
    public final /* synthetic */ AbstractC1991Sh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913Rh(AbstractC1991Sh abstractC1991Sh, JM<? super C1913Rh> jm) {
        super(1, jm);
        this.e = abstractC1991Sh;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1913Rh(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super GetVPNResponse> jm) {
        return ((C1913Rh) create(jm)).invokeSuspend(Unit.a);
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
        InterfaceC7446wf interfaceC7446wf = this.e.b;
        this.d = 1;
        Object objI = interfaceC7446wf.i(this);
        return objI == mn ? mn : objI;
    }
}
