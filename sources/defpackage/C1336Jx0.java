package defpackage;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Jx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1336Jx0<T> implements Iterable<IndexedValue<? extends T>>, InterfaceC6745tJ0 {

    @NotNull
    public final Function0<Iterator<T>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1336Jx0(@NotNull Function0<? extends Iterator<? extends T>> iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.d = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<IndexedValue<T>> iterator() {
        return new C1414Kx0(this.d.invoke());
    }
}
