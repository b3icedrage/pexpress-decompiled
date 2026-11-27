package defpackage;

import android.webkit.WebView;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4165hG extends OR {

    @NotNull
    public final Pa2 e;

    @NotNull
    public final C6120qK1 f;

    @NotNull
    public final C1621Nn1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4165hG(@NotNull Pa2 urlsProvider, @NotNull ReporterApi reporter) {
        super(reporter);
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.e = urlsProvider;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.f = c6120qK1G;
        this.g = C4466ii.e(c6120qK1G);
    }

    @Override // defpackage.OR, android.webkit.WebViewClient
    public void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        if (str == null || !StringsKt.C(str, "/verification", false)) {
            return;
        }
        C5189lv.k(C3784fT.a, null, new C3955gG(this, null), 3);
    }
}
