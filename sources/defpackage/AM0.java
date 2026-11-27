package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AM0 extends AbstractC8015zM0 {

    @NotNull
    public final AbstractC0662Bg1.a<Long> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AM0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.c("last_session_start_time_millis_key");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Long> getKey() {
        return this.d;
    }
}
