package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7238vf2 {

    @NotNull
    public final C7250vi2 a;

    @NotNull
    public final C3528eD1 b;

    @Nullable
    public volatile C3109cD1 c;

    @Nullable
    public volatile String d;

    @NotNull
    public final C7028uf2 e;

    @NotNull
    public final DG f;

    @NotNull
    public final Object g;

    @NotNull
    public final Object h;

    public C7238vf2(@NotNull C7250vi2 interceptor, @NotNull C3528eD1 messageAdapterFactoryProvider) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(messageAdapterFactoryProvider, "messageAdapterFactoryProvider");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(messageAdapterFactoryProvider, "messageAdapterFactoryProvider");
        this.a = interceptor;
        this.b = messageAdapterFactoryProvider;
        this.e = new C7028uf2(this);
        this.f = C6561sS.e();
        this.g = new Object();
        this.h = XO0.a(EnumC4403iP0.d, new C1449Lj(this, 5));
    }
}
