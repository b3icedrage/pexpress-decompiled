package com.api.feature.webpage.screen;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.o;
import com.api.core.ViewModelFragment;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.AW1;
import defpackage.AbstractC4260hi2;
import defpackage.C1621Nn1;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C5189lv;
import defpackage.C6609sg;
import defpackage.C7652xe;
import defpackage.Ch2;
import defpackage.FP0;
import defpackage.FP1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC5910pK1;
import defpackage.InterfaceC6606sf0;
import defpackage.InterfaceC7877yh2;
import defpackage.JM;
import defpackage.KN;
import defpackage.KR;
import defpackage.MN;
import defpackage.OR;
import defpackage.Vh2;
import defpackage.ViewOnClickListenerC6214qm;
import defpackage.Wh2;
import defpackage.Xh2;
import defpackage.ZD1;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/feature/webpage/screen/WebViewFragment;", "Lhi2;", "VM", "Lcom/api/core/ViewModelFragment;", "FeatureWebPageInAppApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WebViewFragment<VM extends AbstractC4260hi2> extends ViewModelFragment<VM> {

    @NotNull
    public final InterfaceC7877yh2 j;

    @NotNull
    public final Ch2 k;

    @NotNull
    public final KR l;

    @NotNull
    public final OR m;
    public final boolean n;

    @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$1", f = "WebViewFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ WebViewFragment h;

        /* JADX INFO: renamed from: com.api.feature.webpage.screen.WebViewFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$1$1", f = "WebViewFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0267a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC5910pK1 g;
            public final /* synthetic */ WebViewFragment h;

            /* JADX INFO: renamed from: com.api.feature.webpage.screen.WebViewFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0268a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ WebViewFragment e;

                public C0268a(KN kn, WebViewFragment webViewFragment) {
                    this.e = webViewFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    this.e.w(true);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0267a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, WebViewFragment webViewFragment) {
                super(2, jm);
                this.g = interfaceC5910pK1;
                this.h = webViewFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0267a c0267a = new C0267a(this.g, jm, this.h);
                c0267a.e = obj;
                return c0267a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0267a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0268a c0268a = new C0268a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0268a, this) == mn) {
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
        public a(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, WebViewFragment webViewFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC5910pK1;
            this.h = webViewFragment;
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
                C0267a c0267a = new C0267a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.g, c0267a, this) == mn) {
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

    @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$2", f = "WebViewFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ WebViewFragment h;

        @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$2$1", f = "WebViewFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ FP1 g;
            public final /* synthetic */ WebViewFragment h;

            /* JADX INFO: renamed from: com.api.feature.webpage.screen.WebViewFragment$b$a$a, reason: collision with other inner class name */
            public static final class C0269a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ WebViewFragment e;

                public C0269a(KN kn, WebViewFragment webViewFragment) {
                    this.e = webViewFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    try {
                        this.e.l(((Boolean) obj).booleanValue());
                    } catch (NullPointerException unused) {
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FP1 fp1, JM jm, WebViewFragment webViewFragment) {
                super(2, jm);
                this.g = fp1;
                this.h = webViewFragment;
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
                    C0269a c0269a = new C0269a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0269a, this) == mn) {
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
        public b(FP0 fp0, FP1 fp1, JM jm, WebViewFragment webViewFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = fp1;
            this.h = webViewFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, this.g, jm, this.h);
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
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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

    @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$3", f = "WebViewFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ WebViewFragment h;

        @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$3$1", f = "WebViewFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC5910pK1 g;
            public final /* synthetic */ WebViewFragment h;

            /* JADX INFO: renamed from: com.api.feature.webpage.screen.WebViewFragment$c$a$a, reason: collision with other inner class name */
            public static final class C0270a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ WebViewFragment e;

                public C0270a(KN kn, WebViewFragment webViewFragment) {
                    this.e = webViewFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    WebViewFragment webViewFragment = this.e;
                    webViewFragment.j.f();
                    webViewFragment.getClass();
                    Unit unit = Unit.a;
                    MN mn = MN.d;
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, WebViewFragment webViewFragment) {
                super(2, jm);
                this.g = interfaceC5910pK1;
                this.h = webViewFragment;
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
                    C0270a c0270a = new C0270a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0270a, this) == mn) {
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
        public c(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, WebViewFragment webViewFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC5910pK1;
            this.h = webViewFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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

    @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$4", f = "WebViewFragment.kt", l = {48}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ WebViewFragment h;

        @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$initLiveData$$inlined$launchAndCollectIn$4$1", f = "WebViewFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC5910pK1 g;
            public final /* synthetic */ WebViewFragment h;

            /* JADX INFO: renamed from: com.api.feature.webpage.screen.WebViewFragment$d$a$a, reason: collision with other inner class name */
            public static final class C0271a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ WebViewFragment e;

                public C0271a(KN kn, WebViewFragment webViewFragment) {
                    this.e = webViewFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    WebViewFragment webViewFragment = this.e;
                    Object objV = webViewFragment.v(webViewFragment.j.f(), jm);
                    return objV == MN.d ? objV : Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, WebViewFragment webViewFragment) {
                super(2, jm);
                this.g = interfaceC5910pK1;
                this.h = webViewFragment;
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
                    C0271a c0271a = new C0271a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0271a, this) == mn) {
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
        public d(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, WebViewFragment webViewFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC5910pK1;
            this.h = webViewFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new d(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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

    @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$load$1", f = "WebViewFragment.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ WebViewFragment<VM> e;
        public final /* synthetic */ boolean g;

        @InterfaceC3368dU(c = "com.api.feature.webpage.screen.WebViewFragment$load$1$1", f = "WebViewFragment.kt", l = {}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public final /* synthetic */ WebViewFragment<VM> d;
            public final /* synthetic */ boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WebViewFragment<VM> webViewFragment, boolean z, JM<? super a> jm) {
                super(2, jm);
                this.d = webViewFragment;
                this.e = z;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.d, this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                WebView webView;
                MN mn = MN.d;
                C1795Pt1.b(obj);
                WebViewFragment<VM> webViewFragment = this.d;
                WebView webViewF = webViewFragment.j.f();
                if (webViewF != null) {
                    webViewFragment.k.c(webViewF, webViewFragment.n());
                }
                if (webViewFragment.getU() && (webView = webViewFragment.j.f()) != null) {
                    WeakHashMap<WebView, String> weakHashMap = ZD1.a;
                    String url = webViewFragment.o();
                    Intrinsics.checkNotNullParameter(webView, "webView");
                    Intrinsics.checkNotNullParameter(url, "url");
                    WeakHashMap<WebView, String> weakHashMap2 = ZD1.a;
                    synchronized (weakHashMap2) {
                        weakHashMap2.put(webView, url);
                        Unit unit = Unit.a;
                    }
                }
                WebView webViewF2 = webViewFragment.j.f();
                if (!Intrinsics.a(webViewF2 != null ? webViewF2.getUrl() : null, webViewFragment.o()) || this.e) {
                    WebView webViewF3 = webViewFragment.j.f();
                    if (webViewF3 != null) {
                        webViewF3.loadUrl(webViewFragment.o());
                    }
                } else {
                    WebView webViewF4 = webViewFragment.j.f();
                    if (webViewF4 != null) {
                        webViewF4.reload();
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebViewFragment<VM> webViewFragment, boolean z, JM<? super e> jm) {
            super(2, jm);
            this.e = webViewFragment;
            this.g = z;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new e(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                WebViewFragment<VM> webViewFragment = this.e;
                a aVar = new a(webViewFragment, this.g, null);
                this.d = 1;
                if (o.a(webViewFragment.getLifecycle(), g.b.i, aVar, this) == mn) {
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
    public WebViewFragment(@NotNull InterfaceC7877yh2 bindingProvider, @NotNull Ch2 webViewCustomizer, @NotNull KR customWebChromeClient, @NotNull OR webViewClient) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        this.j = bindingProvider;
        this.k = webViewCustomizer;
        this.l = customWebChromeClient;
        this.m = webViewClient;
        this.n = true;
    }

    public static /* synthetic */ void u(WebViewFragment webViewFragment, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        webViewFragment.t(z, false);
    }

    public void l(boolean z) {
        InterfaceC7877yh2 interfaceC7877yh2 = this.j;
        interfaceC7877yh2.a0().setVisibility(z ? 0 : 8);
        WebView webViewF = interfaceC7877yh2.f();
        if (webViewF != null) {
            webViewF.setVisibility(z ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getN() {
        return this.n;
    }

    @NotNull
    public String n() {
        return o();
    }

    @NotNull
    public abstract String o();

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public OR getM() {
        return this.m;
    }

    public void q() {
        KR kr = this.l;
        C1699On1 c1699On1 = kr.c;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new Vh2(viewLifecycleOwner, c1699On1, null, this), 3);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new Wh2(viewLifecycleOwner2, kr.e, null, this), 3);
        if (getN()) {
            FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new Xh2(viewLifecycleOwner3, kr.g, null, this), 3);
        }
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1621Nn1 c1621Nn1 = ((AbstractC4260hi2) obj).h;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new a(viewLifecycleOwner4, c1621Nn1, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On2 = ((AbstractC4260hi2) obj2).f;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new b(viewLifecycleOwner5, c1699On2, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1621Nn1 c1621Nn2 = ((AbstractC4260hi2) obj3).j;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new c(viewLifecycleOwner6, c1621Nn2, null, this), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C1621Nn1 c1621Nn3 = ((AbstractC4260hi2) obj4).l;
        FP0 viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner7), null, new d(viewLifecycleOwner7, c1621Nn3, null, this), 3);
    }

    @Nullable
    public final void r() {
        WebView webViewF;
        int i = 2;
        boolean zS = getU();
        InterfaceC7877yh2 interfaceC7877yh2 = this.j;
        if (!zS && (webViewF = interfaceC7877yh2.f()) != null) {
            this.k.a(webViewF, getM(), this.l);
        }
        OR m = getM();
        C6609sg action = new C6609sg(this, i);
        m.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        m.b = action;
        View viewY = interfaceC7877yh2.Y();
        if (viewY != null) {
            viewY.setOnClickListener(new ViewOnClickListenerC6214qm(this, i));
            Unit unit = Unit.a;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean getU() {
        return false;
    }

    public final void t(boolean z, boolean z2) {
        if (!getU() || z) {
            FP0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new e(this, z2, null), 3);
        }
    }

    @Nullable
    public Object v(@Nullable WebView webView, @NotNull JM<? super Unit> jm) {
        return Unit.a;
    }

    public final void w(boolean z) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        InterfaceC7877yh2 interfaceC7877yh2 = this.j;
        interfaceC7877yh2.F(context);
        WebView webViewF = interfaceC7877yh2.f();
        if (webViewF != null) {
            this.k.a(webViewF, getM(), this.l);
        }
        u(this, z, 2);
    }
}
