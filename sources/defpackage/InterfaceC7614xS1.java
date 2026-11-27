package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7614xS1 {
    @NotNull
    Set<Map.Entry<String, List<String>>> a();

    void b(@NotNull String str, @NotNull List list);

    @Nullable
    List<String> c(@NotNull String str);

    @NotNull
    Set<String> names();
}
