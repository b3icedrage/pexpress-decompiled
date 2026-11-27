package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3745fG extends C7806yM1 {

    @NotNull
    public final Q21 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3745fG(@NotNull C4923kf appDataRepository, @NotNull InterfaceC8087zh2 webViewCallbacks, @NotNull Q21 callback) {
        super(appDataRepository, webViewCallbacks);
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(webViewCallbacks, "webViewCallbacks");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.n = callback;
    }
}
