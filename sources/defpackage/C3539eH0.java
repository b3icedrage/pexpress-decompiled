package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3539eH0<T> implements Iterator<T>, InterfaceC6745tJ0 {

    @NotNull
    public final AbstractC5267mG0 d;

    @NotNull
    public final C1385Kn1 e;

    @NotNull
    public final RJ0 g;

    public C3539eH0(@NotNull AbstractC5267mG0 json, @NotNull C1385Kn1 lexer, @NotNull RJ0 deserializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.d = json;
        this.e = lexer;
        this.g = deserializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e.w() != 10;
    }

    @Override // java.util.Iterator
    public final T next() {
        EnumC3852fl2 enumC3852fl2 = EnumC3852fl2.OBJ;
        RJ0 rj0 = this.g;
        MH1 mh1C = rj0.c();
        return (T) new C3573eS1(this.d, enumC3852fl2, this.e, mh1C, null).d(rj0);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
