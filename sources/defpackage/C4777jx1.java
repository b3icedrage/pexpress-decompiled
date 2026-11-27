package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4777jx1 implements InterfaceC7295vw0 {
    @NotNull
    public static String a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return "https://assets.pbotservices.com/images/indicators/indicator-charts/" + path + ".png";
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final C1021Fw0 f() {
        return new C1021Fw0(WE.f(a("unlock"), a("ai_illustration")), null, 2);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final EnumC7035uh1 getPriority() {
        return EnumC7035uh1.h;
    }
}
