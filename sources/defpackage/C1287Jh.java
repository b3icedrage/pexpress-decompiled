package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.AppRepositoryBase$changeLanguage$2", f = "AppRepositoryBase.kt", l = {58}, m = "invokeSuspend")
public final class C1287Jh extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC1991Sh e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287Jh(AbstractC1991Sh abstractC1991Sh, String str, JM<? super C1287Jh> jm) {
        super(1, jm);
        this.e = abstractC1991Sh;
        this.g = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1287Jh(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C1287Jh) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC7446wf interfaceC7446wf = this.e.b;
            this.d = 1;
            if (interfaceC7446wf.a(this.g, this) == mn) {
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
