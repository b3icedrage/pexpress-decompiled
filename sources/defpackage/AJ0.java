package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface AJ0<T, V> extends LJ0<T, V>, InterfaceC7586xJ0<V> {

    public interface a<T, V> extends InterfaceC7586xJ0.a<V>, Function2<T, V, Unit> {
    }

    @Override // defpackage.InterfaceC7586xJ0
    @NotNull
    a<T, V> g();

    void p(T t, V v);
}
