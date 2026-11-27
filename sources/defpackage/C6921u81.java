package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: u81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6921u81 {
    public final C6711t81 a;
    public final InterfaceC0776Cs1 b;

    public C6921u81(@NotNull C6711t81 okHttpClient, @NotNull InterfaceC0776Cs1 requestFactory) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        this.a = okHttpClient;
        this.b = requestFactory;
    }
}
