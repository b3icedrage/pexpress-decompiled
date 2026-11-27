package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5040lB1 {

    @NotNull
    public final C5450n8 a;

    @NotNull
    public final C4620jB1 b;

    @NotNull
    public final InterfaceC1023Fx c;

    @NotNull
    public final AbstractC7971z80 d;

    @NotNull
    public final List<? extends Proxy> e;
    public int f;

    @NotNull
    public Object g;

    @NotNull
    public final ArrayList h;

    /* JADX INFO: renamed from: lB1$a */
    public static final class a {

        @NotNull
        public final ArrayList a;
        public int b;

        public a(@NotNull ArrayList routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.a = routes;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }
    }

    public C5040lB1(@NotNull C5450n8 address, @NotNull C4620jB1 routeDatabase, @NotNull InterfaceC1023Fx call, @NotNull AbstractC7971z80 eventListener) {
        List<Proxy> listM;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.a = address;
        this.b = routeDatabase;
        this.c = call;
        this.d = eventListener;
        C5653o60 c5653o60 = C5653o60.d;
        this.e = c5653o60;
        this.g = c5653o60;
        this.h = new ArrayList();
        C1318Jr0 c1318Jr0 = address.h;
        eventListener.p(call, c1318Jr0);
        URI uriI = c1318Jr0.i();
        if (uriI.getHost() == null) {
            listM = C6806tc2.m(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = address.g.select(uriI);
            if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                listM = C6806tc2.m(Proxy.NO_PROXY);
            } else {
                Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                listM = C6806tc2.y(proxiesOrNull);
            }
        }
        this.e = listM;
        this.f = 0;
        eventListener.o(call, c1318Jr0, listM);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
