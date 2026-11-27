package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: g81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.usecases.ObserveCurrentAssetUseCaseBase$subscribeToAssets$1", f = "ObserveCurrentAssetUseCaseBase.kt", l = {30}, m = "invokeSuspend")
public final class C3931g81 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC4141h81 e;

    /* JADX INFO: renamed from: g81$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ AbstractC4141h81 d;

        public a(AbstractC4141h81 abstractC4141h81) {
            this.d = abstractC4141h81;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) {
            Object objC;
            AbstractC4141h81 abstractC4141h81 = this.d;
            abstractC4141h81.d.setValue((C3279d22) obj);
            C4351i81 c4351i81 = (C4351i81) abstractC4141h81;
            C3279d22 c3279d22 = (C3279d22) c4351i81.b.f.d.getValue();
            if (c3279d22 == null) {
                objC = Unit.a;
            } else {
                AbstractC7004uZ1 abstractC7004uZ1 = c4351i81.a;
                abstractC7004uZ1.d();
                Integer num = c3279d22.f;
                Integer num2 = c3279d22.g;
                if ((num2 == null || num2.intValue() != 0) && num != null && num.intValue() == 0) {
                    objC = abstractC7004uZ1.c(false, jm);
                    if (objC != MN.d) {
                        objC = Unit.a;
                    }
                } else if (num2 == null || num2.intValue() != 0 || ((num != null && num.intValue() == 0) || (objC = abstractC7004uZ1.c(true, jm)) != MN.d)) {
                    objC = Unit.a;
                }
            }
            MN mn = MN.d;
            if (objC != mn) {
                objC = Unit.a;
            }
            return objC == mn ? objC : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3931g81(AbstractC4141h81 abstractC4141h81, JM<? super C3931g81> jm) {
        super(2, jm);
        this.e = abstractC4141h81;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3931g81(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3931g81) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object obj2 = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC4141h81 abstractC4141h81 = this.e;
            InterfaceC6396rf0<C3279d22> interfaceC6396rf0 = abstractC4141h81.b.g;
            a aVar = new a(abstractC4141h81);
            this.d = 1;
            Object objC = interfaceC6396rf0.c(new C4040gg0(aVar), this);
            if (objC != obj2) {
                objC = Unit.a;
            }
            if (objC == obj2) {
                return obj2;
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
