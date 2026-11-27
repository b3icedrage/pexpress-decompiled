package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4652jM0 extends AbstractC4394iM0 {

    @NotNull
    public final AbstractC0662Bg1.a<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4652jM0(@NotNull InterfaceC1442Lg1 preferencesRepositoryApi) {
        super(preferencesRepositoryApi);
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepositoryApi");
        this.d = C1052Gg1.d("LAST_APP_VERSION");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.d;
    }
}
