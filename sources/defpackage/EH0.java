package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EH0 implements Sequence {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ EH0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Iterator] */
    @NotNull
    private final Iterator b() {
        return this.b;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return b();
            case 1:
                return ((Iterable) this.b).iterator();
            default:
                return (Iterator) this.b;
        }
    }
}
