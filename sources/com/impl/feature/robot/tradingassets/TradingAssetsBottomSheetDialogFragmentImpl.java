package com.impl.feature.robot.tradingassets;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment;
import com.pexpress.tool.R;
import defpackage.A2;
import defpackage.AW1;
import defpackage.AbstractC5603ns;
import defpackage.AbstractC6898u22;
import defpackage.B2;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3488e22;
import defpackage.C5189lv;
import defpackage.C6059q22;
import defpackage.C6268r22;
import defpackage.C7121v6;
import defpackage.C7318w22;
import defpackage.C7542x6;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/impl/feature/robot/tradingassets/TradingAssetsBottomSheetDialogFragmentImpl;", "Lcom/base/feature/robot/assetselection/screens/TradingAssetsBottomSheetDialogFragment;", "FeatureRobotImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TradingAssetsBottomSheetDialogFragmentImpl extends TradingAssetsBottomSheetDialogFragment {

    @NotNull
    public final Sd2 k;
    public final int l;

    @InterfaceC3368dU(c = "com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "TradingAssetsBottomSheetDialogFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ TradingAssetsBottomSheetDialogFragmentImpl h;

        /* JADX INFO: renamed from: com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "TradingAssetsBottomSheetDialogFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class C0332a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ FP1 g;
            public final /* synthetic */ TradingAssetsBottomSheetDialogFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl$a$a$a, reason: collision with other inner class name */
            public static final class C0333a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ TradingAssetsBottomSheetDialogFragmentImpl e;

                public C0333a(KN kn, TradingAssetsBottomSheetDialogFragmentImpl tradingAssetsBottomSheetDialogFragmentImpl) {
                    this.e = tradingAssetsBottomSheetDialogFragmentImpl;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    RecyclerView.e adapter = this.e.j.r().getAdapter();
                    Intrinsics.c(adapter, "null cannot be cast to non-null type com.base.feature.robot.assetselection.adapter.TradingAssetAdapter");
                    ((C3488e22) adapter).p((List) obj);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0332a(FP1 fp1, JM jm, TradingAssetsBottomSheetDialogFragmentImpl tradingAssetsBottomSheetDialogFragmentImpl) {
                super(2, jm);
                this.g = fp1;
                this.h = tradingAssetsBottomSheetDialogFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0332a c0332a = new C0332a(this.g, jm, this.h);
                c0332a.e = obj;
                return c0332a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0332a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0333a c0333a = new C0333a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0333a, this) == mn) {
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
        public a(FP0 fp0, FP1 fp1, JM jm, TradingAssetsBottomSheetDialogFragmentImpl tradingAssetsBottomSheetDialogFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = fp1;
            this.h = tradingAssetsBottomSheetDialogFragmentImpl;
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
                C0332a c0332a = new C0332a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0332a, this) == mn) {
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
    public TradingAssetsBottomSheetDialogFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull AbstractC5603ns bindingFactory, @NotNull C6268r22 tradingAssetBindingProviderBottomSheet) {
        super(bindingFactory, tradingAssetBindingProviderBottomSheet);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        Intrinsics.checkNotNullParameter(tradingAssetBindingProviderBottomSheet, "tradingAssetBindingProviderBottomSheet");
        this.k = viewModelFactory;
        this.l = R.id.transition_asset_selection;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C7121v6 c7121v6 = new C7121v6(this, 7);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new A2(new C7542x6(this, 1), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7318w22.class), new B2(interfaceC3770fO0A, 2), new C6059q22(interfaceC3770fO0A), c7121v6);
    }

    @Override // com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment, com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1 = ((AbstractC6898u22) obj).o;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, c1699On1, null, this), 3);
    }
}
