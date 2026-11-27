package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Py0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
public final class C1809Py0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment h;

    /* JADX INFO: renamed from: Py0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.grouped_indicators.IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment h;

        /* JADX INFO: renamed from: Py0$a$a, reason: collision with other inner class name */
        public static final class C0126a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment e;

            public C0126a(KN kn, IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) {
                this.e = indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                int iIntValue = ((Number) obj).intValue();
                IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment = this.e;
                C7078uu c7078uuI = indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment.i();
                TabLayout tabLayout = c7078uuI.g;
                tabLayout.i((iIntValue < 0 || iIntValue >= tabLayout.getTabCount()) ? null : tabLayout.e.get(iIntValue), true);
                c7078uuI.i.c(iIntValue, indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment.n);
                indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment.n = true;
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) {
            super(2, jm);
            this.g = fp1;
            this.h = indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
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
                C0126a c0126a = new C0126a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0126a, this) == mn) {
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
    public C1809Py0(FP0 fp0, FP1 fp1, JM jm, IndicatorSelectionGroupedIndicatorsBottomSheetDialogFragment indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = indicatorSelectionGroupedIndicatorsBottomSheetDialogFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1809Py0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1809Py0) create(kn, jm)).invokeSuspend(Unit.a);
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
