package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class CI implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC5482nI b;

    @NotNull
    public final AbstractC5045lD0 c;

    @Nullable
    public volatile C2936bP1 d;

    @Nullable
    public volatile FF e;

    public CI(@NotNull C4923kf appDataRepository, @NotNull InterfaceC5482nI configEventsProvider, @NotNull AbstractC5045lD0 isShowUseCase) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(configEventsProvider, "configEventsProvider");
        Intrinsics.checkNotNullParameter(isShowUseCase, "isShowUseCase");
        this.a = appDataRepository;
        this.b = configEventsProvider;
        this.c = isShowUseCase;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    @Override // defpackage.InterfaceC0735Cf
    @Nullable
    public final Object b(@NotNull LM lm) {
        C2936bP1 c2936bP1 = this.d;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        this.d = C5189lv.k(C7235vf.a, C6266r20.a, new BI(this, null), 2);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
        C2936bP1 c2936bP1 = this.d;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
    }
}
