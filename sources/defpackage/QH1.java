package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class QH1 implements Iterable<String>, InterfaceC6745tJ0 {
    public final /* synthetic */ C4136h70 d;

    public QH1(C4136h70 c4136h70) {
        this.d = c4136h70;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<String> iterator() {
        return new PH1(this.d);
    }
}
