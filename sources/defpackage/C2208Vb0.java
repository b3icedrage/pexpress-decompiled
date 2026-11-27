package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2208Vb0 implements InterfaceC2130Ub0 {

    @NotNull
    public final InterfaceC3951gE1 a;

    public C2208Vb0(@NotNull AbstractC5463nB1 router, @NotNull InterfaceC3951gE1 screensProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        this.a = screensProvider;
    }

    @Override // defpackage.InterfaceC2130Ub0
    public final void a(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
    }
}
