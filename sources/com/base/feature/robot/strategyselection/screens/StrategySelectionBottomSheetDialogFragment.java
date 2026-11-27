package com.base.feature.robot.strategyselection.screens;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2405Xf;
import defpackage.C3265cz0;
import defpackage.C3399dd0;
import defpackage.C3496e42;
import defpackage.C4205hT0;
import defpackage.C4415iT0;
import defpackage.C5189lv;
import defpackage.C6876tw1;
import defpackage.C7652xe;
import defpackage.ER1;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.HR1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.PR1;
import defpackage.Sd2;
import defpackage.XO0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/strategyselection/screens/StrategySelectionBottomSheetDialogFragment;", "Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotRecyclerBottomSheetDialogFragment;", "LER1;", "LPR1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StrategySelectionBottomSheetDialogFragment extends RobotRecyclerBottomSheetDialogFragment<ER1, PR1> {

    @NotNull
    public final Sd2 k;

    @InterfaceC3368dU(c = "com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "StrategySelectionBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ StrategySelectionBottomSheetDialogFragment h;

        /* JADX INFO: renamed from: com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "StrategySelectionBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0298a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ StrategySelectionBottomSheetDialogFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.strategyselection.screens.StrategySelectionBottomSheetDialogFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0299a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ StrategySelectionBottomSheetDialogFragment e;

                public C0299a(KN kn, StrategySelectionBottomSheetDialogFragment strategySelectionBottomSheetDialogFragment) {
                    this.e = strategySelectionBottomSheetDialogFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    this.e.l().p((List) obj);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0298a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, StrategySelectionBottomSheetDialogFragment strategySelectionBottomSheetDialogFragment) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = strategySelectionBottomSheetDialogFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0298a c0298a = new C0298a(this.g, jm, this.h);
                c0298a.e = obj;
                return c0298a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0298a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0299a c0299a = new C0299a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0299a, this) == mn) {
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
        public a(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, StrategySelectionBottomSheetDialogFragment strategySelectionBottomSheetDialogFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = strategySelectionBottomSheetDialogFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, this.g, jm, this.h);
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
                C0298a c0298a = new C0298a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0298a, this) == mn) {
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

    public StrategySelectionBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.k = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C2405Xf c2405Xf = new C2405Xf(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3265cz0(new C3399dd0(this, 4), 10));
        return C2151Ui0.a(this, C2017Sp1.a.b(PR1.class), new C6876tw1(interfaceC3770fO0A, 2), new HR1(interfaceC3770fO0A), c2405Xf);
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    public final RecyclerView.e j() {
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        boolean z = ((PR1) obj).j;
        Object obj2 = this.g;
        Intrinsics.checkNotNull(obj2);
        C4205hT0 c4205hT0 = new C4205hT0(1, obj2, PR1.class, "onStrategyClick", "onStrategyClick(Lcom/api/feature/robot/robot/strategies/models/TradingStrategyUi;)V", 0, 1);
        Object obj3 = this.g;
        Intrinsics.checkNotNull(obj3);
        return new ER1(z, c4205hT0, new C4415iT0(1, obj3, PR1.class, "onShowDetailsClick", "onShowDetailsClick(Lcom/api/feature/robot/robot/strategies/models/TradingStrategyUi;)V", 0, 1));
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    @NotNull
    /* JADX INFO: renamed from: m */
    public final String getI() {
        String string = getString(R.string.strategy_selection_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment, com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<List<C3496e42>> interfaceC6396rf0 = ((PR1) obj).i;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
    }
}
