package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onTransitionCompleted$1", f = "AuthorizationViewModelBase.kt", l = {}, m = "invokeSuspend")
public final class C1535Mm extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ C1146Hm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535Mm(C1146Hm c1146Hm, JM<? super C1535Mm> jm) {
        super(2, jm);
        this.d = c1146Hm;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1535Mm(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1535Mm) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object value;
        N42 n42;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        GP1 gp1 = this.d.b0;
        do {
            value = gp1.getValue();
            n42 = (N42) value;
            int iOrdinal = n42.ordinal();
            if (iOrdinal == 2) {
                n42 = N42.e;
            } else if (iOrdinal == 3) {
                n42 = N42.d;
            }
        } while (!gp1.d(value, n42));
        return Unit.a;
    }
}
