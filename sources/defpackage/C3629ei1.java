package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ei1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3629ei1 implements InterfaceC7295vw0 {

    @NotNull
    public final InterfaceC3431dl0 a;

    public C3629ei1(@NotNull InterfaceC3431dl0 getCurrentAvatarUrlUseCase) {
        Intrinsics.checkNotNullParameter(getCurrentAvatarUrlUseCase, "getCurrentAvatarUrlUseCase");
        this.a = getCurrentAvatarUrlUseCase;
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final EnumC7035uh1 getPriority() {
        return EnumC7035uh1.h;
    }
}
