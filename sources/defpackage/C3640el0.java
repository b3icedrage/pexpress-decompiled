package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: el0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3640el0 implements InterfaceC3431dl0 {

    @NotNull
    public final InterfaceC7012ub2 a;

    public C3640el0(@NotNull C4923kf appDataRepository, @NotNull InterfaceC7012ub2 userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = userRepository;
    }
}
