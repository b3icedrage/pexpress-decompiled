package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5260mE extends AbstractC7452wg1<Long> {

    @NotNull
    public final AbstractC0662Bg1.a<Long> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5260mE(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.c("time_when_review_dialog_close");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Long> getKey() {
        return this.d;
    }
}
