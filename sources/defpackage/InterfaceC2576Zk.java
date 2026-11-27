package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2576Zk {
    @NotNull
    <T> T a(@NotNull C2498Yk<T> c2498Yk, @NotNull Function0<? extends T> function0);

    <T> void b(@NotNull C2498Yk<T> c2498Yk, @NotNull T t);

    @NotNull
    List<C2498Yk<?>> c();

    boolean d(@NotNull C2498Yk<?> c2498Yk);

    @Nullable
    <T> T e(@NotNull C2498Yk<T> c2498Yk);

    @NotNull
    <T> T f(@NotNull C2498Yk<T> c2498Yk);
}
