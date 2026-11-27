package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ls1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5182ls1 extends AbstractC5395ms1 {
    public final /* synthetic */ CY0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;

    public C5182ls1(CY0 cy0, int i, byte[] bArr) {
        this.a = cy0;
        this.b = i;
        this.c = bArr;
    }

    @Override // defpackage.AbstractC5395ms1
    public final long a() {
        return this.b;
    }

    @Override // defpackage.AbstractC5395ms1
    @Nullable
    public final CY0 b() {
        return this.a;
    }

    @Override // defpackage.AbstractC5395ms1
    public final void c(@NotNull InterfaceC2606Zu sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.w0(this.b, this.c);
    }
}
