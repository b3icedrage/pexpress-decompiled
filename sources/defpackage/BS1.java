package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BS1 {
    @NotNull
    public static final void a(@NotNull InterfaceC7614xS1 interfaceC7614xS1, @NotNull InterfaceC7614xS1 builder) {
        Intrinsics.checkNotNullParameter(interfaceC7614xS1, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator<T> it = builder.a().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            interfaceC7614xS1.b((String) entry.getKey(), (List) entry.getValue());
        }
    }
}
