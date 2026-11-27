package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5551nd2 extends AbstractC5341md2 {

    @NotNull
    public final AbstractC0662Bg1.a<Integer> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5551nd2(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.b("verification_open_counter_key");
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
