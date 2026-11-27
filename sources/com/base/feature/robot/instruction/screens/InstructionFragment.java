package com.base.feature.robot.instruction.screens;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment;
import defpackage.AW1;
import defpackage.AbstractC5603ns;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3102cB0;
import defpackage.C3521eB0;
import defpackage.C4591j4;
import defpackage.C5189lv;
import defpackage.C5462nB0;
import defpackage.C5560ng;
import defpackage.C5882pB0;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.G6;
import defpackage.H6;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/instruction/screens/InstructionFragment;", "Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotRecyclerBottomSheetDialogFragment;", "LcB0;", "LnB0;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstructionFragment extends RobotRecyclerBottomSheetDialogFragment<C3102cB0, C5462nB0> {

    @NotNull
    public final Sd2 k;

    @NotNull
    public final AbstractC5603ns l;

    @InterfaceC3368dU(c = "com.base.feature.robot.instruction.screens.InstructionFragment$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "InstructionFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ InstructionFragment h;

        /* JADX INFO: renamed from: com.base.feature.robot.instruction.screens.InstructionFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.instruction.screens.InstructionFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "InstructionFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0286a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ InstructionFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.instruction.screens.InstructionFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0287a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ InstructionFragment e;

                public C0287a(KN kn, InstructionFragment instructionFragment) {
                    this.e = instructionFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    C5882pB0 c5882pB0 = (C5882pB0) obj;
                    InstructionFragment instructionFragment = this.e;
                    instructionFragment.l().p(c5882pB0.b);
                    instructionFragment.i().i.setText(c5882pB0.a);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0286a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, InstructionFragment instructionFragment) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = instructionFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0286a c0286a = new C0286a(this.g, jm, this.h);
                c0286a.e = obj;
                return c0286a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0286a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0287a c0287a = new C0287a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0287a, this) == mn) {
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
        public a(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, InstructionFragment instructionFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = instructionFragment;
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
                C0286a c0286a = new C0286a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0286a, this) == mn) {
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

    public InstructionFragment(@NotNull Sd2 viewModelFactory, @NotNull AbstractC5603ns bindingProviderFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProviderFactory, "bindingProviderFactory");
        this.k = viewModelFactory;
        this.l = bindingProviderFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C5560ng c5560ng = new C5560ng(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new G6(new C4591j4(this, 2), 1));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5462nB0.class), new H6(interfaceC3770fO0A, 1), new C3521eB0(interfaceC3770fO0A), c5560ng);
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    public final RecyclerView.e j() {
        return new C3102cB0(this.l);
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment, com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        InterfaceC6396rf0<C5882pB0> interfaceC6396rf0 = ((C5462nB0) obj).e;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
    }
}
