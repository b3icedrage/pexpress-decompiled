package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Qv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase$openReviewDialog$2", f = "RobotCommonViewModelBase.kt", l = {137}, m = "invokeSuspend")
public final class C1879Qv1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1486Lv1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879Qv1(C1486Lv1 c1486Lv1, JM<? super C1879Qv1> jm) {
        super(2, jm);
        this.e = c1486Lv1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1879Qv1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1879Qv1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            final C1486Lv1 c1486Lv1 = this.e;
            C3670eu1 c3670eu1 = c1486Lv1.m;
            VK1 vk1 = c3670eu1.d;
            String packageName = c3670eu1.e.a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            AbstractC1592Nf.v vVar = new AbstractC1592Nf.v(StringsKt.N(packageName, ".test"), new C4927kg(c1486Lv1, 5), new C4123h4(c1486Lv1, 1), new Function1() { // from class: Pv1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    C1486Lv1 c1486Lv2 = c1486Lv1;
                    c1486Lv2.m.g.a(iIntValue, c1486Lv2.n(), null);
                    return Unit.a;
                }
            }, new Function2() { // from class: Ov1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj2).intValue();
                    Boolean bool = (Boolean) obj3;
                    bool.getClass();
                    C1486Lv1 c1486Lv2 = c1486Lv1;
                    c1486Lv2.getClass();
                    C5189lv.k(C8056za.j(c1486Lv2), null, new C1409Kv1(c1486Lv2, null), 3);
                    c1486Lv2.m.g.a(iIntValue, c1486Lv2.n(), bool);
                    return Unit.a;
                }
            });
            this.d = 1;
            if (vk1.a(vVar, null, null) == mn) {
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
