package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1442Lg1 {
    @NotNull
    <T> InterfaceC6396rf0<T> a(@NotNull InterfaceC7031ug1<T> interfaceC7031ug1);

    @Nullable
    <T> Object b(@NotNull InterfaceC7031ug1<T> interfaceC7031ug1, @NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm);

    @Nullable
    Object c(@NotNull Set set, @NotNull LM lm);

    @NotNull
    <T> InterfaceC6396rf0<T> d(@NotNull InterfaceC7031ug1<T> interfaceC7031ug1, T t);
}
