package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PR1 extends AbstractC7066uq {

    @NotNull
    public final JR1 e;

    @NotNull
    public final InterfaceC6350rR1 f;

    @NotNull
    public final ReporterApi g;

    @NotNull
    public final MR1 h;

    @NotNull
    public final InterfaceC6396rf0<List<C3496e42>> i;
    public final boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PR1(@NotNull JR1 callbacks, @NotNull InterfaceC4878kR1 strategiesProvider, @NotNull InterfaceC6350rR1 strategyInstructionSelectionProvider, @NotNull ReporterApi reporter, @NotNull RR1 strategyShowDetails, @NotNull MR1 strategySelectionUseCase) {
        super(callbacks);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(strategiesProvider, "strategiesProvider");
        Intrinsics.checkNotNullParameter(strategyInstructionSelectionProvider, "strategyInstructionSelectionProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(strategyShowDetails, "strategyShowDetails");
        Intrinsics.checkNotNullParameter(strategySelectionUseCase, "strategySelectionUseCase");
        this.e = callbacks;
        this.f = strategyInstructionSelectionProvider;
        this.g = reporter;
        this.h = strategySelectionUseCase;
        this.i = strategiesProvider.b();
        this.j = strategyShowDetails.o();
        ReporterApi.a.b(reporter, EnumC5028l80.P0, new LR1(), null, 12);
    }
}
