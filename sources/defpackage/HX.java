package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class HX extends GX {

    @NotNull
    public final AbstractC0662Bg1.a<Integer> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HX(@NotNull InterfaceC1442Lg1 preferencesRepositoryApi) {
        super(preferencesRepositoryApi);
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepositoryApi");
        this.d = C1052Gg1.b("deposit_counter_key");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Integer> getKey() {
        return this.d;
    }

    @Override // defpackage.AbstractC8082zg1
    public final /* bridge */ /* synthetic */ Integer k() {
        return 0;
    }
}
