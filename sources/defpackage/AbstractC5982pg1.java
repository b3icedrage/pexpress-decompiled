package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5982pg1<InOutEntity, KeyEntity> implements InterfaceC7031ug1<KeyEntity> {

    @NotNull
    public final InterfaceC1442Lg1 a;

    public AbstractC5982pg1(@NotNull InterfaceC1442Lg1 preferencesRepositoryApi) {
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepositoryApi");
        this.a = preferencesRepositoryApi;
    }

    @Nullable
    public final Object j(@NotNull InterfaceC1442Lg1 interfaceC1442Lg1, @NotNull Function1 function1, @NotNull LM lm) {
        return interfaceC1442Lg1.b(this, new C5772og1(function1, null), lm);
    }
}
