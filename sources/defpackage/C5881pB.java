package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5881pB extends C7576xG {

    @NotNull
    public final ReporterApi d;

    @NotNull
    public final AbstractC2903bE1 e;

    public C5881pB(@NotNull ReporterApi reporter, @NotNull AbstractC2903bE1 screenToChatTransitionProvider) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(screenToChatTransitionProvider, "screenToChatTransitionProvider");
        this.d = reporter;
        this.e = screenToChatTransitionProvider;
        C5189lv.k(C8056za.j(this), null, new C5671oB(this, null), 3);
    }
}
