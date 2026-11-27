package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1955Rv extends AbstractC1112Ha1.a {

    @NotNull
    public final byte[] a;

    @Nullable
    public final C4651jM b;

    public C1955Rv(byte[] bytes, C4651jM c4651jM) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.a = bytes;
        this.b = c4651jM;
    }

    @Override // defpackage.AbstractC1112Ha1
    @NotNull
    public final Long a() {
        return Long.valueOf(this.a.length);
    }

    @Override // defpackage.AbstractC1112Ha1
    @Nullable
    public final C4651jM b() {
        return this.b;
    }

    @Override // defpackage.AbstractC1112Ha1.a
    @NotNull
    public final byte[] d() {
        return this.a;
    }
}
