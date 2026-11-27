package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class I32 implements H32 {

    @NotNull
    public final H32.a a;
    public final int b;
    public final boolean c;

    @NotNull
    public final String d;
    public final long e;

    @NotNull
    public final String f;

    public I32(H32.a direction, int i, boolean z, String assetName, long j, String requestId) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.a = direction;
        this.b = i;
        this.c = z;
        this.d = assetName;
        this.e = j;
        this.f = requestId;
    }

    @Override // defpackage.H32
    @NotNull
    public final H32.a a() {
        return this.a;
    }

    @Override // defpackage.H32
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.H32
    public final int e() {
        return this.b;
    }
}
