package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5530nY implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC3185cc0 b;

    @NotNull
    public final V11 c;

    @Nullable
    public volatile C2936bP1 d;

    @Nullable
    public volatile Long e;

    public C5530nY(@NotNull C4923kf appDataRepository, @NotNull InterfaceC3185cc0 fetchDepositValuesUseCase, @NotNull V11 depositValuesProvider) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(fetchDepositValuesUseCase, "fetchDepositValuesUseCase");
        Intrinsics.checkNotNullParameter(depositValuesProvider, "depositValuesProvider");
        this.a = appDataRepository;
        this.b = fetchDepositValuesUseCase;
        this.c = depositValuesProvider;
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
        this.d = C5189lv.k(C3784fT.a, C6266r20.a, new C4687jY(this, null), 2);
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
