package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: aM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2702aM0 extends ZL0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2702aM0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return C1052Gg1.d("APP_LANGUAGE_KEY");
    }

    @Override // defpackage.AbstractC8082zg1
    public final /* bridge */ /* synthetic */ String k() {
        return "en";
    }
}
