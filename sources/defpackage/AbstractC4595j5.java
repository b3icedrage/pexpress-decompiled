package defpackage;

import android.webkit.WebView;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4595j5 extends OR {

    @NotNull
    public final Pa2 e;

    @Nullable
    public N4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4595j5(@NotNull Pa2 urlsProvider, @NotNull ReporterApi reporter) {
        super(reporter);
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.e = urlsProvider;
    }

    @Override // defpackage.OR, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        N4 n4;
        super.doUpdateVisitedHistory(webView, str, z);
        String tradingPath = this.e.f();
        boolean zH = false;
        boolean z2 = this.f != null;
        Intrinsics.checkNotNullParameter(tradingPath, "tradingPath");
        if (z2 && tradingPath.length() != 0 && str != null && !str.equals("about:blank")) {
            zH = d.h(StringsKt.e0(StringsKt.X(StringsKt.X(str, '?'), '#'), '/'), tradingPath, false);
        }
        if (!zH || (n4 = this.f) == null) {
            return;
        }
        n4.invoke();
    }
}
