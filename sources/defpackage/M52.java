package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class M52 extends L52 {

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M52(@NotNull InterfaceC1442Lg1 prefsRepository) {
        super(prefsRepository);
        Intrinsics.checkNotNullParameter(prefsRepository, "prefsRepository");
        Intrinsics.checkNotNullParameter(prefsRepository, "prefsRepository");
        this.d = C1052Gg1.a("FIRST_START");
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
