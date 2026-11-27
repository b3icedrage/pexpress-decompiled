package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6753tM {

    @NotNull
    public final C5698oK a;

    @NotNull
    public final InterfaceC1446Li b;

    public C6753tM(@NotNull C5698oK connectionStatusProvider, @NotNull InterfaceC1446Li applicationVersionProviderApi) {
        Intrinsics.checkNotNullParameter(connectionStatusProvider, "connectionStatusProvider");
        Intrinsics.checkNotNullParameter(applicationVersionProviderApi, "applicationVersionProviderApi");
        this.a = connectionStatusProvider;
        this.b = applicationVersionProviderApi;
    }
}
