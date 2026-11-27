package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class K80 {

    @NotNull
    public final C3595ea a;

    @NotNull
    public final C2030Su b;

    @NotNull
    public final C2030Su c;

    @NotNull
    public final AtomicInteger d;

    @NotNull
    public final C2094Tp0 e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    @NotNull
    public final AtomicInteger j;
    public boolean k;

    @NotNull
    public final InterfaceC1403Kt1 l;

    public K80(@NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        this.a = amplitude;
        this.d = new AtomicInteger(0);
        MI mi = amplitude.a;
        this.e = new C2094Tp0(mi);
        this.f = mi.c;
        this.g = mi.b;
        this.j = new AtomicInteger(1);
        this.h = false;
        this.i = false;
        this.b = C2889bA.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 6, null);
        this.c = C2889bA.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 6, null);
        Runtime.getRuntime().addShutdownHook(new G80(this));
        this.l = amplitude.g().g(this, mi, amplitude.c, amplitude.g);
    }

    public final void a(@NotNull C0612Aq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.M++;
        this.b.n(new C4272hl2(EnumC4481il2.d, event));
    }
}
