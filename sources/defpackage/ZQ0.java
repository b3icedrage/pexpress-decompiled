package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ZQ0 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZQ0(int i, Object obj, Object obj2) {
        super(1);
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((EY0) this.e).j((C2717aR0) this.g);
                break;
            default:
                C5818ot1 loadSilentlyResource = (C5818ot1) obj;
                Intrinsics.checkNotNullParameter(loadSilentlyResource, "$this$loadSilentlyResource");
                C6370rY0 c6370rY0 = (C6370rY0) this.e;
                String str = (String) this.g;
                C5951pY0 consumer = new C5951pY0(0, c6370rY0, str);
                loadSilentlyResource.getClass();
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                loadSilentlyResource.b = consumer;
                C6161qY0 consumer2 = new C6161qY0(c6370rY0, str);
                Intrinsics.checkNotNullParameter(consumer2, "consumer");
                loadSilentlyResource.e = consumer2;
                YQ0 consumer3 = new YQ0(1, c6370rY0, str);
                Intrinsics.checkNotNullParameter(consumer3, "consumer");
                loadSilentlyResource.d = consumer3;
                break;
        }
        return Unit.a;
    }
}
