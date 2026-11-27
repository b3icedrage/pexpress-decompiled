package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class JS1 implements Sequence<String> {
    public final /* synthetic */ String a;

    public JS1(String str) {
        this.a = str;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<String> iterator() {
        return new C5297mQ0(this.a);
    }
}
