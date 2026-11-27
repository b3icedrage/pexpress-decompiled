package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataUpdatersStarter$start$1", f = "AppDataUpdatersStarter.kt", l = {53}, m = "invokeSuspend")
public final class C1125Hf extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1281Jf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125Hf(C1281Jf c1281Jf, JM<? super C1125Hf> jm) {
        super(2, jm);
        this.e = c1281Jf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1125Hf(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1125Hf) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C1281Jf c1281Jf = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            GP1 gp1 = c1281Jf.a;
            this.d = 1;
            if (C7236vf0.a(gp1, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        for (InterfaceC0735Cf interfaceC0735Cf : c1281Jf.b) {
            c1281Jf.f.put(interfaceC0735Cf, C5189lv.k(c1281Jf.e, C6266r20.c, new C1203If(interfaceC0735Cf, null), 2));
        }
        return Unit.a;
    }
}
