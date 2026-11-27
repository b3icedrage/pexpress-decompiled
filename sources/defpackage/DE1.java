package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DE1 extends CE1 {

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DE1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.a("SELECTED_ACCOUNT_SCREEN_PASSED");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Boolean> getKey() {
        return this.d;
    }

    @Override // defpackage.AbstractC8082zg1
    public final /* bridge */ /* synthetic */ Boolean k() {
        return Boolean.FALSE;
    }
}
