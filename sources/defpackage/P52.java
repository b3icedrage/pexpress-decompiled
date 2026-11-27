package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class P52 extends C7576xG {

    @NotNull
    public final InterfaceC7541x52 d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final L52 f;

    @NotNull
    public final List<G52> g;

    @NotNull
    public final GP1 h;

    public P52(@NotNull InterfaceC7541x52 tutorialCallback, @NotNull B52 tutorialData, @NotNull ReporterApi reporter, @NotNull L52 tutorialPassedValueUseCaseApi) {
        Intrinsics.checkNotNullParameter(tutorialCallback, "tutorialCallback");
        Intrinsics.checkNotNullParameter(tutorialData, "tutorialData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(tutorialPassedValueUseCaseApi, "tutorialPassedValueUseCaseApi");
        this.d = tutorialCallback;
        this.e = reporter;
        this.f = tutorialPassedValueUseCaseApi;
        this.g = tutorialData.a;
        this.h = C1589Ne.i(0);
    }
}
