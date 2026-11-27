package defpackage;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2879b71 extends AbstractC1870Qs1 {

    @NotNull
    public final AbstractC1841Qj e;

    @NotNull
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2879b71(@NotNull Activity activity, @NotNull AbstractC1841Qj prefsUseCase) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(prefsUseCase, "prefsUseCase");
        this.e = prefsUseCase;
        this.g = "android.permission.POST_NOTIFICATIONS";
    }

    @Override // defpackage.InterfaceC1555Ms1
    @NotNull
    public final String a() {
        return this.g;
    }

    @Override // defpackage.AbstractC1870Qs1
    public final AbstractC8082zg1 b() {
        return this.e;
    }
}
