package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5678oD0 extends AbstractC5468nD0 {
    public final boolean d;

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5678oD0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = true;
        this.e = C1052Gg1.a("stub_is_shown");
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
