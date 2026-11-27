package defpackage;

import android.webkit.WebView;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Pj2 extends Oj2 {

    @NotNull
    public final H21 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pj2(@NotNull Pa2 urlsProvider, @NotNull ReporterApi reporter, @NotNull H21 navigateToDepositCallback) {
        super(urlsProvider, reporter);
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(navigateToDepositCallback, "navigateToDepositCallback");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.h = navigateToDepositCallback;
    }

    @Override // defpackage.AbstractC4165hG, defpackage.OR, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        if (str == null || !StringsKt.C(str, "cashier", false) || StringsKt.C(str, "withdraw", false) || StringsKt.C(str, "country", false)) {
            super.doUpdateVisitedHistory(webView, str, z);
        } else {
            this.h.a();
        }
    }
}
