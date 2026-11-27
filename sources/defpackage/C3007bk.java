package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3007bk extends AbstractC2783ak {

    @NotNull
    public final AbstractC0662Bg1.a<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3007bk(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.d("trading_options_asset");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.d;
    }
}
