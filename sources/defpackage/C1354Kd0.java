package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1354Kd0 extends AbstractC1276Jd0 {

    @NotNull
    public final String d;

    @NotNull
    public final AbstractC0662Bg1.a<String> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354Kd0(@NotNull InterfaceC1442Lg1 preferencesRepositoryApi) {
        super(preferencesRepositoryApi);
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepositoryApi");
        this.d = "";
        this.e = C1052Gg1.d("last_firebase_app_instance_id");
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
