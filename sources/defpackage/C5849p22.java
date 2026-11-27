package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: p22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$3", f = "TradingAssetsBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
public final class C5849p22 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ TradingAssetsBottomSheetDialogFragment h;

    /* JADX INFO: renamed from: p22$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$3$1", f = "TradingAssetsBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ TradingAssetsBottomSheetDialogFragment h;

        /* JADX INFO: renamed from: p22$a$a, reason: collision with other inner class name */
        public static final class C0467a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ TradingAssetsBottomSheetDialogFragment e;

            public C0467a(KN kn, TradingAssetsBottomSheetDialogFragment tradingAssetsBottomSheetDialogFragment) {
                this.e = tradingAssetsBottomSheetDialogFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                this.e.j.g0().setChecked(!((Boolean) obj).booleanValue());
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, TradingAssetsBottomSheetDialogFragment tradingAssetsBottomSheetDialogFragment) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = tradingAssetsBottomSheetDialogFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0467a c0467a = new C0467a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0467a, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5849p22(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, TradingAssetsBottomSheetDialogFragment tradingAssetsBottomSheetDialogFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = tradingAssetsBottomSheetDialogFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5849p22(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5849p22) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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
