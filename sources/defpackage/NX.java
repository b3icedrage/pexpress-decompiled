package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NX {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final AbstractC3104cC b;

    public NX(@NotNull C4923kf appData, @NotNull AbstractC3104cC ciSessionProvider) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(ciSessionProvider, "ciSessionProvider");
        this.a = appData;
        this.b = ciSessionProvider;
    }
}
