package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface LJ0<T, V> extends IJ0<V>, Function1<T, V> {

    public interface a<T, V> extends IJ0.b<V>, Function1<T, V> {
    }

    @Override // defpackage.IJ0
    @NotNull
    a<T, V> f();

    V get(T t);
}
