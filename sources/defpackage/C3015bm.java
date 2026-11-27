package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl$signOut$2", f = "AuthorizationDataSourceImpl.kt", l = {140}, m = "invokeSuspend")
public final class C3015bm extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3224cm e;
    public final /* synthetic */ C6315rG g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3015bm(C3224cm c3224cm, C6315rG c6315rG, JM<? super C3015bm> jm) {
        super(1, jm);
        this.e = c3224cm;
        this.g = c6315rG;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3015bm(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C3015bm) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C3224cm c3224cm = this.e;
            InterfaceC7864ye1 interfaceC7864ye1 = c3224cm.c;
            String strH = c3224cm.d.h();
            String str = this.g.a;
            this.d = 1;
            if (interfaceC7864ye1.e(strH, str, this) == mn) {
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
}
