package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5258mD0 extends AbstractC5045lD0 {

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5258mD0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.e = C1052Gg1.a("is_shown");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Boolean> getKey() {
        return this.e;
    }

    @Override // defpackage.AbstractC8082zg1
    public final /* bridge */ /* synthetic */ Boolean k() {
        return Boolean.FALSE;
    }
}
