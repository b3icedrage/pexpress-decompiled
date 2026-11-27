package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: h41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4125h41 extends NK<C3705f41> {

    @NotNull
    public final ConnectivityManager f;

    @NotNull
    public final C3915g41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4125h41(@NotNull Context context, @NotNull C4946kk2 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.b.getSystemService("connectivity");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.g = new C3915g41(this);
    }

    @Override // defpackage.NK
    public final C3705f41 a() {
        return C4335i41.a(this.f);
    }

    @Override // defpackage.NK
    public final void d() {
        try {
            AS0 as0C = AS0.c();
            String str = C4335i41.a;
            as0C.getClass();
            C4799k31.a(this.f, this.g);
        } catch (IllegalArgumentException e) {
            AS0.c().b(C4335i41.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            AS0.c().b(C4335i41.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.NK
    public final void e() {
        try {
            AS0 as0C = AS0.c();
            String str = C4335i41.a;
            as0C.getClass();
            C4331i31.c(this.f, this.g);
        } catch (IllegalArgumentException e) {
            AS0.c().b(C4335i41.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            AS0.c().b(C4335i41.a, "Received exception while unregistering network callback", e2);
        }
    }
}
