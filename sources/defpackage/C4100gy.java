package defpackage;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4100gy extends AbstractC1870Qs1 implements InterfaceC3890fy {

    @NotNull
    public final AbstractC1607Nj e;

    @NotNull
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4100gy(@NotNull Activity activity, @NotNull AbstractC1607Nj prefsUseCase) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(prefsUseCase, "prefsUseCase");
        this.e = prefsUseCase;
        this.g = "android.permission.CAMERA";
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
