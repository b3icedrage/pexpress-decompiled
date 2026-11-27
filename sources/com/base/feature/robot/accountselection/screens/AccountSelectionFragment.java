package com.base.feature.robot.accountselection.screens;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.AbstractC5603ns;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C2641a4;
import defpackage.C4123h4;
import defpackage.C5189lv;
import defpackage.C5434n4;
import defpackage.C7652xe;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC4119h3;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/accountselection/screens/AccountSelectionFragment;", "Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotRecyclerBottomSheetDialogFragment;", "La4;", "Ln4;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AccountSelectionFragment extends RobotRecyclerBottomSheetDialogFragment<C2641a4, C5434n4> {

    @NotNull
    public final AbstractC5603ns k;

    @NotNull
    public final InterfaceC4119h3 l;

    @InterfaceC3368dU(c = "com.base.feature.robot.accountselection.screens.AccountSelectionFragment$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "AccountSelectionFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ AccountSelectionFragment h;

        /* JADX INFO: renamed from: com.base.feature.robot.accountselection.screens.AccountSelectionFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.accountselection.screens.AccountSelectionFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "AccountSelectionFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0282a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ FP1 g;
            public final /* synthetic */ AccountSelectionFragment h;

            /* JADX INFO: renamed from: com.base.feature.robot.accountselection.screens.AccountSelectionFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0283a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ AccountSelectionFragment e;

                public C0283a(KN kn, AccountSelectionFragment accountSelectionFragment) {
                    this.e = accountSelectionFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    this.e.l().p((List) obj);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0282a(FP1 fp1, JM jm, AccountSelectionFragment accountSelectionFragment) {
                super(2, jm);
                this.g = fp1;
                this.h = accountSelectionFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0282a c0282a = new C0282a(this.g, jm, this.h);
                c0282a.e = obj;
                return c0282a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0282a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0283a c0283a = new C0283a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0283a, this) == mn) {
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
        public a(FP0 fp0, FP1 fp1, JM jm, AccountSelectionFragment accountSelectionFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = fp1;
            this.h = accountSelectionFragment;
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
                C0282a c0282a = new C0282a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0282a, this) == mn) {
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

    public AccountSelectionFragment(@NotNull AbstractC5603ns bindingProviderFactory, @NotNull InterfaceC4119h3 accountItemResourceProvider) {
        Intrinsics.checkNotNullParameter(bindingProviderFactory, "bindingProviderFactory");
        Intrinsics.checkNotNullParameter(accountItemResourceProvider, "accountItemResourceProvider");
        this.k = bindingProviderFactory;
        this.l = accountItemResourceProvider;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment
    public final RecyclerView.e j() {
        return new C2641a4(this.k, this.l, new C4123h4(this, 0));
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
        String string = requireContext().getString(R.string.bot_setting_account_selection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment, com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((C5434n4) obj).g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, c1699On1, null, this), 3);
    }
}
