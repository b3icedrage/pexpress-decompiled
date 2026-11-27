package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class IH1 extends C2784ak0 implements Function1<Sequence<Object>, Iterator<Object>> {
    public static final IH1 m = new IH1();

    public IH1() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<Object> invoke(Sequence<Object> sequence) {
        Sequence<Object> p0 = sequence;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.iterator();
    }
}
