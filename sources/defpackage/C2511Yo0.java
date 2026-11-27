package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2511Yo0 {

    @NotNull
    public final C6102qE1 a;

    @NotNull
    public final InterfaceC5889pD1 b;

    @NotNull
    public final InterfaceC5049lE1 c;

    @NotNull
    public final EK1 d;

    @NotNull
    public final InterfaceC1153Ho0 e;

    public C2511Yo0(@NotNull C6102qE1 sdkContext, @NotNull InterfaceC5889pD1 schedulers, @NotNull InterfaceC5049lE1 sdkApi, @NotNull EK1 storage, @NotNull InterfaceC1153Ho0 historyRepository) {
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(sdkApi, "sdkApi");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        this.a = sdkContext;
        this.b = schedulers;
        this.c = sdkApi;
        this.d = storage;
        this.e = historyRepository;
    }
}
