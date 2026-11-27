package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class H20<T, K> implements Sequence<T> {

    @NotNull
    public final C7439wd0 a;

    @NotNull
    public final C1829Qf b;

    public H20(@NotNull C7439wd0 source, @NotNull C1829Qf keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.a = source;
        this.b = keySelector;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new G20(new C7439wd0.a(this.a), this.b);
    }
}
