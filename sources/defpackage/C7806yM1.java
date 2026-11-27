package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7806yM1 extends AbstractC4260hi2 {

    @NotNull
    public final InterfaceC8087zh2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7806yM1(@NotNull C4923kf appData, @NotNull InterfaceC8087zh2 webViewCallbacks) {
        super(appData);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(webViewCallbacks, "webViewCallbacks");
        this.m = webViewCallbacks;
    }
}
