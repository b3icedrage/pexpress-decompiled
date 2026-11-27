package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AG<T, E> implements InterfaceC5139lg1<T> {
    public final E a;

    @NotNull
    public final C3178ca1 b;

    /* JADX WARN: Multi-variable type inference failed */
    public AG(Object obj, @NotNull C3178ca1 getter) {
        Intrinsics.checkNotNullParameter(getter, "getter");
        this.a = obj;
        this.b = getter;
    }

    @Override // defpackage.InterfaceC5139lg1
    public final boolean test(T t) {
        return Intrinsics.a(this.b.invoke(t), this.a);
    }
}
