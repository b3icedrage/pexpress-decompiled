package defpackage;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4247hf1 {

    @NotNull
    public final C4 a;

    public C4247hf1(@NotNull C4 onDemoBalanceChanged) {
        Intrinsics.checkNotNullParameter(onDemoBalanceChanged, "onDemoBalanceChanged");
        this.a = onDemoBalanceChanged;
    }

    @JavascriptInterface
    public final void demoBalanceChanged() {
        this.a.invoke();
    }
}
