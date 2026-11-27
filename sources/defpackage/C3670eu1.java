package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3670eu1 {

    @NotNull
    public final Ki2 a;

    @NotNull
    public final InterfaceC4548iu1 b;

    @NotNull
    public final C5829ox0 c;

    @NotNull
    public final VK1 d;

    @NotNull
    public final C4909kb1 e;

    @NotNull
    public final InterfaceC6312rF f;

    @NotNull
    public final InterfaceC3880fu1 g;

    public C3670eu1(@NotNull Ki2 winCounterProvider, @NotNull InterfaceC4548iu1 openingStateProvider, @NotNull C5829ox0 localExperiment, @NotNull VK1 showDialogUseCase, @NotNull C4909kb1 packageNameProvider, @NotNull InterfaceC6312rF commonCallbacks, @NotNull InterfaceC3880fu1 eventManager) {
        Intrinsics.checkNotNullParameter(winCounterProvider, "winCounterProvider");
        Intrinsics.checkNotNullParameter(openingStateProvider, "openingStateProvider");
        Intrinsics.checkNotNullParameter(localExperiment, "localExperiment");
        Intrinsics.checkNotNullParameter(showDialogUseCase, "showDialogUseCase");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(commonCallbacks, "commonCallbacks");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.a = winCounterProvider;
        this.b = openingStateProvider;
        this.c = localExperiment;
        this.d = showDialogUseCase;
        this.e = packageNameProvider;
        this.f = commonCallbacks;
        this.g = eventManager;
    }
}
