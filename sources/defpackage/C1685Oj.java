package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1685Oj extends AbstractC1607Nj {

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1685Oj(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1052Gg1.a("ASKED_FOR_CAMERA_PERMISSION");
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
