package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3330dH0<T> implements Iterator<T>, InterfaceC6745tJ0 {

    @NotNull
    public final AbstractC5267mG0 d;

    @NotNull
    public final C1385Kn1 e;

    @NotNull
    public final RJ0 g;
    public boolean h;
    public boolean i;

    public C3330dH0(@NotNull AbstractC5267mG0 json, @NotNull C1385Kn1 lexer, @NotNull RJ0 deserializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.d = json;
        this.e = lexer;
        this.g = deserializer;
        this.h = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.i) {
            return false;
        }
        C1385Kn1 c1385Kn1 = this.e;
        if (c1385Kn1.w() != 9) {
            if (c1385Kn1.w() != 10 || this.i) {
                return true;
            }
            c1385Kn1.s((byte) 9, true);
            throw null;
        }
        this.i = true;
        c1385Kn1.g((byte) 9);
        if (c1385Kn1.w() == 10) {
            return false;
        }
        if (c1385Kn1.w() != 8) {
            c1385Kn1.p();
            return false;
        }
        AbstractC4995l0.r(c1385Kn1, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
        throw null;
    }

    @Override // java.util.Iterator
    public final T next() {
        boolean z = this.h;
        C1385Kn1 c1385Kn1 = this.e;
        if (z) {
            this.h = false;
        } else {
            c1385Kn1.h(',');
        }
        EnumC3852fl2 enumC3852fl2 = EnumC3852fl2.OBJ;
        RJ0 rj0 = this.g;
        return (T) new C3573eS1(this.d, enumC3852fl2, c1385Kn1, rj0.c(), null).d(rj0);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
