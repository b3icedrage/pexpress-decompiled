package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Le0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1435Le0 extends AbstractC1357Ke0 {
    public final boolean e;

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435Le0(@NotNull InterfaceC1442Lg1 prefsRepository) {
        super(prefsRepository);
        Intrinsics.checkNotNullParameter(prefsRepository, "prefsRepository");
        Intrinsics.checkNotNullParameter(prefsRepository, "prefsRepository");
        this.e = true;
        this.f = C1052Gg1.a("launch_first_start");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Boolean> getKey() {
        return this.f;
    }

    @Override // defpackage.AbstractC8082zg1
    public final Boolean k() {
        return Boolean.valueOf(this.e);
    }
}
