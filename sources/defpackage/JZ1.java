package defpackage;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class JZ1 {

    @NotNull
    public final Object a = PW0.e(new Pair(InterfaceC5978pf1.a.d, new DY0(new ArrayList())), new Pair(InterfaceC5978pf1.a.e, new DY0(new ArrayList())), new Pair(InterfaceC5978pf1.a.g, new DY0(new ArrayList())), new Pair(InterfaceC5978pf1.a.h, new DY0(new ArrayList())));
    public C3595ea b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final void a(@NotNull InterfaceC5978pf1 plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        plugin.a(c());
        DY0 dy0 = (DY0) this.a.get(plugin.getType());
        if (dy0 != null) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            synchronized (dy0.a) {
                dy0.a.add(plugin);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Nullable
    public final C0612Aq b(@NotNull InterfaceC5978pf1.a type, @Nullable C0612Aq event) {
        Intrinsics.checkNotNullParameter(type, "type");
        DY0 dy0 = (DY0) this.a.get(type);
        if (event == null) {
            return event;
        }
        if (dy0 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (dy0.a) {
            for (InterfaceC5978pf1 interfaceC5978pf1 : dy0.a) {
                if (event != null) {
                    if (interfaceC5978pf1 instanceof AbstractC4108h00) {
                        try {
                            ((AbstractC4108h00) interfaceC5978pf1).i(event);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (interfaceC5978pf1 instanceof M80) {
                        event = interfaceC5978pf1.g(event);
                        if (event instanceof C8133zv0) {
                            Intrinsics.c(event, "null cannot be cast to non-null type com.amplitude.core.events.IdentifyEvent");
                            event = ((M80) interfaceC5978pf1).c((C8133zv0) event);
                        } else if (event instanceof C2796an0) {
                            Intrinsics.c(event, "null cannot be cast to non-null type com.amplitude.core.events.GroupIdentifyEvent");
                            event = ((M80) interfaceC5978pf1).f((C2796an0) event);
                        } else if (event instanceof C2605Zt1) {
                            Intrinsics.c(event, "null cannot be cast to non-null type com.amplitude.core.events.RevenueEvent");
                            event = ((M80) interfaceC5978pf1).d((C2605Zt1) event);
                        } else if (event != null) {
                            event = ((M80) interfaceC5978pf1).b(event);
                        }
                    } else {
                        event = interfaceC5978pf1.g(event);
                    }
                }
            }
        }
        return event;
    }

    @NotNull
    public final C3595ea c() {
        C3595ea c3595ea = this.b;
        if (c3595ea != null) {
            return c3595ea;
        }
        Intrinsics.l("amplitude");
        throw null;
    }

    public void d(@NotNull C0612Aq incomingEvent) {
        Intrinsics.checkNotNullParameter(incomingEvent, "incomingEvent");
        c().a.getClass();
        b(InterfaceC5978pf1.a.g, b(InterfaceC5978pf1.a.e, b(InterfaceC5978pf1.a.d, incomingEvent)));
    }
}
