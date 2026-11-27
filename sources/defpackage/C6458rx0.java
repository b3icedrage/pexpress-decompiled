package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: renamed from: rx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6458rx0 implements LQ1 {

    @NotNull
    public final ArrayList a = new ArrayList();

    @NotNull
    public final Object b = new Object();

    @NotNull
    public final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();

    @Override // defpackage.LQ1, defpackage.InterfaceC4354i90
    @NotNull
    public final List<Object> a() {
        List listE0;
        synchronized (this.b) {
            listE0 = CollectionsKt.e0(this.a);
            this.a.clear();
            Unit unit = Unit.a;
        }
        return VE.c(listE0);
    }

    @Override // defpackage.LQ1, defpackage.InterfaceC4354i90
    @Nullable
    public final Object b(@NotNull JM jm, @NotNull Object obj) {
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<com.amplitude.core.events.BaseEvent>");
        List events = (List) obj;
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            jSONArray.put(C5208m0.j((C0612Aq) it.next()));
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "eventsArray.toString()");
        return string;
    }

    @Override // defpackage.LQ1, defpackage.InterfaceC4354i90
    @Nullable
    public final Object d(@NotNull LM lm) {
        return Unit.a;
    }

    @Override // defpackage.LQ1
    @Nullable
    public final Object e(@NotNull C0612Aq c0612Aq, @NotNull LM lm) {
        synchronized (this.b) {
            this.a.add(c0612Aq);
        }
        return Unit.a;
    }

    @Override // defpackage.LQ1
    @Nullable
    public final String f(@NotNull LQ1.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.c.get(key.d);
    }

    @Override // defpackage.LQ1
    @NotNull
    public final InterfaceC1403Kt1 g(@NotNull K80 eventPipeline, @NotNull MI configuration, @NotNull EM scope, @NotNull Y90 dispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new C6249qx0(eventPipeline, configuration, scope, dispatcher);
    }

    @Override // defpackage.LQ1
    @Nullable
    public final Unit h(@NotNull LQ1.a aVar, @NotNull String str) {
        this.c.put(aVar.d, str);
        return Unit.a;
    }
}
