package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ai2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2778ai2 {

    @NotNull
    public final C3296d7 a;

    @NotNull
    public final Function0<Unit> b;

    @NotNull
    public final Function0<WebView> c;

    @NotNull
    public final C1449Lj d;

    /* JADX WARN: Multi-variable type inference failed */
    public C2778ai2(@NotNull C3296d7 provider, @NotNull Function0<Unit> leave, @NotNull Function0<? extends WebView> webView) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(leave, "leave");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = provider;
        this.b = leave;
        this.c = webView;
        this.d = new C1449Lj(this, 7);
    }

    public final void a() {
        C3296d7 c3296d7 = this.a;
        if (c3296d7.a == this.d) {
            c3296d7.a = null;
        }
    }
}
