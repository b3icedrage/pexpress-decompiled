package defpackage;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes3.dex */
public final class RR implements PR {

    @NotNull
    public final C1994Si a;

    @Nullable
    public String b;

    @Nullable
    public C2936bP1 c;

    @NotNull
    public final C6381rb1 d;

    @NotNull
    public final C1699On1 e;

    @InterfaceC3368dU(c = "com.impl.feature.platform.usecases.CustomizeDepositWebViewOnLoadUseCaseImpl$addJavaScriptInterfaces$1$1", f = "CustomizeDepositWebViewOnLoadUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ String e;
        public final /* synthetic */ WebView g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, WebView webView, JM<? super a> jm) {
            super(2, jm);
            this.e = str;
            this.g = webView;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return RR.this.new a(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            RR rr = RR.this;
            rr.b = this.e;
            rr.f(this.g);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.impl.feature.platform.usecases.CustomizeDepositWebViewOnLoadUseCaseImpl$addJavaScriptInterfaces$2$1", f = "CustomizeDepositWebViewOnLoadUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return RR.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C6381rb1 c6381rb1 = RR.this.d;
            c6381rb1.a(C6381rb1.a.e, c6381rb1.g);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.impl.feature.platform.usecases.CustomizeDepositWebViewOnLoadUseCaseImpl$addJavaScriptInterfaces$3$1", f = "CustomizeDepositWebViewOnLoadUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return RR.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C6381rb1 c6381rb1 = RR.this.d;
            c6381rb1.a(C6381rb1.a.g, c6381rb1.g);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.impl.feature.platform.usecases.CustomizeDepositWebViewOnLoadUseCaseImpl$insertRecommendedDeposit$1", f = "CustomizeDepositWebViewOnLoadUseCaseImpl.kt", l = {81}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ WebView g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WebView webView, int i, JM<? super d> jm) {
            super(2, jm);
            this.g = webView;
            this.h = i;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return RR.this.new d(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            RR rr = RR.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1994Si c1994Si = rr.a;
                String str = rr.b;
                this.d = 1;
                if (c1994Si.c(this.g, str, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            rr.d.a(C6381rb1.a.h, this.h);
            return Unit.a;
        }
    }

    public RR(@NotNull C1994Si applyDepositScriptUseCase) {
        Intrinsics.checkNotNullParameter(applyDepositScriptUseCase, "applyDepositScriptUseCase");
        this.a = applyDepositScriptUseCase;
        C6381rb1 c6381rb1 = new C6381rb1(C7235vf.a, "Deposit");
        this.d = c6381rb1;
        this.e = c6381rb1.f;
    }

    @Override // defpackage.PR
    public final void a(boolean z) {
        C6381rb1 c6381rb1 = this.d;
        if (c6381rb1.i == z) {
            return;
        }
        c6381rb1.i = z;
        c6381rb1.c();
    }

    @Override // defpackage.PR
    @NotNull
    public final C1699On1 b() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.PR
    @Nullable
    public final Object c(@NotNull WebView webView, @NotNull JM jm) throws Throwable {
        SR sr;
        WebView webView2;
        int i;
        RR rr;
        WebView webView3;
        RR rr2;
        String str;
        Object objNextValue;
        String str2;
        if (jm instanceof SR) {
            sr = (SR) jm;
            int i2 = sr.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sr.j = i2 - Integer.MIN_VALUE;
            } else {
                sr = new SR(this, jm);
            }
        } else {
            sr = new SR(this, jm);
        }
        Object objE = sr.h;
        MN mn = MN.d;
        int i3 = sr.j;
        if (i3 == 0) {
            C1795Pt1.b(objE);
            int i4 = this.d.g;
            sr.d = this;
            sr.e = webView;
            sr.g = i4;
            sr.j = 1;
            Object objB = this.a.b(webView, sr);
            if (objB != mn) {
                webView2 = webView;
                i = i4;
                objE = objB;
                rr = this;
            }
            return mn;
        }
        if (i3 == 1) {
            i = sr.g;
            webView2 = sr.e;
            rr = sr.d;
            C1795Pt1.b(objE);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webView3 = sr.e;
            rr2 = sr.d;
            C1795Pt1.b(objE);
        }
        str = (String) objE;
        if (str == null) {
            str = "";
        }
        objNextValue = new JSONTokener(str).nextValue();
        if (objNextValue instanceof String) {
            str2 = (String) objNextValue;
        } else {
            str2 = null;
        }
        rr2.b = str2;
        rr2.f(webView3);
        return Unit.a;
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        rr.d.a(C6381rb1.a.d, i);
        if (!zBooleanValue) {
            rr.d.a(C6381rb1.a.g, i);
        }
        sr.d = rr;
        sr.e = webView2;
        sr.j = 2;
        objE = LE.e(webView2, "window.ppScriptData?.currency ?? null", sr);
        if (objE != mn) {
            webView3 = webView2;
            rr2 = rr;
            str = (String) objE;
            if (str == null) {
                str = "";
            }
            objNextValue = new JSONTokener(str).nextValue();
            if (objNextValue instanceof String) {
                str2 = (String) objNextValue;
            } else {
                str2 = null;
            }
            rr2.b = str2;
            rr2.f(webView3);
            return Unit.a;
        }
        return mn;
    }

    @Override // defpackage.PR
    public final void d() {
        Set<? extends C6381rb1.a> conditions = CollectionsKt.h0(C6381rb1.a.j);
        C6381rb1 c6381rb1 = this.d;
        c6381rb1.getClass();
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        TimeMark timeMark = c6381rb1.l;
        if (timeMark != null) {
            c6381rb1.j = kotlin.time.b.p(c6381rb1.j, kotlin.time.b.t(timeMark.b()));
        }
        c6381rb1.l = null;
        C2936bP1 c2936bP1 = c6381rb1.k;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        c6381rb1.k = null;
        c6381rb1.g++;
        c6381rb1.h = conditions;
        c6381rb1.j = c6381rb1.c;
        c6381rb1.c();
    }

    @Override // defpackage.PR
    @SuppressLint({"JavascriptInterface"})
    public final void e(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.removeJavascriptInterface("AndroidMessageHandler");
        webView.addJavascriptInterface(new C7209vY(new QR(this, webView), new B5(this, 2), new Q2(this, 4)), "AndroidMessageHandler");
    }

    public final void f(WebView webView) {
        C2936bP1 c2936bP1 = this.c;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        this.c = C5189lv.k(C7235vf.a, null, new d(webView, this.d.g, null), 3);
    }
}
