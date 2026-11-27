package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3386da extends C2747ab {
    public final /* synthetic */ C4693ja h;

    public C3386da(C4693ja c4693ja) {
        this.h = c4693ja;
    }

    @Override // defpackage.C2747ab
    public final void j(@NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        C4693ja c4693ja = this.h;
        c4693ja.getClass();
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        C1956Rv0 c1956Rv0 = c4693ja.d().a;
        c1956Rv0.b(new C1252Iv0(c1956Rv0.a().a, deviceId), EnumC2532Yv0.e);
    }
}
