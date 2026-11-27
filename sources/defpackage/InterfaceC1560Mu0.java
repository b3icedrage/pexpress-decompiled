package defpackage;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1560Mu0 {
    void a(@NotNull C3537eG1 c3537eG1, @NotNull OutputStream outputStream);

    <T> void b(@NotNull T t, @NotNull Writer writer);

    @NotNull
    String c(@NotNull ConcurrentHashMap concurrentHashMap);

    @Nullable
    <T> T d(@NotNull Reader reader, @NotNull Class<T> cls);

    @Nullable
    C3537eG1 e(@NotNull BufferedInputStream bufferedInputStream);
}
