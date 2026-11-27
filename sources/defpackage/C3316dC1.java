package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: dC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3316dC1 extends ML0 implements Function2<Integer, CoroutineContext.Element, Integer> {
    public final /* synthetic */ C2897bC1<?> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3316dC1(C2897bC1<?> c2897bC1) {
        super(2);
        this.d = c2897bC1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer num, CoroutineContext.Element element) {
        int iIntValue = num.intValue();
        CoroutineContext.Element element2 = element;
        CoroutineContext.a<?> key = element2.getKey();
        CoroutineContext.Element elementP = this.d.e.p(key);
        if (key != XF0.a.d) {
            return Integer.valueOf(element2 != elementP ? Integer.MIN_VALUE : iIntValue + 1);
        }
        XF0 xf0 = (XF0) elementP;
        XF0 parent = (XF0) element2;
        while (true) {
            if (parent != null) {
                if (parent == xf0 || !(parent instanceof ND1)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        if (parent == xf0) {
            if (xf0 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + xf0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
