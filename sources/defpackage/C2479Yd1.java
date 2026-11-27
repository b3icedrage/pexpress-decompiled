package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2479Yd1 implements InterfaceC2297Wd1 {

    @NotNull
    public final Y71 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final YX c;

    @NotNull
    public final AbstractC5463nB1 d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final InterfaceC5862p6 f;

    @NotNull
    public final C4923kf g;

    public C2479Yd1(@NotNull Y71 navigator, @NotNull InterfaceC3951gE1 screensProvider, @NotNull YX depositScreenStarter, @NotNull AbstractC5463nB1 router, @NotNull ReporterApi reporter, @NotNull InterfaceC5862p6 activationStateProviderApi, @NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = navigator;
        this.b = screensProvider;
        this.c = depositScreenStarter;
        this.d = router;
        this.e = reporter;
        this.f = activationStateProviderApi;
        this.g = appData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r10.a(r2, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r2.c.e(r0) == r1) goto L41;
     */
    @Override // defpackage.InterfaceC2297Wd1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2479Yd1.a(LM):java.lang.Object");
    }
}
