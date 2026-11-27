package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2277Vy0 extends AbstractC2199Uy0 {

    @NotNull
    public final String d;

    @NotNull
    public final AbstractC0662Bg1.a<String> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277Vy0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = "close_price";
        this.e = C1052Gg1.d("INDICATOR_KEY");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<String> getKey() {
        return this.e;
    }

    @Override // defpackage.AbstractC8082zg1
    public final String k() {
        return this.d;
    }
}
