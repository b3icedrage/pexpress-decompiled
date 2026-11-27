package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class CH1 implements Sequence<Object> {
    public final /* synthetic */ AbstractC1639Nt1 a;

    /* JADX WARN: Multi-variable type inference failed */
    public CH1(Function2 function2) {
        this.a = (AbstractC1639Nt1) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Nt1, java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        ?? block = this.a;
        Intrinsics.checkNotNullParameter(block, "block");
        AH1 ah1 = new AH1();
        ah1.h = C5885pC0.a(ah1, ah1, block);
        return ah1;
    }
}
