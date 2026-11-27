package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ks1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4972ks1 extends AbstractC5395ms1 {
    public final /* synthetic */ CY0 a;
    public final /* synthetic */ C1802Pw b;

    public C4972ks1(CY0 cy0, C1802Pw c1802Pw) {
        this.a = cy0;
        this.b = c1802Pw;
    }

    @Override // defpackage.AbstractC5395ms1
    public final long a() {
        return this.b.f();
    }

    @Override // defpackage.AbstractC5395ms1
    @Nullable
    public final CY0 b() {
        return this.a;
    }

    @Override // defpackage.AbstractC5395ms1
    public final void c(@NotNull InterfaceC2606Zu sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.q1(this.b);
    }
}
