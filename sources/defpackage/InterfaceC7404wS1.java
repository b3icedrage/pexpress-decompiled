package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7404wS1 {

    /* JADX INFO: renamed from: wS1$a */
    public static final class a {
        public static void a(@NotNull InterfaceC7404wS1 interfaceC7404wS1, @NotNull Function2<? super String, ? super List<String>, Unit> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Iterator<T> it = interfaceC7404wS1.a().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                body.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }
    }

    @NotNull
    Set<Map.Entry<String, List<String>>> a();

    void b(@NotNull Function2<? super String, ? super List<String>, Unit> function2);

    boolean c();

    @Nullable
    String get(@NotNull String str);

    boolean isEmpty();
}
