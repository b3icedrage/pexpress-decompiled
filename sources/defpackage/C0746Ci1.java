package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ci1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$onIdClick$1", f = "ProfileViewModelBase.kt", l = {162}, m = "invokeSuspend")
public final class C0746Ci1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC8090zi1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746Ci1(AbstractC8090zi1 abstractC8090zi1, JM<? super C0746Ci1> jm) {
        super(2, jm);
        this.e = abstractC8090zi1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0746Ci1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0746Ci1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC8090zi1 abstractC8090zi1 = this.e;
            C6120qK1 c6120qK1 = abstractC8090zi1.v;
            C6945uG c6945uG = (C6945uG) abstractC8090zi1.d.k.getValue();
            Long l = c6945uG != null ? new Long(c6945uG.a) : null;
            this.d = 1;
            if (c6120qK1.a(l, this) == mn) {
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
