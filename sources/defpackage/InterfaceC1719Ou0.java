package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ou0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1719Ou0 {
    @NotNull
    <T> List<T> getAllServices(@NotNull Class<T> cls);

    <T> T getService(@NotNull Class<T> cls);

    @Nullable
    <T> T getServiceOrNull(@NotNull Class<T> cls);

    <T> boolean hasService(@NotNull Class<T> cls);
}
