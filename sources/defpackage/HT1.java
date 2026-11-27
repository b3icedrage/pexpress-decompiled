package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HT1 implements GT1 {

    @NotNull
    public final InterfaceC3951gE1 a;

    @NotNull
    public final C5253mB1 b;

    @NotNull
    public final Context c;

    public HT1(@NotNull Context context, @NotNull InterfaceC3951gE1 screensProvider, @NotNull C5253mB1 router) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        this.a = screensProvider;
        this.b = router;
        this.c = context;
    }

    @Override // defpackage.GT1
    public final void a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://blog.iqoption.com/"));
        intent.setFlags(268435456);
        Context context = this.c;
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return;
        }
        context.startActivity(intent);
    }

    @Override // defpackage.GT1
    public final void b() {
        this.b.e(this.a.z());
    }
}
