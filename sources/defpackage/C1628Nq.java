package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1628Nq implements InterfaceC1547Mq {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final ReporterApi c;

    @NotNull
    public final Context d;

    @NotNull
    public final Pa2 e;

    public C1628Nq(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull ReporterApi reporter, @NotNull Context context, @NotNull Pa2 urlsProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        this.a = router;
        this.b = screensProvider;
        this.c = reporter;
        this.d = context;
        this.e = urlsProvider;
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void a() {
        this.a.c(this.b.b(), false);
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void c() {
        this.a.c(this.b.s(), false);
        ReporterApi.a.b(this.c, EnumC5028l80.C, null, null, 14);
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void d() {
        this.a.c(this.b.q(), false);
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void e() {
        this.d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.e.A())));
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void g() {
        this.a.c(this.b.A(), false);
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void j() {
        this.a.c(this.b.i(), false);
    }
}
