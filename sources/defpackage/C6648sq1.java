package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6648sq1 {

    @NotNull
    public final C5176lq1 a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final ZT1 c;

    @NotNull
    public final C4612j90 d;

    @NotNull
    public final InterfaceC7012ub2 e;

    public C6648sq1(@NotNull C5176lq1 registerAndLoginParams, @NotNull C4923kf appData, @NotNull ZT1 subIdProvider, @NotNull C4612j90 eventsFlowsProvider, @NotNull InterfaceC7012ub2 userRepository) {
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.a = registerAndLoginParams;
        this.b = appData;
        this.c = subIdProvider;
        this.d = eventsFlowsProvider;
        this.e = userRepository;
    }
}
