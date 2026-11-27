package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4157hD0 extends AbstractC3947gD0 {

    @NotNull
    public final String e;

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4157hD0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.e = "is_amplitude_enabled";
        this.f = C1052Gg1.a("is_amplitude_enabled");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Boolean> getKey() {
        return this.f;
    }

    @Override // defpackage.AbstractC8082zg1
    public final /* bridge */ /* synthetic */ Boolean k() {
        return Boolean.FALSE;
    }
}
