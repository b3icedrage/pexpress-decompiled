package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class R01 {

    @NotNull
    public final List<T01> a;

    @NotNull
    public final C6702t60 b;

    @NotNull
    public final C5653o60 c;

    public R01(@NotNull List allDependencies, @NotNull C6702t60 modulesWhoseInternalsAreVisible, @NotNull C5653o60 directExpectedByDependencies, @NotNull C6702t60 allExpectedByDependencies) {
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.a = allDependencies;
        this.b = modulesWhoseInternalsAreVisible;
        this.c = directExpectedByDependencies;
    }
}
