package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class S5 extends C7576xG {

    @NotNull
    public final K5 d;

    @NotNull
    public final VQ1 e;

    @NotNull
    public final InterfaceC2718aR1 f;

    @NotNull
    public final InterfaceC6396rf0<List<C0615Ar>> g;

    public S5(@NotNull K5 callbacks, @NotNull VQ1 storiesProvider, @NotNull InterfaceC2718aR1 storiesRepository) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(storiesProvider, "storiesProvider");
        Intrinsics.checkNotNullParameter(storiesRepository, "storiesRepository");
        this.d = callbacks;
        this.e = storiesProvider;
        this.f = storiesRepository;
        this.g = storiesRepository.b();
    }
}
