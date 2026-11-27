package com.api.feature.webpage.screen;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C5189lv;
import defpackage.C5421n02;
import defpackage.C7652xe;
import defpackage.C7806yM1;
import defpackage.Ch2;
import defpackage.FP0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC6965uM1;
import defpackage.JM;
import defpackage.KN;
import defpackage.KR;
import defpackage.MN;
import defpackage.OR;
import defpackage.Sd2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/feature/webpage/screen/SimpleWebViewFragment;", "LyM1;", "VM", "Lcom/api/feature/webpage/screen/WebViewFragment;", "FeatureWebPageInAppApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleWebViewFragment<VM extends C7806yM1> extends WebViewFragment<VM> {

    @NotNull
    public final InterfaceC6965uM1 o;

    @Nullable
    public final Integer p;

    @InterfaceC3368dU(c = "com.api.feature.webpage.screen.SimpleWebViewFragment$onViewCreated$1", f = "SimpleWebViewFragment.kt", l = {43}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ SimpleWebViewFragment<VM> e;

        /* JADX INFO: renamed from: com.api.feature.webpage.screen.SimpleWebViewFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.feature.webpage.screen.SimpleWebViewFragment$onViewCreated$1$1", f = "SimpleWebViewFragment.kt", l = {}, m = "invokeSuspend")
        public static final class C0266a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public final /* synthetic */ SimpleWebViewFragment<VM> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0266a(SimpleWebViewFragment<VM> simpleWebViewFragment, JM<? super C0266a> jm) {
                super(2, jm);
                this.d = simpleWebViewFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new C0266a(this.d, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0266a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                SimpleWebViewFragment<VM> simpleWebViewFragment = this.d;
                simpleWebViewFragment.r();
                WebViewFragment.u(simpleWebViewFragment, false, 3);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SimpleWebViewFragment<VM> simpleWebViewFragment, JM<? super a> jm) {
            super(2, jm);
            this.e = simpleWebViewFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
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
                SimpleWebViewFragment<VM> simpleWebViewFragment = this.e;
                FP0 viewLifecycleOwner = simpleWebViewFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                g.b bVar = g.b.i;
                C0266a c0266a = new C0266a(simpleWebViewFragment, null);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(viewLifecycleOwner, bVar, c0266a, this) == mn) {
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
    public SimpleWebViewFragment(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC6965uM1 bindingProvider, @NotNull KR customWebChromeClient, @NotNull OR customWebViewClient, @NotNull Ch2 webViewCustomizer) {
        super(bindingProvider, webViewCustomizer, customWebChromeClient, customWebViewClient);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(customWebViewClient, "customWebViewClient");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        this.o = bindingProvider;
        this.p = Integer.valueOf(R.color.toolbarBackground);
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getL() {
        return this.p;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        q();
        C5189lv.k(C7652xe.f(this), null, new a(this, null), 3);
        InterfaceC6965uM1 interfaceC6965uM1 = this.o;
        Toolbar toolbarD = interfaceC6965uM1.d();
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(gVarRequireActivity, "requireActivity(...)");
        C5421n02.a(toolbarD, gVarRequireActivity);
        interfaceC6965uM1.d().setTitle(x());
    }

    @NotNull
    public abstract String x();
}
