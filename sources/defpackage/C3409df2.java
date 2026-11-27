package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: df2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3409df2 implements InterfaceC3199cf2 {

    @NotNull
    public final Context a;

    @NotNull
    public final ReporterApi b;

    public C3409df2(@NotNull Context context, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = context;
        this.b = reporter;
    }

    @Override // defpackage.InterfaceC3199cf2
    public final void a() {
        ReporterApi.a.b(this.b, EnumC5028l80.D, null, null, 14);
        AM.b(this.a, "free.vpn.unblock.proxy.turbovpn");
    }
}
