package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: h02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4110h02 extends AbstractC3900g02 {

    @NotNull
    public final AbstractC0662Bg1.a<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4110h02(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.d("ssid");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.d;
    }
}
