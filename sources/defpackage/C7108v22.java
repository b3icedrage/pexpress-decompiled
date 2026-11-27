package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: v22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetViewModelBase$onSwitchManualSelect$1", f = "TradingAssetsBottomSheetViewModelBase.kt", l = {99}, m = "invokeSuspend")
public final class C7108v22 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC6898u22 e;

    /* JADX INFO: renamed from: v22$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetViewModelBase$onSwitchManualSelect$1$1", f = "TradingAssetsBottomSheetViewModelBase.kt", l = {100}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Boolean>, Object> {
        public int d;
        public final /* synthetic */ AbstractC6898u22 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC6898u22 abstractC6898u22, JM<? super a> jm) {
            super(1, jm);
            this.e = abstractC6898u22;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Boolean> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6396rf0<Boolean> interfaceC6396rf0L = this.e.j.l();
                this.d = 1;
                obj = C4466ii.o(interfaceC6396rf0L, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7108v22(AbstractC6898u22 abstractC6898u22, JM<? super C7108v22> jm) {
        super(2, jm);
        this.e = abstractC6898u22;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7108v22(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7108v22) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC6898u22 abstractC6898u22 = this.e;
            AbstractC4892kW0 abstractC4892kW0 = abstractC6898u22.j;
            a aVar = new a(abstractC6898u22, null);
            this.d = 1;
            if (abstractC4892kW0.m(aVar, this) == mn) {
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
