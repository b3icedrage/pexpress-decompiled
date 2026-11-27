package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class G20<T, K> extends AbstractC4785k0<T> {

    @NotNull
    public final Iterator<T> g;

    @NotNull
    public final C1829Qf h;

    @NotNull
    public final HashSet<K> i;

    public G20(@NotNull Iterator source, @NotNull C1829Qf keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.g = source;
        this.h = keySelector;
        this.i = new HashSet<>();
    }

    @Override // defpackage.AbstractC4785k0
    public final void b() {
        T next;
        do {
            Iterator<T> it = this.g;
            if (!it.hasNext()) {
                this.d = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.i.add((K) this.h.invoke(next)));
        this.e = next;
        this.d = 1;
    }
}
