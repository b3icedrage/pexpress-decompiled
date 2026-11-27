package com.base.feature.robot.timeselection.screens;

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
import defpackage.C0938Eu1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2354Ww1;
import defpackage.C4692jZ1;
import defpackage.C5189lv;
import defpackage.C5325mZ1;
import defpackage.C5535nZ1;
import defpackage.C5955pZ1;
import defpackage.C6584sZ1;
import defpackage.C6610sg0;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC3804fZ1;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.R4;
import defpackage.Sd2;
import defpackage.T4;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/timeselection/screens/TimeSelectionBottomSheetFragment;", "Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotRecyclerBottomSheetDialogFragment;", "LjZ1;", "LpZ1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeSelectionBottomSheetFragment extends RobotRecyclerBottomSheetDialogFragment<C4692jZ1, C5955pZ1> {

    @NotNull
    public final Sd2 k;

    @NotNull
    public final InterfaceC3804fZ1 l;

    @NotNull
    public final AbstractC5603ns m;

    @InterfaceC3368dU(c = "com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "TimeSelectionBottomSheetFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C6610sg0 g;
        public final /* synthetic */ TimeSelectionBottomSheetFragment h;

        /* JADX INFO: renamed from: com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "TimeSelectionBottomSheetFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0300a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C6610sg0 g;
            public final /* synthetic */ TimeSelectionBottomSheetFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.timeselection.screens.TimeSelectionBottomSheetFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0301a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ TimeSelectionBottomSheetFragment e;

                public C0301a(KN kn, TimeSelectionBottomSheetFragment timeSelectionBottomSheetFragment) {
                    this.e = timeSelectionBottomSheetFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    C6584sZ1 c6584sZ1 = (C6584sZ1) obj;
                    TimeSelectionBottomSheetFragment timeSelectionBottomSheetFragment = this.e;
                    timeSelectionBottomSheetFragment.l().h = c6584sZ1.b;
                    timeSelectionBottomSheetFragment.l().p(c6584sZ1.a);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0300a(C6610sg0 c6610sg0, JM jm, TimeSelectionBottomSheetFragment timeSelectionBottomSheetFragment) {
                super(2, jm);
                this.g = c6610sg0;
                this.h = timeSelectionBottomSheetFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0300a c0300a = new C0300a(this.g, jm, this.h);
                c0300a.e = obj;
                return c0300a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0300a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0301a c0301a = new C0301a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0301a, this) == mn) {
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
        public a(FP0 fp0, C6610sg0 c6610sg0, JM jm, TimeSelectionBottomSheetFragment timeSelectionBottomSheetFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = c6610sg0;
            this.h = timeSelectionBottomSheetFragment;
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
                C0300a c0300a = new C0300a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0300a, this) == mn) {
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

    public TimeSelectionBottomSheetFragment(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC3804fZ1 timeItemResourcesProvider, @NotNull AbstractC5603ns bindingFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(timeItemResourcesProvider, "timeItemResourcesProvider");
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        this.k = viewModelFactory;
        this.l = timeItemResourcesProvider;
        this.m = bindingFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        R4 r4 = new R4(this, 6);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C0938Eu1(new T4(this, 4), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5955pZ1.class), new C2354Ww1(interfaceC3770fO0A, 1), new C5535nZ1(interfaceC3770fO0A), r4);
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    public final RecyclerView.e j() {
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        return new C4692jZ1(this.m, this.l, new C5325mZ1(1, obj, C5955pZ1.class, "onTimeClicked", "onTimeClicked(Lcom/api/feature/trading/models/BetDurationSelection;)V", 0));
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    @Nullable
    public final RecyclerView.l k() {
        return null;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    @NotNull
    /* JADX INFO: renamed from: m */
    public final String getI() {
        String string = getString(R.string.bot_settings_trading_time);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment, com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        C6610sg0 c6610sg0 = ((C5955pZ1) obj).j;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, c6610sg0, null, this), 3);
    }
}
