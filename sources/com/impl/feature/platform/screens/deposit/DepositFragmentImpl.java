package com.impl.feature.platform.screens.deposit;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import androidx.work.b;
import com.base.feature.platform.screens.deposit.DepositFragmentBase;
import com.impl.core.backend.DepositMadeWorker;
import defpackage.AW1;
import defpackage.C1621Nn1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C3296d7;
import defpackage.C4736jk2;
import defpackage.C5189lv;
import defpackage.C6160qY;
import defpackage.C6369rY;
import defpackage.C6693t4;
import defpackage.C6999uY;
import defpackage.C7113v4;
import defpackage.C7630xY;
import defpackage.C7652xe;
import defpackage.C8056za;
import defpackage.Ch2;
import defpackage.EX;
import defpackage.EnumC4403iP0;
import defpackage.EnumC5957pa0;
import defpackage.FP0;
import defpackage.InterfaceC2773ah1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.JX;
import defpackage.K91;
import defpackage.KN;
import defpackage.KX;
import defpackage.LX;
import defpackage.MN;
import defpackage.OR;
import defpackage.Pa2;
import defpackage.Sd2;
import defpackage.XO0;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/impl/feature/platform/screens/deposit/DepositFragmentImpl;", "Lcom/base/feature/platform/screens/deposit/DepositFragmentBase;", "LrY;", "FeaturePlatformImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DepositFragmentImpl extends DepositFragmentBase<C6369rY> {

    @NotNull
    public final C3296d7 A;

    @NotNull
    public final Pa2 x;

    @NotNull
    public final Sd2 y;

    @NotNull
    public final C7630xY z;

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.deposit.DepositFragmentImpl$onViewCreated$$inlined$launchAndCollectIn$default$1", f = "DepositFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C1621Nn1 g;
        public final /* synthetic */ DepositFragmentImpl h;

        /* JADX INFO: renamed from: com.impl.feature.platform.screens.deposit.DepositFragmentImpl$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.deposit.DepositFragmentImpl$onViewCreated$$inlined$launchAndCollectIn$default$1$1", f = "DepositFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class C0321a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C1621Nn1 g;
            public final /* synthetic */ DepositFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.deposit.DepositFragmentImpl$a$a$a, reason: collision with other inner class name */
            public static final class C0322a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ DepositFragmentImpl e;

                public C0322a(KN kn, DepositFragmentImpl depositFragmentImpl) {
                    this.e = depositFragmentImpl;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    Object obj2 = this.e.i;
                    Intrinsics.checkNotNull(obj2);
                    C6369rY c6369rY = (C6369rY) obj2;
                    c6369rY.getClass();
                    C5189lv.k(C8056za.j(c6369rY), null, new C6160qY(c6369rY, null), 3);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0321a(C1621Nn1 c1621Nn1, JM jm, DepositFragmentImpl depositFragmentImpl) {
                super(2, jm);
                this.g = c1621Nn1;
                this.h = depositFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0321a c0321a = new C0321a(this.g, jm, this.h);
                c0321a.e = obj;
                return c0321a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0321a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0322a c0322a = new C0322a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.d.c(c0322a, this) == mn) {
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
        public a(FP0 fp0, C1621Nn1 c1621Nn1, JM jm, DepositFragmentImpl depositFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = c1621Nn1;
            this.h = depositFragmentImpl;
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
                C0321a c0321a = new C0321a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0321a, this) == mn) {
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
    public DepositFragmentImpl(@NotNull Pa2 urlsProvider, @NotNull Sd2 viewModelFactory, @NotNull EX bindingProvider, @NotNull C6999uY webChromeClient, @NotNull C7630xY webViewClient, @NotNull Ch2 webViewCustomizer, @NotNull InterfaceC2773ah1 preloadedWebViewUseCase, @NotNull C3296d7 onBackPressedProvider) {
        super(bindingProvider, webChromeClient, webViewClient, viewModelFactory, webViewCustomizer, preloadedWebViewUseCase);
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(webChromeClient, "webChromeClient");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(preloadedWebViewUseCase, "preloadedWebViewUseCase");
        Intrinsics.checkNotNullParameter(onBackPressedProvider, "onBackPressedProvider");
        this.x = urlsProvider;
        this.y = viewModelFactory;
        this.z = webViewClient;
        this.A = onBackPressedProvider;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6693t4 c6693t4 = new C6693t4(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7113v4(new JX(this, 0), 3));
        return C2151Ui0.a(this, C2017Sp1.a.b(C6369rY.class), new KX(interfaceC3770fO0A, 0), new LX(interfaceC3770fO0A), c6693t4);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String n() {
        return this.x.i();
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String o() {
        return this.x.z();
    }

    @Override // com.base.feature.platform.screens.deposit.DepositFragmentBase, com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi, com.api.feature.webpage.screen.SimpleWebViewFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C1621Nn1 c1621Nn1 = this.z.i;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, c1621Nn1, null, this), 3);
        Context applicationContext = view.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        K91.a aVar = new K91.a(DepositMadeWorker.class);
        Intrinsics.checkNotNullParameter("DEPOSIT_MADE_WORKER_TAG", "tag");
        aVar.c.add("DEPOSIT_MADE_WORKER_TAG");
        b EMPTY = b.c;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        K91 k91A = aVar.e(EMPTY).a();
        C4736jk2 c4736jk2B = C4736jk2.b(applicationContext);
        EnumC5957pa0 enumC5957pa0 = EnumC5957pa0.d;
        c4736jk2B.getClass();
        c4736jk2B.a("DEPOSIT_MADE_WORKER_TAG", enumC5957pa0, Collections.singletonList(k91A));
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    /* JADX INFO: renamed from: p */
    public final OR getM() {
        return this.z;
    }

    @Override // com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi
    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final C3296d7 getA() {
        return this.A;
    }
}
