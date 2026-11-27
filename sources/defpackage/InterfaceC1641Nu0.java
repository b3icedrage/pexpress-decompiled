package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1641Nu0 {
    @NotNull
    C6743tI1 build();

    @NotNull
    <T> AbstractC6953uI1<T> register(@NotNull Class<T> cls);

    @NotNull
    <T> AbstractC6953uI1<T> register(T t);

    @NotNull
    <T> AbstractC6953uI1<T> register(@NotNull Function1<? super InterfaceC1719Ou0, ? extends T> function1);
}
