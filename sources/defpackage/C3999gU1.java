package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3999gU1 implements InterfaceC3579eU1 {

    @NotNull
    public final InterfaceC7012ub2 a;

    @NotNull
    public final C6120qK1 b;

    public C3999gU1(@NotNull InterfaceC7012ub2 userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.a = userRepository;
        this.b = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
    }

    @Override // defpackage.InterfaceC3579eU1
    @Nullable
    public final C4733jk c() {
        return new C4733jk(this.b, 2);
    }
}
