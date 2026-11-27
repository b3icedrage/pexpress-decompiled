package com.base.feature.platform.screens.deposit;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C3342dL0;
import defpackage.C5189lv;
import defpackage.C5950pY;
import defpackage.C6999uY;
import defpackage.C7630xY;
import defpackage.C7652xe;
import defpackage.Ch2;
import defpackage.EX;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.IW;
import defpackage.InterfaceC2773ah1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.Sd2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/platform/screens/deposit/DepositFragmentBase;", "LpY;", "VM", "Lcom/api/feature/platform/screens/common/CommonNavigateToVerificationFragmentApi;", "FeaturePlatformBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DepositFragmentBase<VM extends C5950pY> extends CommonNavigateToVerificationFragmentApi<VM> {

    @NotNull
    public final InterfaceC2773ah1 t;
    public final boolean u;
    public boolean v;
    public boolean w;

    @InterfaceC3368dU(c = "com.base.feature.platform.screens.deposit.DepositFragmentBase$initLiveData$$inlined$launchAndCollectIn$1", f = "DepositFragmentBase.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ DepositFragmentBase h;

        /* JADX INFO: renamed from: com.base.feature.platform.screens.deposit.DepositFragmentBase$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.platform.screens.deposit.DepositFragmentBase$initLiveData$$inlined$launchAndCollectIn$1$1", f = "DepositFragmentBase.kt", l = {49}, m = "invokeSuspend")
        public static final class C0278a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC6396rf0 g;
            public final /* synthetic */ DepositFragmentBase h;

            /* JADX INFO: renamed from: com.base.feature.platform.screens.deposit.DepositFragmentBase$a$a$a, reason: collision with other inner class name */
            public static final class C0279a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ DepositFragmentBase e;

                public C0279a(KN kn, DepositFragmentBase depositFragmentBase) {
                    this.e = depositFragmentBase;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    DepositFragmentBase depositFragmentBase = this.e;
                    depositFragmentBase.w = zBooleanValue;
                    depositFragmentBase.z();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0278a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, DepositFragmentBase depositFragmentBase) {
                super(2, jm);
                this.g = interfaceC6396rf0;
                this.h = depositFragmentBase;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0278a c0278a = new C0278a(this.g, jm, this.h);
                c0278a.e = obj;
                return c0278a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0278a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0279a c0279a = new C0279a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0279a, this) == mn) {
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
        public a(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, DepositFragmentBase depositFragmentBase) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC6396rf0;
            this.h = depositFragmentBase;
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
                C0278a c0278a = new C0278a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.g, c0278a, this) == mn) {
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

    @InterfaceC3368dU(c = "com.base.feature.platform.screens.deposit.DepositFragmentBase$onViewCreated$1", f = "DepositFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ DepositFragmentBase<VM> e;

        @InterfaceC3368dU(c = "com.base.feature.platform.screens.deposit.DepositFragmentBase$onViewCreated$1$1", f = "DepositFragmentBase.kt", l = {52}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ DepositFragmentBase<VM> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DepositFragmentBase<VM> depositFragmentBase, JM<? super a> jm) {
                super(2, jm);
                this.e = depositFragmentBase;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                ((a) create(kn, jm)).invokeSuspend(Unit.a);
                return MN.d;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                InterfaceC2773ah1 interfaceC2773ah1 = this.e.t;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1795Pt1.b(obj);
                        throw new C3342dL0();
                    }
                    C1795Pt1.b(obj);
                    interfaceC2773ah1.a(true);
                    this.d = 1;
                    IW.a(this);
                    return mn;
                } catch (Throwable th) {
                    interfaceC2773ah1.a(false);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DepositFragmentBase<VM> depositFragmentBase, JM<? super b> jm) {
            super(2, jm);
            this.e = depositFragmentBase;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                DepositFragmentBase<VM> depositFragmentBase = this.e;
                FP0 viewLifecycleOwner = depositFragmentBase.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                g.b bVar = g.b.i;
                a aVar = new a(depositFragmentBase, null);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(viewLifecycleOwner, bVar, aVar, this) == mn) {
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
    public DepositFragmentBase(@NotNull EX bindingProvider, @NotNull C6999uY customWebChromeClient, @NotNull C7630xY customWebViewClient, @NotNull Sd2 viewModelFactory, @NotNull Ch2 webViewCustomizer, @NotNull InterfaceC2773ah1 preloadedWebViewUseCase) {
        super(bindingProvider, customWebChromeClient, customWebViewClient, viewModelFactory, webViewCustomizer);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        this.t = preloadedWebViewUseCase;
        this.u = true;
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    public final void l(boolean z) {
        this.v = z;
        z();
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    /* JADX INFO: renamed from: m */
    public final boolean getN() {
        return false;
    }

    @Override // com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi, com.api.core.BindingFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.t.h();
        super.onDestroyView();
    }

    @Override // com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi, com.api.feature.webpage.screen.SimpleWebViewFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(this, null), 3);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    public final void q() {
        super.q();
        FP1 fp1B = this.t.b();
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, fp1B, null, this), 3);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getU() {
        return this.u;
    }

    @Override // com.api.feature.webpage.screen.SimpleWebViewFragment
    @NotNull
    public final String x() {
        String string = getString(R.string.deposit_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void z() {
        super.l(this.v || this.w);
    }
}
