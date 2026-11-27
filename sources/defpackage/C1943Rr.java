package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1943Rr extends AbstractC1787Pr {

    @NotNull
    public final InterfaceC1442Lg1 c;

    @NotNull
    public final AbstractC0662Bg1.a<Integer> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1943Rr(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.c = preferencesRepository;
        this.d = C1052Gg1.b("trading_options_time_in_seconds");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Integer> getKey() {
        return this.d;
    }
}
