package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5102lW0 extends AbstractC4892kW0 {
    public final boolean d;

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5102lW0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = true;
        this.e = C1052Gg1.a("MANUAL_TRADING_ASSET_SELECTION_ENABLED");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Boolean> getKey() {
        return this.e;
    }

    @Override // defpackage.AbstractC8082zg1
    public final Boolean k() {
        return Boolean.valueOf(this.d);
    }
}
