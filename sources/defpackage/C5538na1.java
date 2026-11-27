package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: na1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5538na1 extends AbstractC5328ma1 {

    @NotNull
    public final Pa2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5538na1(@NotNull C4923kf appData, @NotNull Pa2 urlsProvider) {
        super(appData);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        this.b = urlsProvider;
    }

    @Override // defpackage.AbstractC5328ma1
    @NotNull
    public final String a() {
        return C5491nL.c("https://", this.b.a());
    }
}
