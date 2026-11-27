package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class HH1 implements Iterable<Object>, InterfaceC6745tJ0 {
    public final /* synthetic */ Sequence d;

    public HH1(Sequence sequence) {
        this.d = sequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.d.iterator();
    }
}
