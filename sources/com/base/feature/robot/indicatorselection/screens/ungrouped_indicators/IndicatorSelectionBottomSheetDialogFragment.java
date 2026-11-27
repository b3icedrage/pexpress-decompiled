package com.base.feature.robot.indicatorselection.screens.ungrouped_indicators;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.AbstractC5603ns;
import defpackage.C0718Bz0;
import defpackage.C1339Jy0;
import defpackage.C1417Ky0;
import defpackage.C1494Ly0;
import defpackage.C1572My0;
import defpackage.C1728Ox0;
import defpackage.C1795Pt1;
import defpackage.C2;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2846az0;
import defpackage.C4591j4;
import defpackage.C4801k4;
import defpackage.C4927kg;
import defpackage.C5189lv;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/indicatorselection/screens/ungrouped_indicators/IndicatorSelectionBottomSheetDialogFragment;", "Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotRecyclerBottomSheetDialogFragment;", "LOx0;", "LBz0;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorSelectionBottomSheetDialogFragment extends RobotRecyclerBottomSheetDialogFragment<C1728Ox0, C0718Bz0> {

    @NotNull
    public final Sd2 k;

    @NotNull
    public final AbstractC5603ns l;

    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "IndicatorSelectionBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ IndicatorSelectionBottomSheetDialogFragment h;

        /* JADX INFO: renamed from: com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "IndicatorSelectionBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0284a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ IndicatorSelectionBottomSheetDialogFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.indicatorselection.screens.ungrouped_indicators.IndicatorSelectionBottomSheetDialogFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0285a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ IndicatorSelectionBottomSheetDialogFragment e;

                public C0285a(KN kn, IndicatorSelectionBottomSheetDialogFragment indicatorSelectionBottomSheetDialogFragment) {
                    this.e = indicatorSelectionBottomSheetDialogFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    this.e.l().p((List) obj);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0284a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, IndicatorSelectionBottomSheetDialogFragment indicatorSelectionBottomSheetDialogFragment) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = indicatorSelectionBottomSheetDialogFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0284a c0284a = new C0284a(this.g, jm, this.h);
                c0284a.e = obj;
                return c0284a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0284a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0285a c0285a = new C0285a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0285a, this) == mn) {
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
        public a(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, IndicatorSelectionBottomSheetDialogFragment indicatorSelectionBottomSheetDialogFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = indicatorSelectionBottomSheetDialogFragment;
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
                C0284a c0284a = new C0284a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0284a, this) == mn) {
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

    public IndicatorSelectionBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory, @NotNull AbstractC5603ns bindingFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        this.k = viewModelFactory;
        this.l = bindingFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C4927kg c4927kg = new C4927kg(this, 1);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C4591j4(new C2(this, 2), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C0718Bz0.class), new C4801k4(interfaceC3770fO0A, 1), new C1572My0(interfaceC3770fO0A), c4927kg);
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    public final RecyclerView.e j() {
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        C1339Jy0 c1339Jy0 = new C1339Jy0(1, obj, C0718Bz0.class, "onNewSelect", "onNewSelect(Lcom/api/preferences/domain/models/Indicator;)V", 0);
        Object obj2 = this.g;
        Intrinsics.checkNotNull(obj2);
        C1417Ky0 c1417Ky0 = new C1417Ky0(1, obj2, C0718Bz0.class, "onShowDetailsClick", "onShowDetailsClick(Lcom/api/preferences/domain/models/Indicator;)V", 0);
        Object obj3 = this.g;
        Intrinsics.checkNotNull(obj3);
        return new C1728Ox0(this.l, c1339Jy0, c1417Ky0, new C1494Ly0(1, obj3, C0718Bz0.class, "onShowConfigClick", "onShowConfigClick(Lcom/api/preferences/domain/models/Indicator;)V", 0));
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    @NotNull
    /* JADX INFO: renamed from: m */
    public final String getI() {
        String string = getString(R.string.indicator_selection_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment, com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<List<C2846az0>> interfaceC6396rf0 = ((C0718Bz0) obj).s;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
    }
}
