package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Be1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0656Be1 extends AbstractC0578Ae1 {

    @NotNull
    public final AbstractC0662Bg1.a<Long> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656Be1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.c("PLATFORM_ID");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Long> getKey() {
        return this.d;
    }
}
