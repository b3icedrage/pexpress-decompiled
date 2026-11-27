package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.api.feature.analytics.reporters.ReporterApi;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7630xY extends AbstractC7420wY {

    @NotNull
    public final C6120qK1 h;

    @NotNull
    public final C1621Nn1 i;

    /* JADX INFO: renamed from: xY$a */
    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.deposit.webview.DepositWebViewClientImpl$shouldInterceptRequest$1$1", f = "DepositWebViewClientImpl.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C7630xY.this.new a(jm);
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
                C6120qK1 c6120qK1 = C7630xY.this.h;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
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
    public C7630xY(@NotNull Pa2 urlsProvider, @NotNull ReporterApi reporter) {
        super(urlsProvider, reporter);
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.h = c6120qK1G;
        this.i = C4466ii.e(c6120qK1G);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (string = url.toString()) != null && StringsKt.C(string, "high-low", false) && !StringsKt.C(string, "yandex.ru", false)) {
            C5189lv.k(C3286d41.a, null, new a(null), 3);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
