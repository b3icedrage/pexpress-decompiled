package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6000pl {
    public static final void a(@NotNull InterfaceC3220cl interfaceC3220cl, @NotNull List<String> fields) {
        Intrinsics.checkNotNullParameter(interfaceC3220cl, "<this>");
        Intrinsics.checkNotNullParameter(fields, "fields");
        interfaceC3220cl.d("validation").a(false);
        interfaceC3220cl.b("validation.fields", CollectionsKt.J(fields, ",", null, null, null, 62));
        InterfaceC3220cl.a.a(interfaceC3220cl, EnumC4737jl.g, "validation", null, 4);
    }

    @Nullable
    public static final InterfaceC3220cl b(@NotNull String flow, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(data, "data");
        ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap = C3430dl.a;
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC3220cl interfaceC3220clRemove = C3430dl.a.remove(flow);
        if (interfaceC3220clRemove != null) {
            for (Map.Entry<String, ? extends Object> entry : data.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    interfaceC3220clRemove.b(key, value.toString());
                }
            }
        } else {
            C2066Tg c2066Tg = U0.R;
            if (c2066Tg == null || (interfaceC3220clRemove = (InterfaceC3220cl) c2066Tg.invoke(flow, data)) == null) {
                return null;
            }
            C3430dl.b(flow, interfaceC3220clRemove);
        }
        C3430dl.b.put(flow, interfaceC3220clRemove);
        C3430dl.c.put(flow, interfaceC3220clRemove.getId());
        return interfaceC3220clRemove;
    }
}
